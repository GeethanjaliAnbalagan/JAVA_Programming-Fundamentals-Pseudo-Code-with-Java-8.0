//Iterating over all keys of an object
let person = {
	gender : "male"
}

var person1 = Object.create(person);
person1.name = "Adam";
person1.age = 45;
person1.nationality = "Australian";

for (let key in person1) {
// Output : name, age, nationality
// and gender
	console.log(key);
}		
