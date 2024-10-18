package com.ohgiraffers.section01.polymorphism;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("와구와궁");
    }

    @Override
    public void run() {
        System.out.println("타다닥!!");
    }

    @Override
    public void cry() {
        System.out.println("으르르르르... 왉!!!!!!!");
    }

    public void bite() {
        System.out.println("콰압");
    }

}
