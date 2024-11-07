package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration("configuration03")

// test 1
//@ComponentScan(basePackages = "com.ohgiraffers")

// test 2
@ComponentScan(basePackages = "com.ohgiraffers", excludeFilters = {@ComponentScan.Filter(
        // 1. 타입으로 설정
//        type = FilterType.ASSIGNABLE_TYPE,
//        classes = {MemberDAO.class}

        // 2. 어노테이션 종류로 설정
//        type = FilterType.ANNOTATION,
//        classes = {org.springframework.stereotype.Component.class}

        // 3. 표현식으로 설정
//        type = FilterType.REGEX,
//        pattern = {"com.ohgiraffers.section03.annotationconfig.subsection01.java.*"}
)})
public class ContextConfiguration {

}
