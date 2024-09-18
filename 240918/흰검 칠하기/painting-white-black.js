const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const n = +input[0];

const OFFSET = 5;//1000 * 100;
const R = OFFSET * 2 + 1;

let currentLocation = 0;

const board = Array(R).fill('');

for(let i = 1; i <=n; i++) {
    let [distance, direction] = input[i].split(' ');
    distance = Number(distance);

    let left, right;
    let color;

    if(direction === 'L'){
        left = currentLocation - distance;
        right = currentLocation;
        currentLocation = left;
        color = 'w';
    } else {
        left = currentLocation;
        right = currentLocation + distance;
        currentLocation = right;
        color = 'b';
    }
    
    left += OFFSET;
    right += OFFSET;

    for(let i = left; i < right; i++) {
        board[i] = board[i] + color;
    }
}

let totalW = 0, totalB = 0, totalG = 0;

for (let i = 0; i < board.length; i++) {
    const colors = board[i].split('');
    
    if(colors.length === 0) {
        continue;
    }

    if(colors.length >= 4) {
        totalG++;
        continue;
    } else if (colors[colors.length - 1] === 'w'){
        totalW++;
        continue;
    } else {
        totalB++;
        continue;
    }
}

console.log(`${totalW} ${totalB} ${totalG}`);