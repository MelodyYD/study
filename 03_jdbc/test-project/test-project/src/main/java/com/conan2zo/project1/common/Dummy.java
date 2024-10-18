package com.conan2zo.project1.common;



import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Dummy {

    public static Connection getConnection(){

        Connection con = null;

        Properties prop = null;

        try {
            prop.load(new FileReader("src/main/java/com/conan2zo/project1/file"));

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            Class.forName(driver);

            con = DriverManager.getConnection(url,prop);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public static void close (Connection con) {

        try {
            if(con != null & !con.isClosed()){
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void close (Statement stmt) {

        try {
            if(stmt != null & !stmt.isClosed()){
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void close (ResultSet rset) {

        try {
            if(rset != null & !rset.isClosed()){
                rset.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

