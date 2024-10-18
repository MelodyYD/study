package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        // File 클래스의 사용 용법을 이해할 수 있다.

        /* 필기.
        *   파일 처리를 수행하는 대표적인 클래스이다.
        *   대상 파일에 대한 정보로 인스턴스를 생성하고
        *   파일의 생성, 삭제 등을 처리하는 기능을 제공하고 있다.
        * */

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            // 파일 생성이 완료되면 boolean 타입으로 true/false 반환
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess = " + createSuccess);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

        // 영문자 1글자는 1byte, 한글 1글자는 3byte 이다.
        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("파일의 상위경로 : " + file.getParent());
        System.out.println("파일의 절대경로 : " + file.getAbsolutePath());
        
        // 파일을 삭제
        boolean isDelete = file.delete();

        System.out.println("isDelete = " + isDelete);

    }

}
