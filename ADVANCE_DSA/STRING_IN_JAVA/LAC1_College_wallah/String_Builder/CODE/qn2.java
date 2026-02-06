package LAC1_College_wallah.String_Builder.CODE;

public class qn2 {
  public static void main(String[] args) {
    String str = "abcdca";
    StringBuilder gtr = new StringBuilder(str);

    gtr.reverse();

    String s = gtr + "";


    if(str.equals(s)) {
        System.out.println("palindrome");
    } else {
      System.out.println("Not palindrom");
    }
  }
}








