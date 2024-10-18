package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    // RabbitFarm<>
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimals().cry();
    }

    // 토끼 농장의 토끼가 Bunny 이거나 그의 후손 타입으로 만들어진 토끼 농장만 매개변수로 사용 가능
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimals().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimals().cry();
    }

}
