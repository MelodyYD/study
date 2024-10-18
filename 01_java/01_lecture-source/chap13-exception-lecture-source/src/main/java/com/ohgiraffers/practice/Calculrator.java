package com.ohgiraffers.practice;

import com.ohgiraffers.practice.exception.DivideNotZeroException;
import com.ohgiraffers.practice.exception.MultipleNotZeroException;

public class Calculrator {

    public void divitionCalc(int firstNum, int secondNum, char operator)
            throws DivideNotZeroException,
                   MultipleNotZeroException {
        switch (operator) {
            case '+':
                System.out.println(firstNum + " " + operator + " " + secondNum + " = " + addition(firstNum, secondNum));
                break;
            case '-':
                System.out.println(firstNum + " " + operator + " " + secondNum + " = " + subtract(firstNum, secondNum));
                break;
            case '*':
                if (secondNum == 0) {
                    throw new MultipleNotZeroException("곱하는 수는 0이 될 수 없습니다.");
                } else {
                    System.out.println(firstNum + " " + operator + " " + secondNum + " = " + multiply(firstNum, secondNum));
                }
                break;
            case '/':
                if (secondNum == 0) {
                    throw new DivideNotZeroException("나눌 수는 0이 될 수 없습니다.");
                } else {
                    System.out.println(firstNum + " " + operator + " " + secondNum + " = " + divide(firstNum, secondNum));
                }
                break;
            case '%':
                System.out.println(firstNum + " " + operator + " " + secondNum + " = " + remainder(firstNum, secondNum));
                break;
            default:
                System.out.println("연산 기호를 올바르게 입력해 주세요.");
                break;
        }
    }

    private int addition (int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    private int subtract (int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
    private int multiply (int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    private int divide (int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
    private int remainder (int firstNum, int secondNum) {
        return firstNum % secondNum;
    }

}
