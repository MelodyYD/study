package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

    public static void main(String[] args) {

        // FileWriter 를 이해하고 사용할 수 있다.

        /* 필기.
        *   프로그램의 데이터를 내보내기 위한 스트림
        *   FileOutputStream 과 다른 점은 글자(Character) 단위로 데이터를 처리한다.
        * */

        FileWriter fw = null;

        try {
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fw.write(97);
            fw.write('A');
            fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});
            fw.write("하이미디어아카데미");

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            if(fw != null) {
                try {
                    fw.close();

                    /* 필기.
                    *   close 메소드는 닫기 전에 flush() 라는 메소드를 실행시키고 닫는다.
                    *   flush() : 통로에 남아있는 잔류 데이터를 밀어주는 기능.
                    * */

                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
            }

        }

    }

}
