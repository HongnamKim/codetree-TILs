const pivotDateTime = new Date("2011-11-11T11:11");
const targetDateTime = new Date("2011-11");

let [date, time, min] = require('fs').readFileSync(0).toString().split(" ").map(i => parseInt(i));

//console.log(`${date} ${time} ${min}`);

targetDateTime.setDate(date);
targetDateTime.setHours(time);
targetDateTime.setMinutes(min);

const answer = targetDateTime - pivotDateTime;

if(answer < 0) {
    console.log(-1);
} else {
    console.log(answer / 60 / 1000);
}