package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {

        //24.08.27 12:20
        //학습목표. 형변환 시 주의점을 이해하고 사용할 수 있다.

        // 1. 의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;
        System.out.println("bnum = " + bnum);

        // 2. 의도한 데이터 손실
        double height = 175.5;
        int floorHeight = (int) height;


        /*- 실습문제 3

            국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,
            총점과 평균을 정수 형태로 출력하세요.

            -- 출력 예시 --
            초 201
            평균 : 67
        */

        double kor = 80.5;
        double mth = 50.6;
        double eng = 70.8;

        int total = (int) (kor + mth + eng);
        int avr = (int) ((kor + mth + eng)/3);

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avr);


        System.out.println("===================================");
        /*- 연습문제 1

            1000kg 수용 가능한 엘리베이터에 76kg인 사람 몇 명이 탈 수 있는가?
            같은 엘리베이터에 13명이 탄다면 평균 몸무게는?(실수로출력)

            출력결과 : 13명, 76.92…….kg
        */

        int el = 1000;
        int psn = 76;

        double avr2 = (double) el / 13;

        System.out.println("수용 가능 최대 인원(1인 기준 76kg) : " + (el / psn) + "명");
        System.out.println("같은 엘리베이터에 13명이 탔다면 평균 몸무게는? : " + avr2 + "kg");


    }

}
