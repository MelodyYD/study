package com.ohgiraffers.section01.string;

public class Application1 {

    public static void main(String[] args) {

        // String 클래스의 자주 사용하는 메소드에 대해 숙지할 수 있다.

        /* 필기.
        *   charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자 반환
        * */

        String str1 = "apple";

        for(int i=0; i<str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        /* 필기.
        *   concat() : 문자열에 인자로 전달된 문자열을 합치기하여 새로운 문자열을 반환한다.
        *              단, 원본 문자열에는 영향을 주지 않는다.
        * */

        String str2 = "java";
        String str3 = "mysql";

        System.out.println("concat() 메소드 활용 : " + (str2.concat(str3)));
        System.out.println("concat() 동작 후 str2의 값 : " + str2);


        /* 필기.
        *   trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        * */

        String trimStr = "    java    ";
        System.out.println("기존 trimStr 데이터 확인 : " + trimStr + "@");
        System.out.println("trim() 메소드 활용 : " + trimStr.trim() + "@");
        System.out.println("trimStr = " + trimStr); // 원본은 영향을 받지 않는다.


        /* 필기.
        *   toLowerCase() : 모든 문자를 소문자로 바꿔줌
        *   toUpperCase() : 모든 문자를 대문자로 바꿔줌
        *   마찬가지로 원본에는 영향을 미치지 않는다.
        * */

        String caseStr = "JavaMySQL";
        System.out.println("toLower : " + caseStr.toLowerCase());
        System.out.println("toUpper : " + caseStr.toUpperCase());


        /* 필기.
        *   substring() : 문자열의 일부를 잘라내어 새로운 문자열 반환
        * */

        String str4 = "javaMySQL";
        System.out.println("substring(3, 6) : " + str4.substring(3, 6)); //aMy
        System.out.println("substring(3) : " + str4.substring(3)); //aMySQL
        //오버로딩 됨


        /* 필기.
        *   replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 사용한다.
        * */
        System.out.println("replace() : " + str4.replace("java","python"));



    }

}
