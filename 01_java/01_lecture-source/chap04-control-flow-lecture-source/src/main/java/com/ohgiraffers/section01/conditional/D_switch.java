package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSwitchStatement() {
        //24.09.02 12:35
        //switch 문 단독 사용에 대한 흐름을 이해할 수 있다.

        /* 필기.
        *   표현식
        *   switch(비교할 변수) {
        *       case 비교값1 : 비교값1과 일치하는 경우 실행 구문; break;
        *       case 비교값2 : 비교값2와 일치하는 경우 실행 구문; break;
        *       default : case 에 모두 해당하지 않는 경우 실행 구문; break;
        *   }
        * */

        /* 필기.
        *   여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if 구문과 유사하다.
        *   하지만 switch 문으로 비교가 가능한 값은 정수, 문자, 문자열 형태의 값이다.
        *   실수와 논리는 비교할 수 없다. <-중요!!!!!
        *   또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는 게 차이점이다.
        *   case 절에는 변수를 사용할 수 없다.
        * */

        // 1. 문제
        //정수 두 개와 연산 기호 문자를 입력 받아 두 숫자의 연산 결과를 출력해보자.

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();

        System.out.print("연산 기호(+, -, *, /, %) 입력 : ");
        //문자열을 charAt(인덱스)로 문자로 만들기
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;
        }
        System.out.println("계산 결과는...");
        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void testSwitchVendingMachine() {

        System.out.println("========== HiMedia 음료 자판기 ==========");
        System.out.println("    s     m     n     c     h     k    ");
        System.out.println("========== ============================");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("음료를 선택해주세요. : ");
        String selDrink = sc.nextLine();
        System.out.println("");

        // 투입 가격 변수 선언
        int price = 0;

        switch (selDrink) {
            case "s" :
                System.out.println("사이다를 선택했습니다.");
                price = 500;
            case "m" :
                System.out.println("맥콜을 선택했습니다.");
                price = 800;
            case "n" :
                System.out.println("솔의 눈을 선택했습니다.");
                price = 600;
            case "c" :
                System.out.println("콜라를 선택했습니다.");
                price = 500;
            case "h" :
                System.out.println("환타를 선택했습니다.");
                price = 600;
            case "k" :
                System.out.println("밀키스를 선택했습니다.");
                price = 800;
        }

        System.out.print(price + "원을 투입해주세요.");


        System.out.println("========================================");
        System.out.println("====== HiMedia 음료 자판기 개선해보기 ======");
        System.out.println("========================================");

        String orderMenu = "";

        switch (selDrink) {
            case "s" :
                System.out.println("사이다를 선택했습니다.");
                orderMenu = "사이다";
                price = 500;
                break;
            case "m" :
                System.out.println("맥콜을 선택했습니다.");
                orderMenu = "맥콜";
                price = 800;
                break;
            case "n" :
                System.out.println("솔의 눈을 선택했습니다.");
                orderMenu = "솔의 눈";
                price = 600;
                break;
            case "c" :
                System.out.println("콜라를 선택했습니다.");
                orderMenu = "콜라";
                price = 500;
                break;
            case "h" :
                System.out.println("환타를 선택했습니다.");
                orderMenu = "환타";
                price = 600;
                break;
            case "k" :
                System.out.println("밀키스를 선택했습니다.");
                orderMenu = "밀키스";
                price = 800;
                break;
        }

        System.out.println(orderMenu + "을/를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요!");

    }

}
