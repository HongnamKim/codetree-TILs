const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const [num, radix] = input[0].split(' ').map(Number);

const ans = num.toString(radix);

console.log(ans);