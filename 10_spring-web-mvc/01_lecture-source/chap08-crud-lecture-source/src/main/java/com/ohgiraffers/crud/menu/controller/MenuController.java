package com.ohgiraffers.crud.menu.controller;

import com.ohgiraffers.crud.menu.model.dto.CategoryDTO;
import com.ohgiraffers.crud.menu.model.dto.MenuDTO;
import com.ohgiraffers.crud.menu.model.service.MenuService;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/menu/*")
public class MenuController {

    private final MenuService menuService;
    // bean 으로 등록한 메세지 소스 사용
    private final MessageSource messageSource;

    public MenuController(MenuService menuService, MessageSource messageSource) {
        this.menuService = menuService;
        this.messageSource = messageSource;
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

    @GetMapping("/detail")
    public String findMenuDetail(Model model, @RequestParam int code) {

        MenuDTO menu = menuService.menuDetail(code);
        model.addAttribute("menu", menu);

        return "/menu/menuDetail";

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

    @PostMapping("regist")
    public String registMenu(@ModelAttribute MenuDTO newMenu, RedirectAttributes rttr, Locale locale) {
        /*
        *   @ModelAttribute : form 태그로 묶어서 넘어오는 값을 클래스 자료형에 담기 위한 어노테이션
        *   RedirectAttributes : 리다이랙트 시 저장할 값이 있으면 사용하는 객체
        * */
        menuService.registMenu(newMenu);
        rttr.addFlashAttribute("successMessage",
                messageSource.getMessage("regist", new Object[]{newMenu.getName(), newMenu.getPrice()}, locale));

        return "redirect:/menu/list";

    }

}
