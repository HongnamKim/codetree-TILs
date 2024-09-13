const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const [a] = input[0].split(' ').map(Number);

if(a >= 0) {
    console.log(a);
} else {
    console.log(a);
    console.log('minus');
}