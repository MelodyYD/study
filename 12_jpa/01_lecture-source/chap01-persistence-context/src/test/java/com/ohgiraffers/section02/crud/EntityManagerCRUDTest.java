package com.ohgiraffers.section02.crud;

import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EntityManagerCRUDTest {

    /* comment.
    *   Test 클래스는 기존 Main 영역의 메소드를 테스트하기 위함이다.
    *   따라서 검증할 클래스의 인스턴스를 생성해서 테스트하는 용도로 사용한다.
    *  */

    private EntityManagerCRUD crud;

    @BeforeEach
    void initManager() {
        // 테스트 메소드 실행 전 crud 클래스 인스턴스 생성
        this.crud = new EntityManagerCRUD();
    }

    @AfterEach
    void rollback() {
        // 테스트가 실제 DB에 반영되지 않도록 rollback 설정
        EntityTransaction transaction = crud.getManagerInstance().getTransaction();
        // 모든 권한은 매니저에게 entity 를 관리하게 넘겨준다.
        transaction.rollback();
    }

    /* comment.
    *   테스트 시 여러 값들을 이용해서 검증이 필요한 경우 경우의 수 별로 테스트 메소드를 작성해야 한다.
    *   ParameterizedTest 는 경우의 수만큼 반복해야 할 작업을 줄여줄 수 있다.
    *  */
    @ParameterizedTest
    // 여러 개의 테스트 전용 파라미터를 전달. 쉼표로 값을 구분할 수 있다.
    @CsvSource({"1,1", "2,2", "3,3"})
    void testFindByCode(int menuCode, int expected) {

        Menu foundMenu = crud.findMenuByMenuCode(menuCode);
        System.out.println("foundMenu = " + foundMenu);

        Assertions.assertEquals(expected, foundMenu.getMenuCode());

    }

    private static Stream<Arguments> newMenu() {
        return Stream.of(
                Arguments.of(
                        "불고기백반", 11000, 4, "Y"
                )
        );
    }

    @ParameterizedTest
    @DisplayName("새로운 메뉴 insert Test")
    @MethodSource("newMenu")
    void testInsertNewMenu(String name, int price, int code, String orderableStatus) {
        Menu newMenu = new Menu(name, price, code, orderableStatus);
        System.out.println("newMenu = " + newMenu);

        // 새롭게 만든 Menu 객체 전달
        Long count = crud.saveAndReturnCount(newMenu);

        Assertions.assertEquals(22, count);

    }

}
