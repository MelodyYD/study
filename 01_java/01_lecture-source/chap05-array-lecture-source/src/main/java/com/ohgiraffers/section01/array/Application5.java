package com.ohgiraffers.section01.array;

public class Application5 {

    public static void main(String[] args) {
        //24.09.04 13:00
        //배열을 사용한 예제(2)

        //랜덤한 카드 한 장을 뽑아서 출력
        //카드의 숫자 / 카드의 문양 배열을 만들 것이다.

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "ACE", "JACK", "QUEEN", "KING"};

        int randomShapesIndex = (int) (Math.random() * shapes.length);
        int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);

        //발생한 난수를 index를 활용해서 출력
        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapesIndex] + " " + shapes[randomCardNumberIndex] + "입니다.");


    }

}
