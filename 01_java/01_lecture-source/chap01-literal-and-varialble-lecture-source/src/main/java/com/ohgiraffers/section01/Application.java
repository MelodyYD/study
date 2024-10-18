package com.ohgiraffers.section01;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */

        /* 필기.
        *   Java 라고 하는 프로그래밍 언어에서
        *   정해진 약손된 형태의 값들이 있다.
        *  */

        /* 목차. 1. 숫자 형태의 값 */
        // 1-1. 정수 형태의 값 출력
        System.out.println(123);

        // 1-2. 실수 형태의 값 출력
        System.out.println(1.23);

        /* 목차. 2. 문자 형태의 값 출력 */
        // 문자 형태의 값은 홑따옴표(single-quotation)으로 감싸야 한다.
        System.out.println('a');
        // 두 개 이상의 문자를 '' 에 입력하면?
//        System.out.println('ab');
        // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println('');
        // 아무런 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('3');
        // 숫자 값이지만, 홑따옴표로 감싸진 경우에는 문자 '3' 으로 인식한다.

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");
        // 문자열은 문자 여러 개가 나열된 형태를 의미하며, 쌍따옴표(double-quotation)으로 감싸야 한다.
        System.out.println("123");
        System.out.println(""); // 아무 값도 없는 빈 쌍따옴표도 문자열로 취급을 한다.
        System.out.println("a"); // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다. (문자 a 와는 다르다.

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false);

    }


}
