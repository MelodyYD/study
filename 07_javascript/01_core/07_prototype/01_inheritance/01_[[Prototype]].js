/*
    [[Prototype]]
    자바스크립트에서 객체는 [[Prototype]]이라는 숨겨진 프로퍼티를 가지고 있다.
    이 친구는 null이거나, 다른 객체에 대한 참조를 가지고 있다.
*/

const user = {
    id : 'user01',
    login : function() {
        console.log(`${this.id} 님 로그인 성공!!`);
    }
};

const student = {
    name : '학생1'
}

/*
    __proto__
    [[Prototype]]의 getter 와 setter 의 역할을 한다.
*/

// student랑 user를 연결하겠다.
student.__proto__ = user;

console.log(student.id);

// student의 프로토타입은 user로 설정했다.
// 이 말은 student는 user를 상속받았다고 생각하면 된다.
// student는 부모의 프로퍼티를 사용할 수 있게 되는데, 
// 자신에게 없고 부모에게 있는 프로퍼티를 '상속 프로퍼티'라고 한다.

// 프로토타입 체인
const ohgiraffersStudent = {
    class : 3,
    __proto__ : student
}

console.log(ohgiraffersStudent.id);     //user 상속 받은 프로퍼티
console.log(ohgiraffersStudent.name);   //student 상속 받은 프로퍼티