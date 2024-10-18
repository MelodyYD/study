package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {
        // 24.08.27
        // 수업목표. 자동 형변환 규칙에 대해 이해할 수 있다.

        /* 필기.
        *  데이터 형변환
        *  데이터 형변환이 필요한 이유
        *   - 자바에서 다른 타입끼리의 연산은 모두 같은 타입인 경우 실행 가능
        *     ex) int - int, char - char 등
        *     즉, 같은 데이터 타입끼리만 연산이 가능하다.
        * */

        /* 필기.
        *  형변환의 종류와 규칙
        *   형변환의 종류
        *    1. 자동 형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 변환
        *     1-1. 작은 자료형에서 큰 자료형으로 자동으로 형변환된다.
        *     1-2. 정수는 실수로 자동 형변환 된다.
        *     1-3. 문자는 int 형으로 자동 형변환된다.
        *     1-4. 논리형은 형변환 규칙에서 제외된다.
        *    2. 강제 형변환(명시적 형변환) : 형변환 연산자(ex) (long), (int))를 이용한 강제적으로 수행하는 변환
        *     2-1. 자동이 안 된다? -> 강제다.
        * */

        // 1. 자동형변환 규칙 테스트
        // 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환이 된다.
        //      작은 자료형에서 큰 자료형으로 공간만 옮기는 경우에는 데이터 유실이 없기 때문에 컴파일러가 자동으로 수행해준다.

        // 1-1-1. 정수끼리의 자동 형변환
        System.out.println("=============== 1-1-1 ===============");
         byte bnum = 1;     // 1
        short snum = bnum;  // 2
          int inum = snum;  // 4
         long lnum = inum;  // 8

        // 연산 시에도 자동으로 큰 쪽 자료형에 맞춰 계산해준다.
          int num1 = 10;
         long num2 = 20;

//          int result1 = num1 + num2;
            // 자동으로 큰 쪽인 long 타입으로 변경 후 계산하기 때문에, int형 변수 공간에 값을 담을 수 없다.
        long result2 = num1 + num2;
        // int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 않도록 long으로 자동 변환된다.
        // 자동형변환을 통해 int가 아닌 long에 보관하는 것이기 때문에, 컴파일 오류가 발생하지 않는다.

        // 1-1-2. 실수끼리의 자동 형변환
         float fnum = 4.0f;
        double dnum = fnum;

//        float result3 = fnum + dnum;
          // 마찬가지로 안 된다.


        // 1-2. 정수는 실수로 자동 형변환이 된다.
        /* 필기.
        *  정수에서 실수로 변경할 때에는 소수점이 없어도 실수 형태로 표현된다. (본래 정수는 소수점 뒷자리가 생략된 형태)
        *  실수에서 정수로 변경하면 데이터 손실이 발생한다.
         */

        long eight = 8;
        float four = eight;
        System.out.println("four = " + four);
        // 정수와 실수의 연산은 항상 실수로 결과가 반환된다.
        
        float result4 = eight + four;
        System.out.println("result4 = " + result4);

        // 1-3. 문자형은 int 형으로 자동 형변환된다.
        //      문자에는 음수가 없기 때문이다.

        char ch = 'a';
         int charNum = ch;
        System.out.println("charNum = " + charNum);

        // 1-4. 논리형은 형변환 규칙에서 제외된다.
        boolean isTrue = true;
//        byte b = isTrue;
//        short s = isTrue;
//        double d = isTrue;
//        char c = isTrue;
        // 다 불가하다.
        // 어떠한 자료형이든 boolean은 형변환하여 담을 수 없다.


    }

}
