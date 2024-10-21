// Data-type은 값의 종류를 말하며, 자바스크립트는 7개의 데이터 타입을 제공한다.

// 01. 숫자 관련 자료형
// 다양한 숫자 타입을 제공한다.
// ex) 

// 하지만 자바스크립트의 경우에는 하나의 숫자 타입만 존재하며, 모든 수를 실수로 처리한다.

// 변수를 선언하는 키워드 var
var integer = 10;
var double = 5.5;
var negative = -10;

// 자바에서는 출력할 때 sout
// 자바스크립트는 console.Log();

// ctrl + alt + n
console.log(10 === 10.0);
console.log(10 / 4);

// 숫자 타입은 추가적으로 세 가지의 특별한 값을 표현할 수 있다.
// Infinity : 무한대
// -Infinity : 음의 무한대
// NaN : 산술 연산 불가 Not a Number

console.log(10 / 0);
console.log(10 / -0);
console.log(1 * '문자열');