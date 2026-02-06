//package LAC1_College_wallah.CODE;
import java.util.*;
// ---str.equals() vs == operator----------------
// str.equals() checks for value equality + reference equality (if reference not equal then check the value)
// == operator checks for reference equality


public class equal {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");


    System.out.println(s1 == s2); // true, same reference
    System.out.println(s1 == s3); // false, different reference

    System.out.println(s1.equals(s2)); // true, same content
    System.out.println(s1.equals(s3)); // true, same content
  }
}





//-------------StringBUffer and StringBuilder---------------------------
//Both are objects, so they are always stored in the Heap memory.










