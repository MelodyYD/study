package com.ohgiraffers.section03.remix.controller;

import com.ohgiraffers.section03.remix.model.dto.MenuDTO;
import com.ohgiraffers.section03.remix.model.service.MenuService;
import com.ohgiraffers.section03.remix.view.PrintResult;

import java.util.List;
import java.util.Map;

public class MenuController {

    /* comment.
     *   Controller 의 역할
     *   view 에서 사용자가 입력한 정보를 파라미터 형태로 전달 받으면
     *   전달 받은 값들을 검증하거나, "추가적인 정보가 필요하면 가공을 한 뒤
     *   service 쪽으로 전달하기 위한 인스턴스를 생성하여 담고
     *   service 의 비즈니스 로직을 담당하는 메소드를 호출한다."
     *   또한 호출한 수행 결과를 반환 받아 어떤 view 를 보여줄 지
     *   결정하는 역할을 수행하게 된다.
     *  */
    // 안전한 코드를 위해 private final 로 초기화 시켜놓음
    private final MenuService menuService;
    private final PrintResult printResult;

    // MenuController 기본생성자로 MenuService,PrintResult 인스턴스 생성
    // MenuController 객체가 생성 될 때 자동으로 호출됨
    public MenuController() {

        // final 이라는 키워드를 사용할 시 반드시 인스턴스를 생성해줘야한다.
        this.menuService = new MenuService();
        this.printResult = new PrintResult();

    }

    public void selectAllMenu() {

        List<MenuDTO> menuList = menuService.selectAllMenu();

        // 정상 조회
        if (menuList != null) {
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectMenuByCode(Map<String, String> parameter) {

        // 나중에 나올 개념이지만, 나중에 화면에서 입력 받은 값을
        // 컨트롤러가 전달 받게 되면 String 타입으로 넘어오게 된다.
        // 사용자가 입력한 String 타입의 값을 우리가 설계한 자료형에 맞게 parsing
        int code = Integer.parseInt(parameter.get("menuCode"));


        MenuDTO menu = menuService.selectMenuByCode(code);

        if (menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage("selectOne");
        }

    }

    public void insertNewMenu(Map<String, String> parameter) {

        String menuName = parameter.get("name");
        int menuPrice = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("category"));

        // 서로 다른 자료형을 가진 연관있는 값을 클래스로 뭉쳐서 전달
        // menuDTO 클래스 사용
        MenuDTO newMenu = new MenuDTO();
        newMenu.setMenuName(menuName);
        newMenu.setMenuPrice(menuPrice);
        newMenu.setCategoryCode(categoryCode);

        if (menuService.insertNewMenu(newMenu)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }


    public void modifyMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO modifyMenu = new MenuDTO();
        modifyMenu.setMenuCode(code);
        modifyMenu.setMenuName(name);
        modifyMenu.setMenuPrice(price);
        modifyMenu.setCategoryCode(categoryCode);

        menuService.modifyMenu(modifyMenu);

        if (menuService.modifyMenu(modifyMenu)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("menuCode"));

        if (menuService.deleteMenu(code)) {
            printResult.printSuccessMessage("delete");

        } else {

            printResult.printErrorMessage("delete");

        }
    }
}