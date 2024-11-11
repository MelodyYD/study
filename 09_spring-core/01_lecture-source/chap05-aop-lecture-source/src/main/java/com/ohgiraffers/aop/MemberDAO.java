package com.ohgiraffers.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAO {

    // 아직 DB 접속은 하지 않을 것이기 때문에 임시 DB 생성
    private final Map<Long, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();
        memberMap.put(1L, new MemberDTO(1L, "서은광"));
        memberMap.put(2L, new MemberDTO(2L, "이민혁"));
    }

    // 회원 전체 조회
    public Map<Long, MemberDTO> selectAllMembers() {
        return memberMap;
    }

    // 회원 번호로 회원 조회
    public MemberDTO selectMemberByNo(Long no) {
        MemberDTO selectedMember = memberMap.get(no);

        if (selectedMember == null) {
            throw new RuntimeException("해당하는 " + no + "번째 회원은 없습니다.");
        }

        return selectedMember;

    }

}
