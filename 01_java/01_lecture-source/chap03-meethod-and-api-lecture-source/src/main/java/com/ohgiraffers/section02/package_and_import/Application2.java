package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {

    public static void main(String[] args) {
        // 24.08.30 10:15
        //임포트에 대해 이해할 수 있다.

        /*  import란?
        *
        * */

        Calculator calc = new Calculator();

        //non-static 메소드 호출
        int min = calc.minNumberOf(50, 60);
        System.out.println("50과 60 중 더 작은 값은 : " + min);
        //출력 예시 : 50과 60 중 더 작은 값은 : 50

        //static 메소드 호출
        int max = Calculator.maxNumberOf(50, 60);
        //출력 예시 : 50과 60 중 더 큰 값은 : 60


    }

}
