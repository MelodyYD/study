package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    //24.09.03 13:10

    public void testDoWhileStatement() {
        // do-while 문 단독 사용에 대해 이해할 수 있다.

        /* 필기.
        *   [do-while 문 표현식]
        *   초기식;
        *   do {
        *       1회차에는 무조건 실행하고 이후는 조건식을 확인해서 조건을 만족하는 경우에만 반복할 구문;
        *       증감식;
        *   } while (조건식)
        * */

        do {
            System.out.println("최초 한 번 동작함");
        } while (false);

        System.out.println();
        System.out.println("반복문 종료 확인");

    }

    public void doWhileExample() {
        // 스캐너로 문자열을 입력받아 반복적으로 출력할 것이다.
        // 단, exit라고 입력하면 반복문을 종료할 거다.

        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.print("문자열을 입력해주세요. : ");
            str = sc.nextLine();
        } while (!str.equals("exit"));
        // 문자열은 == 비교가 불가능하다.
        // 어떻게 비교할까?
        // equals() : 문자열이 같은지를 비교해주는 메소드

        System.out.println("프로그램을 종료합니다.");




    }

}
