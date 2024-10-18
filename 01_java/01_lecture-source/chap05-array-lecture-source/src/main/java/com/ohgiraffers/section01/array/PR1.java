package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class PR1 {


    public static void main(String[] args) {

        // Q1
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Q2
        String[] fr = {"딸기", "바나나", "복숭아", "키위", "사과"};
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 과일을 구매하시겠습니까? : ");
        System.out.print("1.딸기  2.바나나  3.복숭아  4.키위  5.사과 (번호만) : ");
        int num = sc.nextInt();
        if (num > 5 || num < 1) {
            System.out.println("준비된 과일이 없습니다.");
        } else {
            System.out.println("주문하신 " + fr[num - 1] + " 드려요~");
        }

    }

}
