package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("qualifierService")
public class AnimalService {

    /*
    *   @Qualifier 어노테이션은 여러 개의 Bean 객체 중에서
    *   특정 Bean 을 이름으로 지정하는 어노테이션이다.
    *   @Primary 어노테이션이 존재하더라도 Qualifier 로 이름을 지정해두면
    *   우선순위를 가지게 된다.
    * */

    // 필드 주입 방식
//    @Autowired
//    @Qualifier("Chipmunk")
//    private Animal animal;

    private final Animal animal;

    @Autowired
    public AnimalService(@Qualifier("chipmunk") Animal animal) {
        this.animal = animal;
    }

    public void animalEat() {
        animal.eat();
    }

}
