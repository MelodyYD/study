package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        //24.08.29 10:00
        //수업목표. 메소드의 전달 인자와 매개변수에 대해 이해하고 활용할 수 있다.

        /* 필기.
        *  전달인자(argument)와 매개변수(parameter)를 이용한 호출
        *  지금까지 우리가 배운, 즉 사용한 변수는 지역변수에 해당한다.
        *
        *  매개변수는 전달인자에 맞춰 세팅을 해야 한다. (자료형 구조를 맞춰야 한다.)
        *  전달인자 : 값 그 자체 개념
        *  매개변수 : 공간 개념
        * */

        /* 필기.
        *  변수의 종류
        *  1. 지역변수
        *  2. 매개변수
        *  3. 전역변수
        *  4. 클래스(static) 변수
        * */

        /* 필기.
        *  지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다.
        *  이것을 지역변수의 스코프(볌위)라고 한다.
        *  이제 만약 다른 메소드들 끼리 값을 공유해야 하는 경우가 생기면
        *  메소드 호출시에 사용하는 괄호(ex)methodA())를 이용해서 값을 전달할 수 있다.
        *  이때 전달하는 값을 전달인자(argument)라고 부르고,
        *  메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
        * */

        // 2. 만든 메소드 호출해보기
        Application3 testM = new Application3();
//        testM.testMethod(40);
//        testM.testMethod("40"); // 매개변수 공간은 int 형이지만, 인자를 String으로 보내서 오류 발생
//        testM.testMethod(20,30,40); // 매개변수 공간은 하나지만, 인자를 3개 보내서 오류 발생
//        testM.testMethod(); // 매개변수 공간에 int로 공간 준비하였는데, 인자를 보내지 않아서 오류 발생

        // 3. 변수에 저장한 값을 전달 테스트
        int age = 20;
        testM.testMethod(age);

        // 4. 자동형변환을 이용하여 값 전달 테스트
        byte bNum = 10;
        testM.testMethod(bNum);

        // 5. 강제형변환을 이용하여 값 전달 테스트
        long lNum = 30;
        testM.testMethod((int) lNum);

        // 6. 연산 결과를 이용해서 값 전달 테스트
        testM.testMethod( age * 3 );

    }

    public void testMethod(int test) {

        // 1. 호출할 메소드 만들기
        System.out.println("testMethod 호출됨...");

        System.out.println("제 나이는 " + test + "세 입니다.");

        System.out.println("testMethod 종료됨...");

    }

}
