package com.ohgiraffers.section03.sort;

public class Application2 {

    public static void main(String[] args) {
        //24.09.05 15:40
        //순차 정렬에 대해 이해할 수 있다.

        /* 필기.
        *   순차정렬이란, 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
        *   배열의 처음과 끝이 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
        * */

        int[] iarr = {2, 5, 4, 6, 1, 3};
        for(int i : iarr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 첫 번째 인덱스(0) 는 비교할 필요가 없어서 1번부터 비교 시작
        for (int i = 1; i < iarr.length; i++) {
            // 인덱스가 증가할 때마다 처음부터 해당 인덱스까지 값을 비교
            for (int j = 0; j < i; j++) {
                if (iarr[i] < iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }
        for(int i : iarr) {
            System.out.print(i + " ");
        }

    }

}
