package com.ohgiraffers.section03.wrapper;

public class Application1 {

    public static void main(String[] args) {

        // Wrapper 클래스에 대해서 알 수 있다.

        /* 필기.
        *   상황에 따라서 원시타입(ex int, boolean, char)의 데이터들을 인스턴스화 해야 하는 경우가 생긴다.
        *   이때 기본 타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데,
        *   8가지의 기본 타입 데이터를 인스턴스화 할 수 있도록 하는 클래스를 Wrapper 클래스라고 한다.
        *   (주방에서 사용하는 랩(Wrap) 과 같으 ㄴ의미로 감싼다 라는 의미)
        * */

        /* 필기.
        *   기본타입           래퍼클래스
        *   byte              Byte
        *   short             Short
        *   int               Integer
        *   long              Long
        *   float             Float
        *   double            Double
        *   char              Character
        *   boolean           Boolean
        * */

        /* 필기.
        *   박싱(Boxing) 과 언박싱(UnBoxing)
        *   기본(원시)타입을 래퍼클래스로 인스턴스화 하는 것을 Boxing 이라고 하며,
        *   래퍼클래스로 인스턴스화 된 것을 기본 타입으로 변경하는 것을 UnBoxing 이라고 한다.
        * */

        int intValue = 20;      //기본 타입
//        Integer boxingNumber = new Integer(intValue);   //인스턴스화 - 박싱
//        Integer boxingNumber2 = Integer.valueOf(boxingNumber);

//        System.out.println("boxingNumber: " + boxingNumber);
//        System.out.println("boxingNumber2: " + boxingNumber2);

        //Unboxing -> 인스턴스화 된 값을 기본으로 변경
//        int unBoxingNumber = boxingNumber;
//        System.out.println("unBoxingNumber: " + unBoxingNumber);

        /* 필기.
        *   오토 박싱(Auto Boxing) 오토 언박싱(Auto UnBoxing)
        *   jdk 1.5 부터는 박싱과 언박싱이 필요한 상황에는 컴파일러가 자동으로(묵시적) 처리해준다.
        * */

        //오토 박싱 : 원시타입의 intValue 를 자동으로 Integer 타입에 대입
        Integer boxingNumber3 = intValue;

        //오토 언박싱 : Integer 타입의 boxingNumber3 을 원시타입에 대입
        int unBoxingNumber2 = boxingNumber3;




    }

}
