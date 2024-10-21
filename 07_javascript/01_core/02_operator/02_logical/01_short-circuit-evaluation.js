/*
    논리연산자
    || (OR), && (AND), !(NOT)

    단축 평가- 표현식을 평가하는 도중 결과가 확정이 된 경우 나머지 과정을 생략한다.
    ex) A && B -> A가 false면 B는 실행도 안함
*/

// OR 연산의 경우 'apple' 문자열이 Truthy 값이기 때문에 뒤에 banana 는 보지도 않고 결정한다.
// 그렇기 때문에 논리 연산 결과를 결정한 apple 이라는 피연산자를 반환한다.
console.log('apple' || 'banana')
console.log(false || 'banana')
console.log('apple' || false)

// AND 의 경우 좌항과 우항 모두 확인을 해야하기 때문에 논리 연산의 결과를 결정하는 banana가 가지고 있다.
`
`
console.log('apple' && 'banana')
console.log(false && 'banana')
console.log('apple' && false)

// obj 가 falsy(undefined or null) 값이면 좌항만 실행
// obj 가 falsy 이기 때문에 val -> null 데이터 타입 반환(값)
// 만약 obj 가 truthy 값이면 식을 결정짓는  obj.value 반환
var val = obj && obj.value;