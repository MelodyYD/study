package model.service;

import model.dao.YEJMenuMapper;
import model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static common.Template.getSqlSession;

public class YEJEmployeeService {

    private YEJMenuMapper yejMenuMapper;

    public List<EmployeeDTO> selEmpAllList() {

        SqlSession sqlSession = getSqlSession();

        yejMenuMapper = sqlSession.getMapper(YEJMenuMapper.class);

        List<EmployeeDTO> empAllList = yejMenuMapper.selEmpAllList();

        sqlSession.close();

        return empAllList;
    }

}
