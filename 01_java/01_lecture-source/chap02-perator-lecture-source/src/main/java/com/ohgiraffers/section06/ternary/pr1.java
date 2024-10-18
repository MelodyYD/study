package com.ohgiraffers.section06.ternary;

public class pr1 {

    public static void main(String[] args) {

        /* 문제1
        *  A 여행사의 패키지는 8인 이상이 모여야 출발 확정 상태가 되고, 모이지 않으면 출발 보류 상태를 보여줍니다.
        *  B 여행사의 패키지는 4인 이상이 모여야 출발 확정 상태가 되고, 모이지 않으면 출발 보류 상태를 보여줍니다.
        *  하지만 두 여행사 패키지가 같은 날짜, 같은 장소로 가는 패키지라면 여행사끼리 협의하여 A 패키지에 B 패키지 인원이 합쳐져서 가기도 합니다.
        *  8월 1일에는 두 패키지 모두 지원 인원이 0명이었으나,
        *  8월 10일에 A 패키지에 5인이 지원을 하였고, 8월 20일에 B 패키지에 3인이 지원을 했습니다.
        *
        *  8월 18일과 8월 20일 각각, A 패키지와 B 패키지에서의 '지원 인원 / 최소 출발 인원'과 함께 '일정 확정 여부'를 출력해 주세요.
        *  그리고 보여지는 인원은 미달이더라도 A 패키지 인원과 B 패키지 인원의 합이 A 패키지 최소 인원 이상이라면 양쪽 모두 일정 확정으로 나오도록 출력해 주세요.
        *
        * 희망하는 정답
        * 8/18===================================================
        * A 패키지 : 5 / 8 출발 보류
        * B 패키지 : 0 / 4 출발 보류
        * 8/20===================================================
        * A 패키지 : 5 / 8 출발 확정
        * B 패키지 : 3 / 4 출발 확정
        *
        * */

        //패키지별 최소 인원과 8월 1일 기준 사람 수 입력
        int pkgMinA = 8;
        int psnA = 0;
        int pkgMinB = 4;
        int psnB = 0;

        //8월 10일 A 패키지 인원 증가
        psnA = psnA + 5;

        //사람 수와 패키지 최소 인원을 비교하여 일정 확정 여부를 확인하기
        String planA = ( psnA + psnB >= 8 ) || ( psnA >= pkgMinA ) ? "출발 확정" : "출발 보류";
        String planB = ( psnA + psnB >= 8 ) || ( psnB >= pkgMinB ) ? "출발 확정" : "출발 보류";

        System.out.println("8/18===================================================");
        System.out.println("A 패키지 : " + psnA + " / " + pkgMinA + " " + planA);
        System.out.println("B 패키지 : " + psnB + " / " + pkgMinB + " " + planB);

        //8월 20일 B 패키지 인원 증가
        psnB = psnB + 3;

        planA = ( psnA + psnB >= 8 ) || ( psnA >= pkgMinA ) ? "출발 확정" : "출발 보류";
        planB = ( psnA + psnB >= 8 ) || ( psnB >= pkgMinB ) ? "출발 확정" : "출발 보류";

        System.out.println("8/20===================================================");
        System.out.println("A 패키지 : " + psnA + " / " + pkgMinA + " " + planA);
        System.out.println("B 패키지 : " + psnB + " / " + pkgMinB + " " + planB);

    }

}
