package com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application2 {

    public static void main(String[] args) {
        // 24.09.30 10:50

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/employee";
        String username = "ohgiraffers";
        String password = "ohgiraffers";

        // 1. Connection 객체 선언
        Connection con = null;

        // 2. 사용할 드라이버 등록
        try {
            Class.forName(driver);

            // 3. 드라이버 매니저로 Connection 인스턴스 생성
            con = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        } catch (SQLException e) {
            throw new RuntimeException(e);

        // 4. 사용한 커넥션 자원 닫기
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
