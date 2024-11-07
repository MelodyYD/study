package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // 2. 의존성 주입(2) - 생성자

        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService service = context.getBean("constructorService", BookService.class);

        List<BookDTO> bookList = service.selectAllBooks();
        for(BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        System.out.println(service.selectOneBook(1));

    }

}
