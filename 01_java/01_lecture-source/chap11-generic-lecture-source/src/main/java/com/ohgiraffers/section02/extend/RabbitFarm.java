package com.ohgiraffers.section02.extend;

// RabbitFarm 은 말그대로 토끼를 위한 농장
public class RabbitFarm<T extends Rabbit> {

    /* 필기.
    *   <T extends Rabbit> 의 의미
    *   타입 변수(T)가 어떤 녀석이 될 지 모른다.
    *   하지만 extends Rabbit 이라고 설정하게 되면 토끼이거나 토끼를 상속받는 녀석은 다 가능하다.
    *
    * */

    private T animals;

    //기본 생성자
    public RabbitFarm() {}

    //모든 필드를 초기화하는 생성자
    public RabbitFarm(T animals) {
        this.animals = animals;
    }

    public T getAnimals() {
        return animals;
    }

    public void setAnimals(T animals) {
        this.animals = animals;
    }
}
