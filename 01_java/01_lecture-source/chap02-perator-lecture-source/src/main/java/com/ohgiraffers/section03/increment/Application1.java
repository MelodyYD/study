package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        //24.08.27 15:05 증감연산
        //수업목표. 증감연산자에 대해 이해할 수 있다.

        /* 필기.
        *  증감연산자
        *  피연산자 앞 or 뒤에 사용이 가능하다.
        *  ' ++ ' : 1 증가
        *  ' -- ' : 1 감소
        * */

        // 1, 증감연산자를 단항으로만 사용
        //    단항으로 사용될 때에는 1 증가, 1 감소의 의미
        int num = 20;
        System.out.println("num = " + num);
        num++;
        System.out.println("num = " + num);
        num--;
        System.out.println("num = " + num);
        ++num;
        System.out.println("num = " + num);
        --num;
        System.out.println("num = " + num);

        // 2. 증감연산자를 다른 연산자와 함께 사용
        /* 필기.
        *   주의사항
        *   ++, --의 증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다.
        *   다른 연산자와 함께 사용할 때 증감 연산자의 의미
        *   '++num' = 피연산자의 값을 먼저 1 증가시킨 후 다른 연산 진행
        *   'num++' = 다른 연산자를 먼저 진행한 후 마지막에 피연산자 값을 1 증가
        * */
        int firstNum = 20;
        System.out.println("firstNum = " + firstNum);
        int result1 = firstNum++ * 3;
        System.out.println("firstNum++ * 3 = " + result1);
        System.out.println("firstNum = " + firstNum);

        int secondNum = 20;
        System.out.println("secondNum = " + secondNum);
        int result2 = ++secondNum * 3;
        System.out.println("++secondNum * 3 = " + result2);
        System.out.println("secondNum = " + secondNum);

        int thirdNum = 20;


    }

}
