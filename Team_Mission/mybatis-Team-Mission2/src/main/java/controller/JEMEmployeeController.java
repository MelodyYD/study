package controller;

import model.dto.EmployeeDTO;
import model.service.JEMMemberService;
import org.apache.ibatis.session.SqlSession;
import view.JEMPrintResult;

import java.util.List;
import java.util.Map;

import static common.Template.getSqlSession;

public class JEMEmployeeController {

    private final JEMMemberService jemMemberService;
    private final JEMPrintResult jemPrintResult;

    public JEMEmployeeController() {
        this.jemMemberService = new JEMMemberService();
        this.jemPrintResult = new JEMPrintResult();
    }

    public void selectAllMember() {

        List<EmployeeDTO> memberList = jemMemberService.selectAllMember();

        if(memberList != null){
            jemPrintResult.printMemberList(memberList);
        } else {
            jemPrintResult.printErrorMessage("selectList");
        }

    }

    public void selectPhone(Map<String, String> parameter) {

        String phone = parameter.get("phone");

        EmployeeDTO employeeDTO = jemMemberService.selectPhone(phone);

        if(employeeDTO != null) {
            jemPrintResult.printMember(employeeDTO);
        } else
            jemPrintResult.printErrorMessage("selectOne");
    }

    public void deleteMember(Map<String, String> parameter) {
        String empId = parameter.get("empId");

        if(jemMemberService.deleteMember(empId)){
            jemPrintResult.printSuccessMessage("delete");
        } else {
            jemPrintResult.printErrorMessage("delete");
        }


    }
}
