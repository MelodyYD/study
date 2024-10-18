package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {

    public void miniGameRPSStart() {
        Application.line();
        System.out.println("=============  · · · Now Loading · · · ============");
        Application.line();
        System.out.println("                    가위바위보 게임!");
        System.out.println("        가위바위보 대결을 통하여 골드를 획득해 보세요!");
        System.out.println();
        miniGameRPS();
//        return 67;
    }

    public void miniGameRPS() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("  1.가위   2.바위   3.보");
            System.out.print("안내면 진다~ 가위 바위 보! : ");
            int userRps = sc.nextInt();
            int randRps = rockPaperScissors();

            //아니면  빠꾸
            if (userRps != 1 && userRps != 2 && userRps != 3) {
                System.out.println();
                System.out.println("잘못 입력하였습니다.");
                System.out.println("다시 입력해주세요!");
                Application.line();
            } else {
                userRPS(userRps,randRps);
                break;
            }
        }
    }

    public void userRPS(int userRps,int randRps) {
        if (userRps==randRps) {
            rpsSame(userRps, randRps);
        } else if ((userRps==1 && randRps==2) || (userRps==2 && randRps==3) || (userRps==3 && randRps==1)) {
            rpsLose(userRps,randRps);
        } else {
            rpsWin(userRps, randRps);
        }
    }

    public void rpsWin (int userRps, int randRps) {
        rpsResult(userRps,randRps);
        System.out.println("승리~!!!");
        int winGold = winGold();
        System.out.println("당신에게 " + winGold + "G가 주어집니다.");
        Application.g.setGold(winGold);
    }

    public void rpsLose (int userRps, int randRps) {
        rpsResult(userRps,randRps);
        System.out.println("패배...");
        int loseGold = loseGold();
        System.out.println("당신에게 " + loseGold + "G가 주어집니다.");
        Application.g.setGold(loseGold);
    }

    public void rpsSame (int userRps, int randRps) {
        rpsResult(userRps,randRps);
        System.out.println("비겼습니다! 아쉽네요!");
        int sameGold = sameGold();
        System.out.println("당신에게 " + sameGold + "G가 주어집니다.");
        Application.g.setGold(sameGold);
//        return sameGold;
    }

    public void rpsResult (int userRps, int randRps) {
        String ranRPS = changeRPS(randRps);
        String usrRPS = changeRPS(userRps);

        System.out.println("과연 결과는...!");
        Application.line();
        System.out.println(Application.name + "님이 낸 패 : " + usrRPS);
        System.out.println("미궁이 낸 패 : " + ranRPS);
        Application.line();
    }

    //미니게임(가위바위보) 만들기
    public static int rockPaperScissors() {
        Random rpsRand = new Random();
        int ranNum = rpsRand.nextInt(4);
        return ranNum;
    }

    public static String changeRPS(int rpsNo) {
        String ranRps = (rpsNo == 1) ? "가위" : (rpsNo == 2) ? "바위" : "보";
        return ranRps;
    }

    public int winGold() {
        Random winRand = new Random();
        int winGold = winRand.nextInt(21) + 29;
        return winGold;
    }

    public int sameGold() {
        Random loseRand = new Random();
        int sameGold = loseRand.nextInt(21) + 9;
        return sameGold;
    }

    public int loseGold() {
        Random loseRand = new Random();
        int loseGold = loseRand.nextInt(10);
        return loseGold;
    }

}
