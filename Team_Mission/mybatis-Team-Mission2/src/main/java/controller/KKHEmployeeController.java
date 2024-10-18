package controller;

import model.dto.EmployeeDTO;
import model.service.KKHEmployeeService;
import view.KKHPrintResult;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class KKHEmployeeController {

    private final KKHEmployeeService kkhEmployeeService;
    private final KKHPrintResult kkhPrintResult;

    public KKHEmployeeController() {
        this.kkhEmployeeService = new KKHEmployeeService();
        this.kkhPrintResult = new KKHPrintResult();
    }

    public void selectAllEmployee() {

        List<EmployeeDTO> memberDTO = kkhEmployeeService.selectAllEmployee();

        if (memberDTO != null) {
            kkhPrintResult.printEmployeeList(memberDTO);
        } else {
            kkhPrintResult.printErrorMessage("employeeList");
        }
    }

    public void selectEmployeeByCode(Map<String, String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("empId"));

        EmployeeDTO memberDTO = KKHEmployeeService.selectEmployeeByCode(menuCode);

        if (memberDTO != null) {
            KKHPrintResult.printEmployeeByCode(memberDTO);
        } else {
            KKHPrintResult.printErrorMessage("member");
        }

    }

    public void insertEmployee(Map<String, String> parameter) {

        EmployeeDTO employeeDTO = new EmployeeDTO();
        String empId = parameter.get("empId");
        String empName = parameter.get("empName");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        int salary = Integer.parseInt(parameter.get("salary"));
        double bonus = Double.parseDouble(parameter.get("bonus"));
        String managerId = parameter.get("managerId");
        String hireDate = parameter.get("hireDate");
        String entDate = parameter.get("entDate");
        String entYn = parameter.get("entYn");

        employeeDTO.setEmpId(empId);
        employeeDTO.setEmpName(empName);
        employeeDTO.setEmpNo(empNo);
        employeeDTO.setEmail(email);
        employeeDTO.setPhone(phone);
        employeeDTO.setDeptCode(deptCode);
        employeeDTO.setJobCode(jobCode);
        employeeDTO.setSalLevel(salLevel);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonus(bonus);
        employeeDTO.setManagerId(managerId);
        employeeDTO.setHireDate(Date.valueOf(hireDate));
        employeeDTO.setEntDate(Date.valueOf(entDate));
        employeeDTO.setEntYn(entYn);

        if(employeeDTO != null ) {
            KKHPrintResult.printInsertEmployee(employeeDTO);
        } else {
            KKHPrintResult.printErrorMessage("memberInsert");
        }
    }
}
