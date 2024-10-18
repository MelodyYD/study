package com.ohgiraffers.section03.remix.model.dao;

import com.ohgiraffers.section03.remix.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.awt.*;
import java.util.List;

public interface MenuMapper {

    List<MenuDTO> selectAllMenu();

    MenuDTO selectMenuByCode(int code);

    int insertNewMenu(MenuDTO newMenu);

    int modifyMenu(MenuDTO modifyMenu);

    int delete(int deleteMenu);
}
