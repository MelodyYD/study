/*
    함수 선언문
*/

/*
    함수 선언문에서는 함수의 이름을 생략할 수 없다.
    why? 어떤 객체에 프로퍼티로 추가된 것이 아니기 때문이다.
*/
function hello(name) {
    return `${name}님 안녕하세요~~`;
};

// 함수 호출
console.log(hello('윤이정'));
