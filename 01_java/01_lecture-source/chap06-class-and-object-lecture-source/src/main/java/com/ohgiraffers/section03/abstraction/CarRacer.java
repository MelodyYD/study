package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    //24.09.06 15:35
    private Car car = new Car();

    public void startup() {
        car.startUp();
    }

    public void stepAccelator() {
        car.go();
    }

    public void stopBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }

}
