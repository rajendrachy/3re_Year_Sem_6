package PART3.INTERFACE01.Questions;


// Coding Question 1 — Basic Interface
// Create an interface called Vehicle with one method start().
// Then, create a class Car that implements Vehicle and prints "Car is starting..." when start() is called.
// Finally, test it in a main() method.


interface Vehicle {
   void start(); //by default public & abstract

}


class Car implements Vehicle {
      public void start() {
            System.out.println("Vehicle start");
      }
}




public class Qn1 {
  public static void main(String[] args) {
         Car c = new Car();
         c.start();

        Vehicle v = new Car();
         v.start();


  }
}
















