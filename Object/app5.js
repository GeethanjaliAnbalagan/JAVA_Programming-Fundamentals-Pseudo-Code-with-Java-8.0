//Constructors: provides a template for creation of objects
function Vehicle(name, maker) {
    this.name = name;
    this.maker = maker;
    }
    
    let car1 = new Vehicle('Fiesta', 'Ford');
    let car2 = new Vehicle('Santa Fe', 'Hyundai')
    
    console.log(car1.name); // Output: Fiesta
    console.log(car2.name); // Output: Santa Fe
    console.log(car2.maker);
    