package view;

import controller.JEMEmployeeController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JEMEmployeeView {

    public void jemEmployee() {

        Scanner sc = new Scanner(System.in);
        JEMEmployeeController jemEmployeeController = new JEMEmployeeController();

        do{

            System.out.println("============내 이름은 코난 탐정이조 회사============");
            System.out.println("1. 전체 직원 조회하기");
            System.out.println("2. 핸드폰 번호로 조회하기");
            System.out.println("3. 신입 등록하기");
            System.out.println("4. 직원 정보 수정하기");
            System.out.println("5. 퇴사 직원 정보 삭제하기");
            System.out.println("================================================");
            System.out.print("실행 할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 :
                    jemEmployeeController.selectAllMember();
                    break;
                case 2 :
                    jemEmployeeController.selectPhone(inputPhone());
                    break;
//                case 3 :
//                    jemEmployeeController.insertNewMember(inputMember());
//                    break;
//                case 4 :
//                    jemEmployeeController.modifyMember(inputModifyMember());
//                    break;
                case 5 :
                    jemEmployeeController.deleteMember(inputDeleteMember());
            }

        }while (true);

    }



    //2번
    private static Map<String, String> inputPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.print("조회 할 핸드폰 번호를 입력해주세요 : ");
        String phone = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("phone" , phone);

        return parameter;
    }

    //5번
    private static Map<String, String> inputDeleteMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제 할 사원 번호를 입력하세요 : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);

        return parameter;
    }



}


