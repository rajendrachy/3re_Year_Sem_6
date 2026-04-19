 package Final_Keyword;
//final in variable
// public class Final {
//   public static void main(String[] args) {
//     final int A = 10;
//     System.out.println(A);

//     // A = 20; // error // reassignment not allowed in final Keyword

//     //System.out.println(A);
//   }
// }








//-----------Final method method --------
// class Test {
//   void mNUmber() {
//     System.out.println("4857475757");
//   }

//   final void atmPin() { // cannot override 
//     System.out.println("4985");
//   }
// }

// class thief extends Test {

//   @Override
//   void mNUmber() {
//     System.out.println("4857475757");
//   }


//   // @Override
//   // void atmPin() {   // not override // compile time error
//   //   System.out.println("4985");
//   // }
// }


// class Final {
// public static void main(String[] args) {
//      thief t = new thief();
//      t.mNUmber();
//      t.atmPin();
// }
// }
















//--------------final class----------
// final class Test {
//   void mNUmber() {
//     System.out.println("4857475757");
//   }



//   final void atmPin() { // cannot override 
//     System.out.println("4985");
//   }
// }

// class thief extends Test { // Compile time error

//   @Override
//   void mNUmber() {
//     System.out.println("4857475757");
//   }


//   // @Override
//   // void atmPin() {   // not override // compile time error
//   //   System.out.println("4985");
//   // }
// }


// class Final {
// public static void main(String[] args) {
//      thief t = new thief();
//      t.mNUmber();
//      t.atmPin();
// }
// }