let a = Math.floor(Math.random() * 10);
let b = Math.floor(Math.random() * 10);
let c = Math.floor(Math.random() * 10);

console.log(`First number is ${a}`);
console.log(`Second number is ${b}`);
console.log(`Third number is ${c}`);
const isLargestIntThree = function (x, y, z) {
    if (x > y && x > z) {
        console.log(`Number First ${x} is the gratest in given three number `);
    } else if (y > z && y > x) {
        console.log(`Number Second ${y} is the gratest in given three number `);
    } else {
        console.log(`Number third ${z} is the gratest in given three number `);
    }
}

isLargestIntThree(a, b, c);