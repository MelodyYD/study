package com.ohgiraffers.common;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Food extends Product{

    private Date bakedDate;     //음식 만들어진 시간

    public Food() {
        super();
    }

    public Food(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    @Override
    public String toString() {
        // 부모의 toString 메소드 가져오면서 내 필드를 출력할 수 있는 구문 추가
        return super.toString() + " " + this.bakedDate;
    }

}
