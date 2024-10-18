package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {
        //24.08.28
        //수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다.

        /* 필기.
        *  메소드란?
        *  메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문(코드의 집합).
        * */

        System.out.println("main() 시작됨...");

        // 2. 작성한 methodA () 호출하기
        /* 우리가 만든 메소드 호출하는 방법
            표현식
            클래스명  변수명 = new 클래스명();
            변수명.메소드명();
         */

        //main 영역 밖에 있는 걸 호출하는 방법
        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 종료됨...");
    }

    // 1. method() 만들어보기
    public void methodA() {

        System.out.println("methodA() 등장...");

        methodB();

        System.out.println("methodA() 퇴장...");

    }

    public void methodB() {

        System.out.println("method B 두둥장...");
        System.out.println("method B 퇴장한다...");

    }


    }
