const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const nums = input[0].split('');

let ans = 0;

for(let i = 0; i < nums.length; i++) {
    ans = ans + parseInt(nums[i]) * 2 ** (nums.length -1 -i);
}

console.log(ans);