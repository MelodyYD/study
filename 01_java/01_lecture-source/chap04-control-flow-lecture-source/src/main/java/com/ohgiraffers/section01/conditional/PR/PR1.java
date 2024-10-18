package com.ohgiraffers.section01.conditional.PR;

public class PR1 {

    /* 문제.
    *   1에서 10 사이의 숫자를 랜덤으로 호출하여, 그 값에 따라 점심 메뉴를 고르는 조건문을 만들어보세요.
    *   1:한식 / 2:중식 / 3:일식 / 4:양식 / 5:분식 / 6:베이커리 / 7:샐러드 / 8:동남아 / 9:패스트푸드 / 10:편의점 간편식
    * */

    public static void main(String[] args) {
        int lunch = (int)(Math.random()*10)+1;



        System.out.println("오늘의 점심은 과연~~~");
        System.out.println("두구두구두구두구...");
        System.out.println("");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
        System.out.println("");
        if (lunch == 1) {
            System.out.println("  오늘은... [ 한식 ] 의 날입니다.");
        } else if (lunch == 2) {
            System.out.println("  오늘은... [ 중식 ] 의 날입니다.");
        } else if (lunch == 3) {
            System.out.println("  오늘은... [ 일식 ] 의 날입니다.");
        } else if (lunch == 4) {
            System.out.println("  오늘은... [ 양식 ] 의 날입니다.");
        } else if (lunch == 5) {
            System.out.println("  오늘은... [ 분식 ] 의 날입니다.");
        } else if (lunch == 6) {
            System.out.println("  오늘은... [ 베이커리 ] 의 날입니다.");
        } else if (lunch == 7) {
            System.out.println("  오늘은... [ 샐러드 ] 의 날입니다.");
        } else if (lunch == 8) {
            System.out.println("  오늘은... [ 동남아 ] 의 날입니다.");
        } else if (lunch == 9) {
            System.out.println("  오늘은... [ 패스트푸드 ] 의 날입니다.");
        } else if (lunch == 10) {
            System.out.println("  오늘은... [ 편의점 간편식 ] 의 날입니다.");
        }
        System.out.println("         맛있게 드세요~");
        System.out.println("");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");

    }

}
