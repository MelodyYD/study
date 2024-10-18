package com.ohgiraffers.section04.comparison;

public class Application1 {

    public static void main(String[] args) {
        //24.08.27 15:40
        //수업목표. 비교연산자에 대해 이해하고 활용할 수 있다.

        /* 필기
        *  비교연산자
        *  비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        *  연산자 중 참 혹은 거짓을 반환하는 연산자는 조건식이나 조건문의 조건절에 많이 사용된다.
        * */

        /* 필기
        *   1. 비교연산자의 종류
        *   == : 왼쪽 피연산자와 오른쪽 피연산자가 같으면 true, 다르면 false
        *   != : 왼쪽 피연산자와 오른쪽 피연산자가 다르면 true, 같으면 false
        *   >  : 왼쪽 피연산자가 오른쪽 피연산자보다 크면 true, 아니면 false
        *   >= : 왼쪽 피연산자가 오른쪽 피연산자와 같거나 크면 true, 아니면 false
        *   <
        *   <=
        * */

        int num1 = 10;
        int num2 = 20;

        System.out.println("===================== 정수값 비교 =====================");
        System.out.println("num1 과 num2 가 같은지 비교 : " + (num1 == num2));
        System.out.println("num1 과 num2 가 같지 않은지 비교 : " + (num1 != num2));
        System.out.println("num1 이 num2 보다 큰지 비교 : " + (num1 > num2));
        System.out.println("num1 이 num2 보다 작은지 비교 : " + (num1 < num2));
        System.out.println("num1 이 num2 보다 같거나 큰지 비교 : " + (num1 >= num2));
        System.out.println("num1 이 num2 보다 같거나 작은지 비교 : " + (num1 <= num2));


        //====================================================================================

        // 2. 문자 값 비교
        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println("===================== 문자값 비교 =====================");
        System.out.println("ch1 > ch2 : " + (ch1 > ch2));


        //====================================================================================

        // 3. 문자열 값 비교
        String str1 = "윤이정";
        String str2 = "윤이정";

        System.out.println("===================== 문자열값 비교 =====================");
        System.out.println("str1 과 str2 가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1 과 str2 가 다른지 비교 : " + (str1 != str2));
        //문자열은 대소비교(> <)가 불가하다.


    }

}
