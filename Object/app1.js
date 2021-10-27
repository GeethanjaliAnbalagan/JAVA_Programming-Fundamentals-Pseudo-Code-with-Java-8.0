//Properties of JavaScript Object
let school = {
	name: 'Vivekananda School',
	location : 'Delhi',
	established : '1971',
	20 : 1000,
	displayInfo : function(){
		console.log(`The value of the key 20 is ${school['20']}`);
	}
}
school.displayInfo();
