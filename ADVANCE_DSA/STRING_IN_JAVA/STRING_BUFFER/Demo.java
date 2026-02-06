public class Demo {
  public static void main(String[] args) {
   // StringBuffer sb = new StringBuffer(); // string buffer is mutable
//  // this is empty string buffer

// System.out.println(sb.length()); // 0
//  System.out.println(sb.capacity());  // 16 // empty string capacity in string buffer is 16




//providing sum string inside string buffer
// StringBuffer sb = new StringBuffer("Navin");
// System.out.println(sb.length()); // 5
// System.out.println(sb.capacity()); // 21




//---------append--------
// StringBuffer sb = new StringBuffer("Navin");
//    sb.append(" Raj");
//    System.out.println(sb); // Navin Raj

//    String str = sb.toString();
//    System.out.println(str); // Navin Raj









//-----deleteCharAt() && insert()-------
StringBuffer sb = new StringBuffer("Navin");
   sb.append(" Raj");
   System.out.println(sb); 

   sb.deleteCharAt(2);
   sb.insert(0, "Java ");
   System.out.println(sb); // Nain Raj


  }
}











