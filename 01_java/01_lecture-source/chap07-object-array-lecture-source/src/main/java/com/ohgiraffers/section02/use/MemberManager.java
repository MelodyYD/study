package com.ohgiraffers.section02.use;

public class MemberManager {

    /*
    *   사용자에게 1, 2번 요청을 받게 되면
    * */

    public void signUpMembers() {
        MemberDTO[] members = new MemberDTO[5];
        members[0] = new MemberDTO(1, "user01", "pass01", "푸바오", 4, '여');
        members[1] = new MemberDTO(2, "user02", "pass02", "아이바오", 7, '여');
        members[2] = new MemberDTO(3, "user03", "pass03", "러바오", 7, '남');
        members[3] = new MemberDTO(4, "user04", "pass04", "후이바오", 1, '여');
        members[4] = new MemberDTO(5, "user05", "pass05", "루이바오", 1, '여');


        // 회원 등록에 특화된 직원
        MemberInsertManager insertmanager = new MemberInsertManager();
        insertmanager.insert(members);
    }

    public void searchAllMembers() {
        MemberSearchManager searchManager = new MemberSearchManager();
        searchManager.searchAllMembers();

        MemberDTO[] result = searchManager.searchAllMembers();

        System.out.println("============== 가입 된 푸바오 패밀리 ==============");
        for(MemberDTO member : result) {
            System.out.println(member.toString());
        }
        System.out.println("================================================");
        System.out.println();

    }


}
