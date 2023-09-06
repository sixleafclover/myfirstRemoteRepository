var arr = [];
var tot = 0;


arr[0] = +prompt("국어점수");
arr[1] = +prompt("영어점수");
arr[2] = +prompt("수학점수");

for (var i = 0; i < arr.length; i++) {
    tot += arr[i];
}
alert(`합계 : ${tot}\n평균 : ${tot / arr.length}`);