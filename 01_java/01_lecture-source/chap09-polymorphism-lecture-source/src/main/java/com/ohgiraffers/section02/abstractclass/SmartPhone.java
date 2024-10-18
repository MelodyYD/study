package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product {
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 오버라이딩 강제화된 abstMethod() 호출됨...");
    }

    //상속 복습 : 부모의 것 뿐만아니라 자기만의 기능을 가질 수 있다.
    public void childMethod() {
        System.out.println("SmartPhone 클래스의 childMethod() 호출됨...");
    }

}
