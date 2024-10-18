package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    //다형성을 사용해서 객체 배열을 만들어 연속처리를 할 수 있다.

    public static void main(String[] args) {
        //24.09.11 13:55
        Animal[] animal = new Animal[5];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Dog();
        animal[3] = new Cat();
        animal[4] = new Dog();

        for(int i = 0; i < animal.length; i++) {
            animal[i].cry();
        }

        for(int i = 0; i < animal.length; i++) {
            // 동물들아 너희가 개면 물고 냥이면 골골거려라
            if (animal[i] instanceof Dog) {
                ((Dog) animal[i]).bite();
            } else if (animal[i] instanceof Cat) {
                ((Cat) animal[i]).Grrrr();
            }
        }

    }

}
