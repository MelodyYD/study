package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        //24.08.30 13:05
        //Scanner의 nextLine(), next()의 차이

        /*  필기.
        *   nextline() : 공백을 포함한 줄 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다. (공백 문자 포함)
        *   next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환 (공백 문자 포함하지 않음)
        * */

        // 1. Scanner 객체 생성 = 사용할 준비
        Scanner sc = new Scanner(System.in);

        // 2. 문자열 입력
        // nextLine() 사용
        System.out.print("인사말을 입력해주세요 : ");
        String hi = sc.nextLine();
        System.out.println(hi);

        // next() 사용
        System.out.print("인사말을 입력해주세요 : ");
        String h2 = sc.next();
        System.out.println(h2);


    }

}
