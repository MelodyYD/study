package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {
        //24.09.13 12:35
        /* 필기.
        *   와일드카드(WildCard)
        *   제네릭 클래스 타입의 객체를 메소드의 매개변수 받을 때 그 객체의 타입 변수를 제한할 수 있다.
        *   <?> : 제한 없음 (다 가능)
        *   <? extends Type> : 와일드카드 상한 제한(Type 과 Type 의 후손을 이용한 인스턴스만 인자로 사용 가능)
        *   <? super Type> : 와일드카드 하한 제한(Type 과 Type 의 부모를 이용한 인스턴스만 인자로 사용 가능)
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));
        System.out.println();

        /* 필기.
        *   Bunny 이거나 Bunny 의 후손 토끼 농장만 매개변수로 사용이 가능하고, 상위 타입인 Rabbit 은 매개변수로 사용이 불가능하다.
        * */
//        wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));
        System.out.println();

        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));




    }

}
