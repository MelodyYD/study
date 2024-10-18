package com.ohgiraffers.practice;

public class BookDTO2 {

    //책 번호, 책 이름, 책 저자, 책 가격
    private int bookNo;
    private String bookName;
    private String bookAuthor;
    private int bookPrice;

    public BookDTO2() {}

    public BookDTO2(int bookNo, String bookName, String bookAuthor, int bookPrice) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    public BookDTO2(String title, int category, String author) {
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
