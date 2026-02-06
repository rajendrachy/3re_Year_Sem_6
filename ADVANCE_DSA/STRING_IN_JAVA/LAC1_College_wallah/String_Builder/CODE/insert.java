package LAC1_College_wallah.String_Builder.CODE;
//------insert(index, char)----------------- and deleteCharAt(char)------------------
public class insert {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello World");
    
    // insert character 'J' at index 6
    str.insert(6, 'J'); // Hello JWorld
    System.out.println(str);

    // delete character at index 6
    str.deleteCharAt(6); // Hello World
    System.out.println(str); // Hello World

    
    // insert a string at index 5
    str.insert(5, " Beautiful"); // Hello Beautiful World
    System.out.println(str); // Hello Beautiful World

    // delete a substring from index 5 to 15
    str.delete(5, 15); // Hello World
    System.out.println(str); // Hello World
  }
}
