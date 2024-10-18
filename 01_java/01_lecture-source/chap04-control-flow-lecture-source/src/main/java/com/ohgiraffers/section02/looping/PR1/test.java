package com.ohgiraffers.section02.looping.PR1;

import java.util.Scanner;

public class test {

    public void q7 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("인사 평가 점수를 입력해주세요.");
        System.out.print("성실 점수 : ");
        int fid = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int srv = sc.nextInt();
        System.out.print("미소 점수 : ");
        int smi = sc.nextInt();
        System.out.println("");

        int avr = (fid + srv + smi) / 3;

        if (avr >= 60 && fid>=40 && srv>=40 && smi>=40) {
            System.out.println("축하드립니다! 합격입니다!");
        } else {
            if (avr < 60) {
                System.out.println("평균 점수 미달로 불합격입니다.");
            }
            if (fid < 40) {
                System.out.println("성실 점수 미달로 불합격입니다.");
            }
            if (srv < 40) {
                System.out.println("서비스 점수 미달로 불합격입니다.");
            }
            if (smi < 40) {
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
        }
        System.out.println("수고하셨습니다.");

    }

}
