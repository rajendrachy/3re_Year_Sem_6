//package LAC1_College_wallah.CODE;
//-----------String + int/char/String--------------------
import java.util.*;
public class addString {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    //  String str = "abc";
    //  str += "def";

    //  System.out.println(str); // abcdef // if we add number it work




    

     String str = "abc"; // 'abc' not work (i.e single '' not work but "" this work in the string) 
     str += 10;




     System.out.println(str); // abc10 // if we add number it work
     System.out.println("abc" + "xyz"); // string + string
     System.out.println("abc" + "r"); // string + char
     System.out.println("abc" + 10); // string + int
     System.out.println("abc" + 10 + 20); // String + int + int => abc1020 
     System.out.println("abc" + (10 + 20)); // abc30
     System.out.println(10+20 + "abc");// 30abc // calculate from left to right


  }
}



























