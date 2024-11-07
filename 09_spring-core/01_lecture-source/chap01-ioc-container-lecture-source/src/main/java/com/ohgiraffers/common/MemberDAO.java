package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// @Component 이노테이션은 IOC 컨테이너에게 Bean 으로 등록할 클래스임을 명시하는 이노테이션이다.
// 클래스 레벨에 빈을 등록할 때 이름으로 지정하지 않으면 앞글자가 소문자로 바꾸니 것이 이름으로 지정된다.
@Component
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    private MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "서은광"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "이민혁"));
        memberMap.put(3, new MemberDTO(3, "user03", "pass03", "이창섭"));
        memberMap.put(4, new MemberDTO(4, "user04", "pass04", "임현식"));
        memberMap.put(5, new MemberDTO(5, "user05", "pass05", "프니엘"));
        memberMap.put(6, new MemberDTO(6, "user06", "pass06", "육성재"));
    }

    public MemberDTO selectMember(int no) {
        return memberMap.get(no);
    }

    public boolean insertMember(MemberDTO newMember) {
        // 멤버 insert 에 성공하면 true, 실패하면 false
        int before = memberMap.size();

        memberMap.put(newMember.getNo(), newMember);

        int after = memberMap.size();

        return after > before ? true : false;

    }

}
