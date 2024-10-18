package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        //24.09.04
        //배열의 사용 방법을 익혀 배열을 사용할 수 있다.

        /* 필기.
        *   배열의 사용 방법
        *   1. 배열의 선언
        *   2. 배열의 할당
        *   3. 배열의 인덱스 공간에 값 대입
        * */

        // 1. 배열의 선언
        /*
        *   자료형[] 변수명;
        *   자료형 변수형[];
        * */

        int[] iarr2 = new int[5];
        char carr2[] = new char[10];

        /*
        *   heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근을 하는 것이다.
        *   stack에 저장된 주소로 heap 에 할당이 된 배열을 찾아갈 수 있다.
        * */

        System.out.println("iarr2.length = " + iarr2.length);
        System.out.println("carr2.length = " + carr2.length);


        // 3. 변수를 사용해서 배열의 길이 지정해보기.
        Scanner sc = new Scanner(System.in);
        System.out.print("새로 할당할 배열의 크기를 입력해주세요 : ");
        int size = sc.nextInt();


        /* 필기
        *   하지만 한 번 지정한 배열의 크기는 변경하지 못한다.
        *   배열의 사이즈를 6에서 10으로 쪼개는 게 아닌 새로운 공간을 할당해서 주소값을 레퍼런스변수에 덮어쓴 것이다.
        * */

        /* 필기
        *   한 번 할당된 배열은 지울 수 없다.
        *   다만 레퍼런스 변수를 null로 변경하여 더 이상 주소를 창조할 수 없게 된 배열은
        *   일정 시간이 지나면 heap의 old 영역으로 이동하여 GC(가비지 컬렉터)가 삭제를 해준다.
        * */

//        darr = null;
        /* 필기
        *   NullPointerException
        *   아무것도 참조하지 않고 null 이라는 특수한 값을 창조하고 있는 경우에
        *   참조연산자 (.) 을 사용하게 될 때 발생하는 에러
        *   가장 많이 볼 에러 중 하나다.
        * */

    }

}
