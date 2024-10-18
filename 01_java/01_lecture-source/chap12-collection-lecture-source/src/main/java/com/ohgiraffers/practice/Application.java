package com.ohgiraffers.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* title. ArrayList 활용 예제(1) */

        /* comment.
         *   요구사항
         *   1. 클래스는 Application, BookDTO 클래스로 구성한다.
         *   2. Application 클래스는 main 메소드를 포함한다.
         *   3. BookDTO 클래스는 책과 관련 된 데이터를 모아둔다.
         *   4. BookDTO 클래스는 책 번호, 책 이름, 책 저자, 책 가격을 관리한다.
         *   5. BookDTO 를 사용해서 총 다섯 권의 책을 관리 할 것이며
         *      4권의 책은 BookDTO 클래스의 매개변수 있는 생성자로 만들 것이다.
         *   6. 나머지 책 한 권은 Scanner 객체를 사용해서 우리가 입력한 값으로
         *      2번째 인덱스에 추가를 할 것이다.
         *  */

        /* comment.
         *   출력 예시
         *   1. Application 에서는 ArrayList 를 만들어 4권의 책을 넣고
         *   출력하는 구문을 작성하라.
         *   2. 4권의 출력하는 구문은 for 문 과 향상된 for 문 두 가지를 사용하라.
         *   3. 출력 후 Scanner 객체를 사용해 입력한 값을 ArrayList 에 넣어 출력하라.
         *  */

        Scanner sc = new Scanner(System.in);

        List books = new ArrayList();
        books.add(new BookDTO2(100, "Apple", "aaa", 10000));
        books.add(new BookDTO2(200, "Banana", "bbb", 20000));
        books.add(new BookDTO2(300, "Carrot", "ccc", 30000));
        books.add(new BookDTO2(400, "Durian", "ddd", 40000));

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        System.out.println();

        for (Object s : books) {
            System.out.println(s);
        }


        System.out.println("새로 등록할 책 정보를 입력해 주세요.");
        System.out.print("책 번호 : ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("책 이름 : ");
        String name = sc.nextLine();

        System.out.print("책 저자 : ");
        String aut = sc.nextLine();

        System.out.print("책 가격 : ");
        int pie = sc.nextInt();
        sc.nextLine();
        System.out.println();

        books.add(2,new BookDTO2(num, name, aut, pie));

        for (Object s : books) {
            System.out.println(s);
        }


    }

}
