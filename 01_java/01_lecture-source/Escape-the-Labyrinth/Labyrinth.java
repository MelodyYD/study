package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

public class Labyrinth {

    Option opt = new Option();
    MiniGame mGame = new MiniGame();
    int nowLocation;

    public int mainLaby () {
        if (this.nowLocation == 0) {
            startPoint();
        } else if (this.nowLocation == 40) {
            goalPoint();
            System.out.println();
            opt.finishGame();
        } else if (this.nowLocation == 1 || this.nowLocation == 27 || this.nowLocation == 30 || this.nowLocation == 31) {
            goldPoint();
            System.out.println();
            mGame.miniGameRPSStart();
        } else {
            defPoint();
            // 포인트가 아닌 곳은 항상 여기로 롤백되어서 nowLocation 확인해서 맞는 걸로 출력
        }
        return this.nowLocation;
    }

    public void pointDivision(int nowLoca) {
        // nowLoca == this.nowLocation
        SubLabyrinth sub = new SubLabyrinth();
        switch (nowLoca) {
            case 0: sub.point00(); break;
            case 1: sub.point01(); break;
            case 2: sub.point02(); break;
            case 3: sub.point03(); break;
            case 4: sub.point04(); break;
            case 5: sub.point05(); break;
            case 6: sub.point06(); break;
            case 7: sub.point07(); break;
            case 8: sub.point08(); break;
            case 9: sub.point09(); break;
            case 10: sub.point10(); break;
            case 11: sub.point11(); break;
            case 12: sub.point12(); break;
            case 13: sub.point13(); break;
            case 14: sub.point14(); break;
            case 15: sub.point15(); break;
            case 16: sub.point16(); break;
            case 17: sub.point17(); break;
            case 18: sub.point18(); break;
            case 19: sub.point19(); break;
            case 20: sub.point20(); break;
            case 21: sub.point21(); break;
            case 22: sub.point22(); break;
            case 23: sub.point23(); break;
            case 24: sub.point24(); break;
            case 25: sub.point25(); break;
            case 26: sub.point26(); break;
            case 27: sub.point27(); break;
            case 28: sub.point28(); break;
            case 29: sub.point29(); break;
            case 30: sub.point30(); break;
            case 31: sub.point31(); break;
            case 32: sub.point32(); break;
            case 33: sub.point33(); break;
            case 34: sub.point34(); break;
            case 35: sub.point35(); break;
            case 36: sub.point36(); break;
            case 40: sub.point40(); break;

        }
    }


    // 포인트가 되는 것 4개
    public void startPoint() {
        System.out.println("[ 시작 지점 ]");
    }

    public void goldPoint() {
        System.out.println("[ ! 미니 게임 ! ]");
    }

    public void goalPoint() {
        System.out.println("[ 탈출구 ]");
    }

    public void defPoint() {
        System.out.println("[ ??? ]");
    }

    public void laby01 () {
        defPoint();
        System.out.println();
    }



    /*
                E  	  				   			  	   40
        ┌────┘    ├───────────────────┐			┌────┘    ├───────────────────┐
        │ G       │                   │			│ 01   02 │ 03   04   05   06 │
        ├────┐    │    │    ┌─────    │			├────┐    │    │    ┌─────    │
        │    │    │    │    │         │			│ 07 │ 08 │ 09 │ 10 │ 11   12 │
        │    │    │    │    │    ─────┤			│    │    │    │    │    ─────┤
        │    │    │    │    │         │			│ 13 │ 14 │ 15 │ 16 │ 17   18 │
        │    │    │    │    │    │    │			│    │    │    │    │    │    │
        │              │    │    │    │			│ 19   20   21 │ 22 │ 23 │ 24 │
        ├─────    ┌────┴────┘    │    │			├─────    ┌────┴────┘    │    │
        │         │ G            │ G  │			│ 25   26 │ 27   28   29 │ 30 │
        │    ┌────┴──────────    └────┤			│    ┌────┴──────────    └────┤
        │ G  │                        │			│ 31 │ 32   33   34   35   36 │
        └────┴──────────────┐    ┌────┘			└────┴──────────────┐    ┌────┘
                               S					  	  			  00
*/


}
