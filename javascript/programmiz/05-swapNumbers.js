let a = parseInt(prompt('enter a number : '));
let b = parseInt(prompt('enter a number : '));

console.log(`before swap : a: ${a} b : ${b}`);

a = a + b;
b = a - b;
a = a - b;
console.log(`after swap : a: ${a} b: ${b}`);