# Comprehensive Interview Preparation Guide

## Database Management System (DBMS)

1.  **What is Normalisation? Why is it used?**
    - Normalisation is the process of organizing data in a database to reduce redundancy and improve data integrity.
    - It is used to eliminate duplicate data, ensure logical data dependencies, and prevent update/delete anomalies.

2.  **What is the difference between Delete, Truncate, and Drop?**
    - **Delete:** DML command, removes rows one by one (can use WHERE clause), can be rolled back.
    - **Truncate:** DDL command, removes all rows by deallocating pages, cannot be rolled back easily, resets identity counter.
    - **Drop:** DDL command, removes the entire table structure, cannot be rolled back.

3.  **Primary Key - Why is it useful?**
    - Uniquely identifies each record in a table.
    - Ensures entity integrity.
    - Cannot contain NULL values.

4.  **Foreign Key - Why is it useful?**
    - Used to establish a relation between two tables.
    - Enforces referential integrity (prevents actions that would destroy links between tables).

5.  **ACID Properties**
    - **Atomicity:** All or nothing (transaction completes fully or not at all).
    - **Consistency:** Always have a valid state (transaction brings database from one valid state to another).
    - **Isolation:** Multiple transactions do not interfere with each other.
    - **Durability:** Committed changes are permanently stored.

6.  **Indexing - Why is it used?**
    - Used to retrieve records faster (similar to a book index).
    - Improves speed of SELECT queries and WHERE clauses.

7.  **What is a Join? Explain Left, Right, Inner, Full Join.**
    - **Inner Join:** Returns records that have matching values in both tables.
    - **Left Join:** Returns all records from the left table, and matched records from the right.
    - **Right Join:** Returns all records from the right table, and matched records from the left.
    - **Full Join:** Returns all records when there is a match in either left or right table.

8.  **What is a Transaction? Why is it used?**
    - A unit of work performed against a database.
    - Used to maintain consistency, integrity, and to handle concurrency.

9.  **What is Normalisation and De-normalisation?**
    - **Normalisation:** Reducing redundancy by splitting tables.
    - **De-normalisation:** Combining tables to improve read performance (by adding redundancy).

## Operating System (OS)

10. **What is an OS?**
    - System software that manages computer hardware, software resources, and provides common services for computer programs.

11. **What is a Process?**
    - A program in execution. It includes the program counter, stack, and data section.

12. **What is a Thread?**
    - A lightweight process. It is the smallest unit of execution within a process. Threads of the same process share memory space.

13. **Difference between Process and Thread.**
    - **Process:** Heavyweight, isolated memory, slower creation/context switching.
    - **Thread:** Lightweight, shared memory, faster creation/context switching.

14. **What is a Deadlock?**
    - A situation where two or more processes are unable to proceed because each is waiting for a resource held by the other.

15. **Conditions for Deadlock to occur.**
    - **Mutual Exclusion**
    - **Hold and Wait**
    - **No Preemption**
    - **Circular Wait**

16. **What is Paging and why is it used?**
    - A memory management technique that divides physical memory into fixed-size blocks called frames and logical memory into blocks called pages.
    - It is used to eliminate external fragmentation and allow non-contiguous memory allocation.

17. **What is Virtual Memory?**
    - A memory management technique that allows execution of processes that may not be completely in physical memory. It uses disk space as an extension of RAM.

18. **What is Context Switching?**
    - The process of storing the state of a process (or thread) so that it can be restored and execution resumed later, allowing multiple processes to share a single CPU.

19. **What is Scheduling?**
    - The method by which work specified by a process is assigned to resources (specifically the CPU) that complete the work.

## Object-Oriented Programming (OOPS)

20. **What are the Four Pillars of OOPS?**
    - **Encapsulation:** Bundling data and methods within a class (hiding internal state).
    - **Abstraction:** Hiding complex implementation details and showing only essential features.
    - **Inheritance:** Creating a new class using properties of an existing class.
    - **Polymorphism:** The ability to present the same interface for differing data types (Overloading/Overriding).

## Data Structures & Algorithms (DSA)

21. **What is Time Complexity?**
    - A computational complexity that describes the amount of computer time it takes to run an algorithm as a function of the size of the input.

22. **Difference between Array and Linked List.**
    - **Array:** Contiguous memory, fixed size, faster access (O(1)), slower insertion/deletion.
    - **Linked List:** Non-contiguous memory, dynamic size, slower access (O(n)), faster insertion/deletion.

23. **What is Recursion?**
    - A function that calls itself during its execution. Used to solve problems that can be broken down into smaller, similar sub-problems.

24. **What is a Hash Table & how is it implemented?**
    - A data structure that implements an associative array (mapping keys to values). It uses a hash function to compute an index into an array of buckets or slots.

25. **What is a Pointer?**
    - A variable that stores the memory address of another variable.

26. **What is a Segmentation Fault & why does it occur?**
    - An error that occurs when a program tries to access a memory location that it is not allowed to access (invalid memory).

27. **Time Complexity of Binary Search**
    - O(log n)

28. **Reverse a string**
    - (Algorithm: Two-pointer technique swapping characters from start to end).

29. **Find the largest element in an array**
    - (Algorithm: Iterate through the array, keeping track of the maximum value).

30. **Check if the current string is palindrome or not**
    - (Algorithm: Compare characters from start and end moving inwards).

31. **Merge Sort Algorithm**
    - Divide and conquer algorithm. Divides array into halves, sorts them, then merges. (Time: O(n log n), Space: O(n)).

32. **Quick Sort Algorithm**
    - Divide and conquer. Picks a pivot and partitions the array. (Time: Avg O(n log n), Worst O(n²), Space: O(log n)).

