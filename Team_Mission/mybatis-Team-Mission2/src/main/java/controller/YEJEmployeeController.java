package controller;

import model.dto.EmployeeDTO;
import model.service.YEJEmployeeService;
import view.YEJPrintResult;

import java.util.List;

public class YEJEmployeeController {

    private final YEJEmployeeService yejempsrv;
    private final YEJPrintResult prtRst;

    public YEJEmployeeController() {
        this.yejempsrv = new YEJEmployeeService();
        this.prtRst = new YEJPrintResult();
    }

    public void selEmpAllList() {

        List<EmployeeDTO> empList = yejempsrv.selEmpAllList();

        // 정상 조회
        if (empList != null) {
            YEJPrintResult.printEmpList(empList);
        } else {
//            YEJPrintResult.printErrorMessage("selAllList");
            System.out.println("에러~~~");
        }

    }

}