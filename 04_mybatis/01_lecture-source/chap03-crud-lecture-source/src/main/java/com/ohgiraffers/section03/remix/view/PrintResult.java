package com.ohgiraffers.section03.remix.view;

import com.ohgiraffers.section03.remix.model.dto.MenuDTO;

import java.util.List;

public class PrintResult {
    // 1번 전체조회를 누르고 실행 결과 값을 보는 메소드
    public void printMenuList(List<MenuDTO> menuList) {

        System.out.println("요청하신 전체 메뉴 조회 결과 입니다.");

        for (MenuDTO menu : menuList) {
            System.out.println(menu);
        }

        System.out.println("===============================");

    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList" :
                errorMessage = "메뉴 전체 조회에 실패하셨습니다...";
                break;
            case "selectOne":
                errorMessage = "메뉴코드로 메뉴 조회에 실패하셨습니다...";
                break;
            case "insert":
                errorMessage = "신규 메뉴 등록에 실패하셨습니다...";
                break;
            case "update":
                errorMessage = "메뉴 수정에 실패하셨습니다...";
                break;
        }

        System.out.println(errorMessage);

    }

    public void printMenu(MenuDTO menu) {

        System.out.println(menu.getMenuCode() + "번 메뉴 조회 결과입니다.");
        System.out.println(menu);
        System.out.println("==========================================");




    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "신규 메뉴 등록 성공!!!";
                break;
            case "update":
                successMessage = "메뉴 수정 성공!!!";
                break;
        }

        System.out.println(successMessage);

    }
}
