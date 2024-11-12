package com.ohgiraffers.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/* 필기.
*   클래스 레벨에 RequestMapping 어노테이션 사용 가능.
*   공통되는 URL 을 설정해두고 *(와일드카드)를 이용하면 조금 더 포괄적인 URL 패턴을 설정할 수 있다.
* */
@RequestMapping("/order/*")
public class ClassMappingController {

    // 1. Class 레벨에 매핑하기
    @GetMapping("/regist")
    public String registOrder(Model model) {

        model.addAttribute("message", "GET 방식의 주문 등록 핸들러 메소드 호출됨...");

        return "mappingResult";

    }

    // 2. 여러 URL 매핑하기
    // modify, delete 동시 처리
    @RequestMapping(value = {"modify", "delete"}, method = RequestMethod.POST)


}
