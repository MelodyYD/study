package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {
        //24.09.10 12:50
        // 객체 배열에 대해서 이해할 수 있다.


        /* 필기
        *   객체 배열이란, 레퍼런스 변수에 대한 배열이다.
        *   생성한 인스턴스도 배열을 이용해서 관리를 하게 된다면,
        *   동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속처리를 할 수 있게 되어서 유용하다.
        *   또한 메소드의 반환값(return) 은 1개의 값만 반환할 수 있기 때문에
        *   동일한 타입의 여러 인스턴스를 반환해야 하는 경우 배열로 묶어서 반환할 수 있게 된다.
        * */

        Car car1 = new Car("페라리",300);
        Car car2 = new Car("6바겐", 200);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티", 400);
        Car car5 = new Car("케스퍼", 500);

        car1.carMaxSpeedInfo();
        car2.carMaxSpeedInfo();
        car3.carMaxSpeedInfo();
        car4.carMaxSpeedInfo();
        car5.carMaxSpeedInfo();

        System.out.println();
        System.out.println("==================================================");
        System.out.println();

        Car[] carArr = new Car[5];

        carArr[0] = new Car("페라리",300);
        carArr[1] = new Car("6바겐", 200);
        carArr[2] = new Car("롤스로이스", 250);
        carArr[3] = new Car("부가티", 400);
        carArr[4] = new Car("케스퍼", 500);
        //배열의 장점 : 규칙이 있기 때문에 반복문을 사용할 수 있다.

        for (int i = 0; i < carArr.length; i++) {
            carArr[i].carMaxSpeedInfo();
        }

        //향상된 for문도 사용 가능
        for (Car c : carArr) {
            c.carMaxSpeedInfo();
        }

    }

}
