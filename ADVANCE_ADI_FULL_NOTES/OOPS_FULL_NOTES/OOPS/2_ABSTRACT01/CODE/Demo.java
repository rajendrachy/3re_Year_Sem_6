package CODE;

 abstract class Animal {

}

class Dog extends Animal {

}
class Demo {
  public static void main(String[] args) {
    //animal r = new animal(); // compile time error

    Animal r = new Dog(); // reference creation

  }
}


// abstract class Aniuml {
//   abstract void walk(); // if we have any abstract methhod inside class then it is compulsary to make a abstract class 
// }

// abstract class create when -> if same action but implementation different 



//-- abstract class eg.--
// abstract class Animal{
//   public abstract void eat();
// }

// class Dog extends Animal{

// }

// class Tiger extends Animal{

// }

