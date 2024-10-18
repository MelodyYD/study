package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster {
    //24.09.06 12:50

    /* 접근제한자
    *   클래스 혹은 클래스의 멤버(변수, 메소드) 에 참조연산자(.)로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
    *   1. public : 모든 패키지에서 접근 가능
    *   2. pratected : 동일 패키지에서 접근 가능 (단, 상속관계에 있는 경우 다른 패키지에서 접근 가능)
    *   3. private : 해당 클래스 내부에서만 접근 가능
    *   4. default : 동일 패키지에서만 접근 허용(쓰지 않는 게 default)
    * */

    private String kinds;
    private String hp;


    //1. name hp
//    String name;
//    int hp;

    //2. 또 마음이 바뀌었다. 이름이 아니라 종류로...
//    String kinds;
//    int hp;

//    public void setName(String name) {
//        this.kinds = name;
//    }
//    public void setHp(int hp) {
//        if(hp > 0) {
//            this.hp = hp;
//        } else {
//            this.hp = 0;
//        }
//    }
//
//    // 몬스터의 정보(이름, hp)를 알려주는 기능
//    public String getInfo() {
//        return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
//    }

}
