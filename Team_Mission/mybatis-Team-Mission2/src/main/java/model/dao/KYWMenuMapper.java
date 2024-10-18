package model.dao;

import model.dto.EmployeeDTO;

import java.util.List;

public interface KYWMenuMapper {
    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeName(EmployeeDTO name);
}
