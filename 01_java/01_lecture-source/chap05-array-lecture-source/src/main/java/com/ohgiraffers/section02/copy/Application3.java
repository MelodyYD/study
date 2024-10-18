package com.ohgiraffers.section02.copy;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {
        //24.09.05 11:35
        //깊은 복사에 대해 이해할 수 있다.

        /* 필기
        *   깊은 복사는 heap 에 생성된 배열이 가지고 있는 값을 또 다른 배열에 복사를 해둔 것이다.
        *   서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기 때문에 원본 또는 복제본을 수정하더라도
        *   서로 영향을 미치지 않는다.
        * */

        /* 필기
        *   깊은 복사를 하는 방법은 4가지가 있다.
        *   1. for 문을 이용한 동일한 인덱스의 값 복사
        *   2. Object 의 clone() 메소드를 이용한 값 복사
        *   3. System 의 arraycopy() 메소드를 이용한 값 복사
        *   4. Arrays 의 copyOf() 메소드를 이용한 값 복사
        *
        *   이 중 가장 높은 성능(속도)을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy() 메소드이며,
        *   가장 많이 사용되는 방식은 copyOf() 메소드이다.
        *   clone() 은 이전 배열과 같은 배열밖에 만들지 못하는 특징이 있으며,
        *   그 외 3가지 방법은 복사하는 배열의 길이를 조절할 수 있다는 장점이 있다.
        * */

        int[] originArr = new int[] {1, 2, 3, 4, 5};

        print(originArr);

        // 1. for 문을 이용한 동일한 인덱스의 값 복사
        int[] copyArr1 = new int[10];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        // 2. Object 의 clone() 메소드를 이용한 값 복사
        int[] copyArr2 = originArr.clone();
        print(copyArr2);

        // 3. System 의 arraycopy() 메소드를 이용한 값 복사
        int[] copyArr3 = new int[10];
        /* 전달인자
        *   1. 원본배열
        *   2. 복사를 시작할 인덱스
        *   3. 복사본 배열(copyArr3)
        *   4. 복사를 시작할 인덱스
        *   5. 복사할 길이
        * */
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
        print(copyArr3);

        // 4. Arrays 의 copyOf() 메소드를 이용한 값 복사
        // 4-1. 복사하고 싶은 배열(originArr), 4-2. 만들고 싶은 배열의 길이
        int[] copyArr4 = Arrays.copyOf(originArr, 8);
        print(copyArr4);


    }

    public static void print(int[] 전달받을배열을저장할매개변수) {
        System.out.println("전달 받은 배열의 hashcode() : " + 전달받을배열을저장할매개변수.hashCode());

        for (int i=0; i<전달받을배열을저장할매개변수.length; i++) {
            System.out.print(전달받을배열을저장할매개변수[i] + " ");
        }
        System.out.println();
    }

}
