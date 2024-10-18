package com.ohgiraffers.section02.use;

public class MemberSearchManager {

    public MemberDTO[] searchAllMembers() {

        return new MemberDTO[] {
                new MemberDTO(1, "user01", "pass01", "푸바오", 4, '여'),
                new MemberDTO(2, "user02", "pass02", "아이바오", 7, '여'),
                new MemberDTO(3, "user03", "pass03", "러바오", 7, '남'),
                new MemberDTO(4, "user04", "pass04", "후이바오", 1, '여'),
                new MemberDTO(5, "user05", "pass05", "루이바오", 1, '여')
        };

    }

}
