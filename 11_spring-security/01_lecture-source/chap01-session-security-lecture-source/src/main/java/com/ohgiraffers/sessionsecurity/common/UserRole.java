package com.ohgiraffers.sessionsecurity.common;

import lombok.Getter;

@Getter
public enum UserRole {

    /*
    *   enum 이란?
    *   열거형 상수들의 집합을 의미한다.
    *   주로 고정되어 있는 값들을 처리하기 위해 주로 사용한다.
    *   ex) 시스템의 권한이 단 2개 - 일반 사용자, 관리자
    * */

    USER("USER"), ADMIN("ADMIN");

    private String role;

    UserRole(String role) {this.role = role;}

}
