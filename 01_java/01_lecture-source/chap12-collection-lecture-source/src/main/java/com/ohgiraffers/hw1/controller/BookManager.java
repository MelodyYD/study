package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    ArrayList<BookDTO> booklist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public BookManager() {}

    public void addBook(BookDTO book) {
        booklist.add(book);
        System.out.println("도서 등록이 완료되었습니다.");
        System.out.println();
        // 전달받은 도서정보를 필드에 선언한 List 에 담는다.
        // 해당 BookDTO 객체를 리스트에 담기
    }

    public void deleteBook(int key) {
        if(key>=0 && key<booklist.size()) {
            booklist.remove(key);
            System.out.println(key + "번 도서를 삭제하였습니다.");
        } else {
            System.out.println("입력한 번호의 도서는 존재하지 않습니다.");
        }
        // 전달받은 도서번호를 이용하여 해당하는 인덱스에 도서를 제거한다.
    }

    public void searchBook(String title) {
        boolean found = false;

        for (BookDTO book : booklist) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("검색 결과");
                System.out.println(book);
                found = true;
                break;
            }
            if (!found) {
                System.out.println("조회된 도서가 목록에 없습니다.");
            }
        }
        // equalsIgnoreCase : 대소문자 구분 없이 비교
        // 전달받은 도서 제목의 도서를 찾고 해당 도서의 정보를 출력한다.
        // 검색된 도서가 없는경우 “조회된 도서가 목록에 없습니다” 출력
    }

    public void displayAll() {
        for(BookDTO book : booklist) {
            System.out.println(book);
        }
        // 도서목록 전체 출력
    }


}
