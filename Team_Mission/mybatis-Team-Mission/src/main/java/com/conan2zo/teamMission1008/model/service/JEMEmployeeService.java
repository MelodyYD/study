package com.conan2zo.teamMission1008.model.service;

import com.conan2zo.teamMission1008.model.dao.JEMEmployeeDAO;
import org.apache.ibatis.session.SqlSession;

import static com.conan2zo.teamMission1008.common.Template.getSqlSession;

public class JEMEmployeeService {

    private final JEMEmployeeDAO jemEmployeeDAO;

    public JEMEmployeeService(){
        this.jemEmployeeDAO = new JEMEmployeeDAO();
    }

    public void selectAllMember() {
        SqlSession sqlSession = getSqlSession();

        jemEmployeeDAO.selectAllMember(sqlSession);

    // 22
    }
}
