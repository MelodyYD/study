package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        //24.08.29 11:15
        //수업목표. 메소드 리턴에 대해서 이해할 수 있다.

        /* 필기.
        *  return이란?
        *  모든 메소드 내부에는 return;이 존재한다.
        *  void 형의 메소드는 return; 을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가를 해준다.
        *  return은 현재 메소드를 강제 종료하고 호출한  구문으로 돌아가는 명령어이다. ✨✨✨✨
        * */

        System.out.println("main 시작함...");

        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main 종료됨...");

    }

    public void testMethod() {

        System.out.println("testMethod() 호출됨...");

        System.out.println("testMethod() 종료됨...");

        return; //회색은 안 써도 되는 것 혹은 안 쓰고 있는 것

//        System.out.println("끝났나?");
        //return 아래로 작성된 건 도달하지도 않기에 오류가 발생한다.

        /* 필기.
        *  return 티워드는 컴파일러에 의해 자동으로 가장 마지막 줄에 추가된다.
        *  만약 가장 마지막 줄에 쓰지 않게 되면, 도달할 수 없는 코드가 되어 컴파일 에러를 발생시킨다.
        * */

    }

}
