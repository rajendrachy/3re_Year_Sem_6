package PART3.INTERFACES.CODE;

public abstract class Vehicle implements Transport {
   private int noOFTires;



   public abstract void makeStartSound();


   @Override
   public void getSetGo() {
     // TODO Auto-generated method stub
     System.out.println("going to place");
   }


   

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




