package CODE;
// // abstract -> incomplete


//--------abstract method---------
abstract class Programming { // super class
  public abstract void Developer();
  public abstract void Rank();
}

class Html extends Programming { // if we not override a Rank () then the Html class is also a Abstract class
  @Override
  public void Developer() {
    System.out.println("Tim Berners Lee");
  }

  @Override
  public void Rank() {
    System.out.println("1st");
  }
}

abstract class Java extends Programming { // it is abstract class due to not override the Rank() method from Programming
   @Override
  public void Developer() {
    System.out.println("James gosling-----");
  }
}

class Main {
  public static void main(String[] args) {
//Html h = new Html();
    // Java j = new Java();
    // j.Developer();
    //h.Developer();


    System.out.println();

    //using object reference
    // Programming ja = new Java();
    Programming ha = new Html();
    //  ja.Developer();
     ha.Developer();
     ha.Rank();
  }
}