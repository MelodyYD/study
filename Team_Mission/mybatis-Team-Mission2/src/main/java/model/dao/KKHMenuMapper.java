package model.dao;

import model.dto.EmployeeDTO;

import java.util.List;

public interface KKHMenuMapper {
    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeByCode(int menuCode);

    int insertEmployee(EmployeeDTO employeeDTO);
}
