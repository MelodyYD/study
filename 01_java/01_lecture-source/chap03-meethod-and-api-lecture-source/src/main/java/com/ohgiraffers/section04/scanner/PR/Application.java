package com.ohgiraffers.section04.scanner.PR;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // main

        /*
        * 첫 번째 인자의 최소값 부터 두 번쨰 인자까지 범위의 난수를 출력 (randomNumber 호출)
          인자로 전달한 정수 길이의 랜덤한 문자열을 출력함 (randomUpperAlphabet 호출)
          가위, 바위, 보 중 한 가지를 출력함 (rockPaperScissors 호출)
          앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)
        * */

        System.out.println("===========================================");
        System.out.println("|============== RandomMaker ==============|");
        System.out.println("===========================================");

        // 입력 받아서 하도록 만들기
        Scanner sc = new Scanner(System.in);

        // 준비
        RandomMaker rm = new RandomMaker();

        // 최대 최소 수치 받아서 출력하는 랜덤 메이커
        System.out.println("");
        System.out.println("============== randomNumber ==============");
        System.out.print("랜덤에서 나올 최소 숫자를 입력해주세요. : ");
        int min = sc.nextInt();
        System.out.print("랜덤에서 나올 최대 숫자를 입력해주세요. : ");
        int max = sc.nextInt();
        System.out.println("");
        System.out.println("= = = = = = = = Loading = = = = = = = =");
        System.out.println("");
        int ranNum = rm.randomNumber(min,max);
        System.out.println("결과! : " + ranNum);
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");


        // 인자로 전달한 정수 길이의 랜덤한 문자열을 출력함
//        System.out.println("");
//        System.out.println("=========== randomUpperAlphabet ===========");
//        System.out.print("원하는 랜덤 문자 길이를 입력해주세요. : ");
//        int length = sc.nextInt();
//        System.out.println("");
//        System.out.println("= = = = = = = = = Loading = = = = = = = = =");
//        System.out.println("");
//        String ranApb = rm.randomUpperAlpabet(length);
//        System.out.println("결과! : " + ranApb);
//        System.out.println("");
//        System.out.println("===========================================");
//        System.out.println("");


        //가위, 바위, 보 중 한가지를 반환함
        System.out.println("");
        System.out.println("============ rockPaperScissors ============");
        System.out.println("프로그램을 믿으시나요?");
        System.out.println("그렇다면 당신이 낼 패를 알려드리죠!");
        System.out.println("");
        System.out.println("= = = = = = = = = Loading = = = = = = = = =");
        System.out.println("");
        String rps = rm.rockPaperScissors();
        System.out.println("결과! : " + rps);
        System.out.println("Good Luck :)");
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");

        //앞면, 뒷면 중 한 가지를 출력함
        System.out.println("");
        System.out.println("============== randomNumber ==============");
        System.out.println("내가 동전의 앞면과 뒷면 중 뭐가 나올지 뽑아볼게~");
        System.out.println("얍~");
        System.out.println("");
        System.out.println("= = = = = = = = = Loading = = = = = = = = =");
        System.out.println("");
        String coin = rm.tossCoin();
        System.out.println("결과! : " + coin + "!!");
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");





    }

}
