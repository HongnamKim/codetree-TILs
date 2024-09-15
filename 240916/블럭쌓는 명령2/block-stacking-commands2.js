const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const [n, k] = input[0].split(' ').map(Number);

const block = [];

for(let i = 0; i < n; i++) {
    block.push(0);
}

//console.log(block)

for(let i = 1; i <= k; i++) {
    const [start, end] = input[i].split(' ').map(Number);

    for(let i = start-1; i < end; i++) {
        block[i]++;
    }
}

let max = block[0];

for (let i = 0; i < n; i++) {
    if(block[i] > max) {
        max = block[i];
    }
}

console.log(max);