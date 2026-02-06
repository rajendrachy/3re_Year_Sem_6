package LAC1_College_wallah.String_Builder.CODE;
// 1. String -> interning -> immutabality -> poor performance
// 2. StringBuilder -> mutable -> good performance

public class stringBu {
  public static void main(String[] args) {
    // StringBuilder sb = new StringBuilder(); // empty string builder // size = 16(capacity) // new StringBuilder(100); // size = 100(capacity)


    StringBuilder str = new StringBuilder("Hello");
    str.append(" World"); // appending to the string builder
    System.out.println(str); // Hello World

    
  }
}
