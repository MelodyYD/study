package com.ohgiraffers.section02.preparedstatement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application4 {

    public static void main(String[] args) {
        // 24.10.02 10:55

        // 문제 1. EMPLOYEE 테이블에서 조회할 사원의 성씨를 입력받아 해당하는 성을 가지고 있는 사원의 정보를 모두 출력

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        // 회원 한 명의 정보를 담을 DTO
        EmployeeDTO emp = null;

        // 한명의 정보들을 하나의 인스턴스로 묶기 위한 List
        List<EmployeeDTO> empList = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("조회하실 사원의 성씨를 입력해주세요 : ");
        String empName = sc.nextLine();

//        String query = "SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE ?";
        String query = "SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE CONCAT(?,'%')";

        try {
            pstmt = con.prepareStatement(query);
//            pstmt.setString(1, empName + "%");    // % 를 이 위치에 넣을 경우
            pstmt.setString(1, empName);    // 내장함수 CONCAT 이용할 경우
            rset = pstmt.executeQuery();

            empList = new ArrayList<>();

            while (rset.next()) {
                emp = new EmployeeDTO();
                emp.setEmpId(rset.getString("EMP_ID"));
                emp.setEmpName(rset.getString("EMP_NAME"));
                emp.setEmpNo(rset.getString("EMP_NO"));
                emp.setEmail(rset.getString("EMAIL"));
                emp.setPhone(rset.getString("PHONE"));
                emp.setDeptCode(rset.getString("DEPT_CODE"));
                emp.setJobCode(rset.getString("JOB_CODE"));
                emp.setSalLevel(rset.getString("SAL_LEVEL"));
                emp.setSalary(rset.getInt("SALARY"));
                emp.setBonus(rset.getDouble("BONUS"));
                emp.setManagerId(rset.getString("MANAGER_ID"));
                emp.setHireDate(rset.getDate("HIRE_DATE"));
                emp.setEntDate(rset.getDate("ENT_DATE"));
                emp.setEntYn(rset.getString("ENT_YN"));

                empList.add(emp);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }

        for(EmployeeDTO employee : empList) {
            System.out.println("employee = " + employee);
        }

    }

}
