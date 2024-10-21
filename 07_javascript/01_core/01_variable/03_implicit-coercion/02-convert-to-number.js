/*
    2. 숫자 타입으로 암묵적 타입 변환
*/

// 산술연산자의 피연산자는 숫자여야 하기 때문에 숫자가 아닌 피연산자를 숫자로 암묵적 변환한다.
console.log(10 - '5');
console.log(10 % '5');
console.log(10 / '5');
console.log(10 * '5');
console.log(10 * 'hi');  // 피연산자가 숫자 변환 불가하기 때문에 NaN

console.log('=================================================');

// + 단항 연산자로 숫자가 아닌 타입을 변환할 수 있다.
console.log(+'');
console.log(+'10');
console.log(+'java');   // 숫자로 변환 불가한 문자열 NaN
console.log(+true);
console.log(+null);
console.log(+undefined);
console.log(+{});
console.log(+[]);   // 빈 배열은 0으로 변환된다.
console.log(+function(){});