package com.ohgiraffers.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /*
    *   Interceptor 는 만들었다고 해서 끝이 아니다.
    *   WebMvcConfigurer 를 통해서 만든 인터셉터를 등록하는 과정이 필요하다.
    * */

    @Autowired
    private HandleInterceptor handleInterceptor;

    // 우리가 만든 인터셉터를 Registry(저장소)에 등록하는 역할
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(handleInterceptor)
                // 인터셉터가 어떤 요청에 동작할 것인지 정의
                .addPathPatterns("/*")
                // static(정적인 요소) 파일을 불러오는 것도 하나의 요청이다.
                // 그런 만큼 인터셉터가 단순 화면 꾸미기를 위한 요청에도 동작하는 것은 비효율적이다.
                // 그렇기에 제외할 경로를 지정하는 것이 중요하다.
                .excludePathPatterns("/css/*")
                .excludePathPatterns("/asset/*")
                .excludePathPatterns("/js/*")
                .excludePathPatterns("/images/*");

    }

}
