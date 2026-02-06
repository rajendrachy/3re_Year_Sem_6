//package LAC1_College_wallah.CODE;
//----------Performance of String-----------------
//poor performance of String in Java due to immutability
import java.util.*;

public class performance {
  public static void main(String[] args) {
    String str = "";
    for(int i=1; i<=10; i++) {
      str += i;

    }

    System.out.println(str); // 12345678910
  }
}



