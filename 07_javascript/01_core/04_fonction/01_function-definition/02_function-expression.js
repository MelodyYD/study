/*
    자바스크립트에서 함수는 객체 타입의 값으로 변수에 함수를 할당할 수 있다.

    함수를 변수에 할당한 것을 함수 표현식이라 하며, 함수 표현식에서는 함수의 이름을 생략할 수 있다.
*/

var hello = function(name) {
    return `${name} 하~위`;
};

// 식별자로 함수를 호출
console.log(hello('윤이정'));

var calc = function add (a, b) {
    return a + b;
};


// console.log(add(10, 20));
// 함수 표현식에서 함수명을 생략하지 않아도 되지만, 함수 호출은 식별자로 하게 된다.
// -> 함수명으로는 불가능
console.log(calc(10, 20));