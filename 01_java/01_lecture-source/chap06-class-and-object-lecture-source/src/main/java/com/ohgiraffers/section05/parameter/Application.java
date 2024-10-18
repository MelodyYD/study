package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {
        //24.09.09 13:10
        //메소드의 파라미터에 대해 이해할 수 있다.

        /* 필기.
        *   매개변수(parameter)로 사용 가능한 자료형
        *   1. 기본자료형
        *   2. 기본자료형 배열
        *   3. 클래스자료형
        *   4. 클래스자료형 배열
        *   5. 가변인자
        * */

        ParameterTest pt = new ParameterTest();

        // 1. 기본자료형 매개변수 전달
        int num = 20;
        pt.testPrimaryParameter(num);


        // 2. 기본자료형 배열을 매개변수로 전달받는 메소드 호출
        int[] iarr = {1, 2, 3, 4, 5};
        System.out.println("인자로 전달하는 값 : " + iarr);

        pt.testPrimaryArrayParameter(iarr);

        System.out.print("메소드 전달 후 원본 배열의 값 확인 : ");
        for(int i=0;i<iarr.length;i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        System.out.println("인자로 전달하는 값 : " + iarr);
        System.out.println();


        // 3. 클래스 자료형 매개변수 전달
        RectAngle r1 = new RectAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 클래스 자료형 값 : " + r1);
        pt.testClassParameter(r1);


        // 5. 가변인자
        /* 필기.
        *   가변인자 : 인자로 전달하는 값의 갯수가 정해지지 않은 경우 사용하는 배열이다.
        * */
        pt.testVariableLengthParameter("윤이정");  //가변인자는 전달하지 않아도 된다.
        pt.testVariableLengthParameter("윤이정", "배구","비투비","게임");
        pt.testVariableLengthParameter("윤이정", new String[] {"배구","비투비","게임"});


    }

}
