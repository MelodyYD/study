package view;

import controller.KYWMenuController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KYWEmployeeView {

    public void kywEmployee () {

        Scanner sc = new Scanner(System.in);
        KYWMenuController kywMenuController = new KYWMenuController();

        do {

            System.out.println("=============== 직원 관리 프로그램 ===============");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 이름 조회");
            System.out.println("3. 직원 주민번호로 조회");
            System.out.println("4. 직원 입사");
            System.out.println("5. 직원 정보 수정");
            System.out.println("6. 직원 퇴사");
            System.out.println("===============================================");
            System.out.print("실행할 메뉴를 선택해 주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    kywMenuController.selectAllEmployee();
                    break;
                case 2:
                    kywMenuController.selectNameEmployee(inputName());
                    break;
//                case 3:
//                    menuController.insertNewMenu(inputMenu());
//                    break;
//                case 4:
//                    menuController.modifyMenu(inputModifyMenu());
//                    break;
//                case 5:
//                    menuController.deleteMenu(inputDelete());
//                    break;

            }



        } while (true);

    }

    private static Map<String, String> inputName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 이름을 입력해주세요 : ");
        String name = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("name", name);


        return parameter;


    }

    //    // 삭제기능
//    private static Map<String, String> inputDelete () {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("삭제하실 메뉴 코드를 입력해주세요 : ");
//        String delete = sc.nextLine();
//
//        Map<String, String> parameter = new HashMap<>();
//        parameter.remove(delete);
//        return null;
//
//    }
//    // 수정기능
//    private static Map<String, String> inputModifyMenu() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("수정할 메뉴 코드를 입력해주세요 : ");
//        String code = sc.nextLine();
//        System.out.print("수정할 메뉴 이름을 입력해주세요 : ");
//        String name = sc.nextLine();
//        System.out.print("수정할 메뉴 가격을 입력해주세요 : ");
//        String price = sc.nextLine();
//        System.out.print("수정할 카테고리 코드를 입력해주세요 : ");
//        String categoryCode = sc.nextLine();
//
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("code", code);
//        parameter.put("name", name);
//        parameter.put("price", price);
//        parameter.put("categoryCode", categoryCode);
//
//        return parameter;
//
//    }
//    // 추가기능
//    private  static Map<String, String> inputMenu() {
//        // 메뉴 이름, 가격, 카테고리 코드를 입력 받아 넘겨주기
//        Scanner sc = new Scanner(System.in);
//        System.out.print("신규 메뉴 이름을 입력해주세요 : ");
//        String name = sc.nextLine();
//        System.out.print("신규 메뉴의 판매 가격을 입력해주세요 : ");
//        String price = sc.nextLine();
//        System.out.print("신규 메뉴의 카테고리 코드를 입력해주세요 : ");
//        String category = sc.nextLine();
//
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("name", name);
//        parameter.put("price", price);
//        parameter.put("category", category);
//
//        return parameter;
//
//    }
    //검색기능
    private static Map<String, String> inputMenuCode () {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 메뉴 코드를 입력해주세요 : ");
        String menuCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode", menuCode);

        return parameter;
    }
}
