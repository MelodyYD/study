package com.ohgiraffers.section04.scanner.PR;

import java.util.Random;

public class RandomMaker {
    /*
    + randomNumber(min:int, max:int):int
    + randomUpperAlpabet(length:int):String
    + rockPaperScissors():String
    + tossCoin():String
     */

    public int randomNumber(int min, int max) {
        Random ranN = new Random();
        int ranNum = ranN.nextInt((max - min)+1) + min;
        return ranNum;
    }

//    public String randomUpperAlpabet(int length) {
//        // length로 숫자를 받았어
//        // 그 받은 숫자 길이 만큼 대문자를 뽑아야 해
//        // 대문자의 char 값은 A 65 Z 90
//        // ? 이걸로 계속 돌리는 게 되긴 할텐데 너무 노가다고
//        // ||이면 앞이 트루면 뒤 실행 안하니까
//        // char ch = sc.nextLine().charAt(0); -> 입력한 값의 첫번째 글씨
//        String ranApb = randomUpperlength(length);
//        return ranApb;
//    }
//
//    public String randomUpperlength(int length) {
//        Random ranUA = new Random();
//        String spbS = "";
//        char apbC = (char) (ranUA.nextInt(('Z'-'A')+1) + 'A');
//        String upperAlpabet = spbS+apbC;
//        return (length == 0) ? upperAlpabet : randomUpperAlpabet(length-1);
//    }

    public String rockPaperScissors() {
        Random rpsRand = new Random();
        int ranNum = rpsRand.nextInt(3);
        String rps = (ranNum == 0) ? "가위" : (ranNum == 1) ? "바위" : "보";
        return rps;

    }

    public String tossCoin() {
        Random ranCoin = new Random();
        boolean coin = ranCoin.nextBoolean();
        String tossCoin = (coin == true) ? "앞면" : "뒷면";
        return tossCoin;
    }

}
