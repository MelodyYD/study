package controller;

import model.dto.EmployeeDTO;
import model.service.KYWEmployeeService;
import view.KYWPrintResult;

import java.util.List;
import java.util.Map;

public class KYWMenuController {

    private final KYWEmployeeService kywEmployeeService;
    private final KYWPrintResult kywPrintResult;

    // MenuController 기본생성자로 MenuService,PrintResult 인스턴스 생성
    // MenuController 객체가 생성 될 때 자동으로 호출됨
    public KYWMenuController() {

        // final 이라는 키워드를 사용할 시 반드시 인스턴스를 생성해줘야한다.
        this.kywEmployeeService = new KYWEmployeeService();
        this.kywPrintResult = new KYWPrintResult();

    }

    public void selectAllEmployee() {

        List<EmployeeDTO> employeeList = kywEmployeeService.selectAllEmployee();

        // 정상 조회
            if (employeeList != null) {
                kywPrintResult.printMemberList(employeeList);
            } else {
                kywPrintResult.printErrorMessage("selectList");
        }

    }

    public void selectNameEmployee(Map<String, String> paramether) {

        String name = paramether.get("name");

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpName(name);

        EmployeeDTO employeeName = kywEmployeeService.selectEmployeeName(employeeDTO);

        if (employeeName != null) {
            kywPrintResult.printMemberName(employeeName);
        } else {
            kywPrintResult.printErrorMessage("selectNameList");
        }

    }
}
