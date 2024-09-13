const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const nums = input[0].split(' ').map(Number);

let max = nums[0];

for(const num of nums) {
    if(num >= max){
        max = num;
    }
}

console.log(max);