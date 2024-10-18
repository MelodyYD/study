package com.ohgiraffers.section03.abstraction;

public class Car {
    //24.09.06 15:35

    private boolean isOn;   //시동 상태
    private int speed;      //현재 속력

    public void startUp() {
        if(isOn) {
            System.out.println("이미 시동이 걸려있습니다.");
            System.out.println();
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다.");
            System.out.println();
        }
    }

    public void go() {
        if (isOn) {
            System.out.println("차가 앞으로 움직입니다~~~~");
            this.speed += 10;
            System.out.println("현재 차의 속도는 " + this.speed + "km/h 입니다.");
            System.out.println();
        } else {
            System.out.println("시동을 걸고 움직여 봅시다!");
            System.out.println();
        }
    }

    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("끼~~~~~~~~~~익!!");
                System.out.println("차가 멈췄습니다.");
                System.out.println();
            } else {
                System.out.println("이미 차는 움직이고 있지 않습니다!");
                System.out.println();
            }
        } else {
            System.out.println("시동부터 걸어볼까요?");
            System.out.println();
        }
    }

    public void turnOff() {
        if(isOn) {
            if (this.speed == 0) {
                this.isOn = false;
                System.out.println("안정적으로 차 시동을 껐습니다.");
                System.out.println();
            } else {
                System.out.println("달리는 상태에서는 시동을 끄면 큰일납니다!");
                System.out.println();
            }
        } else {
            System.out.println("이미 시동이 꺼져있습니다~");
            System.out.println();
        }
    }

}
