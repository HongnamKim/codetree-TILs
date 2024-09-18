const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const n = +input[0];

const OFFSET = 1000;
const R = OFFSET * 2 + 1;

let currentLocation = 0;

const board = Array(R).fill(0);

for(let i = 1; i <= n; i++) {
    let [distance, direction] = input[i].split(' ');

    distance = +distance;

    let left, right;
    if(direction === 'L') {
        right = currentLocation;
        left = currentLocation - distance;
        currentLocation = currentLocation - distance;
    } else {
        left = currentLocation;
        right = currentLocation + distance;
        currentLocation = currentLocation + distance;
    }

    left += OFFSET;
    right += OFFSET;

    

    for(let i = left; i < right; i++){
        board[i]++;
    }

    //console.log(board);
}

let result = 0;

for(let i = 0; i < board.length; i++){
    if(board[i] > 1) {
        result++;
    }
}

console.log(result);