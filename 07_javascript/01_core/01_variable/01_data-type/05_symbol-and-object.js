/*
    symbol 타입
    변경 불가능한 원시 타입의 값이며 다른 값과 중복되지 않는 유일한 값을 의미한다.
    -> key

    이 Symbol 타입을 활용해서 나중에 값에 대한 key를 생성하게 된다.
*/

// 심볼 값 생성하기
// Symbol 함수(메소드)를 사용해서 생성한다.
var key = Symbol('key');

// 값의 데이터 타입을 확인할 때 사용하는 typeof
console.log(typeof key);

/* 
    객체 타입
    자바스크립트의 데이터타입은 크게 두 분류로 나눌 수 있다.
    java에서 원시타입과 참조타입으로 나누었다면,
    자바스크립트는 원시타입과 객체타입으로 나눌 수 있다.

    number, string, boolean, undefined, null, symbol
    이 6가지를 제외하고 모두 객체 타입이다.
*/

