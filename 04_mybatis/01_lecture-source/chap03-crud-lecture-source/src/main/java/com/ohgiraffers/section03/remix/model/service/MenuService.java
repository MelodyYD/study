package com.ohgiraffers.section03.remix.model.service;

import com.ohgiraffers.section01.xmlconfig.common.Template;
import com.ohgiraffers.section03.remix.model.dao.MenuMapper;
import com.ohgiraffers.section03.remix.model.dto.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section03.remix.common.Template.getSqlSession;


public class MenuService {

    private MenuMapper menuMapper;

    public List<MenuDTO> selectAllMenu() {

        // 1. SqlSession 생성
        SqlSession sqlSession = getSqlSession();

        // 2. Template 에 등록 한 Mapper 파일 사용 준비
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menuLIST = menuMapper.selectAllMenu();

        // 3. 사용한 SqlSession 닫기
        sqlSession.close();

        return menuLIST;
    }

//    public com.ohgiraffers.section01.xmlconfig.model.dto.MenuDTO selectMenuByMenuCode(int code) {
//
//        // 1. SqlSession 생성
//        SqlSession sqlSession = Template.getSqlSession();
//
//        // 2. DAO 계층의 메소드 호출하기 - session 과 추가적인 전달 값 있으면 전달
//        com.ohgiraffers.section01.xmlconfig.model.dto.MenuDTO menu = menuDAO.selectMenuByMenuCode(sqlSession, code);
//
//        // 3. 사용한 통로 닫아주기
//        sqlSession.close();
//
//        return menu;
//
//    }
//
//    public boolean insertNewMenu(com.ohgiraffers.section01.xmlconfig.model.dto.MenuDTO newMenu) {
//
//        // 1. SqlSession 생성
//        SqlSession sqlSession = Template.getSqlSession();
//
//        // 2. DAO 계층에 SqlSession 과 전달 할 값 있으면 전달
//        int result = menuDAO.insertNewMenu(sqlSession, newMenu);
//        System.out.println("result = " + result);
//
//        // 3. dml(insert, update, delete) 구문은 트랜젝션 제어를
//        //    해주어야한다. 저장을 할 것인지, 롤백을 할 것인지
//        if (result > 0) {
//            sqlSession.commit();
//        } else {
//            sqlSession.rollback();
//        }
//
//        // 4. sqlSession 닫기
//        sqlSession.close();
//
//        return result > 0 ? true : false;
//    }
//
//    public boolean modifyMenu(com.ohgiraffers.section01.xmlconfig.model.dto.MenuDTO modifyMenu) {
//
//        SqlSession sqlSession = Template.getSqlSession();
//
//        int result = menuDAO.updateMenu(sqlSession, modifyMenu);
//
//        if (result > 0) {
//            sqlSession.commit();
//        } else {
//            sqlSession.rollback();
//        }
//
//        sqlSession.close();
//
//        return result > 0 ? true : false;
//
//    }


    public MenuDTO selectMenuByCode(int code) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);

        MenuDTO menu = menuMapper.selectMenuByCode(code);

        sqlSession.close();

        return menu;


    }

    public boolean insertNewMenu(MenuDTO newMenu) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.insertNewMenu(newMenu);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return result > 0 ? true : false;
    }

    public boolean modifyMenu(MenuDTO modifyMenu) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.modifyMenu(modifyMenu);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return result > 0 ? true : false;

    }

    public boolean deleteMenu(int deleteMenu) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.delete(deleteMenu);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
