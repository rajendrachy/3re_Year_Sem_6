public class StringMethodsDemo {
    public static void main(String[] args) {
        String s = "Hello World";

        // 1. length()
        System.out.println("Length: " + s.length()); // 11

        
        // 2. charAt()
        System.out.println("Char at 1: " + s.charAt(1)); // 'e'



        // 3. equals() & equalsIgnoreCase()
        System.out.println("Equals 'Hello World'? " + s.equals("Hello World")); // true
        System.out.println("EqualsIgnoreCase 'hello world'? " + s.equalsIgnoreCase("hello world")); // true

        // 4. compareTo()
        System.out.println("CompareTo 'Zoo': " + s.compareTo("Zoo")); // negative
        System.out.println("CompareTo 'Apple': " + s.compareTo("Apple")); // positive

        // 5. startsWith() & endsWith()
        System.out.println("Starts with 'He'? " + s.startsWith("He")); // true
        System.out.println("Ends with 'ld'? " + s.endsWith("ld")); // true

        // 6. contains()
        System.out.println("Contains 'World'? " + s.contains("World")); // true

        // 7. indexOf() & lastIndexOf()
        String s2 = "banana";
        System.out.println("IndexOf 'a': " + s2.indexOf("a")); // 1
        System.out.println("LastIndexOf 'a': " + s2.lastIndexOf("a")); // 5

        // 8. substring()
        System.out.println("Substring(0, 5): " + s.substring(0, 5)); // "Hello"

        // 9. toLowerCase() & toUpperCase()
        System.out.println("Lowercase: " + s.toLowerCase()); // "hello world"
        System.out.println("Uppercase: " + s.toUpperCase()); // "HELLO WORLD"

        // 10. trim() & strip()
        String s3 = "   Java   ";
        System.out.println("Trim: '" + s3.trim() + "'");   // "Java"
        System.out.println("Strip: '" + s3.strip() + "'"); // "Java"

        // 11. replace(), replaceFirst(), replaceAll()
        System.out.println("Replace 'a' with 'o': " + s2.replace("a", "o")); // "bonono"
        System.out.println("ReplaceFirst 'a' with 'o': " + s2.replaceFirst("a", "o")); // "bonana"
        System.out.println("ReplaceAll 'a' with 'o': " + s2.replaceAll("a", "o")); // "bonono"

        // 12. split()
        String csv = "one,two,three";
        String[] parts = csv.split(",");
        System.out.println("Split: " + parts[0] + " | " + parts[1] + " | " + parts[2]); // "one | two | three"

        // 13. join()
        String joined = String.join("-", "A", "B", "C");
        System.out.println("Join: " + joined); // "A-B-C"

        // 14. isEmpty() & isBlank()
        String empty = "";
        String blank = "   ";
        System.out.println("isEmpty: " + empty.isEmpty()); // true
        System.out.println("isBlank: " + blank.isBlank()); // true (Java 11+)

        // 15. repeat()
        System.out.println("Repeat: " + "Hi ".repeat(3)); // "Hi Hi Hi "
    }
}


