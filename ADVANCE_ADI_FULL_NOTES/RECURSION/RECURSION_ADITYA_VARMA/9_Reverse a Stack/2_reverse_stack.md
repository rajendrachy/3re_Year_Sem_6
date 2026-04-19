# Reverse a Stack Using Recursion (Java)

## Problem
Reverse the elements of a stack using recursion without using any extra data structure.

## Approach
1. Pop the top element from the stack.
2. Recursively reverse the remaining stack.
3. Insert the popped element at the bottom of the stack.

Two recursive functions are used:
- `reverse()` → reverses the stack.
- `insertAtBottom()` → inserts an element at the bottom of the stack.

## Java Implementation

```java
import java.util.Stack;

public class ReverseStackRecursion {

    // Function to insert element at the bottom of stack
    static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, item);
        stack.push(top);
    }

    // Function to reverse the stack using recursion
    static void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            reverse(stack);
            insertAtBottom(stack, top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverse(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}
```

## Output

```
Original Stack: [1, 2, 3, 4]
Reversed Stack: [4, 3, 2, 1]
```

## Time Complexity
- **O(n²)** in worst case due to repeated recursive insertions.

## Space Complexity
- **O(n)** due to recursion stack.


