package com.ohgiraffers.section02.abstractclass;

public class Application {

    public static void main(String[] args) {
        //24.09.12 09:55
        //추상 클래스와 추상 메소드에 대해 이해할 수 있다.

        /* 필기.
        *   추상클래스와 추상메소드
        *   추상메소드를 0개 이상 가지고 있는 클래스를 추상클래스라고 한다.
        *   추상클래스는 클래스 선언부에 abstract 라고 명시해야 한다.
        *   추상클래스는 클래스인 척하는 녀석이기 때문에 직접적으로 인스턴스를 생성할 수 없다.
        *   그렇기 때문에 추상클래스를 사용하기 위해서는 상속 받은 자식클래스를 이용하여 인스턴스를 생성해야 한다.
        * */

        // 1. 추상클래스는 인스턴스를 생성할 수 없다.
//        Product product = new Product();

        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);


        // static 메소드는 인스턴스 생성이 불필요
        Product.staticMethod();

        /* 필기
        *
        * */


    }

}
