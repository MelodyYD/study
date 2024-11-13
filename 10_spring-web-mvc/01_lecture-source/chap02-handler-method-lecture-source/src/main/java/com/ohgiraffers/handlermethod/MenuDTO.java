package com.ohgiraffers.handlermethod;

/* DTO 의 기본 조건
*   1. 기본 생성자
*   2. 모든 필드를 초기화하는 생성자
*   3. Getter
*   4. Setter
*   5. ToString
* */
public class MenuDTO {

    /* 필기.
    *   form 태그의 name 속성과 필드 이름을 맞춰줘야 한다!!!!!
    * */
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO() {}

    public MenuDTO(String name, int price, int categoryCode, String orderableStatus) {
        this.name = name;
        this.price = price;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }

}
