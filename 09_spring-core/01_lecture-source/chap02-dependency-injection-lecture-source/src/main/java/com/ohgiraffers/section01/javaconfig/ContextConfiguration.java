package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account account() {
        return new PersonalAccount(20, "1002-051-054-123");
    }

    @Bean
    public MemberDTO member() {
        return new MemberDTO(1, "서은광", "seoek1122@gmail.com", account());
    }

}
