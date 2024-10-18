package com.ohgiraffers.section02.use;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //24.09.10 14:40
        //DTO(데이터 위주) 와 행위 위주의 클래스를 활용한 예제

        /*
        *   DTO를 활용한 간단한 회원 관리용 프로그램
        *   1. Application 에서 플레이어가 여러 명의 회원 정보를 받아 등록
        *   2. Application 에서 플레이어가 전체 회원 조회 시 등록된 회원 정보 반환
        * */

        Scanner sc = new Scanner(System.in);
        MemberManager manager = new MemberManager();

        while(true) {
            System.out.println("============== HiMedia 회원 관리 프로그램 ==============");
            System.out.println(" 1. 회원 등록");
            System.out.println(" 2. 회원 전체 조회");
            System.out.println(" 9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1:
                    manager.signUpMembers();
                    break;
                case 2:
                    manager.searchAllMembers();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다. 다시 이용해주세요^^");
                    return;
                default:
                    System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
                    break;
            }
        }


    }

}
