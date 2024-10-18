package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        //Static 메소드를 호출할 수 있다.

        /* 필기.
        *
        *
        *
        * */

        /* 필기.
         *  [표현식]
         *  클래스명.메소드명();
         * */


        Application8.sumTwoNumbers(10,20);
        int result = Application8.sumTwoNumbers(10,20);
        System.out.println("result = " + result);

        /* 필기.
        *  동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 가능하다.
        * */



    }

    public static int sumTwoNumbers(int first, int second) {


        return first + second;

    }

}
