package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        // 3. Java-annotation 방식
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);



    }

}
