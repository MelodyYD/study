/*
    02. 문자열 타입
    문자열 타입은 우리가 입력하는 텍스트를 의미한다.
    java 에서는 문자열을 "" 표현
    작은 따옴표(''), 큰 따옴표(""), 백틱(``) 으로 값을 감싼다.
*/

var string;
string = 'javacript';
string = "javacript";
string = `javacript`;

string = '작은따옴표 내의 "작은따옴표"';

/* 
    템플릿 리터럴
    ES6 버전부터 도입 된 멀티라인 문자열, 표현식 삽입 등
    여러 기능을 제공하는 문자열 표기법이다.
    (``) 백틱을 사용해서 작성을 하게 된다.
*/

// 일반 문자열 '', "" 내에서는 줄바꿈을 허용하지 않는다.
// var str = '안녕하세요.
// 반갑습니다';

// 백틱(``) 을 사용해서 줄 바꿈을 표현할 수 있다.
var str = `안녕하세요
저는 조평훈입니다.`;

console.log(str);

// java 에서 문자열 합치기 와 비교
var lastName = '조';
var firstName = '평훈';

console.log('제 이름은 ' + lastName + firstName + '입니다');

// 표현식 삽입 을 이용하면 문자열 합치기 보다 간결하게 사용할 수 있다.
// 자바스크립트에서 값을 표현하고 싶으면 {} 내부에 변수를 집어넣을 수 있다.
// 하지만 주의점은 `` 으로 문자열을 감싸야 한다.
console.log(`제 이름은 ${lastName}${firstName} 입니다.`);
console.log('제 이름은 ${lastName}${firstName} 입니다.');
