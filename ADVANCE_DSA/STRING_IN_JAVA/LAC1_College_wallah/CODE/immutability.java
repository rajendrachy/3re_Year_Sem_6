// package LAC1_College_wallah.CODE;
// //-----------immutabality of string(String is ------------immutable)----------------
// // String is immutable, meaning once created, its value cannot be changed.
// public class immutability {
//   public static void main(String[] args) {
//     String s = "Hello";
//     String x = "Hello";

//     //s.charAt(0) = 'q'; // This line will cause a compile-time error because strings are immutable
//      s = "Dello"; // This creates a new string object and assigns it to s
//     System.out.println(s); // Output: Dello
//   }
// }






















//package LAC1_College_wallah.CODE;

public class immutability {
  public static void main(String[] args) {
    String s = "Hello"; // qn change to -> Heylo
    String x = "Hello";

    s = s.substring(0, 2) + 'y' + s.substring(3);

    System.out.println(s); // Output: Heylo
    System.out.println(x); // Output: Hello

  }
}






// Why is string immutable?
// 1. Security: Immutable strings are safer to use in multi-threaded environments
//2. Interning exists to save memory and improve performance







