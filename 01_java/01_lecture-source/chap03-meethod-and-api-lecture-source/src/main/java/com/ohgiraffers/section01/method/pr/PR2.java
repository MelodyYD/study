package com.ohgiraffers.section01.method.pr;

public class PR2 {

    public static void main(String[] args) {

        /*
        int형 변수 num1, num2 를 선언하고 num1과 num2가 짝수인지 판별하는 메소드 isEven을  작성하시오.
        단, 결과는 참, 거짓으로 출력되며 삼항연산자를 이용하기 바랍니다.

        입력 )
        num1 = 37
        num2 = 28

        출력 결과 )
        num1 = 거짓
        num2 = 참
        */

        int num1 = 37;
        int num2 = 28;

        PR2 even = new PR2();
        System.out.println("num1 = " + even.isEven(num1));
        System.out.println("num2 = " + even.isEven(num2));

    }

    public String isEven(int num) {

        return (num%2 == 0) ? "참" : "거짓" ;

    }

}
