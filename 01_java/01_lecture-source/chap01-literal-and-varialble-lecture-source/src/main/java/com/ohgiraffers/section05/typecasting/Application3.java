package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        /* 필기
        *  자동 형변환과 강제 형변환을 이용한 다른 자료형 끼리의 연산
        *
        * */

        int inum = 10;
        long lnum = 100;

        // 1. 두 수의 연산 결과를 int 형으로 반환 후 int 자료형 변수에 리턴
//        int isum = inum + lnum; // 연산의 결과가 자동형변환 되어 long이 된다.
                                // int = long 충돌되기 때문에 오류 발생

        int isum = (int) (inum + lnum); // (inum + lnum) 에서 자동형변환이 이루어졌다.
        System.out.println("isum = " + isum);
        int isum2 = inum + (int) lnum;  // (int) lnum 에서 long을 int로 강제형변환했다.
        System.out.println("isum2 = " + isum2);
        long isum3 = inum + lnum;       // 자동형변환되어 문제 발생X
        System.out.println("isum3 = " + isum3);

    }

}
