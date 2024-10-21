/*
    암묵적 타입 변환
    - 개발자가 의도를 가지고 타입을 변환하는 것을 명시적 타입 변환이라고 하며,
      자바스크립트 엔진에 의해 암묵적으로 변환하는 것을 암묵적 타입 변환이라고 한다.
    - 명시적 타입 변환은 코드에서 드러나게 되지만,
      암묵적 타입 변환은 드러나지 않기 때문에 개발자가 예측을 해야한다.
*/

// 문자열로 타입 변환
console.log(10 + '20');

// 테플릿 리터럴 표현식
console.log(`10 + 20 = ${10 + 20}`);


// 문자열 타입이 아닌 값을 암묵적으로 변환하는 결과
// 빈 문자열을 더하면 문자열로 변환이 된다.
console.log(NaN + '');
console.log(Infinity + '');
console.log(true + '');
console.log(null + '');
console.log(undefined + '');
console.log({} + '');
console.log([] + '');
console.log(function(){} + '');