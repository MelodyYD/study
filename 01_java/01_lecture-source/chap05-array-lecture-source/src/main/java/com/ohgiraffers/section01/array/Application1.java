package com.ohgiraffers.section01.array;

public class Application1 {

    public static void main(String[] args) {
        //24.09.04
        //배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다.

        /* 필기.
        *   배열이란?
        *   동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)
        *   배열은 heap 영역에 new 연산자를 이용해서 할당을 하게 된다.
        *   new : 할당 연산자
        * */

        /* 필기.
        *   배열의 사용 이유
        *   만약 배열을 사용하지 않는다면 필요한 값을 일일히 변수에 담아주어야 한다.
        *   변수는 값 1개만을 저장할 수 있기 때문이다.
        *   1. 연속된 메모리 공간으로 관리할 수 없다. (모든 변수의 이름을 사용자가 관리해야 한다.)
        *   2. 규칙이 없기 때문에 반복문을 통한 연속 처리가 불가능하다.
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        //결과를 저장할 변수
        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        System.out.println("sum = " + sum);

        // 배열의 선언 및 할당
        // 자료형[] 변수명 = new 자료형[공간크기];
        int[] arr = new int[5];

        System.out.println("arr = " + arr);

        // 값 할당해보기
        // arr 이름을 가진 연속된 메모리 공간이고 공간마다 찾아갈 수 있는 번호(인덱스)를 이용해서 접근할 수 있다.
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        //배열은 일정한 규칙을 가지고 있기에 반복문을 통해 값을 대입할 수 있다.
        //.length : 크기 반환
        
        int sum2 = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println("sum2 = " + sum2);
        




    }
}
