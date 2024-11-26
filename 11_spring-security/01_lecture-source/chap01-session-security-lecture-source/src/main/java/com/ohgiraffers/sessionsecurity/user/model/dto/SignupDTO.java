package com.ohgiraffers.sessionsecurity.user.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SignupDTO {

    private String userID;
    private String userName;
    private String userPass;
    private String role;

}
