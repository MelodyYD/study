package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    //클래스가 초기화되는 시점에는 정적 필드로 선언
    private static LazySingleton lazy;

    //마찬가지로 생성자를 통한 인스턴스 생성 제한.
    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (lazy == null) {
            //인스턴스가 생성된 적이 없으면
            //한 번이라도 생성이 되었다면 바로 return
            lazy = new LazySingleton();
        }

        return lazy;
    }
}
