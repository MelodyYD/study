package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {

        // FileOutputStream 을 이해할 수 있다.

        /* 필기.
        *   프로그램에서 발생한 데이터를 외부 파일로 보내기 위한 용도의 스트림이다.
        *   바이트 단위로 데이터를 처리한다.
        * */

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");

            // write(); 메소드 : 전달인자로 넣은 값을 해당하는 파일에 전달함.
            fout.write(97);

            byte[] barr = new byte[] {98, 99, 100, 101, 10, 103};
            fout.write(barr);

            // 1번 인덱스부터 길이 3만큼 파일에 내보내기
            fout.write(barr, 1, 3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            if(fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

}
