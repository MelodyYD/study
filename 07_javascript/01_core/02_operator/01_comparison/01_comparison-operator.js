/* 
    기본적인 연산자 내용은 java 동일
    다른 거 위주로 확인
*/

/*
    동등/일치 비교 연산
    - 동등비교(==, !=) : 암묵적 타입 변환을 통해 타입을 일치시킨 후 값 비교
    - 일치비교(===, !==) : 타입과 값이 모두 일치해야 한다.
*/

// 숫자 1, 문자 '1', true 비교해보기
console.log(`1 == '1' : ${1 == '1'}`);
console.log(`1 == true : ${1 == true}`);
console.log(`'1' == true : ${'1' == true}`);

console.log(`1 === '1' : ${1 === '1'}`);
console.log(`1 === true : ${1 === true}`);
console.log(`'1' === true : ${'1' === true}`);

// 비교 연산자를 통해 문자열끼리도 비교가 가능하다. -> 유니코드 사용
console.log(`'apple' < 'banana' : ${'apple' < 'banana'}`);