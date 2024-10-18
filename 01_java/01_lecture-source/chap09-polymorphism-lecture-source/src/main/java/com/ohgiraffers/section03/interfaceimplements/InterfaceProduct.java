package com.ohgiraffers.section03.interfaceimplements;

public interface InterfaceProduct {

    /* 필기.
    *   인터페이스의 특징은 상수 필드만 작성이 가능하다.
    *   public static final 키워드 조합을 상수 필드라고 한다.
    *   반드시 선언과 동시에 초기화를 해주어야 한다.
    * */

    public static final int MAX_NUM = 100;

    /* 필기.
    *   인터페이스는 추상메소드만 작성이 가능하다.
    *   따라서 인터페이스 내부에 작성한 메소드는 묵시적으로 pulic abstract 의 의미를 가지게 된다.
    * */

    //1. 인터페이스는 생성자를 가질  수 없다.
//    public InterfaceProduct() {}

    //2. 인터페이스는 구현부가 있는 메소드를 가질 수 없다.
//    public void nonstaticMethod() {}

    //3. 추상클래스에서 작성해본 추상메소드만 작성할 수 있다.
    /* 필기.
    *   인터페이스 내부의 메소드는 묵시적으로 public abstract 의 의미를 가지고 있다.
    * */
//    public abstract void nonStaticMethod();     //회색은 쓰지 않아도 되는 걸 의미
    void nonStaticMethod();

}
