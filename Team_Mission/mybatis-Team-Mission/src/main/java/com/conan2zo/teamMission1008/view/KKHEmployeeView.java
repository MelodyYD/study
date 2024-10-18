package com.conan2zo.teamMission1008.view;

import com.conan2zo.teamMission1008.controller.KKHEmployeeController;

import java.util.Scanner;

public class KKHEmployeeView {

public void display () {
    Scanner sc = new Scanner(System.in); // 스캐너 생성
    KKHEmployeeController controller = new KKHEmployeeController(); // 컨트롤 클래스 생성

    do{
        System.out.println("================명탐정코난회사=================");
        System.out.println("1. 직원 전체 조회");
        System.out.println("2. 코드로 직원 조회");
        System.out.println("3. 직원 입사");
        System.out.println("4. 직원 정보 변경");
        System.out.println("5. 직원 해고");
        int no = sc.nextInt();

        switch (no) {
            case 1 :
                controller.colummsAllSearch();
                        break;

        }

    } while (true);

    }
}
