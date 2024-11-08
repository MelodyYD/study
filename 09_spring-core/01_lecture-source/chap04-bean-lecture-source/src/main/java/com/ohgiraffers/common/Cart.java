package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> items;      // 카트에 담긴 상품들

    public Cart() {
        items = new ArrayList<>();
    }

    // 전달 받은 상품을 카트에 담는 메소드
    public void addItem(Product item) {
        items.add(item);
    }

    // 카트에 담긴 물품 확인 메소드
    public List<Product> showCart() {
        return items;
    }

}
