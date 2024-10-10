const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const n = +input[0];

const OFFSET = 100;
const R = 2 * OFFSET + 1;

const board = [];

for(let i = 0; i < R; i++){
    board.push(Array(R).fill(0));
}

//console.log(board);

let area = 0;

for(let i = 1; i <= n; i++){
    const [x1, y1, x2, y2] = input[i].split(' ').map(Number);

    for(let j = x1 + OFFSET; j < x2 + OFFSET; j++) {
        for(let k = y1 + OFFSET; k < y2 + OFFSET; k++) {
            if(board[j][k] !== 1) {
                area++;
                board[j][k] = 1
            }
        }
    }
}

//console.log(board);
console.log(area);