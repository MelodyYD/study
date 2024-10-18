package com.ohgiraffers.section02.assginment;

public class Applicaton1 {

    public static void main(String[] args) {

        //24.08.27 15:00
        //학습목표. 대입연산자와 산술 복합 대입 연산자를 이해할 수 있다.

        /* 필기
        *  ' = '  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
        *  ' += ' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
        *  ' -= '
        *  ' *= '
        *  ' /= '
        *  ' %= '
        * */

        int num = 12;
        System.out.println("num = " + num);
        num += 3;
        System.out.println("num = " + num);
        num -= 5;
        System.out.println("num = " + num);
        num *= 2;
        System.out.println("num = " + num);
        num /= 2;
        System.out.println("num = " + num);
        num %= 4;
        System.out.println("num = " + num);


        // =- 등의 연산자가 뒤로 가면 그저 대입해버릴 뿐, 존재하는 연산자 표기가 아니다.

    }

}
