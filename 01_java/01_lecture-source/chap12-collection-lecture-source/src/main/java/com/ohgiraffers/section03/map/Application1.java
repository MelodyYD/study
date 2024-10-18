package com.ohgiraffers.section03.map;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {
        // 24.09.20 09:40

        // Map 의 자료구조에 대해 이해하고 HashMap 을 이용할 수 있다.

        /* 필기.
        *   Map 인터페이스의 특징
        *   일반적인 Collection 인터페이스와는 다른 저장 방식을 가지고 있다.
        *   Map 의 가장 큰 특징은 키(key)와 값(value)을 하나의 세트로 저장하는 방식이다.
        * */

        /* 필기.
        *   키(key) 란?
        *   값을 찾기 위한 이름 역할을 하는 객체를 의미한다. -> 변수의 역할
        *   1. 키는 중복 저장을 허용하지 않지만, 키가 다르다면 값은 중복 가능
        *   2. 요소의 저장 순서를 유지하지 않는다.
        * */

        /* 필기.
        *   Map 인터페이스를 구현한 클래스는 대표적으로 HashMap, HashTable, TreeMap 등이 있다.
        *   이 세 가지 클래스 중 HashMap 이 가장 많이 사용되며
        *   해시 알고리즘이 적용되어 검색 속도가 매우 빠른 특징을 가지고 있다.
        * */

        HashMap hmap = new HashMap();
        
        // 1. HashMap 인스턴스에 값 저장하기
        // put() : Map 에 값을 집어넣는 메소드
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(3.3, 123);

        System.out.println("hmap = " + hmap);
        
        // 2. 키는 중복 저장이 안된다. (set 방식)
        hmap.put(12, 345);
        System.out.println("hmap = " + hmap);

        // 3. 값은 중복 저장이 되는 지 확인
        // key 값이 중복되지 않는다면 value 는 중복 저장이 가능하다.
        hmap.put(11, 345);
        System.out.println("hmap = " + hmap);
        
        // 4. Map 에 저장된 값 ㄲ ㅓ내기 
        System.out.println("12번 키에 해당하는 값 : " + hmap.get(12));
        hmap.remove(12);
        System.out.println("hmap = " + hmap);

        // 저장 된 객체 수 확인 size() 메소드
        System.out.println("hmap 에 저장된 객체 수 : " + hmap.size());

        System.out.println();
        System.out.println("=============================================");
        System.out.println();

        // 다형성 적용해서 HashMap 만들기
        Map<String, String> hmap2 = new HashMap<>();
        hmap2.put("one", "java");
        hmap2.put("two", "mysql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "mybatis");
        hmap2.put("five", "jpa");

        // 1. keySet() 을 이용해서 키만 따로 Set 으로 만들고, iterator() 로 목록 만들기
        Set<String> keySet = hmap2.keySet();     // set 방식으로 바뀜
        Iterator<String> keyIter = keySet.iterator();       //iterator 방식으로 바뀜

        // 2. Iterator 에서 제공하는 hasNext(), next() 메소드 사용해서 반복문
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }


    }

}
