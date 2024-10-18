package com.ohgiraffers.section04.constructor;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        //24.09.09 10:40
        /* 필기.
        *   생성자란?
        *   우리가 지금까지 클래스명 래퍼런스변수명 = new 클래스명();
        *   이렇게 객체를 만들어왔다.
        *   new 뒤에 클래스명은 사실 생성자(constructor)라고 불리는 메소드를 호출하는 구문이다.
        *   하지만 우리는 지금까지 생성자를 만든 적이 없는데, 매개변수가 없는 생성자는 compiler 에 의해 자동으로 추가되기 때문이다.
        *   그래서 지금까지 우리가 작성하지 않고도 사용할 수 있었다.
        * */

        UserDTO user = new UserDTO();
        System.out.println("user 의 초기값 : " + user.toString());

        /* 필기.
        *   기본 생성자로 인스턴스를 생성하게 되면 jvm 이 제공하는 기본값들로 값이 초기화가 된다.
        *   하지만 우리가 초기값을 원하는대로 생성하자마자 넣고 싶으면 매개변수가 있는 생성자로 값을 인자로 전달하면 된다.
        *   주의점!!!
        *    : 만약에 매개변수가 있는 생성자가 존재한다면 기본 생성자는 컴파일러가 자동으로 추가해주지 않는다.
        *      따라서 이 점을 주의해야 한다.
        * */

        UserDTO user2 = new UserDTO("user01", "pass01", "윤이정");
        System.out.println("user2의 초기값 : " + user2.toString());

        UserDTO user3 = new UserDTO("user01", "pass01", "윤이정", LocalDateTime.now());
        System.out.println("user3의 초기값 : " + user3.toString());

    }

}
