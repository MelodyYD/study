/*
    length 프로퍼티는 요소의 갯수를 나타낸 0 이상의 정수를 value로 갖고 있다.
*/

console.log([].length);
// 기준 배열 생성
const arr = [1, 2, 3, 4, 5];
console.log(arr.length);

// 기존 배열에 값 추가 push();
arr.push(6);    // 인자로 전달한 요소 기존 배열에 추가
console.log(arr.length);
// pop() 기존 배열의 마지막 요소 제거
arr.pop();
console.log(arr.length);

// 길이 프로퍼티에 숫자값을 명시적으로 할당할 때, 기존 배열보다 작다면 배열의 길이를 줄여버린다.
// 다시 늘려도 사라진 데이터는 돌아오지 않는다.
arr.length = 3;
console.log(arr.length);

// 자바스크립트 배열의 또 다른 특징은 희소배열을 허용한다는 점이다.
// 희소배열이란, 연속적으로 위치하지 않고 비어있는 것을 의미한다.
const space = [, 2, , 4];
console.log(space);
console.log(space.length);

/*
    일반적인 배열의 길이는 요소의 갯수를 의미한다.
    따라서 배열의 길이와 요소 갯수는 항상 일치하지만,
    자바스크립트의 배열은 길이와 요소 갯수가 항상 일치하지는 않는다.
*/