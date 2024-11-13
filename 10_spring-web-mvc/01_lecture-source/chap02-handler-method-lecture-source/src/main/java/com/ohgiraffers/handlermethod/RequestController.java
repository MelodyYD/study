package com.ohgiraffers.handlermethod;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

@Controller
@RequestMapping("/request/*")
@SessionAttributes("id")
public class RequestController {

    // 요청 시 값을 전달 받는 방법
    /* 필기.
    *   view 페이지를 보여주는 방식
    *   1. String 타입 반환값에 view 파일 이름 작성
    *   2. 메소드의 반환 타입을 void
    *   - 반환 타입을 void 로 하게 되면 요청 url 이 view 의 이름이 된다.
    * */

    @GetMapping("regist")
    public void regist() {}

    /*
    *   1. WebRequest 객체로 요청 파라미터 전달 받기
    *   매개변수 선언부에 WebRequest 객체를 선언하면 해당하는 핸들러 메소드가 호출 시 인자로 값을 전달해준다.
    *   (서블릿 배울 때 doPost 메소드 내부에 HttpServletRequest)
    *   스프링 프레임워크는 내부적으로 Servlet 을 사용하기 때문에 HttpServletRequest 도 사용이 가능하다.
    *   다만 사용하지 않는 건, WebRequest 객체는 Servlet 에 종속적이지는 않아도 기능은 모두 포함하고 있기 때문이다.
    *   이에 추후 Servlet 기능이 사라지더라도 적은 수정만으로 교체할 수 있다는 장점이 있다.
    *   WebRequest 객체는 Spring 측에서 제공하기 때문에 Spring 친화적으로 많이 사용한다.
    * */
    @PostMapping("regist")
    public String registMenu(Model model, WebRequest request) {

        String menuName = request.getParameter("name");
        int menuPrice = Integer.parseInt(request.getParameter("price"));
        int categoryCode = Integer.parseInt(request.getParameter("categoryCode"));

        String message = menuName + "을(를) 신규 메뉴 목록 " + categoryCode + "번 카테고리에 " + menuPrice + "원으로 등록했습니다!";

        model.addAttribute("message", message);

        return "request/printResult";

    }

    @GetMapping("modify")
    public void modify() {}

    /*
    *   @RequestParam
    *   화면에서 요청하는 값을 담아주는 어노테이션이다.
    *   담을 매개변수 앞에 작성하게 되며, form 의 name 속성과 매개변수명을 일치시켜야 한다.
    *   만약 일치시키고 싶지 않을 경우 : @RequestParam("폼name속성") String 사용하고자하는변수명
    *   name 속성이 일치하지 않으면 400-bad request 에러가 발생한다.
    *
    * */
    @PostMapping("modify")
    public String modifyMenu(Model model, @RequestParam(required = false) String name, @RequestParam(defaultValue = "0") int price) {

        String message = name + "의 가격을 " + price + "로 수정!";
        model.addAttribute("message", message);
        return "request/printResult";

    }

    /*
    *   요청 파라미터가 여러개인 경우 각각 담는 것이 아닌, Map 을 사용해서 한 번에 담을 수 있다.
    *   맵의 키는 form 태그의 name 속성 값이 된다.
    * */
    @PostMapping("modifyAll")
    public String modifyAll(Model model, @RequestParam Map<String, String> parameters) {

        String menuName = parameters.get("modifyName2");
        int menuPrice = Integer.parseInt(parameters.get("modifyPrice2"));

        String message = menuName + "의 가격을 " + menuPrice + "로 수정!";
        model.addAttribute("message", message);

        return "request/printResult";
    }

    @GetMapping("search")
    public void search() {}

    /* ❗가장 중요❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗
    *   지금은 요청하는 파라미터가 얼마 없어 @RequestParam 어노테이션을 사용해도 간단하게 작성할 수 있다.
    *   하지만, 받아올 데이터가 많아지면 관리할 변수나 키값도 같이 많아질 수밖에 없다.
    *   @ModelAttribute 객체를 생성하여 요청되는 값을 필드와 form 태그의 name 속성끼리 비교하여 값을 넣어준다.
    *
    *   @ModelAttribute 담은 값은 view 페이지에서 타입(자료형) 앞글자를 소문자로 한 네이밍 규칙으로 사용할 수 있다.(menuDTO)
    *   다른 이름을 사용하고 싶은 경우 : @ModelAttribute("사용할값")
    *   위와 같이 지정할 수도 있다.
    * */
    @PostMapping("search")
    public String searchMenu(@ModelAttribute MenuDTO menu) {

        System.out.println("menu = " + menu);

        return "request/searchResult";

    }

    @GetMapping("login")
    public void login() {}

    @PostMapping("login1")
    public String sessionTest(HttpSession session, @RequestParam String id) {

        session.setMaxInactiveInterval(60 * 60 * 24);
        session.setAttribute("id", id);

        return "request/loginResult";

    }

    @GetMapping("logout1")
    public String logout(HttpSession session) {

        // 강제 session 만료시키는 메소드
        session.invalidate();

        return "request/loginResult";

    }

    /*
    *   @SessionAttributes 를 통한 session 에 값 담기
    *   클래스 레벨에 @SessionAttributes 를 사용하여 session 에 담을 key 값을 설정하면
    *   Model 영역에 해당 key 로 값이 추가되는 경우 자동으로 session 에 등록해준다.
    * */
    @PostMapping("login2")
    public String sessionTest2(Model model, @RequestParam String id) {

        model.addAttribute("id", id);
        return "request/loginResult";

    }

    /*
    *   SessionAttributes 방식은
    *   session 의 상태를 관리하는 SessionStatus 객체의 setComplete() 메소드를 사용해야 만료시킬 수 있다.
    * */
    @GetMapping("logout2")
    public String logout2(SessionStatus sessionStatus) {

        sessionStatus.setComplete();
        return "request/loginResult";

    }

    @GetMapping("body")
    public void body() {}

    /*
    *   @RequestBody
    *   해당 어노테이션은 http 본문 자체를 읽는 부분을 모델로 변환시켜주는 어노테이션이다.
    *   출력해보니 쿼리스트링 형태로 문자열이 전달된다.
    *   -> key 와 value 형태로 값이 전달되고 있다.
    *   나중에 나올 개념인 JSON(자바스크립트객체표현식)으로 전달되면
    *   Jackson 컨버터 : 자바스크립트 객체 <--> 자바 객체
    *   위와 같이 자동 변환해주어 프론트엔드 서버(js 기반)와 백엔드 서버(java 기반) 간의 데이터 전송을 할 수 있게 해준다.
    *   주로 Rest API 를 사용하여 만들 때 많이 사용하며, 일반적인 form 태그에서는 거의 사용하지 않는다.
    */
    @PostMapping("body")
    public String bodyTest(@RequestBody String body) throws UnsupportedEncodingException {

        System.out.println("body = " + body);
        /*
        *   넘어온 값을 보면 알 수 없이 변환이 되어있다.
        *   이것을 encoding 되어있다고 말하며, 해석하기 위해서는 decoding 을 해야한다.
        * */
        System.out.println(URLDecoder.decode(body, "UTF-8"));
        return "request/printResult";
        
    }

}
