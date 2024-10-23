/*
    생성자 함수의 프로토타입
    new 연산자를 사용해서 만든 객체는 생성자 함수의 프로토타입 정보를 이용해 [[Prototype]] 을 설정한다.
*/

const user = {
    id : 'user01',
    login : function() {
        console.log(`${id} 님 로그인 성공!`)
    }
}

function Student(name) {
    this.name = name;
}

Student.prototype = user;

/*
    F.prototype 은 new F 를 호출할 때만 사용이 된다.
    new F를 호출할 때 만들어지는 새로운 객체에게 [[Prototype]]을 할당하게 된ㄷ.
*/

const student = new Student('학생1');
console.log(student.id);

// Object.create() 메소드를 사용해서 객체 생성하는 방법
const ohgiraffers = Object.create(student);
console.log(ohgiraffers);

console.log(ohgiraffers.id);