# 14.10 – Stack Overflow and Heap Overflow | Memory Leak | Memory Layout in C

## 1. Introduction

In a C program, memory is divided into different regions such as:

- Stack
- Heap
- Data segment
- BSS segment
- Code (Text) segment

Errors in memory usage can cause problems such as **stack overflow, heap overflow, and memory leaks**.

---

# 2. Memory Layout of a C Program

Typical memory structure:

```
-------------------------
|        Stack          |
|  Function calls       |
|  Local variables      |
-------------------------
|        Heap           |
|  Dynamic allocation   |
-------------------------
|        BSS            |
| Uninitialized globals |
-------------------------
|       Data            |
| Initialized globals   |
-------------------------
|       Code            |
| Program instructions  |
-------------------------
```

---

# 3. Stack Overflow

### Definition

A **stack overflow** occurs when the program uses **more stack memory than available**.

This usually happens due to:

- Deep recursion
- Infinite recursion
- Large local variables

### Example

```c
#include <stdio.h>

void recursion() {
    recursion();   // infinite recursion
}

int main() {
    recursion();
    return 0;
}
```

This function keeps calling itself and eventually causes a **stack overflow**.

### Causes

- Infinite recursion
- Too many function calls
- Large local arrays

---

# 4. Heap Overflow

### Definition

A **heap overflow** occurs when a program **writes more data than the allocated heap memory**.

This can corrupt other memory locations.

### Example

```c
#include <stdio.h>
#include <stdlib.h>

int main() {

    char *ptr = (char*) malloc(5);

    strcpy(ptr, "HelloWorld");  // writing beyond allocated memory

    free(ptr);

    return 0;
}
```

Here memory allocated is **5 bytes**, but a larger string is written.

---

# 5. Memory Leak

### Definition

A **memory leak** occurs when **heap memory is allocated but never freed**.

The program keeps consuming memory even though it no longer needs it.

### Example

```c
#include <stdlib.h>

int main() {

    int *ptr = (int*) malloc(sizeof(int));

    *ptr = 10;

    // free(ptr);  // missing free causes memory leak

    return 0;
}
```

Because `free()` is not called, the allocated memory remains occupied.

---

# 6. Comparison

| Problem | Description | Cause |
|-------|-------------|------|
| Stack Overflow | Stack memory limit exceeded | Deep or infinite recursion |
| Heap Overflow | Writing beyond allocated heap memory | Buffer overflow |
| Memory Leak | Allocated memory not released | Missing `free()` |

---

# 7. Prevention

### To avoid stack overflow

- Use proper **base condition in recursion**
- Avoid excessive recursion depth

### To avoid heap overflow

- Allocate correct memory size
- Use safe functions like `strncpy()`

### To avoid memory leaks

- Always call `free()` after `malloc()` or `calloc()`
- Use memory debugging tools

---

# 8. Key Points

- Stack overflow occurs due to excessive stack usage.
- Heap overflow occurs when writing beyond allocated heap memory.
- Memory leaks occur when allocated memory is not freed.
- Proper memory management is essential in C programming.

---

# 9. Short Exam Definition

**Stack Overflow:** When a program exceeds the stack memory limit.

**Heap Overflow:** When a program writes more data than the allocated heap memory.

**Memory Leak:** When allocated heap memory is not released using `free()`.

---

# 10. Summary

Stack overflow, heap overflow, and memory leaks are common memory problems in C programs.  
Proper memory management and correct use of recursion and dynamic allocation help prevent these issues.











