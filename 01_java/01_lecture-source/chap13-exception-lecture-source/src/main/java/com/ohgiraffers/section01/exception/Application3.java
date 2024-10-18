package com.ohgiraffers.section01.exception;

public class Application3 {

    public static void main(String[] args) {

        // 3.

        ExceptionTest et = new ExceptionTest();


        // try 구문 내에서 예외가 발생하면 catch 구문이 동작한다.
        try {
            // 상품 가격이 더 높게 만들 것이다.
            et.checkEnoughMoney(50000, 10000);
            System.out.println("======================= 상품 구입 가능 =======================");
        } catch (Exception e) {
            System.out.println("====================== 상품 구입 불가능 ======================");
//            throw new RuntimeException(e);
        }

        System.out.println("프로그램을 종료합니다.");

    }

}
