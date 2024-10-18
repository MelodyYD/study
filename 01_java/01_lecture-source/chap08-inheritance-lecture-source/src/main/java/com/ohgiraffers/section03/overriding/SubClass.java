package com.ohgiraffers.section03.overriding;

//클래스에 final 키워드를 붙이게 되면 상속을 제한하는 의미이다.
public class SubClass extends SuperClass {

    //1. 메소드 이름 변경하면 오류 발생
//    @Override
//    public void method2(int num) {}

    //2. 메소드의 리턴타입 변경하면 오류 발생
//    @Override
//    public int method(int num) {return 0;}

    //3. 매개변수의 갯수, 타입 변경시 오류 발생
//    @Override
//    public void method(String num) {}

    //4. 메소드의 이름과 리턴 타입, 매개변수 갯수, 타입, 순서 모두 일치
    @Override
    public void method(int num) {}

    // 5. private 메소드는 오버라이딩 불가
//    @Override
//    private void privateMethod() {}

    //6. final 메소드 오버라이딩 불가
//    @Override
//    public final void finalMethod() {}

    //7. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 해야 가능
    @Override
//    void protectedMethod() {}   // 더 좁은 범위로는 불가능
//    protected void protectedMethod() {}   // 부모와 같은 범위로는 가능
    public void protectedMethod() {}    //더 넓은 범위로는 가능하다.


}
