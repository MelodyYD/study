package com.ohgiraffers.section02.copy;

import com.sun.security.jgss.GSSUtil;

public class Application2 {

    public static void main(String[] args) {
        //

        /* 필기
        *   얕은 복사의 활용
        *
        *   리턴 값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
        * */

        String[] names = {"푸바오", "러바오", "아이바오"};

        //얕은 복사 확인을 위해 해시태그 출력
        System.out.println("names : " + names.hashCode());

        //우리가 만든 배열을 출력하는 기능을 가진 메소드에 전달
        //우리가 값을 보내 면 -> 받는 곳도 값을 받는 준비를 해야한다.

        // 1.
        print(names);

        // 2. 리턴값으로 활용
        String[] animals = getAnimals();
        System.out.println("animals : " + animals.hashCode());

    }

    // print() 메소드의 역할은 우리가 전달한 배열을 출력하는 역할이다.
    public static void print(String[] baoFamily) {
        System.out.println("baoFamily : " + baoFamily.hashCode());
        for (int i = 0; i < baoFamily.length; i++) {
            System.out.print(baoFamily[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals() {
        String[] animals = {"후이바오", "루이바오"};
        System.out.println("animals : " + animals.hashCode());

        return animals;
    }

}
