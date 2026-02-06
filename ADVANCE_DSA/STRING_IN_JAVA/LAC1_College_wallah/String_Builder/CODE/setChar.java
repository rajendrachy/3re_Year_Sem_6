package LAC1_College_wallah.String_Builder.CODE;
//-------------setChar(index, char)----------------- and append()------------------

public class setChar {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello World");
    
    // set character at index 6 to 'J'
    str.setCharAt(6, 'J'); // Hello Jorld
    System.out.println(str);

    // append a string
    str.append("!"); // Hello Jorld!
    System.out.println(str); // Hello Jorld!
    
    // append a number
    str.append(123); //+ not allowed // Hello Jorld!123
    System.out.println(str); // Hello Jorld!123


    str.append(true); // + not allowed
    System.out.println(str); // Hello Jorld!123true
  }
}
