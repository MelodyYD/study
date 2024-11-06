package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Data       // 편한 기능~~~~~ 다 가능~~~~~ 하지만 안 쓰는 걸 추천~~~~~ 하지만 버그/에러가 많음~~~~~
//위의 5가지 수행할 수 있지만 Lombok 자체의 버그가 많아 권장하지 않음
public class MemberDTO {

    private int no;
    private String id;
    private String pwd;
    private String name;

}
