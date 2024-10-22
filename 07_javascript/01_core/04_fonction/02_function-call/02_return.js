function hello(name) {
    return `${name} ㅎㅇㄹ`;

    // java와 마찬가지로 return은 가장 마지막 줄에 있어야 한다.
    // 하지만 자바스크립트는 error가 아닌 무시를 하게 된다.
    console.log('dadad');
}

console.log(hello('윤이정'));

function fuc() {
    console.log('함수 호출됨...');

    // 반환 값을 명시적으로 지정하지 많으면 undefined가 된다.
    // 생략을 하더라도 undefined이다.
}
console.log(fuc());