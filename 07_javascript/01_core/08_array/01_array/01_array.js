/*
    java의 배열은 원시 자료형을 저장하는 용도로 사용했다.
    그리고 java의 경우에는 type이 굉장히 중요하기 때문에 하나의 배열은 같은 타입의 데이터만 취급을 할 수 있었다.
    자바스크립트에서의 배열은 조금 더 넓은 범위로 생각하면 좋다.
*/

// 1. 배열 리터럴을 사용해서 배열 생성
// 배열이 가지고 있는 값을 요소라고 부르며, 배열은 자바스크립트의 모든 값을 다 넣을 수 있다.
const arr = ['바나나', '복숭아', '키위'];
console.log(arr);

// 2. 배열 생성자 함수를 사용해서 만들 수 있다.
// 인자가 없으면 빈 배열을 만들어준다.
const arr2 = new Array();
console.log(arr2);

// 인자가 1개이며 숫자인 경우 전달한 숫자만큼의 length를 가진 배열 리턴
const arr3 = new Array(10);
console.log(arr3);

// 인자가 2개 이상이거나 숫자가 아닌 경우에는 전달한 인자를 요소로 갖는 배열 생성
const arr4 = new Array(1, 2, 3);
console.log(arr4);

// 3. Array.of() 메소드
// 전달한 인자를 요소로 갖는 배열을 생성한다.
console.log(Array.of(10));

// 요소에 접근하는 방법
// int[] arr = new int[]{1, 2, 3};
// 1 -> 접근? arr[0]

console.table(arr);
console.log(arr[0]);

// 자바스크립트에서 객체는 프로퍼티의 집합이다.
// 원시타입이 아닌 모든 값은 객체이다.

// 배열은 요소의 갯수, 즉 배열의 길이를 나타내는 length라는 프로퍼티를 가지고 있다.
console.log(arr.length);

// 배열은 자바와 마찬가지로 length라는 프로퍼티를 갖기 때문에 for문을 사용할 수 있다.
for(let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

console.log(typeof arr);

