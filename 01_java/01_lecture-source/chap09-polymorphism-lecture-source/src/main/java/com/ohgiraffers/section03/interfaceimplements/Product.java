package com.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterfaceProduct, java.io.Serializable {
    //interface 를 상속받을 때에는 implements 키워드를 사용한다.

    /* 필기
    *   클래스에서 인터페이스를 상속 받을 때에는 implements 키워드를 사용하게 된다.
    *   또한 인터페이스는 여러 개를 상속받을 수 있으며,
    *   extends 로 다른 클래스를 상속 받는 경우에도 별개로 추가 상속 가능하다.
    *   단, extends 가 implements 보다 앞에 작성되어야 한다.
    *  */

    @Override
    public void nonStaticMethod() {
        System.out.println("InterfaceProduct 의 nonStaticMethod 호출...");
    }



}
