package view;

import model.dto.EmployeeDTO;

import java.util.List;

public class KKHPrintResult {

    public static void printEmployeeByCode(EmployeeDTO memberDTO) {

        System.out.println("코드로 조회한 직원 조회입니다.");

        System.out.println(memberDTO.getEmpId() + "사원 조회 결과 입니다.");
        System.out.println(memberDTO);
        System.out.println("=============================================");

    }

    public static void printInsertEmployee(EmployeeDTO employeeDTO) {
        System.out.println("신입사원 오늘 입사 했나요?");
        System.out.println(employeeDTO.getEmpName() + "사원 입니다.");
        System.out.println(employeeDTO);
    }

    public void printEmployeeList(List<EmployeeDTO> memberDTO) {
        System.out.println("요청하신 전체 직원 조회입니다.");

        for(EmployeeDTO member : memberDTO) {
            System.out.println(member);
        }

        System.out.println("=================================================");
    }


    public static void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {

            case "memberList" :
                errorMessage = "직원 전체 조회에 실패하였습니다.";
                break;
            case "member" :
                errorMessage = "직원 조회에 실패하였습니다.";
                break;
            case "memberInsert" :
                errorMessage = "신입사원이 도망쳤어요!! 얼릉 잡으세요";
                break;
        }
    }
}