33. **Divide & Conquer Algorithm**
    - A paradigm that solves a problem by breaking it into subproblems, solving them recursively, and combining the results.

34. **Knapsack Problem (0/1)**
    - Given weights and values, maximize value without exceeding weight capacity. Solved using DP (Time: O(n*W)).

35. **Huffman Coding Algorithm**
    - Greedy algorithm used for lossless data compression. Assigns variable-length codes to input characters based on frequency.

36. **Dijkstra's Algorithm**
    - Finds the shortest path from a source node to all other nodes in a graph with non-negative weights.

37. **Kruskal's Algorithm**
    - Greedy algorithm to find Minimum Spanning Tree (MST). Sorts edges by weight and adds if no cycle is formed.

38. **Floyd Warshall Algorithm**
    - Dynamic programming algorithm to find shortest paths in a weighted graph with positive or negative edge weights (no negative cycles). Time: O(V³).

39. **DFS (Depth First Search)**
    - Traversal algorithm that explores as far as possible along each branch before backtracking.

40. **BFS (Breadth First Search)**
    - Traversal algorithm that explores neighbors level by level.

41. **Merge Sort VS Quick Sort.**
    - **Merge:** Guaranteed O(n log n), stable, requires extra memory.
    - **Quick:** Faster in practice, O(log n) space, O(n²) worst case, not stable.

42. **Dijkstra VS BFS.**
    - **BFS:** For unweighted graphs (shortest path by edges).
    - **Dijkstra:** For weighted graphs (shortest path by total weight).

43. **DFS Vs BFS Differences.**
    - **DFS:** Uses stack, good for connectivity/cycles, path memory O(h).
    - **BFS:** Uses queue, good for shortest path (unweighted), path memory O(w).

44. **Kadane's Algorithm**
    - Finds the maximum sum subarray in O(n) time.

45. **LCS - Longest Common Subsequence**
    - DP algorithm to find the longest subsequence common to two sequences. Time: O(m*n).

46. **Longest Increasing Subsequence**
    - DP/Binary Search algorithm to find the length of the longest subsequence that is strictly increasing. Time: O(n log n).

47. **Topological Sorting (DAG)**
    - Linear ordering of vertices in a Directed Acyclic Graph (DAG) such that for every edge u->v, u comes before v.

48. **Union Find (Disjoint Set)**
    - Data structure that tracks a set of elements partitioned into disjoint subsets. Supports Union (merge) and Find (check connectivity).

49. **Rabin Karp Algorithm**
    - String matching algorithm that uses hashing to find any one of a set of pattern strings in a text. Average time O(n+m).

50. **KMP Algorithm (Efficient Pattern Matching)**
    - String matching algorithm that utilizes a "prefix function" (LPS array) to avoid comparing characters that have already been matched. Time O(n+m).

51. **Greedy Algorithm (Activity Selection)**
    - Selects the maximum number of non-overlapping activities by always picking the one with the earliest finish time.

52. **Bellman Ford Algorithm**
    - Finds shortest paths from source to all vertices. Handles negative weights and detects negative cycles. Time: O(V*E).

53. **Dijsktra's Vs Bellman Ford Algorithm**
    - **Dijkstra:** Faster (O(E log V)), fails on negative weights.
    - **Bellman Ford:** Slower (O(V*E)), handles negative weights, detects cycles.

54. **Matrix Chain Multiplication (DP)**
    - Finds the most efficient way to multiply a sequence of matrices by determining optimal parentheses. Time: O(n³).

55. **Strassen's Matrix Multiplication**
    - Divide and conquer algorithm for matrix multiplication. Time complexity O(n^2.807), better than standard O(n³).

56. **N Queens (Backtracking)**
    - Problem of placing N chess queens on an N×N board so that no two queens threaten each other.

57. **Subset Sum Problem (DP)**
    - Determines if there is a subset of the given set with sum equal to a given sum. Time: O(n*sum).

58. **Coin Change (DP)**
    - Finds the number of ways to make a change for a given amount using a given set of coins.

59. **Heap Sort**
    - Comparison-based sorting algorithm using a binary heap data structure. Time: O(n log n), Space: O(1).

60. **Backtracking**
    - Algorithmic technique for solving problems recursively by trying to build a solution incrementally and removing solutions that fail constraints.

## Scenario Based & System Design

61. **Database is slow: What will you do to make the speed high?**
    - Check and add proper **Indexing**.
    - Optimize SQL queries (avoid SELECT *, use WHERE effectively).
    - Analyze execution plan (EXPLAIN command).
    - Implement **Denormalization** for read-heavy loads.
    - Increase hardware resources (RAM, faster SSD).
    - Implement caching (Redis, Memcached).
    - Partition or Shard large tables.

62. **System is slow / hanging: What are the possible reasons?**
    - **Deadlock** in the OS or Database.
    - High CPU usage (infinite loop, heavy computation).
    - Memory Leak leading to excessive swapping (Virtual Memory thrashing).
    - Slow Disk I/O or Network latency.
    - Insufficient RAM.
    - Resource starvation (lack of threads/connections).

63. **When to use multithreading?**
    - To utilize multiple CPU cores for parallel computation (CPU-bound tasks).
    - To keep the UI responsive while performing background tasks (I/O-bound tasks like file reading or network calls).
    - To improve throughput of a server handling multiple client requests.

64. **What is a REST API?**
    - An architectural style for designing networked applications. It relies on stateless, client-server communication, typically using HTTP. It uses standard methods (GET, POST, PUT, DELETE) to manipulate resources identified by URLs.