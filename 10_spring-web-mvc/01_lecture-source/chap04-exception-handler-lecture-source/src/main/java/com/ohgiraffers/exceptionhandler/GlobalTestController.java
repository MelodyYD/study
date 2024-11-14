package com.ohgiraffers.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GlobalTestController {

    /* 필기.
    *   다른 클래스에서 @ExceptionHandler 메소드를 작성해두었다고 해서
    *   지금 클래스에서 발생하는 예외를 처리할 수는 없다.
    *   Why? 전혀 연관이 없는 클래스이기 때문에!
    * */
    /* 필기.
    *   @ExceptionHandler 의 우선순위는 해당 클래스에 핸들러가 있으면 클래스 레벨이 우선순위를 가진다.
    *   만약 해당 클래스에 핸들러가 없으면 이후 전역의 핸들러를 동작시키게 된다.
    * */
    @GetMapping("global-nullpointer")
    public String globalNull() {

        String str = null;
        System.out.println(str.charAt(0));

        return "/";

    }

    @GetMapping("global-userexception")
    public String globalUserException() throws MemberNotFoundException {
        boolean check = true;
        if (check) {
            throw new MemberNotFoundException("찾는 회원이 없어...");
        }
        return "/";
    }

    @GetMapping("global-default")
    public String manyException() {

        double[] array = new double[0];
        // 배열의 크기를 0으로 설정하고 1번째 데이터 출력하기
        System.out.println(array[0]);

        return "/";

    }

}
