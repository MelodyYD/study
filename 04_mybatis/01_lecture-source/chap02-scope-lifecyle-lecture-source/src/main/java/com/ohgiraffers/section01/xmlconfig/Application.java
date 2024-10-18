package com.ohgiraffers.section01.xmlconfig;

import static com.ohgiraffers.section01.xmlconfig.MybatisTemplate.getSqlSession;

public class Application {

    public static void main(String[] args) {
        // 24.10.07 12:40

        System.out.println(getSqlSession());
        System.out.println(getSqlSession());
        System.out.println(getSqlSession());
        System.out.println(getSqlSession());
        System.out.println(getSqlSession());

    }

}
