package com.ohgiraffers.section04.constructor;

import java.time.LocalDateTime;

public class UserDTO {
    //24.09.09 10:50

    private String id;
    private String pwd;
    private String name;
    private LocalDateTime enrollDate;       //필드로 다른 클래스 자료형도 사용 가능(회원가입일시)

    /* 필기.
    *   생성자의 작성 위치
    *   작성 위치는 클래스 내부에 작성하면 되지만,
    *   통상적으로는 필드와 메소드 선언부 사이에 작성하는 것이 암묵적 관례이다.
    * */

    /* 필기.
    *   생성자의 사용 목적
    *   1. 인스턴스(객체) 생성 시점에 수행할 명령이 있는 경우 사용
    *   2. 매개변수 있는 생성자의 경우 매개변수로 전달 받은 값으로 필드 초기화하며 인스턴스를 생성할 목적으로 사용한다.
    *   3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않 겠다.
    *      따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도(초기값 전달 강제)
    * */

    /* 필기.
    *   생성자 작성 방법
    *   [표현식]
    *    접근제한자 클래스명(매개변수) {
    *        인스턴스 생성 시점에 수행할 코드(주로 필드 초기화)
    *        this.필드명 = 매개변수;
    *    }
    *
    *   생성자 작성 시 주의점!!!
    *   1. 생성자 메소드는 반드시!!!!! 클래스의 이름과 동일해야한다. (대소문자까지!!!)
    *   2. 생성자 메소드는 반환형을 작성하지 않는다. (작성시에는 생성자가 아닌 메소드로 인식)
    * */

    // 1. 기본 생성자 : 메소드?를 전달받지 않은 기본 상태
    public UserDTO() {
        System.out.println("UserDTO 의 기본생성자 호출됨...");
    }


    // 동일한 이름을 가진 생성자 혹은 메소드는 한 클래스 안에서 작성하는 건 불가능하다.
//    public UserDTO() {}

    // 2. 매개변수가 있는 생성자
    public UserDTO(String id, String pwd, String name) {
        /* 필기.
        *   id, pwd, name 의 초기화를 담당하는 생성자
        *   - 분명 동일한 이름을 사용했지만, 컴파일 오류가 발생하고 있지 않다.
        *   - 매개변수 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라 동일한 이름을 가진 생성자 혹은 메소드를 여러개 작성할 수 있음을 의미한다.
        *   - 오버로딩(overLoading)
        * */
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("UserDTO 의 매개변수가 있는 생성자 호출함...");
    }

    // 3. 모든 필드를 초기화하는 생성자
    public UserDTO(String id, String pwd, String name, LocalDateTime enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("모든 필드를 초기화하는 생성자 호출됨...");
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
