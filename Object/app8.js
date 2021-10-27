//Object members(properties or methods) can be accessed using the 
//dot notation 
//(objectName.memberName)
let school = {
	name : "Vivekanada",
	location : "Delhi",
	established : 1971,
	20 : 1000,
	displayinfo : function() {
		console.log(`${school.name} was established
		in ${school.established} at ${school.location}`);
	}

}

console.log(school.name);

console.log(school.established);
