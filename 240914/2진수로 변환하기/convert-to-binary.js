const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const num = parseInt(input[0]);

const ans = parseInt(num.toString(2));

console.log(ans);