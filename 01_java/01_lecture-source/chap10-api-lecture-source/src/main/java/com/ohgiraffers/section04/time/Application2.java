package com.ohgiraffers.section04.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application2 {

    public static void main(String[] args) {
        //24.09.13 10:15
        //time 패키지의 클래스들에 포매팅을 적용해서 출력할 수 있다.

        String timeNow = "10:17:10";
        String dateNow = "2024-09-13";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);

        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);

        String timeNow2 = "10-17-10";
        String dateNow2 = "240913";

        LocalTime localTime1 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println("localTime1 = " + localTime1);
        LocalDate localDate1 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println("localDate1 = " + localDate1);


    }

}
