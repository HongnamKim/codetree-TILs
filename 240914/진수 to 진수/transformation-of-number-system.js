const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const [a, b] = input[0].split(' ').map(Number);
const n = parseInt(input[1]);

let ans = parseInt(n, a).toString(b);
console.log(ans);