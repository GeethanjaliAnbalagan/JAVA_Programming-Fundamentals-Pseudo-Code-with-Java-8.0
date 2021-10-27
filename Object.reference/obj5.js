// Const objects can be modified

const user = {
    name: "John"
  };
  
  user.name = "Pete"; // (*)
  
  console.log(user.name); // Pete