package com.ohgiraffers.section02.use;

public class MemberInsertManager {

    public void insert(MemberDTO[] members) {
        System.out.println("전달 받을 회원 " + members.length + "명 등록하겠습니다.");

        for(int i = 0; i < members.length; i++) {
            System.out.println(members[i].getName() + "님을 회원 등록에 성공했습니다.");
        }

    }

}
