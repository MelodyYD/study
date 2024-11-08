package com.ohgiraffers.section01.scope.subsection01.singleton;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class ContextConfig {

    @Bean
    public Product kimchi() {
        return new Food("겉절이", 2000, new Date());
    }

    @Bean
    public Product coke() {
        return new Drink("콜라", 1500, 500);
    }

    @Bean
    public Product soda() {
        return new Drink("밀키스", 1800, 250);
    }

    @Bean
    public Cart cart() {
        return new Cart();
    }

}
