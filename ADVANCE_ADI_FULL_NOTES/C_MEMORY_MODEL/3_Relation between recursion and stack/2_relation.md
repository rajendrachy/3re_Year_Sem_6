# 14.9 – Relation Between Recursion and Stack in C

## 1. Introduction
In the C programming language, recursion and stack memory are closely related.  
Whenever a recursive function is called, the **stack** stores information about each function call.

This information includes:
- Function parameters
- Local variables
- Return address

The stack keeps track of these calls until recursion finishes.

---

# 2. What is Recursion?

Recursion is a programming technique where a **function calls itself**.

A recursive function must have:

1. **Base case** – stops recursion  
2. **Recursive case** – function calls itself

### Example

```c
#include <stdio.h>

void countdown(int n) {
    if(n == 0)
        return;

    printf("%d\n", n);
    countdown(n - 1);
}

int main() {
    countdown(5);
    return 0;
}
```

Output

```
5
4
3
2
1
```

---

# 3. What is Stack Memory?

The **stack** is a memory area used for:

- Function calls
- Local variables
- Function parameters

The stack follows the **LIFO principle (Last In First Out)**.

Each function call creates a **stack frame**.

---

# 4. Stack Frame

A **stack frame** is a block of memory that stores:

- Function parameters
- Local variables
- Return address

Each recursive call creates a **new stack frame**.

---

# 5. Relation Between Recursion and Stack

When recursion happens:

1. The first function call is pushed onto the **stack**.
2. Each recursive call adds another **stack frame**.
3. This continues until the **base case** is reached.
4. Then functions return and stack frames are removed one by one.

---

# 6. Example Showing Stack Behavior

Factorial example:

```c
#include <stdio.h>

int factorial(int n) {

    if(n == 1)
        return 1;

    return n * factorial(n - 1);
}

int main() {

    int result = factorial(4);

    printf("Factorial = %d", result);

    return 0;
}
```

### Function Calls

```
factorial(4)
factorial(3)
factorial(2)
factorial(1)
```

### Stack Operations

```
Push factorial(4)
Push factorial(3)
Push factorial(2)
Push factorial(1)
Pop factorial(1)
Pop factorial(2)
Pop factorial(3)
Pop factorial(4)
```

---

# 7. Stack Overflow

If recursion continues without a proper base condition, the stack keeps growing until memory runs out.

This causes a **Stack Overflow**.

Example:

```c
void infinite() {
    infinite();
}
```

---

# 8. Key Points

- Recursion uses **stack memory** to store function calls.
- Each recursive call creates a **stack frame**.
- Stack follows **LIFO order**.
- When the base case is reached, stack frames are removed.
- Too many recursive calls cause **stack overflow**.

---

# 9. Short Exam Definition

**Recursion and stack are related because every recursive function call is stored in the stack as a stack frame until the function returns.**

---

# 10. Summary

Recursion relies on stack memory to manage multiple function calls.  
Each call is pushed onto the stack and removed when the function returns.




