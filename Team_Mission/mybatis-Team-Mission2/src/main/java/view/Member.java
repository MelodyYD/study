package view;

import java.util.Scanner;

import static java.lang.System.exit;

public class Member {

    public void selectMember() {

        Scanner sc = new Scanner(System.in);
        KKHEmployeeView kkhEmployeeView = new KKHEmployeeView();
        JEMEmployeeView jemEmployeeView = new JEMEmployeeView();
        KYWEmployeeView kywEmployeeView = new KYWEmployeeView();
        YEJEmployeeView yejEmployeeView = new YEJEmployeeView();

        do {
            System.out.println("============= 멤버 선택 ==============");
            System.out.println("1. 김관훈");
            System.out.println("2. 정은미");
            System.out.println("3. 김용욱");
            System.out.println("4. 윤이정");
            System.out.println("9. 프로그램 종료");
            System.out.println("=====================================");
            System.out.print("멤버를 선택해주세요 : ");
            int no = sc.nextInt();

            if (no == 9) {
                System.out.println("프로그램을 종료합니다.");
                exit(0);
            }

            switch (no) {
                case 1:
                    kkhEmployeeView.kkhEmployee();
                    break;
                case 2:
                    jemEmployeeView.jemEmployee();
                    break;
                case 3:
                    kywEmployeeView.kywEmployee();
                    break;
                case 4:
                    yejEmployeeView.yejEmployee();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    System.out.println();
                    break;
            }

        } while (true);

    }

}
