package com.ohgiraffers.section05.overloading;

public class OverloadingTests {
    //24.09.09 12:50
    //오버로딩에 대해 이해할 수 있다.

    /* 필기.
    *   오버로딩 사용 이유
    *   매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우가 종종 있다.
    *   이때 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 붙이게 되면,
    *   메소드의 이름을 다 외우고 관리하기 힘들 것이다.
    *   동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 관리하는 기술을 오버로딩(overloading)이라고 한다.
    * */

    /* 필기.
    *   오버로딩의 조건
    *   동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수가 타입, 갯수, 순서를 다르게 작성해서
    *   한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록 한다.
    *   - 메소드의 시그니쳐가 다르면 다른 메소드로 인식하게 된다.
    * */

    /* 필기
    *   메소드의 시그니처란?
    *   public void test(int num) {} 이라는 메소드가 있다면,
    *   test(int num) <=이 부분이 메소드의 시그니처이다.
    * */

    public void test() {}

    //메소드의 시그니처가 같이 때문에 컴파일 에러 발생
//    public void test() {}

    //접근제한자를 바꾸어도 메소드 시그니처가 같기 때문에 오류 발생
//    private void test() {}

    // 반환형을 바꾸더라도 메소드 시그니처가 같이 때문에 오류 발생
//    public int test() {return 0;}

    // 매개변수의 이름은 메소드 시그니처에 영향을 주지 않는다!
//    public void test(int num) {}

    // 매개변수 갯수에 따라 오버로딩 성립 확인
    public void test(int num, int num1) {}

    // 매개변수 타입 변화에 따른 오버로딩 성립 확인
    public void test(int num, String num1) {}

    // 매개변수 순서에 따른 오버로딩 성립 확인
    public void test(String num1, int num) {}
}
