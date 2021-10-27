//Comparison by reference
let a = {};
let b = a; // copy the reference

console.log( a == b ); // true, both variables reference the same object
console.log( a === b ); // true