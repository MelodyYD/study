package com.ohgiraffers.section01.polymorphism;

public class Application {
    //24.09.11 14:50
    //다형성과 타입 형변환에 대해 이해할 수 있다.

    /*
    *   다형성이란?
    *   하나의 인스턴스가 여러 가지 타입을  가질 수 있는 것을 의미한다.
    *   그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있고,
    *   하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 만들 수 있다.
    * */

    public static void main(String[] args) {

        System.out.println("=================동물 생성=================");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();
        System.out.println();

        System.out.println("================강아지 생성================");
        Dog dog = new Dog();
        dog.eat();
        dog.run();
        dog.cry();
        dog.bite();
        System.out.println();

        System.out.println("================고양이 생성================");
        Cat cat = new Cat();
        cat.eat();
        cat.run();
        cat.cry();
        cat.Grrrr();
        System.out.println();

        /* 필기.
        *   강아지와 고양이는 동물 클래스를 상속받았다.
        *   따라서 강아지는 강아지이면서 동물이고, 고양이는 고양이이면서 동물이다.
        * */

        //1. 부모 타입으로 자식 인스턴스 주소값 저장
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // 동물은 동물이지 강아지/고양이가 아니다.
        // IS-A 관계가 성립되어야 한다.
        // 강아지 a1 = new 동물();

        // 2. 동적 바인딩 확인
        /*
        *   컴파일 시점에는 해당 타입의 메소드와 연결(통로)되어 있다가
        *   런타임 시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어
        *   동작하는 것을 의미한다.
        * */
        System.out.println("=====================동적 바인딩 확인=====================");
        a1.cry();
        a2.cry();
        System.out.println();

        /*
        *   하지만 현재 레퍼런스 변수의 타입은 동물이기 때문에 강아지와 고양이가 가진 고유 기능은 작동시킬 수 없다.
        * */
//        a1.bite();

        //3. 타입 형변환 확인
        System.out.println("=====================클래스타입 형변환=====================");

        //주의사항 : 타입 형변환을 잘못하게 되면 컴파일시에는 문제 없지만 런타임 오류가 발생한다.
//        ((Cat)a1).Grrrr();
//        ((Dog)a2).bite();
        System.out.println();

        //4. instanceof 연산자로 확인
        System.out.println("=====================instanceof=====================");
        System.out.println("a1 이 강아지 타입인지 확인 : " + (a1 instanceof Dog));
        System.out.println("a1 이 고양이 타입인지 확인 : " + (a1 instanceof Cat));
        System.out.println("a2 가 강아지 타입인지 확인 : " + (a2 instanceof Dog));
        System.out.println("a2 가 고양이 타입인지 확인 : " + (a2 instanceof Cat));
        System.out.println("a1 이 동물 타입인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a1 이 Object 타입인지 확인 : " + (a1 instanceof Object));

        //5. 클래스의 업캐스팅과 다운캐스팅
        /* 필기.
        *   클래스 형변환은 up-casting 과 down-casting 으로 구분할 수 있다.
        *   up   : 상위 타입으로 형변환 ex) 강아지 > 동물
        *   down : 하위 타입으로 형변환 ex) 동물 > 강아지
        * */

        Animal a3 = (Animal) new Cat(); // up-casting
        Cat a4 = (Cat) new Animal();    // down-casting




        System.out.println();



    }

}
