package com.ohgiraffers.section05.parameter;

public class RectAngle {
    private double width;   //너비
    private double height;  //높이

    //매개변수가 있는 생성자를 작성하면, 기본생성자는 자동으로 만들어지지 않는다.
    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea() {
        double area = width * height;
        System.out.println("이 사각형의 넓이는 " + area + "입니다.");
    }

    public void calcRound() {
        double round = (width * height) * 2;
        System.out.println("이 사각형의 둘레는 " + round + "입니다.");
    }


}
