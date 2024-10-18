package com.ohgiraffers.section01.method;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application9 {

    public static void main(String[] args) {

        //24.08.29 14:50
        //다른 클래스에 작성한 메소드를 호출할 수 있다.

        /* 필기.
        *  우리는 Application에서 2개의 정수를 전달할 것이고,
        *  Calculator 클래스에는 2개의 정수를 전달 받아
        *  최솟값을 구하는 메소드(기능)
        *  최댓값을 구하는 메소드(기능)
        *  실행 후 Application에게 2개의 정수 중 큰 값과 작은 값이 무엇인지 알려줄 것이다.
        * */

        int first = 10;
        int second = 18;

        //non-static method 호출 방식
        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first, second);

        //static method 호출 방식
        int max = maxNumberOf(first, second);

        /* 필기.
        *  static 메소드도 non-static 메소드처럼 호출은 가능하다.
        *  하지만 권장하지 않는다.
        *  원래 방식이 있는데 굳이 그럴 필요가 없기 때문.
        *  이미 메모리에 로딩이 되어 있는 static 메소드는 여러 객체가 공유하게 된다.
        *  new 키워드로 접근을 하게 된다면 공유된 값에 예상치못한 동착을 유발할 수 있기 때문에 사용을 제한해달다는 컴퓨터 주의 문구다.
        * */
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }

}
