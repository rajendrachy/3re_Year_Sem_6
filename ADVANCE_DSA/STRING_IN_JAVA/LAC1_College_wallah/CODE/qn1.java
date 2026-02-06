//package LAC1_College_wallah.CODE;
import java.util.*;

public class qn1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str = sc.nextLine(); // Read the input string


    //printing all the substrings of the input string
    System.out.println("All substrings of the input string are: ");
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        System.out.print(str.substring(i, j) + " ");
      }
    }
  }
}

