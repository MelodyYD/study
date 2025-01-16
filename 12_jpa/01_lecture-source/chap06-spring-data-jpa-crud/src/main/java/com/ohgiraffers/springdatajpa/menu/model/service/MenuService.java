package com.ohgiraffers.springdatajpa.menu.model.service;

import com.ohgiraffers.springdatajpa.menu.entity.Category;
import com.ohgiraffers.springdatajpa.menu.entity.Menu;
import com.ohgiraffers.springdatajpa.menu.model.dao.CategoryRepository;
import com.ohgiraffers.springdatajpa.menu.model.dao.MenuRepository;
import com.ohgiraffers.springdatajpa.menu.model.dto.CategoryDTO;
import com.ohgiraffers.springdatajpa.menu.model.dto.MenuDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    // Bean 으로 등록한 modelmapper 의존성 주입
    private final ModelMapper modelMapper;
    private final CategoryRepository categoryRepository;

    /* 1. 메뉴 코드로 특정 메뉴 조회하기 */
    public MenuDTO findMenuByMenuCode(int menuCode) {

        Optional<Menu> foundMenu = repository.findById(menuCode);
                                   // 잘못된 파라미터가 넘겨왔을 때 예외처리 필수
//                                   .orElseThrow(IllegalAccessError::new);

        // entity -> DTO 로 변환
        // map(변환 대상, 변환할 타입)
        return modelMapper.map(foundMenu, MenuDTO.class);
    }

    /* 2. 페이징 처리하지 않은 메뉴 리스트 조회하기 */
    public List<MenuDTO> findMenuList() {
        // 정렬 없는 find
        // List<Menu> menulist = repository.findAll();
        List<Menu> menulist = repository.findAll(Sort.by("menuPrice").descending());
        // stream : 컬렉션(List 등) 데이터를 처리하기 위해 나열
        return menulist.stream()
                       .map(menu -> modelMapper.map(menu, MenuDTO.class))
                       .collect(Collectors.toList());
    }

    public Page<MenuDTO> findMenuListByPaging(Pageable pageable) {

        pageable = PageRequest.of(
                pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() -1,
                pageable.getPageSize(),
                Sort.by("menuCode").descending()
        );

        Page<Menu> menuList = repository.findAll(pageable);

        return menuList.map(menu -> modelMapper.map(menu, MenuDTO.class));
    }

    public List<MenuDTO> findByMenuPrice(int menuPrice) {
        List<Menu> menuList = repository.findByMenuPriceGreaterThanOrderByMenuPrice(menuPrice);
        return menuList.stream()
                .map(menu -> modelMapper.map(menu, MenuDTO.class))
                .collect(Collectors.toList());
    }

    public List<CategoryDTO> findAllCategory() {
        List<Category> categoryList = categoryRepository.findAllCategory();
        for (Category c : categoryList) {
            System.out.print(c + ", ");
        }
        return categoryList.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .collect(Collectors.toList());
    }

    // DML 구문이기 때문에 Transactional
    @Transactional
    public void registMenu(MenuDTO menu) {

        // 아래처럼 생성해주어도 상관은 없으나 modelMapper 사용하는 것이 더 간결하다.
//        Menu addMenu = new Menu(
//                menu.getMenuCode(),
//                menu.getMenuName(),
//                menu.getMenuPrice(),
//                menu.getCategoryCode(),
//                menu.getOrderableStatus());

        /* comment.
        *   지금까지는 Entity 를 DTO 로 변환했다면 DML 구문에서는 DTO 타입을 Entity 로 변환해야
        *   Persistence Context == JPA 가 관리를 해준다.
        * */
        repository.save(modelMapper.map(menu, Menu.class));
    }

    @Transactional
    public void modifyMenu(MenuDTO modifyMenu) {
        /* update 는 엔티티를 특정해서 필드의 값을 변경해주면 된다. */
        /* JPA 는 변경감지 기능이 있다.
        *   따라서 하나의 엔티티를 특정해서 필드 값을 변경하면 변경된 값으로 flush(반영)한다.    
        * */
        
        // 엔티티 찾기
        Menu foundMenu = repository.findById(modifyMenu.getMenuCode())
                .orElseThrow(IllegalArgumentException::new);
        System.out.println("foundMenu = " + foundMenu);

        // 1. setter 를 통해 update 기능 - (지양한다.)
        // foundMenu.setMenuName(modifyMenu.getMenuName());
        // 기존 데이터 갈아끼우는 느낌.
        // 안전하지 않고 누구나 접근 가능하여 위험성 다분.

        // 2. @Builder 를 통해 update 기능
        // foundMenu = foundMenu.toBuilder()
        //                     .menuName(modifyMenu.getMenuName())
        //                     .build();
        // build 를 통해서 foundMenu 새롭게 탄생시켰으니 save 메소드 통해 JPA 에게 전달
        //repository.save(foundMenu);

        // 3. Entity 클래스 내부에 Builder 패턴을 구현
        foundMenu = foundMenu.menuName(modifyMenu.getMenuName()).builder();
        // 이름만 수정한 후 builder 로 재탄생
        // 어찌보면 리소스 낭비처럼 보이지만 더 안전함 (기존 의존성 끊고 새로 탄생)
        repository.save(foundMenu);
        // 다시 만들어냈기 때문에 save 로 등록해주는 것!
    }

    @Transactional
    public void deleteMenu(int menuCode) {
        repository.deleteById(menuCode);
    }
}
