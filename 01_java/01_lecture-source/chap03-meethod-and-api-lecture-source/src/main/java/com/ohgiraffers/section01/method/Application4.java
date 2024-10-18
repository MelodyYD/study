package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {
        //24.08.29 10:55
        //수업목표. 여러 개의 전달 인자를 이용한 메소드 호출 테스트

        // 2. 여러 개 매개변수를 가진 메소드 호출하기.
        Application4 app4 = new Application4();
        app4.testArgsMethod("윤이정",27,'F');
        // 순서가 바뀌면 알아듣지 못한다.


    }

    // 1. 여러개의 전달인자를 받을 수 있는 메소드 만들기
    public void testArgsMethod(String name, int age, final char gender) {

        /* 필기
        *  매개변수도 일종의 지역변수로 분류된다.
        *  매개변수 역시 상수의 의미를 가지는 final 키워드를 사용할 수 있다.
        *  (지역변수에 final 키워드를 붙이는 것과 동일하다.)
        * */

        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + "입니다.");

    }

}
