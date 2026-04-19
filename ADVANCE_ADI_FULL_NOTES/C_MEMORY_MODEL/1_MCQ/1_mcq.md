# Memory Model in C - MCQs (With Answers & Explanation)

---

## 1. Where are local variables stored in C?
A) Heap  
B) Stack  
C) Data segment  
D) Code segment  
**Answer: B**  
**Reason:** Local variables are stored in stack because they are function-scoped.

---

## 2. Memory allocated using malloc() is stored in:
A) Stack  
B) Heap  
C) Register  
D) Code segment  
**Answer: B**  
**Reason:** malloc allocates memory dynamically in heap.

---

## 3. Which function is used to allocate dynamic memory in C?
A) alloc()  
B) malloc()  
C) new()  
D) create()  
**Answer: B**  
**Reason:** malloc() is standard C function for dynamic allocation.

---

## 4. Which keyword is used to free dynamically allocated memory?
A) delete  
B) free  
C) remove  
D) clear  
**Answer: B**  
**Reason:** free() releases heap memory in C.

---

## 5. Static variables are stored in:
A) Stack  
B) Heap  
C) Data segment  
D) Registers  
**Answer: C**  
**Reason:** Static variables persist for entire program in data segment.

---

## 6. Default value of uninitialized local variable is:
A) 0  
B) garbage value  
C) NULL  
D) 1  
**Answer: B**  
**Reason:** Local variables are not initialized automatically.

---

## 7. Memory leak occurs when:
A) Memory is freed  
B) Memory is reallocated  
C) Memory is not freed  
D) Stack is used  
**Answer: C**  
**Reason:** Not freeing heap memory causes leak.

---

## 8. Which of the following is NOT a memory segment?
A) Stack  
B) Heap  
C) Cache segment  
D) Data segment  
**Answer: C**  
**Reason:** Cache is hardware, not program memory segment.

---

## 9. Pointer size depends on:
A) Data type  
B) Compiler only  
C) Architecture (32/64 bit)  
D) Variable value  
**Answer: C**  
**Reason:** Pointer size depends on system architecture.

---

## 10. calloc() differs from malloc() because it:
A) Allocates single block  
B) Initializes memory to zero  
C) Frees memory  
D) Uses stack  
**Answer: B**  
**Reason:** calloc initializes allocated memory to 0.

---

## 11. Stack memory is:
A) Static  
B) Dynamic  
C) Automatically managed  
D) Manually managed by malloc  
**Answer: C**  
**Reason:** Stack is automatically managed by compiler.

---

## 12. Heap memory is:
A) Fixed size  
B) Automatically freed  
C) Manually managed  
D) Read-only  
**Answer: C**  
**Reason:** Programmer must manage heap memory.

---

## 13. Which section stores global variables?
A) Stack  
B) Heap  
C) Data segment  
D) Register  
**Answer: C**  
**Reason:** Global variables are stored in data segment.

---

## 14. Function call information is stored in:
A) Heap  
B) Stack  
C) Data segment  
D) Disk  
**Answer: B**  
**Reason:** Stack stores activation records.

---

## 15. Dangling pointer refers to:
A) Null pointer  
B) Freed memory pointer  
C) Stack pointer  
D) Array pointer  
**Answer: B**  
**Reason:** It points to freed memory.

---

## 16. realloc() is used to:
A) Free memory  
B) Resize allocated memory  
C) Initialize memory  
D) Copy memory  
**Answer: B**  
**Reason:** realloc changes size of allocated block.

---

## 17. Which memory is fastest?
A) Heap  
B) Stack  
C) Disk  
D) ROM  
**Answer: B**  
**Reason:** Stack is faster due to LIFO structure.

---

## 18. Stack follows:
A) FIFO  
B) LIFO  
C) Random order  
D) Priority  
**Answer: B**  
**Reason:** Stack follows Last In First Out.

---

## 19. Heap follows:
A) FIFO  
B) LIFO  
C) No fixed order  
D) Sorted order  
**Answer: C**  
**Reason:** Heap allocation is random.

---

## 20. Which is stored in code segment?
A) Variables  
B) Functions  
C) Heap memory  
D) Stack frames  
**Answer: B**  
**Reason:** Program instructions are stored in code segment.

---

## 21. Memory alignment is related to:
A) Speed optimization  
B) File storage  
C) Network transfer  
D) Encryption  
**Answer: A**  
**Reason:** It improves CPU access speed.

---

## 22. Wild pointer is:
A) Initialized pointer  
B) NULL pointer  
C) Uninitialized pointer  
D) Freed pointer  
**Answer: C**  
**Reason:** It is not initialized.

---

## 23. Which operator is used for dynamic memory?
A) &  
B) *  
C) malloc  
D) sizeof  
**Answer: C**  
**Reason:** malloc is used for dynamic allocation.

---

## 24. sizeof(pointer) returns:
A) Size of data  
B) Size of memory block  
C) Size of pointer itself  
D) Zero  
**Answer: C**  
**Reason:** It returns pointer size (4 or 8 bytes).

---

## 25. Stack overflow happens when:
A) Heap is full  
B) Too many function calls  
C) Memory is freed  
D) Pointer is NULL  
**Answer: B**  
**Reason:** Deep recursion fills stack.

---

## 26. Heap overflow occurs when:
A) Stack is empty  
B) Memory allocation exceeds limit  
C) Function returns  
D) Pointer is deleted  
**Answer: B**  
**Reason:** Too much dynamic allocation.

---

## 27. Memory segmentation helps in:
A) Faster compilation  
B) Organized memory management  
C) File compression  
D) Encryption  
**Answer: B**  
**Reason:** Separates memory logically.

---

## 28. Local variables are destroyed when:
A) Program starts  
B) Function ends  
C) Heap is cleared  
D) Compiler runs  
**Answer: B**  
**Reason:** Stack frame is removed.

---

## 29. Global variables are stored until:
A) Function ends  
B) Program terminates  
C) Stack clears  
D) Pointer is deleted  
**Answer: B**  
**Reason:** They exist till program ends.

---

## 30. Which function allocates memory for array in C?
A) malloc  
B) calloc  
C) realloc  
D) all of these  
**Answer: D**  
**Reason:** All can allocate memory dynamically.