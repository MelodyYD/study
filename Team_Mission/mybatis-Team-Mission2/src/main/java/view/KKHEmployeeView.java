package view;

import controller.KKHEmployeeController;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KKHEmployeeView {

    public void kkhEmployee() {
        Scanner sc = new Scanner(System.in);
        KKHEmployeeController kkhEmployeeController = new KKHEmployeeController();

        do {

            System.out.println("===============주식회사 HiMeDia==================");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원코드로 직원 조회");
            System.out.println("3. 직원 입사");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 퇴사");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            System.out.println("=================================================");

            switch (no) {
                case 1 :
                    kkhEmployeeController.selectAllEmployee();
                    break;
                case 2 :
                    kkhEmployeeController.selectEmployeeByCode(inputMenuCode());
                    break;
                case 3 :
                    kkhEmployeeController.insertEmployee(inputInsertEmployee());

            }

        } while (true);

    }

    private static Map <String, String> inputInsertEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입사할 사원의 사원번호를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.print("입사할 사원의 이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("입사할 사원의 주민등록번호를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("입사할 사원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("입사할 사원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("입사할 사원의 부서코드를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("입사할 사원의 직급코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("입사할 사원의 급여등급을 입력하세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("입사할 사원의 급여를 입력하세요 : ");
        int salary = sc.nextInt();
        System.out.print("입사할 사원의 보너스율을 입력하세요 : ");
        double bonus = sc.nextDouble();
        System.out.print("입사할 사원의 관리자사번을 입력하세요 : ");
        String managerId = sc.nextLine();
        sc.nextLine();
        System.out.print("입사할 사원의 입사일을 입력하세요 : ");
        Date hireDate = Date.valueOf(sc.nextLine());
        System.out.println("퇴사 할거같은 날짜를 입력하세요 : ");
        Date entDate = Date.valueOf(sc.nextLine());
        System.out.println("퇴직여부를 입력하세요 (Y/N) : ");
        String entYn = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", String.valueOf(salary));
        parameter.put("bonus", String.valueOf(bonus));
        parameter.put("managerId", managerId);
        parameter.put("hireDate", String.valueOf(hireDate));
        parameter.put("entDate", String.valueOf(entDate));
        parameter.put("entYn", entYn);

        return parameter;
    }

    private static Map<String, String> inputMenuCode() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색하실 메뉴 코드를 입력해주세요 : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);

        return parameter;
    }


}
