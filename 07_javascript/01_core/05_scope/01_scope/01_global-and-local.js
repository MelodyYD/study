// 전역 스코프와 지역 스코프

var x = 'global x';
var y = 'global y';
var z = 'global z';

function outer() {

    var z = 'outer local z';
    console.log(x);
    console.log(y);
    console.log(z);

    function inner() {
        var x = 'inner local x';
        console.log(x);
        console.log(y);
        console.log(z);
    }

    inner();

}

// console.log(z); 지역변수는 {} 외부에서 사용이 불가능하다.
outer();