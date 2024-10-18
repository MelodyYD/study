package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

    // FileReader 를 이해하고 사용할 수 있다.

    /* 필기.
    *   FileInputStream 과 사용 방법은 거의 동이랗다.
    *   하지만 byte 단위가 아닌 character 단위로 읽어들이는 부분이 가장 큰 차이점이다.
    * */

    public static void main(String[] args) {

        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

            int value;

            while ((value = fr.read()) != -1) {
                System.out.print((char) value);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }

}
