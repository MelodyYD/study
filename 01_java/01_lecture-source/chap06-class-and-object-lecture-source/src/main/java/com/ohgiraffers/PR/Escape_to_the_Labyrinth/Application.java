package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

import java.util.Scanner;

import static java.lang.System.exit;

public class Application {

    public static String name;

    public static void main(String[] args) {
        /* 프로그램 개요.
         *   미로를 탈출하는 게임
         *
         *  시스템 요구사항
         *   0. 플레이어의 이름을 입력할 수 있다.
         *   1. 플레이어는 선택지 중 하나를 선택할 수 있다.
         *   1-1. 길을 나아가는 선택지와 골드를 확인하는 선택지를 매번 고를 수 있다.
         *   1-2. 골드가 150 골드를 넘을 시, 즉시 탈출할 수 있다.
         *   2. 미로도 선택지에 해당하는 지문을 출력할 수 있다.
         *   2-1. 특정 장소에서는 미니게임을 할 수 있다.
         *   2-2. 미니게임은 가위바위보이며, 랜덤으로 출력해 이기면 30~50 골드, 지면 10~30 골드를 얻는다.
         *   3. 만약 정답이 아닌 곳에 도착한다면 최초로 되돌아가는 선택지를 고를 수 있다.
         *   4. 마지막 장소에 무사히 도착하거나, 골드로 탈출하면 승리!
         * */

        /* 프로그램 설계하기
         *   1. 필요한 객체 도출
         *   -> 플레이어, 선택지, 미로, 미니게임, 골드
         *   2. 객체 간의 상호작용
         *   -> 선택지가 수신할 수 있는 메세지(선택지가 해야 할 일)
         *      1) 현재 위치 확인
         *      2) 선택지 확인
         *      3) 골드 확인
         *   -> 미로가 수신할 수 있는 메세지(미로가 해야 할 일)
         *      1) 현재 위치 확인
         *      2) 잘못된 선택지 / 다음 미로 / 미니게임 확인
         *      3) 골드 확인
         *   -> 골드가 수신할 수 있는 메세지(골드가 해야 할 일)
         *      1) 현재 골드량 확인
         *      2) 골드량에 따른 선택지 주기 (뒤로 가기, 탈출하기)
         * */

        /* 필기.
         *   1. Application 클래스
         *    - 메인 메소드 내에서 Scanner 통해 플레이어가 명령을 내림
         *   2. Labyrinth 클래스
         *    - 속성 : 현재 위치
         *    - 행위 : 이동해라, 이벤트 확인해라, 골드 확인해라
         *   3. MiniGame 클래스
         *    - 속성 : 해당 위치 도착 상태, 게임
         *    - 행위 : 가위바위보
         *   4. Option 클래스
         *    - 속성 : 이동
         * */

        Scanner sc = new Scanner(System.in);
        Option opt = new Option();
        Gold g = new Gold();
        Labyrinth laby = new Labyrinth();
        MiniGame mGame = new MiniGame();

        line();
        System.out.println("================== 미로 탈출 게임~ ==================");
        line();
        System.out.println("당신은 지금 어떤 미로에 도착했습니다.");
        System.out.println("출구로 향하거나, 골드를 모아 탈출하세요!");
        System.out.println();

        line();
        System.out.print("플레이어의 이름을 입력해주세요. : ");
        name = sc.nextLine();
        System.out.println();
        System.out.println("어서 오세요, " + name + "님!");
        System.out.println();
        System.out.println("게임을 시작하시겠습니까?");
        System.out.println("  1. 시작하기     2. 끝내기");
        System.out.print("선택 : ");
        int ss = sc.nextInt();

        if (ss == 2) {
            opt.endGame(name);
        } else if (ss == 1) {
            opt.startGame(name);
//            while (true) {
//                opt.defaultOption();
//                int numDef = sc.nextInt();
//                if(numDef == 9) {
//                    break;
//                }
//                switch (numDef) {
//                    case 1:
//                        break;
//                    case 2:
//                        while(true) {
//                            opt.goldChack();
//                            int numGold = sc.nextInt();
//                            if(numGold == 2) {
//                                break;
//                            }
//                            switch (numGold) {
//                                case 1:
//                                    System.out.println("현재 " + name + "님이 가지고 있는 골드는 총 " + g.goldState() + " Gold 입니다.");
//                                    line();
//                                    break;
//                                case 3:
//                                    opt.escapeLabirinth();
//                                    break;
//                                default:
//                                    System.out.println("잘못 입력했습니다. 다시 입력해 주세요.");
//                                    break;
//                            }
//                        }
//                        System.out.println("뒤로 돌아갑니다.");
//                        line();
//                        break;
//
//                    case 3:
//                        opt.startBack();
//                        break;
//
//                    default:
//                        System.out.println("잘못 입력했습니다. 다시 입력해 주세요.");
//                        break;
//                }
//            }
//            opt.finishGame(); //탈출 성공

        }

    }

    public static void line () {
        System.out.println();
        System.out.println("===================================================");
        System.out.println();
    }



}
