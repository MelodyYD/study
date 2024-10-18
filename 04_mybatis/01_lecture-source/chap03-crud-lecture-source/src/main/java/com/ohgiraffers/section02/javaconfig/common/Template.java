package com.ohgiraffers.section02.javaconfig.common;

import com.ohgiraffers.section02.javaconfig.model.dao.MenuMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {
    // properties 파일로 넘기면 어떨까?
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/menudb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    private static SqlSessionFactory sqlSessionFactory;

    // 데이터베이스를 위한 환경설정
    public static SqlSession getSqlSession() {

        if (sqlSessionFactory == null) {
            Environment environment = new Environment(
                    "dev",
                    new JdbcTransactionFactory(),
                    new PooledDataSource(DRIVER, URL, USER, PASSWORD)
            );

            Configuration configuration = new Configuration(environment);

            // comment. 작성한 MenuMapper 인터페이스 mapper 로 등록
            configuration.addMapper(MenuMapper.class);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        }

        return sqlSessionFactory.openSession(false);

    }

}
