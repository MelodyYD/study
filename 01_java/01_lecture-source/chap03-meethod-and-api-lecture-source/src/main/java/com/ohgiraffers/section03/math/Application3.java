package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {
        //24.08.30 11:50
        //java.util.Random 클래스를 사용해서 난수 발생
        
        /*  필기.
        *   random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값;
        * */

        Random random = new Random();
        int ranNum = random.nextInt(10);
        System.out.println("ranNum = " + ranNum);
        
        // 1 ~ 10
        int ranNum1 = random.nextInt(10) + 1;
        System.out.println("ranNum1 = " + ranNum1);
               
        // 10 ~ 15
        int ranNum2 = random.nextInt(6) + 10;
        System.out.println("ranNum2 = " + ranNum2);
        
        // -127 ~ 128
        int ranNum3 = random.nextInt(256) - 127;
        System.out.println("ranNum3 = " + ranNum3);

    }

}
