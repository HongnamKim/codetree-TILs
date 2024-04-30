const [input, day] = require('fs').readFileSync(0).toString().split("\n");

let [m1, d1, m2, d2] = input.split(' ').map(Number);

const day_of_month = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

let elapsedDay = 0;

while(true){
    if(m1 === m2 && d1 === d2){
        break;
    }
    elapsedDay++;
    d1++;

    if(d1 > day_of_month[m1]){
        d1 = 1;
        m1++;
    }
}

const dayNames = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"];

let answer = parseInt(elapsedDay / 7);
if(dayNames.indexOf(day) <= elapsedDay % 7){
    answer++;
}

console.log(answer);

//console.log(parseInt(elapsedDay / 7));
//console.log(elapsedDay % 7);