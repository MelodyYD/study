package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    // if, if-else, if-else-if 문 단독 사용에 대한 흐름 이해하고 작용할 수 있다.

    /* 필기.
     *   if-else-if 문 표현식
     *   if(조건식1) {
     *       조건식 1이 true 일 때 실행할 구문;
     *   } else if(조건식 2) {
     *       조건식 1이 false 고, 조건식 2가 true 일 때 실행할 구문;
     *   } else {
     *       위의 조건 2개가 모두 거짓일 경우 실행할 구문;
     *   }
     * */

    /* 필기.
     *   if-else-if 문은 조건식 1의 결과 값이 참(true) 이면 if {} 블럭 실행
     *   조건식 1이 false 이면 조건식 2를 확인하여 참(true) 이면 else if {} 블럭 실행한다..
     *   조건식 1, 2의 결과가 모두 거짓(false) 이면 else {} 블럭을 실행한다.
     * */

    public void testIfElseIfStatement() {
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다...");
        System.out.println("그 때... 연못에서 산신령이 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 무슨 도끼를 빠뜨렸는지 물어보게 되는데...");
        System.out.println("=======================================================");

        System.out.print("산신령 : 어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1) {
            System.out.println("산신령 : 고얀 것! 이 금도끼는 네 도끼가 아니지 않으냐! 썩 꺼지거라!");
        } else if(answer == 2) {
            System.out.println("산신령 : 이 은도끼가 너의 것이라고? 이런 거짓말쟁이를 봤나! 썩 꺼지거라!");
        } else if(answer == 3) {
            System.out.println("산신령 : 홀홀... 정직하고 욕심 없는 치구나. 그래. 내 기특한 너에게 이 도끼를 전부 주마!");
        } else {
            System.out.println("산신령 : 응? 뭐라고?");
        }

        System.out.println("그렇게 산신령은 다시 연못 속으로 떠나갔다.");
    }

    public void testNestedIfElseIfStatement() {
        /* 문제.
        *   ohgiraffers 대학교의 조** 교수는 학생들의 성적을 입력해서 학점 등급을 매기는 채점방식을 사용하고 있다.
        *   학생의 이름과 점수를 입력 받아
        *   90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C',
        *   60점 이상이면 'D', 60점 미만이면 'F' 학점을 줄 것이다.
        *   추가로 각 등급의 중간 점수(ex 65, 75, 85, 95) 이상이면 '+'를 붙여줄 것이다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요. : ");
        String name = sc.nextLine();
        System.out.print("점수를 입력해주세요. : ");
        int point = sc.nextInt();

        String grade = "";

        if (point >= 90) {
            grade = "A";
            if (point >= 95) {
                grade += "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if (point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if (point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }
        System.out.println(name + "님의 학점은 " + grade + "입니다.");
    }


    // 개선
    public void improveNestedIfElseIfStatement() {
        /* 문제.
        *   ohgiraffers 대학교의 조** 교수는 학생들의 성적을 입력해서 학점 등급을 매기는 채점방식을 사용하고 있다.
        *   학생의 이름과 점수를 입력 받아
        *   90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C',
        *   60점 이상이면 'D', 60점 미만이면 'F' 학점을 줄 것이다.
        *   추가로 각 등급의 중간 점수(ex 65, 75, 85, 95) 이상이면 '+'를 붙여줄 것이다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요. : ");
        String name = sc.nextLine();
        System.out.print("점수를 입력해주세요. : ");
        int point = sc.nextInt();

        String grade = "";

        if (point >= 90) {
            grade = "A";
        } else if (point >= 80) {
            grade = "B";
        } else if (point >= 70) {
            grade = "C";
        } else if (point >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if(point % 10 >= 5 && point >= 60) {
            grade += "+";
        }
        System.out.println(name + "님의 학점은 " + grade + "입니다.");
    }

    public void pr1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("내 몸무게가 몇이더라? : ");
        double weight = sc.nextDouble();

        if (weight > 70) {
            System.out.println("그럼 샐러드나 먹어야 겠다...");
        } else if (weight <= 70) {
            System.out.print("잠깐... 치킨집이 문을 열었던가? (1. 영업 중, 2. 영업 종료) : ");
            int answer = sc.nextInt();
            if (answer != 1) {
                System.out.println("아... 그냥 라면이나 먹어야겠다.");
            } else {
                System.out.println("아싸! 치킨 먹어야지! 오늘은 치팅이다!!!!!");
            }
        }
        System.out.println("잘 먹겠습니다~");
    }

}
