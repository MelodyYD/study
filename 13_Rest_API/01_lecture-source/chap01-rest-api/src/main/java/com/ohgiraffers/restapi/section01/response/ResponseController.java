package com.ohgiraffers.restapi.section01.response;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController
/* Controller + ResponseBody 가 합쳐진 것이다.
*   - 더 이상 컨트롤러는 view 를 응답할 책임을 버리고
*   - Data 만 응답을 할 것이다.
*  */
@RequestMapping("/response")
public class ResponseController {

    /* 문자열 응답 */
    @GetMapping("/hello")
    public String helloworld() {
        System.out.println("안녕 세상!!");

        return "hello world!!!";
    }

    /* 원시타입 Test */
    @GetMapping("/random")
    public int getRandom() {

        return (int)(Math.random() * 10) + 1;
    }

    /* Object 타입 응답 */
    @GetMapping("/object")
    public Message getMessage() {
        return new Message(200, "정상 응답 성공!!!");
    }

    /* List 타입 */
    @GetMapping("/list")
    public List<String> getList() {

        return List.of(new String[] {"햄버거", "피자", "치킨"});
    }

    /* Map 타입 응답 */
    @GetMapping("/map")
    public Map<Integer, String> getMap() {

        Map<Integer, String> responseMap = new HashMap<>();
        responseMap.put(200, "정상응답!!!");
        responseMap.put(404, "찾을 수가 없어요...");
        responseMap.put(500, "내 실수^^");

        return responseMap;
    }

    /* comment.
    *   image 파일은 produce 설정을 하지 않으면 텍스트 형식으로 전송된다.
    *   produces 설정은 response header 의 content-type(데이터 제공 형식)
    *   에 대한 설정이다.
    *  */
    @GetMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage() throws IOException {
        return getClass().getResourceAsStream("/images/spring.png")
                         .readAllBytes();
    }

}
