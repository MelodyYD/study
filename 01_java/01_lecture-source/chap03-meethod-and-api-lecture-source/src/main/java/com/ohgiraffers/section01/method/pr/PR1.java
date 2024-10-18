package com.ohgiraffers.section01.method.pr;

public class PR1 {

    public static void main(String[] args) {

        PR1 hi = new PR1();
//        hi.JEM();
        hi.Hello("은미");
//        hi.LSH();
        hi.Hello("정현");
//        hi.LSH();
        hi.Hello("승현");
//        hi.YEJ();
        hi.Hello("이정");

    }
//
//    public void JEM() {
//        System.out.print("은미");
//    }
//
//    public void MJH() {
//        System.out.print("정현");
//    }
//
//    public void LSH() {
//        System.out.print("승현");
//    }
//
//    public void YEJ() {
//        System.out.print("이정");
//    }

    public void Hello(String name) {
        System.out.print(name);
        System.out.println("님 안녕하세요?");
    }



}
