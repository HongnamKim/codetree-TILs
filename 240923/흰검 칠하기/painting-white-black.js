const fs = require('fs');

const input = fs.readFileSync(0).toString().trim().split('\n');

const n = +input[0];

//console.log(`n: ${n}`);

const OFFSET = 100 * 1000;
const R = 2 * OFFSET + 1;
let currentLocation = OFFSET;

const board = Array(R).fill('');

for(let i = 1; i <= n; i++) {
    let [x, direction] = input[i].split(' ');

    x = +x;
    
    if(direction === 'R'){
        for(let i = 0; i < x; i++) {
            board[currentLocation] += 'b'
            if(i !== x - 1){
                currentLocation++;
            }
            
        }
    } else if(direction === 'L'){
        for(let i = 0; i < x; i++) {
            board[currentLocation] += 'w'
            if(i !== x - 1){
                currentLocation--;
            }
            
        }
    }

}

//console.log(board);

let W = 0, B = 0, G = 0;

for(let i = 0; i < R; i++){
    const colors = board[i].split('');

    if(colors.length === 0) {
        continue;
    }

    if(colors.length > 3) {
        G++;
    }else if(colors[colors.length - 1] === 'w') {
        W++;
    }else{
        B++;
    }
}

console.log(`${W} ${B} ${G}`)