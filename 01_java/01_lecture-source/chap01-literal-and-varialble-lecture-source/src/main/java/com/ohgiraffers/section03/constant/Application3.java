package com.ohgiraffers.section03.constant;

public class Application3 {

    public static void main(String[] args) {

        System.out.println("=============== 실습 문제 1 ===============");
        /*- 실습문제 1
          정수형 변수 2개를 선언하여,
          각 20과 30으로 초기화 한 후,
          두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요.

            -- 출력 예시 --
            더하기 결과  : 50
            빼기 결과 : -10
            곱하기 결과 : 600
            나누기한 몫 : 0
            나누기한 나머지 : 20
    */

        int num1 = 20;
        int num2 = 30;

        System.out.println("더하기 결과 : " + (num1 + num2));
        System.out.println("빼기 결과 : " + (num1 - num2));
        System.out.println("곱하기 결과 : " + (num1 * num2));
        System.out.println("나누기한 몫 : " + (num1 / num2));
        System.out.println("나누기한 나머지 : " + (num1 % num2));


        System.out.println("=============== 실습 문제 2 ===============");

        /*- 실습문제 2
        * 사각형의 넓이와 둘레를 구하여 출력합니다.
          너비 12.5 높이 36.4를 변수에 저장하고,
          넓이와 둘레를 계산한 뒤 각각 넓이와 둘레를 변수에 담아 아래와 같이 출력하세요.

          -- 출력 예시 --

          면적 : 455.0
          둘레 : 97.8
        */

        double area = 12.5;
        double heit = 36.4;

        System.out.println("면적 : " + (area * heit));
        System.out.println("둘레 : " + ((area + heit) * 2));


    }
}
