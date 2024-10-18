package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryAndMenuDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementService {

    private ElementMapper mapper;

    public void selectCacheTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementMapper.class);

        // 동일한 쿼리문을 여러번 실행 테스트
        for (int i = 0; i < 10; i++) {
            // 조회 시간 확인용 시작 시간 체크
            Long startTime = System.currentTimeMillis();

            List<String> menuNameList = mapper.selectCacheTest();
            System.out.print(menuNameList);
            System.out.println();

            Long endTime = System.currentTimeMillis();

            // 총 걸린 시간 체크
            Long interval = endTime - startTime;
            System.out.println("수행 시간 : " + interval + "(ms)");

        }

        sqlSession.close();

    }

    public void selectResultMapTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapTest();

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }

        sqlSession.close();

    }

    public void selectResultMapConstructor() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapConstructor();

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }

        sqlSession.close();

    }

    public void selectResultMapAssociation() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementMapper.class);

        List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();

        for(MenuAndCategoryDTO menu : menuList) {
            System.out.println(menu);
        }

        sqlSession.close();

    }

    public void selectResultMapCollection() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementMapper.class);

        List<CategoryAndMenuDTO> menuList = mapper.selectResultMapCollectionTest();

        for(CategoryAndMenuDTO menu : menuList) {
            System.out.println(menu);
        }

        sqlSession.close();

    }

    public void sqlTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementMapper.class);

        List<MenuDTO> menuList = mapper.selectSqlTest();

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }

        sqlSession.close();

    }
}
