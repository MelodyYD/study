package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    // 추상클래스는 필드를 가질 수 있다.
    private int nonStaticField;
    private static int staticField;

    // 생성자도 가질 수 있다.
    public Product() {}

    // 일반적인 메소드도 가질 수 있다.
    public void nonStaticMethod() {
        System.out.println("Product 의 nonStatic 메소드 호출됨...");
    }

    public static void staticMethod() {
        System.out.println("Product 의 static 메소드 호출됨...");
    }

    /* 필기.
    *   위에까지는 일반적인 클래스와 다를 바가 없다.
    *   하지만 클래스를 추상클래스로 만들게 되면 추상 메소드를 작성할 수 있다.
    *   미완성 메소드(추상 메소드) : 구현부가 없는 메소드를 의미한다.
    *   추상메소드가 0개 이상인 경우 선택적으로 abstract 키워드를 클래스에 작성해야 한다.
    *   하지만 추상메소드가 존재(1개 이상)하면 abstract 키워드는 필수다.
    * */

    public abstract void abstractMethod();

}
