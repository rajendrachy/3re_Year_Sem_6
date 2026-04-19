package PART3.ABSTRACTION.CODE;

public class Car extends Vehicle{
public int noOfDoors;

  public Car() {
    super(4); // Parent class Constructor calls with 4 tires

  }
  
  @Override
  public void makeStartSound() {
     System.out.println("Car is starting with a vroom sound!");
     
  }
  
}

