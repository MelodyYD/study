package com.ohgiraffers.common;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    private MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "서은광"));
        memberMap.put(1, new MemberDTO(1, "user02", "pass02", "이민혁"));
        memberMap.put(1, new MemberDTO(1, "user03", "pass03", "이창섭"));
        memberMap.put(1, new MemberDTO(1, "user04", "pass04", "임현식"));
        memberMap.put(1, new MemberDTO(1, "user05", "pass05", "프니엘"));
        memberMap.put(1, new MemberDTO(1, "user06", "pass06", "육성재"));
    }

}
