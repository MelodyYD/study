package com.ohgiraffers.section03.sort;

public class Application1 {

    public static void main(String[] args) {
        //24.09.05 15:10
        //변수의 두 값을 변경하는 방법

        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

//        num1 = num2;
//        num2 = num1;

        // 임시 공간 만들어보자.
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("수정 후 num1 = " + num1);
        System.out.println("수정 전 num2 = " + num2);

        int[] arr = {2, 1, 3};

//        temp2 = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp2;


    }

}
