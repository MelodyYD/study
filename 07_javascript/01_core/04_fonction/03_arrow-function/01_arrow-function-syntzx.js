/*
    ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
    ☆  ES6 버전에서 도입이 된 화살표 함수는 function 키워드 대신에   ☆
    ★  => 를 사용해서 조금 더 간략하게 함수를 정의하는 것을 의미한다. ★
    ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆
*/

var message = function() {
    return "Hello World!!!";
}

console.log(message());

// function 생략 가능
message = () => {
    return `Arrow Function!!`;
}

console.log(message());

// 명령문(실행할 코드)이 하나만 있는 경우 중괄호 생략 가능
message = () => 'Arrow Function is Simple';

console.log(message());

// 매개변수 있을 시 화살표 함수 사용
message = (arg1, arg2) => "Arrow" + arg1 + arg2;
console.log(message('Function', 'argument!!'));

// 매개변수가 하나면 소괄호 생략 가능
message = arg1 => 'arrow arg1' + arg1;
/*  위 내용과 아래 내용이 동일함...
    message = function(arg1) {
        return 'arrow arg1' + arg1;
    }
*/
console.log(message('very simple'));