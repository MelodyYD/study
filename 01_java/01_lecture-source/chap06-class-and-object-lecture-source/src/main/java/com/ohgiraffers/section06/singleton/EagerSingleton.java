package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    // 클래스가 초기화되는 시점에 인스턴스를 생성한다.
    private static EagerSingleton eager = new EagerSingleton();

    // singleton 패턴은 외부에서 생성자를 통해 인스턴스 생성을 못하게 제한한다.
    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return eager;
    }


}
