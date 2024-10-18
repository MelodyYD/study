package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        //24.08.28 11:05
        //수업목표. 논리연결연산자

        /* 필기.
        * AND 연산과 OR 연산의 특징
        *   논리식 && 논리식 : 앞의 결과가 false면 뒤를 실행조차 안한다.
        *   논리식 || 논리식 : 앞의 결과가 true면 뒤를 실행조차 안한다.
        * */

        // 1. 논리 && 논리 : 앞의 결과가 false일 때 뒤의 식 동작 확인

        int num1 = 10;

        // 앞의 조건을 의도적으로 false로 강제화하고, 뒤의 조건은 ++로 num1의 값을 1 증가시키는 코드를 작성했다.
        // 그래서 만약에 ++num1이 동작을 했다면 result 출력했을 때 11이 나와야 하지만,
        // 결과가 10인 걸 보면 뒤 코드가 동작하지 않은 것을 출력을 통해 확인한 것이다.
        // 이미 false이기 때문에 ++을 하지 않음!!!
        int result = (false && ++num1 > 0) ? num1 : num1;

        System.out.println("&& 실행 확인해보기 : " + result);


        /* 좋은 개발자 참고.
         && 의 조건식 두 개가 모두 만족을 해야 true를 반환하는데, 첫 번째 조건식에서 false가 나오게 되면
         뒤에 조건은 확인하지 않는다.
         따라서 컴퓨터가 일을 적게 하게 만들기 위해서는 (속도 향상) false가 나올 확률이 높은 조건을 앞에 두면 좋다.
        */


        // 2. 논리 || 논리 : 앞의 결과가 true면 뒤를 실행 안 함.

        int num2 = 10;
        int result2 = (true && ++num2 > 0) ? num2 : num2;

        System.out.println("|| 실행 확인해보기 : " + result2);




    }

}
