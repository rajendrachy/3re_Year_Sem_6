package LAC1_College_wallah.String_Builder.CODE;



import java.util.*;

public class qns1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);

        String toggledStr = ""; // To store the toggle version

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                toggledStr += ch;
                continue;
            }

            int ascii = (int) ch;

            if (ascii >= 65 && ascii <= 90) {
                // Capital -> convert to small
                ascii += 32;
            } else if (ascii >= 97 && ascii <= 122) {
                // Small -> convert to capital
                ascii -= 32;
            }

            toggledStr += (char) ascii;
        }

        System.out.println("Toggle String: " + toggledStr);
    }
}
