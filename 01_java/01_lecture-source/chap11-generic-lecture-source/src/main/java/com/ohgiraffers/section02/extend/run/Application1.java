package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        //extends 키워드를 사용해서 특정 타입만 사용할 수 있도록 범위를 제한할 수 있다.

        // Animal은 Rabbit이거나 Rabbit의 후손이 아니다.
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> rabbitFarm = new RabbitFarm<Mammal>();

        //extends 키워드로 Rabbit 후손들은 인스턴스 생성이 가능하다.
        RabbitFarm<Rabbit> farm3 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm4 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm5 = new RabbitFarm<>();


        farm3.setAnimals(new Rabbit());
        farm3.getAnimals().cry();

        farm4.setAnimals(new Bunny());
        farm4.getAnimals().cry();

        farm5.setAnimals(new DrunkenBunny());
        farm5.getAnimals().cry();




    }

}
