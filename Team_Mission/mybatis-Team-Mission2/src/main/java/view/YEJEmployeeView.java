package view;

import controller.YEJEmployeeController;

import java.util.Scanner;

public class YEJEmployeeView {

    public void yejEmployee() {

        Scanner sc = new Scanner(System.in);
        YEJEmployeeController YEJEmpCon = new YEJEmployeeController();

        // 조회 등록 수정 삭제
        do {
            System.out.println("┌───────────────────────────────────────────────────────────┐");
            System.out.println("│               ★ 코난 회사 정보 관리 프로그램 ★         　     │");
            System.out.println("│                                                           │");
            System.out.println("│  1. 인원 전체 조회하기                                       │");
            System.out.println("│  2. 특정 조건으로 인원 조회하기                      　        │");
            System.out.println("│  3. 입사 처리       　                                      │");
            System.out.println("│  4. 발령 처리  　                                           │");
            System.out.println("│  5. 퇴사 처리   　                                          │");
            System.out.println("│  9. 종료하기     　                                         │");
            System.out.println("│                                                           │");
            System.out.println("└───────────────────────────────────────────────────────────┘");
            System.out.println("");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: YEJEmpCon.selEmpAllList();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    return;
                default:
                    System.out.println("┌───────────────────────────────────────────────────────────┐");
                    System.out.println("│  잘못 입력하였습니다. 다시 입력해주세요.                    　　　│");
                    System.out.println("└───────────────────────────────────────────────────────────┘");
                    System.out.println();
                    break;
            }

        } while (true);

    }

}
