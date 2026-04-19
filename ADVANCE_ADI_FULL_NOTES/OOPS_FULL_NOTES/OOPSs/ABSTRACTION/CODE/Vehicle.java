package PART3.ABSTRACTION.CODE;

public abstract class Vehicle {
   private int noOFTires;



   public abstract void makeStartSound();

   public Vehicle(int noOFTires) {
       this.noOFTires = noOFTires;
   }

   
   // Getter method for noOFTires
   public int getNoOFTires() {
       return noOFTires;
   }

   // Setter method for noOFTires
   public void setNoOFTires(int noOFTires) {
       this.noOFTires = noOFTires;
   }

   public void commute() {
       System.out.printf("I am going from A to B with %d tires\n", noOFTires);
   }
   
}





