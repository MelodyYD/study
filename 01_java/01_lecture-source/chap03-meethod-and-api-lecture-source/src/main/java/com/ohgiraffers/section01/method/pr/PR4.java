package com.ohgiraffers.section01.method.pr;

public class PR4 {

    /*
    main에 줄번호를 int lineNum=0; 로 선언, 초기화 하고
    mothod에 이름을 String, 줄번호,국어, 영어, 수학 점수를 int매개변수로 입력 받아 출력하고
    return을 이용하여 줄번호를 하나씩 올려보자
    */

    public static void main(String[] args) {

        int lineNum = 1;
        PR4 score = new PR4();
        lineNum=score.score(lineNum,"이승현",50,66,74);
        lineNum=score.score(lineNum,"정은미",37,67,73);
        lineNum=score.score(lineNum,"문정현",85,85,82);
        lineNum=score.score(lineNum,"윤이정",61,34,89);
        lineNum=score.score(lineNum,"박재민",66,88,99);
        lineNum=score.score(lineNum,"김경훈",97,100,24);
        lineNum=score.score(lineNum,"조평훈",0,0,0);

    }

    public int score(int num, String name, int kor, int eng, int mth) {
        System.out.println(num + ". " + name + " 국어: " + kor + "영어: " + eng + "수학: " + mth);
        return ++num;
    }

}
