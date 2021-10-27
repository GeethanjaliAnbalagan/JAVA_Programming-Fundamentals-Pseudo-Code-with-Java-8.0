// Cloning and merging, Object.assign
let user = {
    name: "John",
    age: 30
  };
  
  let clone = {}; // the new empty object
  
  // let's copy all user properties into it
  for (let key in user) {
    clone[key] = user[key];
  }
  
  // now clone is a fully independent object with the same content
  clone.name = "Pete"; // changed the data in it
  
  console.log( user.name ); // still John in the original object
  console.log( clone.name );