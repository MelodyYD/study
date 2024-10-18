package com.ohgiraffers.section04.comparison;

public class pr1 {

    public static void main(String[] args) {

        /* 연습 문제 2
        급식에서 비엔나 소세지를 한 명 당 6개씩 나눠주고 있다.
        현재 67번째 학생이 받아갔다면 현재까지 소세지 소비량과, 다음 학생을 호출해보자.
        */
        System.out.println("========== 연습 문제 2 ==========");
        int sg = 6;
        int std = 67;
        System.out.println("소세지 소비량 : " + (std++ * sg));
        System.out.println("다음 학생은 " + std + "번째 학생입니다.");

        // =========================================================================

        /* 연습 문제 3
        정현님의 체중은 55.5kg 이고 키는 160cm입니다. BMI를 계산하는 코드를 작성하세요.
        BMI(체질량지수) = 체중(kg) / (키(m)의 제곱)  ※ 키의 단위 확인
        출력은 정현님의 BMI는 ? 입니다. 로 출력해주세요.
        */
        System.out.println("========== 연습 문제 3 ==========");
        double jhWeight = 55.5; //kg
           int jhHeight = 160; //cm

        double jhHe2 = (double) jhHeight / 100;
        double BMI = jhWeight / (jhHe2 * jhHe2);

        System.out.println("정현님의 BMI는 " + BMI + " 입니다.");


        System.out.println("========== 실습 문제 1 ==========");
        /* 실습 문제 1
        * 주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는
        * 어떤 자료형(data type) ? 과 regNo 라는 이름의 변수를 선언하고
        * 자신의 주민등록번호로 초기화 하는 한 줄의 코드를 적으시오.
        */




        System.out.println("========== 실습 문제 2 ==========");
        /* 실습 문제 2
        * 다음의 문장에서 리터럴 변수 상수 키워드를 적으시오 , , , .
        * int i = 100;
        * long l =100L;
        * final float PI = 3.14f;

        * 상수 :
        * 변수 :
        * 리터럴 :
        */




        System.out.println("========== 실습 문제 3 ==========");
        /* 실습 문제 3
        * 다음 중 형변환을 생략할 수 있는 것은 모두 고르시오 ? ( )
            byte b = 10;
            char ch = 'A';
            int i = 100;
            long l = 1000L;
            a. b = (byte)i;
            b. ch = (char)b;
            c. short s = (short)ch;
            d. float f = (float)l;
            e. i = (int)ch;
        */





        System.out.println("========== 실습 문제 4 ==========");
        /* 실습 문제 4
        * 연산의 출력결과를 적으세요
            int x = 2;
            int y = 5;
            char c = 'A'; // 'A' 65 의 문자코드는
            System.out.println(1 + x << 33);
            System.out.println(y >= 5 || x < 0 && x > 2);
            System.out.println(y += 10 - x++);
            System.out.println(x+=2);
            System.out.println( !('A' <= c && c <='Z') );
            System.out.println('C'-c);
            System.out.println('5'-'0');
            System.out.println(c+1);
            System.out.println(++c);
            System.out.println(c++);
        */





    }

}
