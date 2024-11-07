package com.ohgiraffers.section02.common;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Chipmunk implements Animal {

    @Override
    public void eat() {
        System.out.println("chipmunk eat");
    }

}
