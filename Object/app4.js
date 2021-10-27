//object constructer
const school = new Object();
school.name = 'Vivekanada school';
school.location = 'Delhi';
school.established = 1971;

school.displayInfo = function(){
	console.log(`${school.name} was established
		in ${school.established} at ${school.location}`);
        
}

school.displayInfo();
