# 14.11 – Types of Pointers in C
Wild Pointer | Void Pointer | Null Pointer | Dangling Pointer

## 1. Introduction

Pointers are an important feature of the C programming language.  
A **pointer** is a variable that stores the **memory address of another variable**.

Example:

```c
#include <stdio.h>

int main() {
    int a = 10;
    int *ptr = &a;

    printf("Value of a: %d\n", a);
    printf("Address of a: %p\n", ptr);

    return 0;
}
```

---

# 2. Types of Pointers in C

Some common pointer types include:

- Null Pointer
- Void Pointer
- Wild Pointer
- Dangling Pointer

---

# 3. Null Pointer

### Definition

A **null pointer** is a pointer that **does not point to any memory location**.

It is usually assigned the value `NULL`.

### Example

```c
#include <stdio.h>

int main() {

    int *ptr = NULL;

    if(ptr == NULL)
        printf("Pointer is NULL");

    return 0;
}
```

### Purpose

- Used to initialize pointers
- Helps avoid accessing invalid memory
- Used as a default value

---

# 4. Void Pointer

### Definition

A **void pointer** is a pointer that **can store the address of any data type**.

It is also called a **generic pointer**.

### Example

```c
#include <stdio.h>

int main() {

    int a = 10;
    float b = 5.5;

    void *ptr;

    ptr = &a;
    printf("Integer value: %d\n", *(int*)ptr);

    ptr = &b;
    printf("Float value: %f\n", *(float*)ptr);

    return 0;
}
```

### Important Points

- Cannot be directly dereferenced
- Requires **type casting** before accessing data

---

# 5. Wild Pointer

### Definition

A **wild pointer** is a pointer that **has not been initialized**.

It points to an **unknown memory location**.

### Example

```c
#include <stdio.h>

int main() {

    int *ptr;   // wild pointer

    printf("%d", *ptr);

    return 0;
}
```

This may cause **unpredictable behavior**.

### Prevention

Always initialize pointers:

```c
int *ptr = NULL;
```

---

# 6. Dangling Pointer

### Definition

A **dangling pointer** is a pointer that **points to memory that has already been freed**.

### Example

```c
#include <stdio.h>
#include <stdlib.h>

int main() {

    int *ptr = (int*) malloc(sizeof(int));

    *ptr = 10;

    free(ptr);

    printf("%d", *ptr);   // dangling pointer

    return 0;
}
```

Here, memory is freed but the pointer still refers to it.

### Prevention

After freeing memory, set pointer to `NULL`.

```c
free(ptr);
ptr = NULL;
```

---

# 7. Summary Table

| Pointer Type | Description |
|--------------|-------------|
| Null Pointer | Pointer that points to nothing |
| Void Pointer | Generic pointer that can store any data type |
| Wild Pointer | Uninitialized pointer |
| Dangling Pointer | Pointer pointing to freed memory |

---

# 8. Key Points

- Pointers store memory addresses.
- Null pointers point to no location.
- Void pointers are generic pointers.
- Wild pointers are uninitialized pointers.
- Dangling pointers point to deleted memory.

---

# 9. Short Exam Definition

**Null Pointer:** Pointer that points to no memory location.  

**Void Pointer:** Generic pointer that can hold address of any data type.  

**Wild Pointer:** Uninitialized pointer pointing to random memory.  

**Dangling Pointer:** Pointer pointing to memory that has already been freed.

---

# 10. Conclusion

Understanding different types of pointers helps prevent memory errors and improves safe memory handling in C programs.














