package LAC1_College_wallah.String_Builder.CODE;

//ASCII value of the A->65, a->97 and 0->48

import java.util.*;

public class qn1 {
  public static void main(String[] args) {

     System.out.println("Enter a String: ");
     Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());


  
    System.out.println("Original String: " + str);


    //toggle
    //PhysicS -> pHYSICs

    for(int i=0; i<str.length(); i++){
      //P -> p
      // check -> alphabet - small , capital

      boolean flag = true; // true -> capital

      char ch = str.charAt(i);

   if(ch == ' ') continue;


      int asci = (int)ch; //65


      if(asci >= 97) flag = false; // small


      if(flag == true) { // capital
         asci += 32;
         char dh = (char)asci; // a
         str.setCharAt(i, dh);

      }  else { // small
          asci -= 32;
          char dh = (char)asci;
          str.setCharAt(i, dh);
      }
    }

System.out.println("Toggle String: "+ str);

  }
}




