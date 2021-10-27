// bracket notation
let school = {
	name: 'Vivekananda School',
	displayInfo : function(){
		console.log(`${school.name.split(' ')[0]}`);
	}
}
school.displayInfo(); // Vivekananda
