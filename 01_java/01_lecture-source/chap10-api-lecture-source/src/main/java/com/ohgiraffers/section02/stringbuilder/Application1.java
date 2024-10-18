package com.ohgiraffers.section02.stringbuilder;

public class Application1 {

    public static void main(String[] args) {
        //String 과 StringBuilder 의 차이점을 알 수 있다.

        /* 필기.
        *   String 과 StringBuilder 의 차이
        *
        *   String
        *   : 불변이라는 특성을 가지고 있다.
        *     문자열에 + 연산으로 합치기를 하는 경우에는 기존의 인스턴스를 수정하는 것이 아닌, 새로운 인스턴스를 반환한다.
        *     따라서 문자열 변경이 많이 일어나는 경우에는 성능상에 좋지 않다.
        *     하지만 반대로 변하지 않는 문자열 같은 경우에는 오히려 좋다.
        *
        *   StringBuilder
        *   : 가변이라는 특성을 가지고 있다.
        *     append() 라는 메소드를 이용해서 문자열 합치기를 할 수 있는데,
        *     기존의 인스턴스를 수정할 뿐, 새로운 인스턴스를 만들지 않는다.
        *     따라서 잦은 변경이 일어나는 문자열의 경우 String 보단 성능이 좋다.
        * */
        
        String str = "java";
        System.out.println("str : " + str);


        //toString() 메소드가 오버라이딩 되어있어 주소가 아닌 값이 나온다.
        StringBuilder sb = new StringBuilder("java");
        System.out.println("sb : " + sb);
        System.out.println("sb 의 hashcode() : " + sb.hashCode());

        //append("합칠 문자열");
        sb.append("mysql");
        System.out.println("sb.append() : " + sb);

        /* 필기.
        *   hashcode() 를 확인했을 때, 인스턴스가 동일한 것을 확인했다.
        *   즉, 문자열을 변경했다고 해서 새로운 인스턴스가 생성된 것이 아니다.
        * */

        System.out.println("문자열 합치기 후 sb 의 hashcode() : " + sb.hashCode());
        


    }

}
