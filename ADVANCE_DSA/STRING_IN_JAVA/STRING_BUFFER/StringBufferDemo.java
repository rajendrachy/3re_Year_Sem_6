public class StringBufferDemo {
    public static void main(String[] args) {
        // Create a new StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() - Adds text at the end
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        // 2. insert() - Inserts text at a specific index
        sb.insert(5, ",");
        System.out.println(sb); // Output: Hello, World

        // 3. replace() - Replaces characters from start index to end-1 index
        sb.replace(7, 12, "Java");
        System.out.println(sb); // Output: Hello, Java

        // 4. delete() - Deletes characters from start index to end-1 index
        sb.delete(5, 7);
        System.out.println(sb); // Output: HelloJava

        // 5. deleteCharAt() - Deletes character at a specific index
        sb.deleteCharAt(5);
        System.out.println(sb); // Output: Helloava

        // 6. setCharAt() - Sets/replaces character at a specific index
        sb.setCharAt(5, 'J');
        System.out.println(sb); // Output: HelloJa

        // 7. reverse() - Reverses the entire StringBuffer
        sb.reverse();
        System.out.println(sb); // Output: aJolleH

        // 8. charAt() - Returns the character at a specified index
        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + ch); // Output: Character at index 2: o

        // 9. length() - Returns the current length (number of characters)
        System.out.println("Length: " + sb.length()); // Output: Length: 7

        // 10. capacity() - Returns the current capacity of the buffer
        System.out.println("Capacity: " + sb.capacity()); // Output: Capacity: 23 (default or expanded)

        // 11. ensureCapacity() - Ensures minimum capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity()); // Output: >=50

        // 12. setLength() - Sets the length of the buffer (truncate or pad with '\0')
        sb.setLength(5);
        System.out.println("After setLength: " + sb); // Output: aJoll
    }
}








//-------------------Summary of Common StringBuffer Methods----------------------
// Method	                                          Purpose
// append(String s)	                           Add text at the end
// insert(int index, String s)	               Insert text at specific index
// replace(int start, int end, String s)	   Replace a substring
// delete(int start, int end)	               Delete substring
// deleteCharAt(int index)	                   Delete single character
// setCharAt(int index, char c)	               Replace single character
// reverse()	                               Reverse the buffer
// charAt(int index)	                       Get character at index
// length()	                                   Get number of characters
// capacity()	                               Get total buffer capacity
// ensureCapacity(int minCapacity)	           Make sure capacity >= minCapacity
// setLength(int newLength)	                   Set length of buffer (truncate or pad)






