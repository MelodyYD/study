package com.ohgiraffers.section03.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    // 같은 예외를 던져주는 구문으로는 오버라이딩 가능하다.
//    @Override
//    public void overrideTestMethod() throws IOException {}

    // 예외를 제외하고도 오버라이딩 가능하다.
//    @Override
//    public void overrideTestMethod() {}

    // 부모의 예외처리 클래스보다 상위 타입 오버라이딩
    // 자식은 항상 부모보다 더 자세하게(더 구체적인 예외 상황) 작성해야 한다.
//    @Override
//    public void overrideTestMethod() throws Exception {}

    // 부모의 예외처리 클래스보다 더 하위에 있는 예외(즉, 구체적)인 경우 오버라이딩 가능
    @Override
    public void overrideTestMethod() throws FileNotFoundException {}

}
