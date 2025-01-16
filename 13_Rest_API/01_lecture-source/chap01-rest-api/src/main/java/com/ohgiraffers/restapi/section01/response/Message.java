package com.ohgiraffers.restapi.section01.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {

    private int httpStatusCode;
    private String message;

}
