package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

public class Gold {
    private int gold;

    public int goldState () {
        // 내 골드 현황 확인
        return this.gold;
    }

    public void setGold(int change) {
        // 골드 추가 획득 혹은 사용
        this.gold += change;
//        System.out.println(change);
    }

    // 골드 사용할 때에는 -로 받을 수 있도록

//    public void goldDownStart (int change) {
//        // 골드 사용 - 처음으로
//        this.gold -= change;
//    }
//
//    public void goldDownEnd (int change) {
//        // 골드 사용 - 탈출
//        this.gold -= change;
//    }
}
