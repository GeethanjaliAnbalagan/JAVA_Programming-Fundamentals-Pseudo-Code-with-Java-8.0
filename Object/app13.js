//object reference
let user = { name: 'John' };

let admin = user;
console.log(user.name);

admin.name = 'Pete'; // changed by the "admin" reference

console.log(user.name);