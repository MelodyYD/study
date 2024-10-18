package com.ohgiraffers.section03.dto;
// DTO, Dto, VO => 데이터를 묶어두기 위한 클래스


public class MemberDTO {
    //24.09.09 09:55

    private int memberNo;           //회원 번호
    private String name;            //회원 이름
    private int age;                //회원 나이
    private char genter;            //회원 성별
    private double height;          //회원 키
    private double weight;          //회원 몸무게
    private boolean isActivated;    //회원 탈퇴 여부

    /* 필기.
    *   설정자(setter)와 접근자(getter)는 실무에서 암묵적으로 통용되는 규칙이 존재한다.
    * */

    /* 필기.
    *   설정자(setter)의 작성 규칙
    *   1. 필드값을 변경할 목적으로 매개변수를 설정하려는 필드와 같은 자료형으로 선언을 한다.
    *   2. 호출 당시 전달되는 매개변수의 값을 이용하여 필드 값을 변경한다.
    *   [표현식]
    *    public void setName(String name) {
    *        this.name = name;
    *    }
    *   -> set필드명 (매개변수) {
    *          this.필드명 = 매개변수;
    *      }
    * */

    /* 필기.
    *   접근자 작성 규칙
    *    필드의 값을 반환 받을 목적의 메소드 집합을 의미한다.
    *    필드에 접근해서 setter를 통해 적용된 값을 return을 통해 반환하게 되며,
    *    이때 반환 타입은 반환하려는 값의 자료형과 일치한다.
    *   [표현식]
    *    public 자료형 get필드명() {
    *        return 반환값;
    *    }
    * */

    // 1. setter(설정자) 작성
    // 해당하는 필드에 우리가 전달한 memberNo를 대입하겠다.
    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }
    // alt + insert 단축키

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGenter(char genter) {
        this.genter = genter;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    // 2. getter(접근자) 작성
    public int getMemberNo() {
        return memberNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGenter() {
        return genter;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}
