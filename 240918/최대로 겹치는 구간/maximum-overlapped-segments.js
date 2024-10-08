const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const n = input[0].split(' ').map(Number);

const offset = 100;

const board = new Array(201).fill(0);

for(let i = 1; i <= n; i++){
    let [start, end] = input[i].split(' ').map(Number);
    start = start + offset;
    end = end + offset;

    //console.log(`${start} ${end}`);

    for(let i = start; i < end; i++) {
        board[i]++;
    }

    
}

const result = Math.max(...board);

console.log(result);