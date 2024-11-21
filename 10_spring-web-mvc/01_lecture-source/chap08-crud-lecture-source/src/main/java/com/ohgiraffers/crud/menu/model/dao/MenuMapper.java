package com.ohgiraffers.crud.menu.model.dao;

import com.ohgiraffers.crud.menu.model.dto.CategoryDTO;
import com.ohgiraffers.crud.menu.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
*   Mybatis 의 전용 어노테이션.
*   Repository 의 더 구체적인 기능을 가졌다.
* */
@Mapper
public interface MenuMapper {

    List<MenuDTO> findAllMenus();

    List<CategoryDTO> findAllCategory();

    void registNewMenu(MenuDTO newMenu);

    MenuDTO menuDetail(int code);

}
