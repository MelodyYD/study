/*
    옵셔널 체이닝 연산자
    ES11(2020년) 에 도입된 연산자로서 좌항의 피연산자가 null
    또는 undefined 일 때 undefined 를 반환하고
    그렇지 않으면 우항의 프로퍼티 참조를 이어나간다.
*/

var obj = null;
// var val = obj && obj.value;
var val = obj?.value;
// 위에 두 식은 같은 의미
console.log(val);

