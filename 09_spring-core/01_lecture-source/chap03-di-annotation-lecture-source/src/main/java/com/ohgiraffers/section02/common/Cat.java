package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
@Primary
/*
*   @Primary 어노테이션을 설정하면 @Autowired 로 동일한 타입(Animal) 의 여로 Bean 을 찾게 되는 경우
*   자동으로 연결을 우선시할 타입으로 설정된다.
*   동일한 타입의 클래스 중 한 개만 @Primary 어노테이션을 사용할 수 있다.
* */
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

}
