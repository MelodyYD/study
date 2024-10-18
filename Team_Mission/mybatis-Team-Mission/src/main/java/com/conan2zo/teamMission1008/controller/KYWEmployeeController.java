package com.conan2zo.teamMission1008.controller;

import com.conan2zo.teamMission1008.model.service.KYWEmployeeService;

public class KYWEmployeeController {

    // 안전한 코드 실행을 위해 private final 로 초기화
    private final Employee management;
    private final PrintResult printResult;

    // 기본 생성자
    public KYWEmployeeController() {

        // final 이라는 키워드를 사용할 시 반드시 인스턴스를 생성해서 초기화 해줘야한다.
        this.management = new Employee();
        this.printResult = new PrintResult();

    }
    public static void selectAllMember() {

    }//dd
}
