// package LAC1_College_wallah.CODE;
// //---interning and new--------------
public class interning {
  String str = "Hello"; // both are same string literals
  // They refer to the same memory location in the string pool 
  String gtr = "Hello"; // string are interned by default


  //interning happen to save space in the heap memory
  public static void main(String[] args) {
    interning obj = new interning();
    System.out.println(obj.str == obj.gtr); // true, both refer to the same interned string
    System.out.println(obj.str.equals(obj.gtr)); // true, content is the same

    String str1 = new String("Hello");
    String str2 = new String("Hello");
    System.out.println(str1 == str2); // false, different objects in memory
    System.out.println(str1.equals(str2)); // true, content is the same

    String internedStr1 = str1.intern();
    String internedStr2 = str2.intern();
    System.out.println(internedStr1 == internedStr2); // true, both refer to the same interned string
  }
}














//---------String are immutable-------------------

//package LAC1_College_wallah.CODE;
//--- new--------------
// public class interning {
//   String str = new String("Hello"); // creates a new String object in heap memory
//   String gtr = new String("Hello"); // creates another new String object in heap memory

//   public static void main(String[] args) {
//     interning obj = new interning();
//     System.out.println(obj.str == obj.gtr); // false, different objects in memory
//     System.out.println(obj.str.equals(obj.gtr)); // true, content is the same

//     // Interning example
//     String internedStr1 = obj.str.intern(); // returns the interned string from the string pool
//     String internedStr2 = obj.gtr.intern(); // returns the interned string from the string pool
//     System.out.println(internedStr1 == internedStr2); // true, both refer to the same interned string
//   }
// }




