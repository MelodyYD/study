package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;

//@Component
// @Component 의 역할에 따라 특수한 @Repository 어노테이션
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

    private final Map<Integer, BookDTO> bookList;

    // DB 연동은 넘어가고 생성자를 통해 임시 데이터 생성
    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 1234, "자바가 제일 쉬웠어요!", "조평훈", "하이출판", new Date()));
        bookList.put(2, new BookDTO(2, 5678, "자바가 제일 어려웠어요!", "조땡땡", "하이출판", new Date()));
    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectBookByNo(int no) {
        return bookList.get(no);
    }

}
