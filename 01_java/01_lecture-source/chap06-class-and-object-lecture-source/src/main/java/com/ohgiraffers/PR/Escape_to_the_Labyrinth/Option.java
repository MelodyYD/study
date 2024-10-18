package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

import java.util.Scanner;

import static java.lang.System.exit;

public class Option {
    Scanner sc = new Scanner(System.in);

    private Gold g = new Gold();
    private Labyrinth laby = new Labyrinth();
    private MiniGame mGame = new MiniGame();


    public void defaultOption() {
        line();
        System.out.println(" 무엇을 하시겠습니까?");
        System.out.println("   1. 길 찾기");
        System.out.println("   2. 골드 확인");
        System.out.println("   3. 처음으로(10G)");
        System.out.println("   9. 게임 종료");
        System.out.println();
        System.out.print("메뉴를 선택해주세요 : ");
    }

    public void startGame(String name) {
        while (true) {
            defaultOption();
            int numDef = sc.nextInt();
            if(numDef == 9) {
                break;
            } else if(numDef == 3) {
                startBack();
                break;
            }
            subDetOpt(numDef, name);
        }
    }

    public void subDetOpt(int numDef, String name) {
        switch (numDef) {
            case 1:
                // 미궁 탐험 시작
                break;
            case 2:
                goldChkOpt(name);
                break;
            default:
                System.out.println("잘못 입력했습니다. 다시 입력해 주세요.");
                break;
        }
    }

    public void goldChkOpt (String name) {
        while(true) {
            goldChack();
            int numGold = sc.nextInt();
            if (numGold == 1) {
                System.out.println("현재 " + name + "님이 가지고 있는 골드는 총 " + g.goldState() + " Gold 입니다.");
                line();
            } else if(numGold == 2) {
                g.setGold(mGame.miniGameRPSStart());

//                System.out.println("뒤로 돌아갑니다.");
                line();
                break;
            } else if(numGold == 3) {
                escapeLabirinth();
                exit(0);
            } else {
                System.out.println("잘못 입력했습니다. 다시 입력해 주세요.");
            }
        }
    }

    public void endGame(String name) {
        line();
        System.out.println("                      아쉽네요.");
        System.out.println("                  게임이 종료됩니다.");
        System.out.println("                   또 봐요, " + name + "님.");
        line();
    }

    public void finishGame () {
        line();
        System.out.println("                     탈출 성공!");
        line();
    }

    public void labyrinthOption() {
        // 1. 길 찾기
    }

    public void goldChack() {
        // 2. 골드 확인
        line();
        System.out.println(" 무엇을 하시겠습니까?");
        System.out.println("   1. 내 잔여 골드 확인");
        System.out.println("   2. 뒤로 가기");
        if (g.goldState() >= 150) {
            System.out.println("   3. 탈출하기! (150G)");
        }
        System.out.println();
        System.out.print("메뉴를 선택해주세요 : ");
    }

    public void startBack() {
        // 3. 처음으로(10G)
        System.out.println("처음으로 되돌아갑니다.");
        g.goldDownStart(10);
        line();
        //처음 장소로 이동하는 거 선언하기
    }

    public void escapeLabirinth() {
        // 골드로 탈출
        finishGame();
        System.out.println("              역시 뭐든 돈이 최고네요. :)              ");
        System.out.println("              다음 방문을 기다리겠습니다.");
        System.out.println("                  좋은 하루 되세요~!         ");
        line();
    }

    public static void line () {
        System.out.println();
        System.out.println("===================================================");
        System.out.println();
    }

}
