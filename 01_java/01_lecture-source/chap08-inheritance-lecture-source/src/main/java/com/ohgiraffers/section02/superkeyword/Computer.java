package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Computer extends Product{

    private String cpu;
    private int hdd;
    private int ram;
    private String os;

    public Computer() {
        System.out.println("Computer 클래스의 기본생성자 호출됨...");
    }

    public Computer(String code, String brand, String name, int price, LocalDateTime manufacturingDate, String cpu, int hdd, int ram, String os) {
        //부모의 모든 필드를 초기화하는 생성자로 값 전달
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        System.out.println("Computer 클래스의 부모 필드도 같이 초기화하는 생성자 호출함");
    }

    public Computer(String cpu, int hdd, int ram, String os) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출됨...");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Computer ["
                + "cpu=" + this.cpu
                + ", hdd=" + this.hdd
                + ", ram=" + this.ram
                + ", os=" + this.os + "]";

    }

}
