package com.ohgiraffers.sessionsecurity.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "main";
    }

    // 관리자만 들어갈 수 있는지 테스트
    @GetMapping("admin/page")
    public ModelAndView adminPage(ModelAndView mv) {
        mv.setViewName("/admin/admin");
        return mv;
    }

    // 일반 유저만 들어갈 수 있는지 테스트
    @GetMapping("user/page")
    public ModelAndView userPage(ModelAndView mv) {
        mv.setViewName("user/user");
        return mv;
    }

}
