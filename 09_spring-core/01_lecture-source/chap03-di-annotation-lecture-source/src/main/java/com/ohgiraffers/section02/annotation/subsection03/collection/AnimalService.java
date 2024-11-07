package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("collectionService")
public class AnimalService {

    private final List<Animal> animals;

    @Autowired
    public AnimalService(List<Animal> animals) {
        this.animals = animals;
    }

    public void animalEat() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

}
