package view;

import model.dto.EmployeeDTO;

import java.util.List;

public class KYWPrintResult {


    public void printMemberList(List<EmployeeDTO> employeeList) {

        System.out.println("요청하신 전체 메뉴 조회 결과 입니다.");

        for (EmployeeDTO memberDTO : employeeList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }
    public void printErrorMessage (String errorCode){
        String errorMessage = "";

            switch (errorCode) {
                case "selectList":
                    errorMessage = "직원 전체 조회에 실패하셨습니다...";
                    break;
                case "selectNameList":
                    errorMessage = "직원 이름 조회에 실패하셨습니다...";
            }

            System.out.println(errorMessage);

    }


    public void printMemberName(EmployeeDTO employeeList) {

        System.out.println("요청하신 직원 이름 조회 결과입니다.");

        System.out.println(employeeList);

    }
}