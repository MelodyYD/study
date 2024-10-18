package com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    //1. extends 키워드를 통해 Car 클래스 상속

    //기본 생성자
    public FireCar() {

        /* 필기.
        *   모든 생성자에는 가장 첫줄에 super() 를 컴파일러가 자동으로 추가해준다.
        *   super() -> 부모의 기본 생성자를 호출하는 구문이다.
        *   명시적, 묵시적 둘 다 가능하다.
        * */

        super();

        System.out.println("FireCar의 기본 생성자 호출됨...");
    }

    //2. soundHorn() 메소드 오버라이딩
    @Override
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빠아아아아아아아아아아아아앙 뿅뿅뿅뿅뿅뿅뿅뿅 빠아아아아아아아아아앙");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다.");
        }
    }

    // 3. 물뿌리는 기능 추가
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다!!! 물을 뿌립니다!!!");
    }

}
