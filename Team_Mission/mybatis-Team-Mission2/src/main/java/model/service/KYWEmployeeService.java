package model.service;

import model.dao.KKHMenuMapper;
import model.dao.KYWMenuMapper;
import model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static common.Template.getSqlSession;

public class KYWEmployeeService {

    private KYWMenuMapper kywMenuMapper;

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        kywMenuMapper = sqlSession.getMapper(KYWMenuMapper.class);

        List<EmployeeDTO> memberDTO = kywMenuMapper.selectAllEmployee();

        sqlSession.close();

        return memberDTO;
        
    }

    public EmployeeDTO selectEmployeeName(EmployeeDTO name) {

        SqlSession sqlSession = getSqlSession();

        kywMenuMapper = sqlSession.getMapper(KYWMenuMapper.class);

        EmployeeDTO memberDTO = kywMenuMapper.selectEmployeeName(name);

        sqlSession.close();

        return memberDTO;

    }
}
