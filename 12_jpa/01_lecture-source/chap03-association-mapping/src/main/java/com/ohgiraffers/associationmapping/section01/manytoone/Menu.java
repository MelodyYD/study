package com.ohgiraffers.associationmapping.section01.manytoone;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "menu_and_category")
@Table(name = "tbl_menu")
@NoArgsConstructor
@AllArgsConstructor
@Getter         // 엔티티는 DB에 들어가는 것이기 때문에 함부로 값을 수정하는 걸 방지하기 위해 Setter 를 지양한다.
@ToString
public class Menu {

    @Id
    @Column(name = "menu_code")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    /* comment.
    *   [영속성 전이]
    *   특정 엔터티를 영속화(관리)할 때, 연관관계에 있는 엔티티도 같이 영속화한다는 의미이다.
    *   이 클래스에서 예를 들면 1번 메뉴를 영속화할 때, 포함하는 Category 엔티티도 같이 영속화한다는 의미이다.
    *  */

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_code")
    private Category category;

    @Column(name = "orderable_status")
    private String orderableStatus;

}
