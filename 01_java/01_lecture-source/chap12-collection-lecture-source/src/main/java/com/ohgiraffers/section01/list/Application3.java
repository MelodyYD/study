package com.ohgiraffers.section01.list;

import java.util.Stack;

public class Application3 {

    public static void main(String[] args) {
        //24.09.19 12:35

        /* 필기.
        *   Stack
        *   대표적인 예시로 메소드의 호출 구조를 들 수 있다.
        *   선형 메모리 공간에 데이터를 저장하며, 후입선출(LIFO - Last In First Out) 방식의 구조이다.
        * */

        Stack<Integer> integerStack = new Stack<>();

        // Stack 에 값을 넣을 때는 push()
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack = " + integerStack);

        // stack 요소를 찾을 때 search() 사용 가능하다.
        // 인덱스가 아닌 위에서부터의 순번을 의미한다.
        // 또한 가장 상단의 위치가 0이 아닌 1부터 시작을 한다.
        System.out.println(integerStack.search(5));

        /* 필기.
        *   stack 에 값을 꺼내는 메소드는 2가지가 있다.
        *   peek() : 해당 스택 공간에서 가장 마지막(상단)에 있는 요소 반환
        *    pop() : 해당 스택 공간에서 가장 마지막(상단)에 있는 요소 반환 후 제거
        * */

        System.out.println("peak() : " + integerStack.peek());
        System.out.println("integerStack = " + integerStack);
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);


    }

}
