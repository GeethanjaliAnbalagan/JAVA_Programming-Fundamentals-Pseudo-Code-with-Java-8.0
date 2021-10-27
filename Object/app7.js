//Prototypes : create objects involves using prototypes
//let obj = Object.create(prototype_object, propertiesObject)
          // the second propertiesObject argument is optional

          let footballers = {
            position: "Striker"
        }
        
        let footballer1 = Object.create(footballers);
        
            // Output : Striker	
        console.log(footballer1.position);
        