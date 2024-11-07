package com.ohgiraffers.section02.common;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
//@Primary
public class Rabbit implements Animal {

    @Override
    public void eat() {
        System.out.println("rabbit eat");
    }

}
