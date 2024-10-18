package view;

import model.dto.EmployeeDTO;

import java.util.List;

public class JEMPrintResult {


    public void printMemberList(List<EmployeeDTO> memberList) {
        System.out.println("요청하신 전체 직원 조회 결과입니다.");

        for (EmployeeDTO member : memberList){
            System.out.println("member = " + member);
        }

        System.out.println("================================================");
    }

    public void printMember(EmployeeDTO employeeDTO) {
        System.out.println("요청하신 핸드폰 번호 직원 정보 조회 결과입니다.");

        System.out.println(employeeDTO);

        System.out.println("================================================");
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" :
                errorMessage = "전체 직원 조회하기에 실패하셨습니다...";
                break;
            case "selectOne" :
                errorMessage = "핸드폰 번호로 직원 조회하기에 실패하셨습니다...";
            case "delete" :
                errorMessage = "직원의 정보 삭제에 실패하셨습니다...";

        }
    }


    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode) {
            case "delete" :
                successMessage = "퇴사한 직원의 정보가 삭제되었습니다.";
                break;
        }

        System.out.println(successMessage);
    }


}
