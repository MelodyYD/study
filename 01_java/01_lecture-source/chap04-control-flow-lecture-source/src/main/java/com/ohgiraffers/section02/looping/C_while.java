package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    // 1부터 10까지 1씩 증가시키면서 i값 출력하는 반복문
    public void testWhileStatement() {
        /* 초기식
         *   while(조건식) {
         *       조건을 만족하는 경우 반복할 구문;
         *       증감식;
         *   }
         * */

        int i=1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void whileExample1() {
        //스캐너를 이용해서 문자열을 입력받아 인덱스를 이용해 한글자씩 출력해보기
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요. : ");
        String str = sc.nextLine();

        /* 필기.
         *   charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 변환해주는 메소드
         *   length() : String 클래스에서 제공하는 메소드로, 문자열의 길이를 int형으로 반환해준다.
         * */

        //for문
        System.out.println("for문 ================================");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i +"번째 : " + ch);
        }
    }

    public void whileExample2() {
        // 중첩 while 문을 이용해서 구구단 출력 연습
        // dan : 2~9
        // su : 1~9

        int dan = 2;
        while (dan < 10) {
            int su = 1;
            while (su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                su++;
            }
            System.out.println();
            dan++;
        }
    }


}
