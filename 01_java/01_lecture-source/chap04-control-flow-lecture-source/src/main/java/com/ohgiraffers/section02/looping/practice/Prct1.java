package com.ohgiraffers.section02.looping.practice;

import java.util.Scanner;

public class Prct1 {

    public void q1() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; 
        }
        System.out.println("sum = " + sum);
    }

    public void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = num; i > 0; i--) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = num; i > 0; i--) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }

    public void q4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요. : ");
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.println((i+1) + " : " + ch);
        }
    }

    public void q5() {
        for (char ch = 'a' ; ch <= 'z'; ch++) {
            System.out.print(ch);
        }
    }

    public void q6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();

        while (num > 0) {
            switch (num%2) {
                case 0 :
                    System.out.print("마");
                    break;
                case 1 :
                    System.out.print("토");
                    break;
            }
            num--;
        }
    }
    /* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요.
     * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다."를 출력하면 됩니다.
     *
     * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
     * 정수를 다시 입력 받도록 하세요.
     *
     * 참고) 소수란?
     * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
     * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
     *
     * -- 입력 예시 --
     * 2보다 큰 정수를 하나 입력하세요 : 7
     *
     * -- 출력 예시 --
     * 소수다.
     * */
    public void q7() {

    }



}
