package com.ohgiraffers.section01.array;

public class Application3 {

    public static void main(String[] args) {
        //24.09.04 12:00
        // 배열에 초기화되는 자료형별 기본값을 알 수 있다.

        /* 필기.
        *   정수 : 0
        *   실수 : 0.0
        *   논리 : false
        *   문자 : \u0000
        *   참조 : null
        * */

        int[] iarr = new int[5];
        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

        /*
        *   자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 경우에는 블럭({})을 사용하면 된다.
        *   블럭을 사용하는 경우에는 new 를 사용하지 않아도 되며,
        *   값의 갯수만큼 자동으로 크기가 설정된다.
        * */

        int[] iarr2 = {11, 22, 33, 44, 55};
        int[] iaar3 = new int[] {11, 22, 33, 44, 55};

        // 들어있는 값 반복으로 출력해보기
        for(int i = 0; i < iarr2.length; i++) {
            System.out.println("iarr2[" + i + "] = " + iarr2[i]);
        }

        String[] sarr = {"apple", "banana", "orange", "3"};
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "] = " + sarr[i]);
        }



    }

}
