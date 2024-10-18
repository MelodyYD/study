package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {
    /* 필기.
    *   final : 종단의 의미를 가지는 키워드이다.
    *   final 키워드는 사용하는 위치가 다양하지만, 결국 변경 불가의 의미를 갖는다.
    *   1. 지역변수 : 초기화 이후 값 변경 불가
    *   2. 매개변수 : 호출 시 전달한 인자 변경 불가
    *   3. 전역변수 : 인스턴스 생성 후 초기화 이후 값 변경 불가
    *   4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
    *   5. non-static 메소드 : 메소드 재작성(overriding) 불가
    *   6. static 메소드 : 메소드 재작성(overriding) 불가
    *   7. 클래스 : 상속 불가
    * */

    // 1. non-static 필드에 final 사용
    // 인스턴스가 생성될 때 int 자료형의 기본값인 0이 필드에 들어가는데,
    // 초기화 이후 값을 변경할 수 없기 때문에 바로 초기화를 시켜주어야 한다.
    // 그렇지 않으면 compile error 가 발생한다.
//    private final int nonStaticNum;

    // 1-1. 해결방안(1) : 선언과 동시에 초기화를 한다.
    private final int NON_STATIC_NUM = 1;

    // 1-2. 해결방안(2) : 생성자를 통해 초기화를 한다.
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }

    // 2. static 필드에 final 키워드 사용
//    private static final int STATIC_NUM;    //0 이라는 기본값이기 때문에 오류 발생

    private static final double PI = 3.14;

    /* 필기.
    *   static 이 붙은 키워드는 생성자를 이용한 초기화가 불가능하다.
    *   생성자는 인스턴스가 생성되는 시점(new 를 만나는 시점) 에 호출이 되기 때문에 그 전에는 초기화가 일어나지 못한다.
    *   하지만 static 키워드는 프로그램이 run 하는 동시에 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하여
    *   기본값으로 초기화 된 후 값을 변경하지 못하게 되면서 에러가 발생한다.
    * */

    private static final double STATIC_DOUBLE;
//    public FinalFieldTest(double staticDouble) {
//        this.STATIC_DOUBLE = staticDouble;
//    }

    // 정적 초기화 블록으로 초기화 할 수 있다.
    static {
        STATIC_DOUBLE = 0.5;
    }

}
