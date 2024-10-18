package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {
        // 인터페이스(interface)에 대해 이해할 수 있다.

        /* 필기.
        *   인터페이스도 추상클래스와 마찬가지로 클래스의 변형체이다.
        *   추상메소드와 상수필드만 가질 수 있는 특징이 있다.
        * */

        /* 필기.
        *   인터페이스의 사용 목적
        *   1. 추상클래스와 비슷하게 필요한 기능을 공통화해서 강제성을 부여할 목적
        *   2. 자바가 가진 단일상속의 단점을 극복할 수 있다.(다중 상속 가능)
        * */

        //인터페이스도 인스턴스를 생성할 수 없다.
//        InterfaceProduct interfaceProduct = new InterfaceProduct();

        //다형성을 이용해서 자식 타입의 인스턴스로 사용할 수 있다.
        InterfaceProduct interfaceProduct = new Product();

        //동적 바인딩을 통해 오버라이딩 된 메소드로 호출이 된다.
        interfaceProduct.nonStaticMethod();




    }

}
