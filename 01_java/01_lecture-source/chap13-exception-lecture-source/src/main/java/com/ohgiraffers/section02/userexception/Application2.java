package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNagativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {
        // 24.09.20 12:50

        // 사용자 정의의 예외클래스 정의 후 발생한 예외를 처리할 수 있다.

        ExceptionTest2 et = new ExceptionTest2();

        try {
            // 상품 가격 음수
//            et.checkEnoughMoney(-3000, 5000);

            // 가진 돈 음수
//            et.checkEnoughMoney(3000, -5000);

            // 물건의 가격이 가진 돈보다 큼
            et.checkEnoughMoney(5000, 3000);

            /* 필기.
            *   주의사항
            *   catch 블럭은 위에서부터 아래로 자신의 타입과 맞는 경우 동작을 하게 되는데,
            *   상위타입(NegativeException)이 catch 블럭 상단에 위치하게 된다면
            *   하단에 작성한 하위타입(MoneyNegativeException) 은 절대 도달할 수 없는 코드가 되어
            *   컴파일 에러를 발생시킨다.
            * */

        // 예외 상황별 catch 블럭을 따로 작성해서 처리할 수 있다.
        } catch (PriceNegativeException e) {
            System.out.println("가격이 음수 상황 발생!!!!!!!");
            System.out.println(e.getMessage());

        } catch (MoneyNagativeException e) {
            System.out.println("돈이 음수 상황 발생!!!!!!!");
            System.out.println(e.getMessage());

        } catch (NotEnoughMoneyException e) {
            System.out.println("돈이 충분하지 않은 상황 발생!!!!!!!");
            System.out.println(e.getMessage());

            // finally 구문 : 예외 발생 여부와 상관없이 실행할 내용
            //finally 구문은 나중에 다시 다루겠지만, 사용한 자원을 닫는 곳에 많이 쓴다.
        } finally {
            System.out.println("finally 블럭 예외 상관 없이 동작 확인...");
        }

        System.out.println("프로그램이 종료됩니다.");

    }

}
