package com.ohgiraffers.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);

        MemberService memberService = context.getBean("memberService",MemberService.class);

        System.out.println("=====================selectMembers=====================");
        System.out.println(memberService.selectMembers());

        System.out.println("=====================selectMember======================");
        System.out.println(memberService.selectMember(1L));

    }

}
