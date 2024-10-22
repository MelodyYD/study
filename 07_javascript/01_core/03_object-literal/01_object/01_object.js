/*
    객체
    자바스크립트는 객체 기반 프로그래밍 언어로 원시 값을 제외한 나머지(함수, 배열 등등)는 모두 객체이다.
    객체는 0개 이상 property(값)으로 구성된 집합이며, property는 키와 값으로 구성된다.
    * 자바스크립트에서 사용할 수 있는 모든 값은 property 값이 될 수 있다.
    property 값이 function 타입이면 메소드라고 부른다.
*/

/*
    객체 생성하는 방법
    Java의 경우 new 인스턴스 생성 연산자와 함께 생성자를 호출하여 객체를 만들었다.
    자바스크립트는 Java와는 달리 여러가지 객체 생성 방식을 제공한다.

    1. 객체 리터럴 : 중괄호 내의 0개 이상의 property 정의
    2. Object 생성자 함수
    3. 생성자 함수
    4. Object.create() 메소드
    5. Class 문법

    이 5가지 방법 중 가장 많이 쓰이는 방식은 1번 객체 리터럴을 사용하는 방식이다.
*/

// 객체 리터럴의 중괄호는 코드 블럭을 의미하지 않는다.
// 따라서 닫는 중괄호 뒤에 세미콜론을 붙인다.
var student = {
    // key - value 세트로 구성
    // 프로퍼티란 객체(student)의 상태를 나타내는 값(필드 개념)
    name : '윤이정',
    age : 20,
    // 메소드 : 프로퍼티
    getInfo : function() {
        return `${this.name}은 ${this.age}살입니다.`;
    }
};

console.log(student);
console.log(typeof student);

console,log('===========================================');

var student2 = {};
console.log(student2);
console.log(typeof student2);

/*
    객체 리터럴 방식은 student 객체를 만든 것처럼 프로퍼티를 넣으면서 생성할 수도 있고,
    student2 객체처럼 비어있는 객체를 만든 후 동적으로 프로퍼티를 추가할 수도 있다.
*/

console,log('===========================================');