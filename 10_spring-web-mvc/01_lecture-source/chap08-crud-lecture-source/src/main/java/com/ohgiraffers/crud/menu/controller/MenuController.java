package com.ohgiraffers.crud.menu.controller;

import com.ohgiraffers.crud.menu.model.dto.CategoryDTO;
import com.ohgiraffers.crud.menu.model.dto.MenuDTO;
import com.ohgiraffers.crud.menu.model.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/menu/*")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("list")
    public String findMenuList(Model model) {

        // 메뉴 전체 조회는 MenuDTO 타입이 여러개이므로 List 타입
        List<MenuDTO> menuList = menuService.findAllMenus();

        for(MenuDTO menuDTO : menuList) {
            System.out.println(menuDTO);
        }

        model.addAttribute("menuList", menuList);

        return "menu/list";

    }

    @GetMapping("regist")
    public void registPage() {}

    /*
    *   @ResponseBody 어노테이션
    *   기존 Controller 의 역할은 view 를 마지막에 리턴하는 것이 의무이다.
    *   하지만 @responseBody 는 view 가 아닌 데이터를 리턴할 수 있게 만든다.
    *   json -> 자바스크립트 객체 표기법
    * */
    @GetMapping(value = "category", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CategoryDTO> findCategoryList() {

        return menuService.findAllCatetory();

    }

}
