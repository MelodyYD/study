package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    //다형성을 적용하여 리턴타입에 활용할 수 있다.

    public static void main(String[] args) {
        //24.09.11 16:05
        /*
        *   랜덤한 동물 인스턴스를 반환 받아 울부짖게 만들기
        * */

        Application3 app3 = new Application3();
        Animal random = app3.getRandomAnimal();

        random.cry();


    }

    public Animal getRandomAnimal() {

        // 강아지 고양이 2개
        int random = (int)(Math.random()*2);

        return random == 0 ? new Dog() : new Cat();

    }

}
