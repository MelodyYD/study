package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {
        //24.08.27 11:40
        //학습목표. 강제 형변환 규칙에 대해 이해할 수 있다.

        /* 필기.
        *  강제형변환(명시적 형변환)
        *  바꾸려는 자료형으로 캐스트 연산자 => () 를 이용하여 형변환한다.
        *  ex)
        * */

        /* 필기.
        *  자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        *  1. 강제 형변환의 규칙
        *  1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요.
        *  1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
        *  1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환 필요.
        *  1-4. 논리형은 강제 형변환 규칙도 제외된다.
        * */

        // 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환
        // 1-1-1. 정수 끼리의 강제 형변환

        long lnum = 8;
//        int inum = lnum;
        int inum = (int) lnum;
        short snum = (short) inum;
        byte bnum = (byte) snum;
        
        // 1-2. 실수를 정수로 변경 시
        float fnum = 4.5f;
//        long lnum2 = fnum;
        // 소수점이 날아가기 때문에 큰 공간이라고 해도 강제형변환이 필요하다.
        long lnum2 = (long) fnum;
        System.out.println("lnum2 = " + lnum2);

        // 1-3. 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형변환
        char ch = 'a';
//        short snum2 = ch;
        // 같은 2 바이트인데 왜 강제로 해야할까? -> 문자는 음수가 없기 때문에
        // sign bit(부호 결정 공간)도 값을 저장할 수 있는 공간으로 사용한다.
        short snum2 = (short) ch;
        System.out.println("snum2 = " + snum2);

        // 1-4. 논리는 application1에서 한 자동형변환과 같이 강제형변환 규칙에서도 제외된다.


    }

}
