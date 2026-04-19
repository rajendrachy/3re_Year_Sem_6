# Stack vs Heap in a C Program

## 1. Introduction

In the C programming language, memory is divided into different regions
when a program runs. Two important memory areas are Stack and Heap.
These areas store variables and data while the program executes.

Understanding stack and heap memory helps programmers manage memory
efficiently and avoid issues like memory leaks.

------------------------------------------------------------------------

## 2. Memory Layout of a C Program

Typical memory layout:

  -------------------------
  \| Stack \| \| Local
  variables \| \| Function
  calls \|
  -------------------------
  \| Heap \| \| Dynamic
  memory \|

  -------------------------

|   BSS Segment \|
| Uninitialized globals \|

  -------------------------
  \| Data Segment \| \|
  Initialized globals \|
  -------------------------
  \| Text / Code \| \|
  Program instructions \|

  -------------------------

### Sections Explanation

Text Segment -- Contains compiled program instructions\
Data Segment -- Stores initialized global and static variables\
BSS Segment -- Stores uninitialized global and static variables\
Heap -- Used for dynamic memory allocation\
Stack -- Stores local variables and function calls

------------------------------------------------------------------------

# 3. Stack Memory

The stack is used to store local variables and function calls.

Characteristics: - Managed automatically by the compiler - Uses LIFO
(Last In First Out) structure - Memory is released automatically when
the function ends - Faster memory access - Limited memory size

Example:

``` c
#include <stdio.h>

void display() {
    int x = 10;   // Stack variable
    printf("%d", x);
}

int main() {
    display();
    return 0;
}
```

------------------------------------------------------------------------

# 4. Heap Memory

The heap is used for dynamic memory allocation during runtime.

Memory allocation functions: - malloc() - calloc() - realloc() - free()

Example:

``` c
#include <stdio.h>
#include <stdlib.h>

int main() {

    int *ptr;

    ptr = (int*) malloc(sizeof(int));

    *ptr = 25;

    printf("Value = %d", *ptr);

    free(ptr);

    return 0;
}
```

------------------------------------------------------------------------

# 5. Stack vs Heap Comparison

  Feature       Stack                 Heap
  ------------- --------------------- ------------------------
  Allocation    Automatic             Manual
  Managed by    Compiler              Programmer
  Speed         Faster                Slower
  Memory Size   Small                 Large
  Lifetime      Until function ends   Until free() is called
  Usage         Local variables       Dynamic memory

------------------------------------------------------------------------

# 6. Example Using Both

``` c
#include <stdio.h>
#include <stdlib.h>

int main() {

    int a = 5;

    int *ptr;
    ptr = (int*) malloc(sizeof(int));

    *ptr = 10;

    printf("Stack value: %d\n", a);
    printf("Heap value: %d\n", *ptr);

    free(ptr);

    return 0;
}
```

------------------------------------------------------------------------

# 7. Key Points

-   Stack stores local variables and function calls.
-   Heap stores dynamically allocated memory.
-   Stack memory is automatically managed.
-   Heap memory must be manually allocated and freed.
-   Stack is faster but smaller.
-   Heap is larger but slower.

------------------------------------------------------------------------

# 8. Short Exam Definition

Stack: Memory area used for storing function calls and local variables.

Heap: Memory area used for dynamic memory allocation during program
execution.

------------------------------------------------------------------------

# 9. Summary

Stack and heap are important parts of a program's memory. Stack is used
for automatic memory management, while heap is used when programmers
need to allocate memory dynamically at runtime.
