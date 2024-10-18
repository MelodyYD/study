package com.ohgiraffers.practice;

import com.ohgiraffers.practice.exception.DivideNotZeroException;
import com.ohgiraffers.practice.exception.MultipleNotZeroException;
import com.ohgiraffers.practice.exception.NotIntegerNum;

import java.util.Scanner;

public class Application {
    /*
    * 계산기 만들기 연습
        사칙연산을 수행하는 계산기 (+, -, *, /, %)
        *
        요구사항
        Application 클래스와 Calculrator 클래스 구현
        Application 클래스에서는 main 메소드 구현
        Application 클래스에서 Scanner 객체를 사용해서 2 개의 정수, 1 개의 사칙연산 기호를 받는다.
        입력 한 정수를 사칙연산 기호에 따라
        Calculrator 클래스의 각기 다른 사칙연산 메소드로 전달한다.
        사칙연산이 수학적으로 통용되는 상식선에서 정상적으로 돌아가도록 구현
        모든 사칙 연산은 정수로 계산되도록 할 것
        나누기의 경우 나눌 수 가 0인 경우 사용자 정의의 DivideNotZeroException 이 발생하도록 구현
        DivideNotZeroException 클래스는 message 로 "나눌 수는 0이 될 수 없습니다" 출력
        곱하기의 경우 곱하는 수가 0인 경우 사용자 정의의 MultipleNotZeroException 이 발생하도록 구현
        MultipleNotZeroException 클래스는 message 로 "곱하는 수는 0이 될 수 없습니다" 출력
        그 외에 본인이 만들고 싶은 예외사항 있으면 얼마든지 추가 가능
    */

    public static void main(String[] args) throws NotIntegerNum {

        // 계산기 만들기

        // Scanner 객체 사용
        Scanner sc = new Scanner(System.in);
        Calculrator calc = new Calculrator();

        // 2 개의 정수, 1 개의 사칙연산 기호를 받는다.
        System.out.println("정수 계산기 가동!");
        System.out.print("첫 번째 정수 : ");
//        if (!sc.hasNextInt()) {
//            throw new NotIntegerNum("정수를 입력해 주세요.");
//        }
        int firstNum = sc.nextInt();
        System.out.print("계산하려는 사칙연산 : ");
        char operator = sc.next().charAt(0);
        System.out.print("두 번째 정수 : ");
        int secondNum = sc.nextInt();
        System.out.println();
        System.out.println("============ 결과 ============");
        System.out.println();

        try {
            calc.divitionCalc(firstNum, secondNum, operator);

        } catch (DivideNotZeroException e) {
            // 나누기의 경우 secondNum 이 0이라면?
            // DivideNotZeroException 발생
            System.out.println(e.getMessage());

        } catch (MultipleNotZeroException e) {
            // 곱하기의 경우 secondNum 이 0이라면?
            // MultipleNotZeroException 발생
            System.out.println(e.getMessage());

        } //catch (NotIntegerNum f) {
//            // firstNum 혹은 secondNum 이 정수 값이 아니라면?
//            // NotIntegerNum 발생
//            System.out.println(f.getMessage());
//        }


        System.out.println();
        System.out.println("=============================");



    }


}
