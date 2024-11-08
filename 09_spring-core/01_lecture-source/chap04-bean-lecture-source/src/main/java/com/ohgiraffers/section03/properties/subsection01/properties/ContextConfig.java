package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
/*
*   우리가 resource 폴더에 작성해둔 파일을 읽어들이는 annotation
* */
@PropertySource("section03/properties/product-info.properties")
public class ContextConfig {

    /*
    *   @PropertySource 로 읽을 파일에 경로를 지정하면 우리가 작성한 데이터를 읽을 준비가 된 것이다.
    *   값을 읽을 때는 key 로 value 에 접근하며, @Value 어노테이션을 사용해 간단히 불러올 수 있다.
    * */

    @Value("${food.kimchi}")
    private String foodName;

    @Value("${food.kimchi.price}")
    private int foodPrice;

    @Value("${drink.coke}")
    private String drinkCoke;

    @Value("${drink.coke.price}")
    private int drinkCokePrice;

    @Value("${drink.coke.capacity}")
    private int cokeCapacity;

    @Value("${drink.soda}")
    private String drinkSoda;

    @Value("${drink.soda.price}")
    private int drinkSodaPrice;

    @Value("${drink.soda.capacity}")
    private int sodaCapacity;

    @Bean
    public Product coke() {
        return new Drink(drinkCoke, drinkCokePrice, cokeCapacity);
    }

    @Bean
    public Product soda() {
        return new Drink(drinkSoda, drinkSodaPrice, sodaCapacity);
    }

    @Bean
    public Product kimchi() {
        return new Food(foodName, foodPrice, new Date());
    }

    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }


}
