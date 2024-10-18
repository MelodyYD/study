package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Product {
    //24.09.11 11:40

    private String code;                        // 상품 코드
    private String brand;                       // 상품 브랜드
    private String name;                        // 상품 이름
    private int price;                          // 상품 가격
    private LocalDateTime manufacturingDate;    // 제조 일자

    public Product() {}

    public Product(String code, String brand, String name, int price, LocalDateTime manufacturingDate) {

        /*
        *   Product 클래스는 아무런 클래스도 상속받고 있지 않지만,
        *   super() 가 호출이 되고 있다.
        *   => 결론. 모든 클래스는
        *   => Object
        * */
        super();

        this.code  = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product 의 모든 필드를 초기화하는 생성자 호출됨...");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public LocalDateTime getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDateTime manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }


    public String getInfo() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }

}
