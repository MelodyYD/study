/*
    숫자 타입으로 명시적 타입 변환
    1. Number() 생성자 함수를 사용해서 변환
    2. parseInt, parseFloat 함수 이용(문자열->숫자만 가능)
    3. * 산술 이용
*/

console.log(Number(true));
console.log(Number(10.01));

// int, fload 소숫점 절삭
console.log(parseInt('10'));
console.log(parseFloat('10'));
console.log(parseInt('10.2'));
console.log(parseFloat('10.2'));

console.log('10' * 1);  //아무 의미 없는 *1 하여 산술연산 진행