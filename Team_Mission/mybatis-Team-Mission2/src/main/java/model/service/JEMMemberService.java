package model.service;

import model.dao.JEMMenuMapper;
import model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static common.Template.getSqlSession;

public class JEMMemberService {

    private JEMMenuMapper jemMenuMapper;

    public List<EmployeeDTO> selectAllMember() {
        SqlSession sqlSession = getSqlSession();

        jemMenuMapper = sqlSession.getMapper(JEMMenuMapper.class);

        List<EmployeeDTO> memberList = jemMenuMapper.selectAllMember();

        sqlSession.close();

        return memberList;
    }

    public EmployeeDTO selectPhone(String phone) {
        SqlSession sqlSession = getSqlSession();

        jemMenuMapper = sqlSession.getMapper(JEMMenuMapper.class);

        EmployeeDTO employeeDTO = jemMenuMapper.selectPhone(phone);

        sqlSession.close();

        return employeeDTO;
    }

    public boolean deleteMember(String empId) {
        SqlSession sqlSession = getSqlSession();

        jemMenuMapper = sqlSession.getMapper(JEMMenuMapper.class);

        int result = jemMenuMapper.deleteMember(empId);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
