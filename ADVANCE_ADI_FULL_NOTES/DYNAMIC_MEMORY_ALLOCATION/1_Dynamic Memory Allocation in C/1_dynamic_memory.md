# Dynamic Memory Allocation in C

## 1. Introduction

Dynamic Memory Allocation (DMA) is a method of allocating memory **during program execution (runtime)**.

Unlike static memory allocation, where memory is fixed at compile time, dynamic allocation allows programs to **request memory when needed**.

In C, dynamic memory is allocated from the **heap memory**.

Dynamic memory allocation functions are defined in the header file:

```c
#include <stdlib.h>
```

---

# 2. Why Dynamic Memory Allocation?

Dynamic memory allocation is useful when:

- The size of data is **not known at compile time**
- Memory needs to be **allocated and released during execution**
- Programs require **flexible memory usage**

Example situations:
- Dynamic arrays
- Linked lists
- Trees and graphs

---

# 3. Functions Used in Dynamic Memory Allocation

C provides four main functions for dynamic memory allocation:

| Function | Purpose |
|--------|--------|
| malloc() | Allocates memory block |
| calloc() | Allocates memory and initializes it to zero |
| realloc() | Resizes previously allocated memory |
| free() | Releases allocated memory |

---

# 4. malloc() Function

### Definition

`malloc()` allocates a **block of memory** of specified size.

### Syntax

```c
ptr = (type*) malloc(size_in_bytes);
```

### Example

```c
#include <stdio.h>
#include <stdlib.h>

int main() {

    int *ptr;

    ptr = (int*) malloc(sizeof(int));

    *ptr = 10;

    printf("Value = %d", *ptr);

    free(ptr);

    return 0;
}
```

---

# 5. calloc() Function

### Definition

`calloc()` allocates memory for **multiple elements** and initializes them to **zero**.

### Syntax

```c
ptr = (type*) calloc(number_of_elements, size_of_each_element);
```

### Example

```c
#include <stdio.h>
#include <stdlib.h>

int main() {

    int *ptr;

    ptr = (int*) calloc(5, sizeof(int));

    for(int i = 0; i < 5; i++)
        printf("%d ", ptr[i]);

    free(ptr);

    return 0;
}
```

Output:

```
0 0 0 0 0
```

---

# 6. realloc() Function

### Definition

`realloc()` changes the **size of previously allocated memory**.

### Syntax

```c
ptr = realloc(ptr, new_size);
```

### Example

```c
#include <stdio.h>
#include <stdlib.h>

int main() {

    int *ptr;

    ptr = (int*) malloc(2 * sizeof(int));

    ptr = realloc(ptr, 5 * sizeof(int));

    free(ptr);

    return 0;
}
```

---

# 7. free() Function

### Definition

`free()` releases dynamically allocated memory back to the system.

### Syntax

```c
free(ptr);
```

### Example

```c
free(ptr);
ptr = NULL;
```

Setting pointer to `NULL` prevents **dangling pointers**.

---

# 8. Advantages of Dynamic Memory Allocation

- Efficient use of memory
- Memory allocated only when needed
- Supports dynamic data structures
- Flexible memory management

---

# 9. Disadvantages

- Memory leaks if `free()` is not used
- Slower than stack allocation
- Requires careful memory management

---

# 10. Key Points

- Dynamic memory is allocated at **runtime**.
- Memory is allocated from the **heap**.
- `malloc()` allocates memory.
- `calloc()` allocates and initializes memory.
- `realloc()` resizes memory.
- `free()` releases memory.

---

# 11. Short Exam Definition

**Dynamic Memory Allocation is the process of allocating memory during program execution using functions like `malloc()`, `calloc()`, `realloc()`, and `free()`.**

---

# 12. Conclusion

Dynamic memory allocation is a powerful feature of C programming that allows programs to manage memory efficiently during runtime.





















