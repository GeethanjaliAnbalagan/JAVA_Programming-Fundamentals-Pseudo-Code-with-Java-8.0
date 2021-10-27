var person = {  name: ‘John’, age: ‘23’, mobileNumber: ‘8798766543’, state:’TamilNadu’ }; 
var personProps = Object.keys(person);
for(var i = 0; i < personProps.length; i++){
    var key = personProps[i];
    var value = person[key];
    console.log(key + " : " + value);
}



var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var spl = input.trim();
var array = spl.split("\n");
const s = new Object();
s.name=array;
s.age=array;
s.mobileNumber=array;
s.state = TamilNadu;

school.displayInfo = function(){
	console.log(`{ name:${s.name},age: ${s.age},mobileNumber: ${s.mobileNumber},state:${s.state} } `);
}

school.displayInfo();

console.log(array);




var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var spl = input.trim();
var array = spl.split("\n");
const s = new Object();
s.name=
console.log(array);

