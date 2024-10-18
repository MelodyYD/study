package com.ohgiraffers.section01.polymorphism;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("옴뇸뇸뇸");
    }

    @Override
    public void run() {
        System.out.println("토다다닥");
    }

    @Override
    public void cry() {
        System.out.println("먀아아아아아아악!!!!!!!!!");
    }

    // 자식은 부모의 메소드 재정의 뿐 아니라 본인의 기능도 가질 수 있다.
    public void Grrrr() {
        System.out.println("골골골골골...");
    }

}
