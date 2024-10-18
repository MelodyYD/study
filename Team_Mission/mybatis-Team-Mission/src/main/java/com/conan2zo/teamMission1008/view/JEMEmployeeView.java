package com.conan2zo.teamMission1008.view;

import com.conan2zo.teamMission1008.controller.JEMEmployeeController;

import java.util.Scanner;

public class JEMEmployeeView {

    public void displqy() {

        Scanner sc = new Scanner(System.in);
        JEMEmployeeController jemEmployeeController = new JEMEmployeeController();

        do {

            System.out.println("====================코난회사====================");
            System.out.println("1. 직원 전체 정보조회하기");
            System.out.println("2. 직원의 핸드폰번호 조회하기");
            System.out.println("3. 입사한 직원 추가하기");
            System.out.println("4. 직원 정보 수정하기");
            System.out.println("5. 퇴사한 직원 삭제하기");
            System.out.println("===============================================");
            System.out.println("실행 하실 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1:
                    jemEmployeeController.selectAllMember();




            }






        } while (true);



    }

}
