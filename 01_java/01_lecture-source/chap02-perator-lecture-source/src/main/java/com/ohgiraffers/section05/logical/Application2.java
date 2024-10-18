package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {
        //24.08.28 10:30
        //수업목표. 논리연산자의 우선순위에 대해 이해하고 활용해보자.

        /* 필기.
        *  논리연산자의 우선순위와 활용
        *  논리 and 연산자와 논리 or 연산자의 우선순위
        *  && : 11 순위
        *  || : 12 순위
        * */

        // 1. 1부터 100 사이의 값인지 확인
        int num1 = 160;
        System.out.println("num1이 1부터 100 사이 숫자인지 확인 : " + ( num1 >= 1 && num1 <= 100 ) );

        // 2. 영어 대문자인지 확인
        char ch1 = 'G'; //문자는 내부적으로 숫자이다.
        System.out.println("ch1이 영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z') );

        // 번외
        // a는 A보다 클까? -> 구글링 없이 형변환을 써보자

        char aTest = 'a';
        char ATest = 'A';

        int aToInt = aTest;
        int AToInt = ATest;

        System.out.println("aToInt = " + aToInt);
        System.out.println("AToInt = " + AToInt);

        // 3. 'f' 대소문자 상관없이 영어인지 확인해보기
        char ch2 = 'f';
        System.out.println("ch2는 영어인가? : " + ( ch2 >= 'A' && ch2 <= 'Z' || ch2 >= 'a' && ch2 <= 'z'));



    }

}
