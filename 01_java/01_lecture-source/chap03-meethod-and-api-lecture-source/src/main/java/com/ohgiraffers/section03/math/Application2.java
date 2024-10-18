package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {
        //24.08.30 11:15
        //random() 사용해서 사용자 지정 범위의 난수 발생

        /*  난수의 활용
        *   Math.random() 을 이용하게 되면 0부터 1 전까지의 실수값을 반환해준다.
        *   필요에 따라서 실수가 아닌 정수를 출력하고자 하거나, 특정 범위(8~20)의 난수를 하고 싶을 땐 방법이 있다.
        * */

        /*  필기.
        *   원하는 범위의 난수를 구하는 공식
        *   (int)(Math.random() * 구하려는 난수의 갯수 + 구하려는 난수의 최소값)
        * */

        // 1. 0 ~ 9 까지의 난수 발생
        int random1 = (int)(Math.random() * 10) + 0;
        System.out.println("0 ~ 9 숫자 뽑기 : " + random1);

        // 문제. 1 ~ 10
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("1 ~ 10 숫자 뽑기 : " + random2);

        // 문제. 10 ~ 15
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("10 ~ 15 숫자 뽑기 : " + random3);

        // 문제. -128 ~ 127
        int random4 = (int)(Math.random() * 256) - 128;
        System.out.println("-128 ~ 127 숫자 뽑기 : " + random4);

    }

}
