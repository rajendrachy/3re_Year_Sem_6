package PART3.INTERFACE01.CODE;
import java.util.Scanner;



interface client {
     void input(); // bydefault public + abstract 
     void output();
}





class Main implements client {
    String name;
    double salary;

    public void input() { // public always use else throw error
      Scanner sc = new Scanner(System.in);

      
      System.out.println("Enter your name");
       name = sc.nextLine();


    System.out.println("Enter Salary");
      salary = sc.nextDouble();
    }



    
   public void output() { // public always use else throw error
       System.out.println("Your details are: ");
      System.out.println(name + " " + salary);
    }



    
    public static void main(String[] args) {
       client c = new Main();
       c.input();
       c.output();
    }
}






