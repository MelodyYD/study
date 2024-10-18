package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {
        //JDK = java development kit
        //JRE = java runtime enviroment
        //JVM = java virtual memory(machine)

        //Math 클래스에서 제공하는 static 메소드를 호출할 수 있다.

        /*  API란?
        *   Application Programming Interface
        *   프로그램에서 사용할 수 있도록 운영체제나 프로그래밍 언어가 제공하는 기능을 이용(제어)할 수 있도록 만든 인터페이스
        *   구현하기 힘들거나 번거로운 기능을 JDK만 설치하게 되면 사용할 수 있도록 제공해둔 소스코드를 의미
        *   우리는 가져와서 사용만 하면 된다.
        * */

        // 1. 절대값 출력해보기
        System.out.println("-7의 절댓값 구하기 : " + (Math.abs(-7)));

        // 2. 최대값과 최솟값 출력해보기
        System.out.println("10과 20 중 더 큰 값은 : " + (Math.max(10,20)));

        // 3. 난수 출력
        System.out.println("랜덤 값 출력 : " + Math.random());


    }

}
