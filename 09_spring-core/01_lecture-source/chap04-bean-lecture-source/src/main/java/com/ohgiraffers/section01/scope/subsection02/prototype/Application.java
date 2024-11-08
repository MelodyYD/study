package com.ohgiraffers.section01.scope.subsection02.prototype;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);

//        String[] beanNames = context.getBeanDefinitionNames();
//        for (String beanName : beanNames) {
//            System.out.println("beanName = " + beanName);
//        }

        Product kimchi = context.getBean("kimchi", Food.class);
        Product coke = context.getBean("coke", Drink.class);
        Product soda = context.getBean("soda", Drink.class);

        // 첫 번째 손님을 위한 쇼핑카트 객체 생성
        Cart cart1 = context.getBean("cart", Cart.class);
        cart1.addItem(kimchi);
        cart1.addItem(soda);

        System.out.println("첫 번째 손님 카트 목록 : " + cart1.showCart());

        // 두 번째 손님을 위한 쇼핑카트 객체 생성
        Cart cart2 = context.getBean("cart", Cart.class);
        cart2.addItem(coke);

        System.out.println("두 번째 손님 카트 목록 : " + cart2.showCart());
        System.out.println("cart1.hashCode() = " + cart1.hashCode());
        System.out.println("cart2.hashCode() = " + cart2.hashCode());

        /*
        *   init 메소드는 Bean 객체 생성 시점에 동작을 한다.
        *   destory 메소드는 Bean 객체 소멸 시점에 동작을 하게 되는데,
        *   이는 컨테이너를 종료시키지 않으면 확인할 수 없다.
        *   가비지 컬렉터가 해당 빈을 메모리에서 삭제할 때 destory 메소드가 동작한다.
        *   하지만 메모리에서 지우기 전에 프로세스가 종료되어
        *   강제로 컨테이너를 닫아줘야만 destory 를 확인할 수 있다.
        * */

        ((AnnotationConfigApplicationContext)context).close();

    }

}
