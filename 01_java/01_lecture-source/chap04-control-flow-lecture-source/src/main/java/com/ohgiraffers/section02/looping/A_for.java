package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement () {
        //24.09.02 14:40
        //for 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.

        /* 필기.
        *   for 문 표현식
        *   for ( 초기식; 조건식; 증감식) {
        *       조건에 만족하는 경우 수행할 구문 (반복 구문);
        *   }
        * */

        // 1. 문제. 1 부터 10까지 1씩 증가시키면서 i 값을 출력하는 반복문
        // 초기식 : int i = 1;
        // 조건식 : i <= 10;
        // 증감식 : i++
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }


    }



    public void testForExample1() {
        //무엇을 반복하는 지를 확인해서 반복문으로 개선할 수 있다.

        // 문제. 10명의 학생 이름을 입력받아 이름을 출력해보자.

        Scanner sc = new Scanner(System.in);

//        System.out.print("첫 번째 학생의 이름을 입력해주세요. : ");
//        String std1 = sc.nextLine();
//        System.out.println("첫 번째 학생의 이름은 " + std1 + " 입니다.");
//        System.out.print("두 번째 학생의 이름을 입력해주세요. : ");
//        String std2 = sc.nextLine();
//        System.out.println("두 번째 학생의 이름은 " + std2 + " 입니다.");
//        System.out.print("세 번째 학생의 이름을 입력해주세요. : ");
//        String std3 = sc.nextLine();
//        System.out.println("세 번째 학생의 이름은 " + std3 + " 입니다.");
//        System.out.print("네 번째 학생의 이름을 입력해주세요. : ");
//        String std4 = sc.nextLine();
//        System.out.println("네 번째 학생의 이름은 " + std4 + " 입니다.");
//        System.out.print("다섯 번째 학생의 이름을 입력해주세요. : ");
//        String std5 = sc.nextLine();
//        System.out.println("다섯 번째 학생의 이름은 " + std5 + " 입니다.");
//        System.out.print("여섯 번째 학생의 이름을 입력해주세요. : ");
//        String std6 = sc.nextLine();
//        System.out.println("여섯 번째 학생의 이름은 " + std6 + " 입니다.");
//        System.out.print("일곱 번째 학생의 이름을 입력해주세요. : ");
//        String std7 = sc.nextLine();
//        System.out.println("일곱 번째 학생의 이름은 " + std7 + " 입니다.");
//        System.out.print("여덟 번째 학생의 이름을 입력해주세요. : ");
//        String std8 = sc.nextLine();
//        System.out.println("여덟 번째 학생의 이름은 " + std8 + " 입니다.");
//        System.out.print("아홉 번째 학생의 이름을 입력해주세요. : ");
//        String std9 = sc.nextLine();
//        System.out.println("아홉 번째 학생의 이름은 " + std9 + " 입니다.");
//        System.out.print("열 번째 학생의 이름을 입력해주세요. : ");
//        String std10 = sc.nextLine();
//        System.out.println("열 번째 학생의 이름은 " + std10 + " 입니다.");


        /* 반복문으로 변경.
        *   반복해야 하는 문구
        *   1. 안내 문구
        *   2. 학생의 이름을 입력받아 변수에 저장
        *   3. 저장된 이름을 출력
        * */

        for(int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해 주세요 : ");
            String std = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + std + " 입니다.");
        }

        /*
        *   둘 중 뭐가 더 좋은 코드인가?
        *   = 둘 다 좋은 코드이다.
        *   Why? 둘 다 요구사항을 만족했으므로.
        *
        *   하지만 반복문을 사용하는 것이 더 좋은 코드다.
        *   1. 보다 간결하게 작성되었다. (가독성 상승)
        *   2. 학생의 이름뿐 아니라 성적이나 이름을 입력하는 기능도 추가해야한다면? (유지보수성 향상)
        * */
    }


    public void testForExample2() {
        // 2. 1부터 10까지 합계를 구하시오.
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }


    public void testForExample3() {
        // 3. 5 ~ 10 사이의 난수를 발생시켜서 1부터 발생한 난수까지의 합계를 구해보자.
        Random rand = new Random();
        int sum = 0;
        int j = (int) (Math.random() * 6)+5;
        System.out.println("j = " + j);
        for (int i = 1; i <= j; i++) {
            sum += i;
        }
        System.out.println("합계 : " + sum);

    }

    public void testForExample4() {
        // 숫자 2개를 입력 받아 작은 수에서 큰 수까지의 합을 구하시오.
        // 단, 두 숫자는 같지 않다를 가정하에 진행한다.
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요. : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요. : ");
        int second = sc.nextInt();
        int sum = 0;
        if(first == second) {
            System.out.println("두 정수가 같지 않은 숫자를 입력해 주세요.");
        } else {
            if (first > second) {
                for(int i = second; i<=first; i++) {
                    sum += i;
                }
                System.out.println("입력한 정수 " + first + "와/과 " + second + "수까지의 합은 " + sum + "입니다.");
            } else if (first < second) {
                for(int i = first; i<=second; i++) {
                    sum += i;
                }
                System.out.println("입력한 정수 " + first + "와/과 " + second + "수까지의 합은 " + sum + "입니다.");
            }
        }

    }
    public void printSimpleGugudan() {
        //스캐너로 2 ~ 9 사이의 구구단을 받아 2 ~ 9 사이인 경우 구구단을 출력하고,
        //그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해주세요"를 출력해보자.

        Scanner sc = new Scanner(System.in);
        System.out.print("출력하고 싶은 구구단의 단을 입력해주세요. ( 2 ~ 9 ) : ");
        int dan = sc.nextInt();

        if (dan>=2 && dan<=9) {
            for(int su = 1; su<=9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        } else {
            System.out.println("반드시 2 ~ 9 사이의 양수를 입력해주세요.");
        }


    }

}
