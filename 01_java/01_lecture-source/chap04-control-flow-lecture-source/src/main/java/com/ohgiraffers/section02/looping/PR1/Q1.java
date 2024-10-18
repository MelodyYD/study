package com.ohgiraffers.section02.looping.PR1;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Q1 {

    //1번, 성인 인증
    public void q1 () {
        System.out.println("어서오세요! 이곳은 술을 판매하고 있습니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("나이가 어떻게 되세요? : ");
        int age = sc.nextInt();
        if (age >= 20) {
            System.out.println("판매 가능합니다.");
        } else {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }

    //짝홀 게임
    public void q2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("어서오세요! 짝홀게임 한 번 하실래요?");
        System.out.println("안에 도토리가 몇 개가 들어있을 거 같나요? 최소 1개에서 최대 10개까지 있답니다!");
        System.out.println("만약 도토리의 개수까지 정확히 맞추면 상품이 두 배!");
        System.out.println("짝수와 홀수만 맞추면 일반 상품이 주어집니다~");
        System.out.print("몇 개일지 맞춰보시겠어요? : ");
        int num = sc.nextInt();
        System.out.println("");
        if (num % 2 != 0) {
            System.out.println("당신이 배팅한 도토리 개수는 " + num + "개!");
            System.out.println("고로 홀수입니다!");
        } else {
            System.out.println("당신이 배팅한 도토리 개수는 " + num + "개!");
            System.out.println("고로 짝수입니다!");
        }
        System.out.println("짝홀, 과연 그 결과는~~~?");
        System.out.println("");
        Random rand = new Random();
        int random = rand.nextInt(10)+1;
        if (num == random) {
            System.out.println("축하드립니다! 정확히 맞추셨습니다~!");
            System.out.println("상품 두 배! 잘 챙겨가세요~");
        } else if (random % 2 != 0) {
            System.out.println("도토리는 " + random + "개가 들어 있었습니다!");
            System.out.println("즉, 홀수가 정답입니다!");
            switch (num%2) {
                case 1:
                    System.out.println("당신이 배팅한 도토리는 " + num + "개였으므로, 홀수!");
                    System.out.println("짝홀 성공! 상품 받아가세요~");
                    break;
                case 0:
                    System.out.println("당신이 배팅한 도토리는 " + num + "개였으므로, 짝수!");
                    System.out.println("아쉽게도 배팅에 실패했습니다~ 또 놀러오세요~");
            }
        } else {
            System.out.println("도토리는 " + random + "개가 들어 있었습니다!");
            System.out.println("즉, 짝수가 정답입니다!");
            switch (num%2) {
                case 0:
                    System.out.println("당신이 배팅한 도토리는 " + num + "개였으므로, 짝수!");
                    System.out.println("짝홀 성공! 상품 받아가세요~");
                    break;
                case 1:
                    System.out.println("당신이 배팅한 도토리는 " + num + "개였으므로, 홀수!");
                    System.out.println("아쉽게도 배팅에 실패했습니다~ 또 놀러오세요~");
            }
        }
    }

    // 3. 숫자 뽑기
    public void q3 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("어서오세요! 선물 당첨되셨나요? 축하드립니다!");
        System.out.println("당첨 번호에 따라 선물을 다른 걸 드리고 있어서요.");
        System.out.print("당첨 번호가 어떻게 되세요? ( 1 ~ 10 ) : ");
        int lotto = sc.nextInt();
        if (lotto >= 11 || lotto <= 0 ) {
            System.out.println("에이, 그런 번호는 없어요~ 당첨 번호는 1~10 사이에만 있거든요.");
        } else if(lotto % 2 != 0) {
            System.out.println("홀수네요! 자, 상품으로 인형 드립니다!");
        } else if (lotto % 2 == 0) {
            System.out.println("짝수네요! 자, 상품으로 인형 드립니다!");
        }
    }

    // 4. 건강 검진
    public void q4 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("어서오세요! 여기서 키와 몸무게 좀 재시고 저한테 말씀해주세요.");
        System.out.print("키는 몇 cm이신가요? : ");
        double height = sc.nextDouble();
        System.out.print("몸무게는 몇 kg이신가요? : ");
        double weight = sc.nextDouble();
        System.out.println("");

        double heightM = height / 100;
        double bmi = weight / (heightM * heightM);

        if (bmi < 20) {
            System.out.println("BMI 결과... 저체중이시네요. 축제 음식을 왕창 드세요!");
        } else if (bmi >= 20 && bmi < 25) {
            System.out.println("BMI 결과... 정상 체중이시네요. 축제 재미있게 즐기세요!");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("BMI 결과... 과체중이시네요. 축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        } else if (bmi >= 30) {
            System.out.println("BMI 결과... 음... 댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        }
    }

    // 5. 계산기
    public void q5 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("간단한 계산기를 사용해 볼까요?");
        System.out.print("첫 번째 숫자를 입력해주세요. : ");
        int first = sc.nextInt();
        System.out.print("어떤 연산을 처리하고 싶나요? 연산 기호(+, -, *, /, %)를 입력해주세요. : ");
        char op = sc.next().charAt(0);
        System.out.print("두 번째 숫자를 입력해주세요. : ");
        int second = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println(first + " " + op + " "  + second + " = " + (first + second));
                break;
            case '-':
                System.out.println(first + " " + op + " "  + second + " = " + (first - second));
                break;
            case '*':
                System.out.println(first + " " + op + " "  + second + " = " + (first * second));
                break;
            case '/':
                System.out.println(first + " " + op + " "  + second + " = " + (first / second));
                break;
            case '%':
                System.out.println(first + " " + op + " "  + second + " = " + (first % second));
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                break;
        }
    }

    //간식 안내
    public void q6 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("어서 오세요! 맛있는 간식 드시고 가세요!");
        System.out.println(" - - - Menu - - - ");
        System.out.println("  1. 캬라멜팝콘");
        System.out.println("  2. 츄로스");
        System.out.println("  3. 통감자");
        System.out.println("  4. 도토리탕후루");
        System.out.print("주문하시겠어요? : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("캬라멜팝콘 말이죠?");
                System.out.println("캬라멜 팝콘은 15,500원입니다! 맛있게 드세요~!");
                break;
            case 2:
                System.out.println("츄로스 말이죠?");
                System.out.println("츄로스는 3,000원입니다! 맛있게 드세요~!");
                break;
            case 3:
                System.out.println("통감자 말이죠?");
                System.out.println("통감자는 2,000원입니다! 맛있게 드세요~!");
                break;
            case 4:
                System.out.println("도토리탕후루 말이죠?");
                System.out.println("도토리탕후루 5,000원입니다! 맛있게 드세요~!");
                break;
            default:
                System.out.println("해당 상품은 판매하지 않습니다!");
        }
    }

    // 인사평가
    public void q7 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("인사 평가 점수를 입력해주세요.");
        System.out.print("성실 점수 : ");
        int fid = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int srv = sc.nextInt();
        System.out.print("미소 점수 : ");
        int smi = sc.nextInt();
        System.out.println("");
        System.out.println("인사평과 결과===================");

        int avr = (fid + srv + smi) / 3;

        if (avr >= 60 && fid>=40 && srv>=40 && smi>=40) {
            System.out.println("축하드립니다! 합격입니다!");
        } else {
            if (avr < 60) {
                System.out.println("평균 점수 미달로 불합격입니다.");
            }
            if (fid < 40) {
                System.out.println("성실 점수 미달로 불합격입니다.");
            }
            if (srv < 40) {
                System.out.println("서비스 점수 미달로 불합격입니다.");
            }
            if (smi < 40) {
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
        }
        System.out.println("수고하셨습니다.");
    }

    //급여 계산
    public void q8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("급여 정산을 시작합니다.");
        System.out.print("월 급여 입력 : ");
        int month = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int sell = sc.nextInt();
        double bonus = 0;

        if (sell<10000000) {
            bonus = 1;
        } else if (sell>=10000000 && sell<30000000) {
            bonus = 0.01;
        } else if (sell>=30000000 && sell<50000000) {
            bonus = 0.03;
        } else if (sell>=50000000){
            bonus = 0.05;
        }

        int total = (int)(month + (sell * bonus));      //총급여

        System.out.println();
        System.out.println("======================");
        System.out.println("매출액 : " + sell);
        System.out.println("보너스율 : " + (int)(bonus*100) + "%");
        System.out.println("월 급여 : " + month);
        System.out.println("보너스 금액 : " + (int) (sell * bonus));
        System.out.println("======================");
        System.out.println("총 급여 : " + total);
    }

    //놀이기구 탑승제한
    public void q11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이가 어떻게 되세요? : ");
        int age = sc.nextInt();
        System.out.print("키는 몇 cm이신가요? : ");
        double height = sc.nextDouble();
        System.out.println();

        if (age<10) {
            System.out.println("아쉽지만 9살 넘으면 또 와주세요~");
        }
        if (height<110) {
            System.out.println("아쉽지만 110cm 넘게 크면 또 와주세요~");
        }
        System.out.println("즐거운 하루 보내세요~");
    }

    //과목 평균
    public void q12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 과목은 몇 점인가요? : ");
        int sc1 = sc.nextInt();
        System.out.print("두 번째 과목은 몇 점인가요? : ");
        int sc2 = sc.nextInt();
        System.out.println();

        if(sc1 < 40 || sc2 < 40 || (sc1 + sc2) / 2 < 60) {
            System.out.println("불합격입니다.");
        } else {
            System.out.println("합격입니다.");
        }
    }

    // 렌트비
    public void q13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("안녕하세요~ 어떤 차 렌트하시겠어요?");
        System.out.print("1.소형  2.중형  3.대형  4.SUV  5.승합  6.추천 (숫자만 입력) : ");
        int num = sc.nextInt();
        System.out.println();
        
        switch (num) {
            case 1:
                System.out.println("소형은 일일 40,000원입니다~");
                break;
            case 2:
                System.out.println("중형은 일일 55,000원입니다~");
                break;
            case 3:
                System.out.println("대형은 일일 80,000원입니다~");
                break;
            case 4:
                System.out.println("SUV는 일일 100,000원입니다~");
                break;
            case 5:
                System.out.println("승합은 일일 120,000원입니다~");
                break;
            case 6:
                System.out.print("예산이 어떻게 되시나요? : ");
                int money = sc.nextInt();
                if (money >= 120000) {
                    System.out.println("그러면 승합은 어떠신가요?");
                } else if(money >= 100000) {
                    System.out.println("그러면 SUV는 어떠신가요?");
                } else if(money >= 80000) {
                    System.out.println("그러면 대형은 어떠신가요?");
                } else if(money >= 55000) {
                    System.out.println("그러면 중형은 어떠신가요?");
                } else if(money >= 40000) {
                    System.out.println("그러면 소형은 어떠신가요?");
                } else {
                    System.out.println("음... 은행이라도 한 번 다녀오시겠어요?");
                }
                break;
            default:
                System.out.println("그런 건 없어요~");
        }
        System.out.println("또 오세요~~");
    }
        /*
        Q4. Scanner 로 1 ~ 12 사이의 정수를 입력 받아 입력 한 정수에 해당하는
              계절의 정보를 출력하시오.
              추가적으로 겨울과 여름의 경우 온도를 입력받아
              겨울에 경우 -15 도 이하이면 한파경보
              -5 ~ -14 이면 한파 주의보
              여름의 경우 33도 이상이면 폭염경보,
              28 ~ 33 이면 폭염주의보 를 출력하시오
    */
    //

}
