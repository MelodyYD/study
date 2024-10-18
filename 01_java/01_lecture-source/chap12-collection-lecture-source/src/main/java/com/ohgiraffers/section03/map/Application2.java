package com.ohgiraffers.section03.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {
        // 24.09.20 10:40

        // Properties 에 대해 이해할 수 있다.

        /* 필기.
        *   Properties 란?
        *   HashMap 을 구현하여 사용 방법이 거의 유사하지만, 차별점은 key 와 value 모두 문자열만 사용할 수 있다는 것이다.
        *   사용하는 예시는 대부분의 설정 관련 파일의 값을 읽어 어플리케이션에 적용하기 위해 사용한다.
        * */

        // Properties 는 값의 의미를 가졌다.
        Properties prop = new Properties();

        // 값 설정
        prop.setProperty("driver", "com.mysql.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost/menu");
        prop.setProperty("username", "ohgiraffers");
        prop.setProperty("password", "ohgiraffers");

        System.out.println("prop = " + prop);


        // 예외 처리 -> 파일의 입력과 출력에 대한 것은 예외 처리를 강제화 해두었다.
        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileOutputStream("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("=========================================");
        System.out.println();


        // 1. Output 으로 내보낸 파일을 읽어보자.
        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileInputStream("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));

            // list() -> Properties 의 모든 키와 값 목록을 내보내기한다.
            prop2.list(System.out);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
