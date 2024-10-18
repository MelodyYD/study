package com.ohgiraffers.section02.encapsulation.resolve;

public class Application {

    public static void main(String[] args) {
        //24.09.06 12:55
        //접근제한자를 이해하고 지금까지 발생한 문제를 해결할 수 있다.

        // 1. private 필드에 직접 접근했을 때
        Monster monster1 = new Monster();
//        monster1.kinds = "시진핑";

        /* 필기.
        *   우리가 클래스에 만들어둔 필드(전역변수 == 인스턴스변수)대로 공간은 생성되어 있지만,
        *   private 으로 직접적으로 접근은 막아두고
        *   public 으로 만들어둔 메소드를 통해서만 필드의 값을 대입할 수 있도록 해놓은 것이다.
        *   이것을 캡슐화(encapsulation) 이라고 한다.
        * */



    }

}
