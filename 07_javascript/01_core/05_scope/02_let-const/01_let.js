/*
    let
    : var 키워드가 가진 단점(함수 레벨 스코프)를 보완하기 위해 도입된 변수 선언 키워드이다.
*/

// 1. 변수 중복 선언 금지
// var a = 10;
// var a = 20;
// console.log(a);

let msg = '안녕하세요';
// let msg = '안녕히가세요';
console.log(msg);
// let과 const 키워드는 같은 스코프 내에서 중복 선언이 불가능하다.

// 2. 블록 레벨 스코프
let i = 0;

