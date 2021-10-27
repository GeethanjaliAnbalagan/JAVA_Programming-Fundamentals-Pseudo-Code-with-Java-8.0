//Object members(properties or methods) can be accessed using the
//Bracket Notation
// objectName["memberName"]

let school = {
	name : "Vivekanada School",
	location : "Delhi",
	established : 1995,
	20 : 1000,
	displayinfo : function() {
		document.write(`${school.name} was established
		in ${school.established} at ${school.location}`);
	}
}

// Output : Vivekanada School
console.log(school['name']);

// Output: 1000
console.log(school['20']);
