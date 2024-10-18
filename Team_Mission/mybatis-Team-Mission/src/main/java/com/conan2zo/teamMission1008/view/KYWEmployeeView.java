package com.conan2zo.teamMission1008.view;

import com.conan2zo.teamMission1008.controller.KYWEmployeeController;

import java.util.Scanner;

public class KYWEmployeeView {

    public static void kywEmployee() {

        // 반복문 사용으로 직원관리 프로그램 실행
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("=============== 직원 관리 프로그램 ===============");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 이름 조회");
            System.out.println("3. 직원 주민번호로 조회");
            System.out.println("4. 직원 입사");
            System.out.println("5. 직원 정보 수정");
            System.out.println("6. 직원 퇴사");
            System.out.println("===============================================");
            System.out.print("실행할 메뉴를 선택해 주세요 : ");

            int no = sc.nextInt();

            // 번호를 누르면 해당하는 작업 실행
            switch (no) {
                case 1:
                    KYWEmployeeController.selectAllMember();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }

        } while (true);//ddddd

    }





}
