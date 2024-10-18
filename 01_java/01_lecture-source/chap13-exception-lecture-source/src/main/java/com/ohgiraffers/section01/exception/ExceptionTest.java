package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 계신 돈은 " + money + "원입니다.");

        if (money >= price) {
            System.out.println("상품을 구매할 자격이 있습니다.");
        } else {
            // 돈이 부족
            /* 필기.
            *   강제로 예외를 발생시키는 방법
            *   throw new 예외클래스명();
            * */
            throw new Exception();

        }

        System.out.println("즐거운 쇼핑하세요~~~~");

    }
}
