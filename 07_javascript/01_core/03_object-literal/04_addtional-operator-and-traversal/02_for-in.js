var panda = {
    name : '푸바오',
    age : 4,
    getInfo : function() {
        return `${this.name}는 ${this.age}살입니다.`;
    }
};

for(var key in panda) {
    console.log(`key = ${key}`);    // key 구문
    console.log(`panda[key] = ${panda[key]}`);  // key에 해당하는 value
};