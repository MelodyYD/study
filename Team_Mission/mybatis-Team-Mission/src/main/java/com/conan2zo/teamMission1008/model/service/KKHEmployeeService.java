package com.conan2zo.teamMission1008.model.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSession;

import static com.conan2zo.teamMission1008.common.Template.getSqlSession;

public class KKHEmployeeService {

    public KKHEmployeeService(){} // 기본생성자

    public static void colummsAllSearch() {

        SqlSession sqlSession = getSqlSession();
    }
}
