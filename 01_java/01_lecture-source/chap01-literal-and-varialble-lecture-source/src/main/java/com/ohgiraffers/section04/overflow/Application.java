package com.ohgiraffers.section04.overflow;

public class Application {

    public static void main(String[] args) {
        //24.08.27 09:50
        //수업 목표. 오버플로우

        /* 필기.
        *  자료형 별 최대 범위를 벗어나는 경우를 오버플로우라고 한다.
        * */

        // 1. 오버플로우
        byte num1 = 127;
        // byte의 최대 저장 범위는 127
        System.out.println("num1 = " + num1);

        num1++; // num1 + 1; 1 증가
        System.out.println("num1 overflow 확인하기 = " + num1);

        // 2. 언더플로우
        byte num2 = -128;
        System.out.println("num2 = " + num2);

        num2--; // num2 - 1; 1 감소
        System.out.println("num2 underflow 확인하기 = " + num2);

        // 오버플로우와 언더플로우가 발생했으나, 컴파일 오류가 발생하지 않는다.
        // 그렇기 때문에

        int firstNum = 1000000;
        int secondNum = 700000;
        // int는 양수로 21억 정도까지 저장 가능
        int multi = firstNum * secondNum;
        System.out.println("multi = " + multi);
        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);
        // 더 넓은 공간을 마련했음에도 불구하고 값이 이상하게 나온다.
        // 이미 overflow가 난 값을 저장한 것이기 때문이다.
        // 계산 처리 전에 미리 long으로 자료형을 변경해야 한다.
        
        long result = (long) firstNum * secondNum; // long으로 형태를 맞추어 주자.(강제 형변환) java는 자료형이 명확하다.
        System.out.println("result = " + result);


    }

}
