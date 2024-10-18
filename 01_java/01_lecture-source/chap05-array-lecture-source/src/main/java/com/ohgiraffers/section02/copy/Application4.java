package com.ohgiraffers.section02.copy;

public class Application4 {
    public static void main(String[] args) {
        //24.09.05 14:35
        //배열의 깊은 복사를 사용한 java 문법을 이해하고 활용

        /* 필기.
        *   깊은 복사는 원본 배열과 복사본 배열 둘 중 한 가지의 값을 변경하더라도 전혀 영향을 주지 않는다,
        *   다른 주소를 가지고 있기 때문이다.
        *   같은 값을 가지고 있는 서로 다른 배열!!
        * */

        // 1. 두 개의 같은 값을 가지는 배열 만들기
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        // 2. 각 배열의 인덱스에 10씩 누적 증가
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }

        // 3. 반복문을 사용한 값 출력해보기
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        /* 필기.
        *   향상된 for 문
        *   배열의 인덱스에 하나씩 차레로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복을 실행한다.
        * */

        for(int i : arr2) {
            i+=10;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        /* 주의.
        *   향상된 for문은 배열의 인덱스에 차례로 접근할 때에는 유용하나,
        *   값을 변경할 수는 없다.
        *
        * */

        for(int i : arr2) {
            System.out.print(i + " ");
        }

    }
}
