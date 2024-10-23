function Student (name, age) {
    // 1. this
    console.log(this);
    this.name = name;
    this.age = age;
    this.getinfo = function() {
        return `${this.name}은/는 ${this.age}세입니다.`;
    }
};

const student = new Student('윤이정', 20);
console.log(student);