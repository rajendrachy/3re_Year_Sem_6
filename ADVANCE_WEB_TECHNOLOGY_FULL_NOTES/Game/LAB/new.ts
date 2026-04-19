
type game =  {
  name: String,
  age : number,

  display: () => void;

}


const person : game = {
   name: "Raj",
   age: 34,

   display() {
    console.log(`The name is ${this.name} and age is ${this.age}`);
   }
}

person.display();







