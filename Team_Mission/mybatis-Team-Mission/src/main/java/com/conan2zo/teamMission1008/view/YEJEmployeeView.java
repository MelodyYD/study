package com.conan2zo.teamMission1008.view;

import com.conan2zo.teamMission1008.controller.YEJEmployeeController;

import java.util.Scanner;

public class YEJEmployeeView {

    public void YEJEmpViewDisplay() {
        Scanner sc = new Scanner(System.in);
        YEJEmployeeController YEJEmpCon = new YEJEmployeeController();

        do {
            System.out.println("┌───────────────────────────────────────────────────────────┐");
            System.out.println("│               ★ 코난 회사 정보 관리 프로그램 ★         　     │");
            System.out.println("│                                                           │");
            System.out.println("│  1. 인원 전체 조회하기                                       │");
            System.out.println("│  2. 특정 조건으로 인원 조회하기                               │");
            System.out.println("│  3.                                        │");
            System.out.println("│  4.                                            │");
            System.out.println("│  5.                                            │");
            System.out.println("│  9. 종료하기                                               │");
            System.out.println("│                                                           │");
            System.out.println("└───────────────────────────────────────────────────────────┘");
            System.out.println("");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();
        } while (true);



    }

}
