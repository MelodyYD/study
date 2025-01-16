package com.ohgiraffers.restapi.section03.valid;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ErrorResponse {

    private String code;        // 에러 코드
    private String description; // 에러 설명
    private String detail;      // 부가 설명

}
