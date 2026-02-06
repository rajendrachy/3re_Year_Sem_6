package LAC1_College_wallah.String_Builder.CODE;

//-----------reverse() and delete()--------------
public class reverse {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello World");

    System.out.println(str);

    str.reverse(); // reversing the string builder
    System.out.println(str); // dlroW olleH

    str.reverse(); // reversing back to original
    System.out.println(str); // Hello World

    str.delete(2,4);
    System.out.println(str); // Heo World


  }
}




