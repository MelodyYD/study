package com.ohgiraffers.section01.string;

import java.util.StringTokenizer;

public class Application3 {

    public static void main(String[] args) {

        /* 필기.
         *   split() : 정규표현식을 이용해서 문자열을 분리한다.
         *             공백 문자열도 포함한다.
         *             정규표현식은 속도가 느리다는 단점을 가지고 있고
         *             자바에서는 다루지 않고 자바스크립트에서 간단히 볼 예정이다.
         *   StringTokenizer
         *   -> 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
         *      공백 문자열을 무시할 수 있다.
         *      정규표현식을 사용하지 않아 split() 보다 속도면으로 빠르다.
         *      구분자를 생략하는 경우에는 공백을 기준으로 구분한다.
         * */

        //                  사번/이름/주소/부서
        String employee1 = "100/홍길동/서울/영업부";
        String employee2 = "200/유관순//총무부";      //주소 없음
        String employee3 = "300/이순신/경기도/";      //부서 없음

        String[] emp1Arr = employee1.split("/");
        String[] emp2Arr = employee2.split("/");
        String[] emp3Arr = employee3.split("/");

        for (int i = 0; i < emp1Arr.length; i++) {
            System.out.print(emp1Arr[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < emp2Arr.length; i++) {
            System.out.print(emp2Arr[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < emp3Arr.length; i++) {
            System.out.print(emp3Arr[i] + "  ");
        }
        System.out.println();


        //전달인자 (분리하고 싶은 문자열, 구분 기호)
        StringTokenizer st1 = new StringTokenizer(employee1, "/");
        StringTokenizer st2 = new StringTokenizer(employee2, "/");
        StringTokenizer st3 = new StringTokenizer(employee3, "/");

        //StringTokenizer 는 인덱스 체계가 아니라 조건문 사용이 불가하다.
        while (st1.hasMoreTokens()) {
            System.out.println("st1 : " + st1.nextToken());
        }

        while (st2.hasMoreTokens()) {
            System.out.println("st2 : " + st2.nextToken());
        }

        while (st3.hasMoreTokens()) {
            System.out.println("st3 : " + st3.nextToken());
        }


    }

}
