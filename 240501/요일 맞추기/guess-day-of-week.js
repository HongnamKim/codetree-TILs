const input = require('fs')
                .readFileSync(0)
                .toString()
                .split(" ")
                .map(item => parseInt(item));

const [m1, d1, m2, d2] = input;

let beforeMonth;
let beforeDay;

let afterMonth;
let afterDay;

let change = false;

if(m1 < m2){
    
    afterMonth = m2;
    afterDay = d2;

    beforeMonth = m1;
    beforeDay = d1;
} else if (m1 === m2 && d1 < d2) {
    
    afterMonth = m2;
    afterDay = d2;

    beforeMonth = m1;
    beforeDay = d1;

} else if (m1 === m2 && d1 > d2) {
    
    afterMonth = m1;
    afterDay = d1;

    beforeMonth = m2;
    beforeDay = d2;
    change = true;
} else {
    afterMonth = m1;
    afterDay = d1;

    beforeMonth = m2;
    beforeDay = d2
    change = true;
}


const month_of_days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

let elapsedDay = 0;

while(true) {
    if(beforeMonth === afterMonth && beforeDay === afterDay){
        break;
    }
    elapsedDay++;

    beforeDay++;
    if(beforeDay > month_of_days[beforeMonth]){
        beforeDay = 1;
        beforeMonth++;
    }
}


const day = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"];
const dayIndex = change ? (elapsedDay % 7) * -1 : elapsedDay % 7;

const answer = day.at(dayIndex);

console.log(answer);