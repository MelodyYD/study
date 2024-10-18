package model.dao;

import model.dto.EmployeeDTO;

import java.util.List;

public interface JEMMenuMapper {
    List<EmployeeDTO> selectAllMember();


    EmployeeDTO selectPhone(String phone);

    int deleteMember(String empId);
}
