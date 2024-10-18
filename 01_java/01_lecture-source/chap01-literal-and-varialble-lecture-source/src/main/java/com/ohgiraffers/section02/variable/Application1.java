package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        // 247.08.26 10:50
        // 수업 목표 : 변수의 사용 목적에 대해 이해할 수 있다.

        /* 필기
        *  변수의 사용 목적
        *   1. 값에 의미를 부여하기 위한 목적
        *       - 의미 전달이 쉬워야 코드를 읽기 쉬워진다.
        *       - 협업 및 유지보수가 편해진다.
        *   2. 한 번 저장해둔 값을 재사용하기 위한 목적
        *       - 변수를 이용하여 코드 작성시, 값을 변경해도 보다 편하게 변경할 수 있다.
        *   3. 시간에 따라 변하는 값을 저장하고 사용하기 위한 목적
        *       - 변하는 갓을 저장하기 위한 공간! ⭐⭐⭐⭐⭐
        * */

        // 1. 값에 의미 부여
        System.out.println("=============== 값의 의미 부여 테스트 ===============");
        System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");
        int salary = 1000000;
        int bonus  = 200000;

        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");


        // 2.한 번 저장해둔 값 재사용
        System.out.println("=============== 변수에 저장한 값 재사용 테스트 ===============");
        // 10명의 고객에게 100포인트 지급하는 출력문을 만들어보자.
        System.out.println("1번 고객에게 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 100포인트 지급하였습니다.");

        int point = 100;
        // = : 대입 연산자
        // (공간) = (값)
        System.out.println("1번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("2번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("3번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("4번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("5번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("6번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("7번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("8번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("9번 고객에게 " + point + "포인트 지급하였습니다.");
        System.out.println("10번 고객에게 " + point + "포인트 지급하였습니다.");


        // 3. 시간에 따라 변경되는 값을 저장, 사용
        System.out.println("=============== 변수에 저장한 값 변경 테스트 ===============");
        int sum = 0;
        //soutv : 가까운 변수를 출력해주는 기능
        System.out.println("sum = " + sum);

        sum = sum + 10;
        System.out.println("sum에 10을 더한 두 번째 sum = " + sum);

        sum = sum + 10;
        System.out.println("sum에 10을 더한 세 번째 sum = " + sum);

    }
}
