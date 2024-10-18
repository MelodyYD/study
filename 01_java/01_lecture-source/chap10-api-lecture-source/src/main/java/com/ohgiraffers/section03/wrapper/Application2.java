package com.ohgiraffers.section03.wrapper;

public class Application2 {

    public static void main(String[] args) {
        // 문자열 파싱(parsing) 에 대해 이해할 수 있다.

        /* 필기.
        *   parsing 이란?
        *    : 문자열(String) 값을 기본자료형 값으로 변경하는 것.
        * */

        /* 필기.
        *   기본자료형은 넘겨진 문자열을 스스로 바꿀 수 있는 기능이 없다.
        *   따라서 byte 의 Wrapper 클래스인 Byte 가 가지고 있는 parseByte(); 메소드를 사용해서
        *   문자열 값을 Byte 형으로 변경할 수 있다.
        * */
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");
//        char c = Character.par;     //Character 는 parsing 제공하지 않는다.
        // 하지만 우리에겐 CharAt() 이 있다.
        char c = "ABC".charAt(0);

    }

}
