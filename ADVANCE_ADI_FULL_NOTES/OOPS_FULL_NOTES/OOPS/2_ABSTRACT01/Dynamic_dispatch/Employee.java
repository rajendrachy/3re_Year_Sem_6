package Dynamic_dispatch;
//child class
public class Employee  extends User{

             //overridden method 
           void show() {
          System.out.println("This is child class show method");
          }


      public static void main(String[] args) {

//-----------Before Overriding----------
        //Employee e = new Employee();
       // e.show(); // it is calling parent class method when method is not overriding



       //----------after overriding---------------
       //e.show(); // it call child class method after overriding the method
       // This is called adynamic metjod dispatch



       //----------creating Obj with a super(parent) class reference-------
      //  User u = new Employee();
      //  u.show(); // it is calling a child class show() method




      // make a object of user class(parent class)
      // User u = new User();
      // u.show(); // it is calling parent class show() method


     
      }
}











