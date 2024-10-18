package com.ohgiraffers.section03.branching;

public class A_break {
    public void testBreakStatement() {
        //break에 대해 이해할 수 있다.
        /* 필기.
        *   break 문은 반복문 내에서 사용한다.
        *   break 는 반복문을 빠져나올 때 사용하게 되며, 반복문의 조건문 판단 결과와 상관없이 반복문을 탈출하기 위해 사용된다.
        *   단, switch 문은 반복문이 아니지만 예외적으로 사용된다.
        * */

        // 1~100 합계를 구할 건데, 조건절을 무한루프로 만들어보자.
        //합계를 담을 변수 선언
        int sum = 0;

        int i = 1;
        //조건절에 true 를 넣어 반복문이 무한하게 돌게 만든다.

        while (true) {
            sum+=i;
            i++;
            if(i==100) {
                break;
            }
        }

        System.out.println("1부터 100까지의 합은 " + sum + " 입니다.");

        // break 문은 모든 반복문을 종료시키는 게 아닌, 자신에게 가장 인접한 반복문을 종료시킨다.

    }
}
