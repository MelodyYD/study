package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {}

    public void mainMenu() {
        int choice;
        System.out.println("*** 도서 관리 프로그램 ***");
        System.out.println();
        do {
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력 (사용 안함)");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("\n조작할 메뉴 번호를 입력해주세요. : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.println("해당 메뉴는 사용하실 수 없습니다.");
                    System.out.println();
                    break;
                case 3:
                    bm.deleteBook(inputBookNo());
                    System.out.println();
                    break;
                case 4:
                    bm.searchBook(inputBookTitle());
                    System.out.println();
                    break;
                case 5:
                    bm.displayAll();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    System.out.println();
                    break;
            }
        } while (choice != 6);
    }

    public BookDTO inputBook() {
        // BookDTO 객체의 필드 값을 키보드로 입력 받아 초기화 하고 객체 리턴
        System.out.println("추가할 도서에 대한 정보를 입력해 주세요.");
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        BookDTO book = new BookDTO(title, category, author);
        // 매개변수 생성자를 이용하여 위의 초기값을 이용하 ㄴBookDTO 객체 리턴
        return book;    // 일단 임시로~~~
    }

    public int inputBookNo() {
        // 삭제할 도서번호를 키보드로 입력 받아 리턴
        System.out.print("삭제할 도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine();
        return bNo;
    }

    public String inputBookTitle() {
        //검색할 도서제목을 키보드로 입력 받아 리턴
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        return title;
    }

}
