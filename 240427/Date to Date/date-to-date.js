let [month1, day1, month2, day2] = require('fs').readFileSync(0).toString().split(" ").map(i => parseInt(i));
//console.log(`${month1} ${day1}`);
//console.log(`${month2} ${day2}`);

const num_of_days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

let elapsedDays = 1;

while(true) {
    if(month1 === month2 && day1 === day2){
        break;
    }

    elapsedDays++;
    day1++;

    if(day1 > num_of_days[month1]){
        day1 = 1;
        month1++;
    }
}

console.log(elapsedDays);