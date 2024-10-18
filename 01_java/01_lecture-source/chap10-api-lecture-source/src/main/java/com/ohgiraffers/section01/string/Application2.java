package com.ohgiraffers.section01.string;

public class Application2 {

    public static void main(String[] args) {
        //24.09.12 12:30
        //문자열 객체를 만드는 방법과 인스턴스가 생성되는 방식

        /* 필기.
        *   문자열 객체를 만드는 방법
        *   1. "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (싱글톤)
        *   2. new String("문자열")
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        // 리터럴 형태로 만든 문자열 인스턴스는 동일한 값을 가지게 되면 하나의 인스턴스로 관리하게 된다. (싱글톤)
        // 따라서 주소값을 비교하는 == 연산으로 비교시 서로 동일한 주소를 비교하여 true 를 반환한다.
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str3 == str4 : " + (str3 == str4));


        /* 필기.
        *   문자열의 가장 큰 특징은 불변이다.
        *   기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는 것이 아닌, 새로운 문자열을 할당하게 된다.
        * */
        str1 += "mysql";
        System.out.println("str1 == str2 : " + (str1 == str2));

        /* 필기.
        *   equals() : 인스턴스를 비교하는 것이 아닌(주소값) 문자열 갑을 비교하여
        *              동일한 값을 가지는 경우에는 true,
        *              다른 값을 가지는 경우에는 false 를 반환하도록 되어있다.
        *   따라서 인스턴스 생성 방식과 상관없이 값이 같은 지를 확인하기
        *   위해서는 == 연산 대신, equals() 메소드를 사용해야 한다.
        * */




    }

}
