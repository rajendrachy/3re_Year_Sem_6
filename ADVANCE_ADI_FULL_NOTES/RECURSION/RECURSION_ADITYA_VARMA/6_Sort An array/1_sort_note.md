# Sorting an Array Using Recursion (C++ and Java)

## Problem

Sort an array using **recursion only (no loops)**.

Example

**Input**

```
[3, 1, 4, 2]
```

**Output**

```
[1, 2, 3, 4]
```

---

# Core Idea

The recursive strategy works as follows:

1. Remove the **last element** from the array.
2. Recursively **sort the remaining array**.
3. Insert the removed element back into the **correct position** in the sorted array.

We solve this problem using the **three-step recursion method**:

* Base Condition
* Hypothesis
* Induction

---

# Step 1 — Base Condition

The base condition is the **smallest problem size** that can be solved directly.

For this problem:

If the array contains **only one element**, it is already sorted.

```
if(arr.size() == 1)
    return;
```

Example

```
[5]
```

A single-element array is always sorted.

---

# Step 2 — Hypothesis

Assume that the recursive function **correctly sorts an array of size (n-1)**.

Example

```
arr = [3,1,4,2]
```

Remove the last element:

```
temp = 2
remaining array = [3,1,4]
```

Now assume the recursive function correctly sorts this smaller array:

```
sort([3,1,4]) → [1,3,4]
```

This assumption is called the **recursion hypothesis**.

---

# Step 3 — Induction

Now we must prove that the algorithm works for **size n**.

From the hypothesis we already have:

```
[1,3,4]
```

Now insert the removed element:

```
temp = 2
```

Steps:

```
[1,3,4]

2 < 4 → remove 4
2 < 3 → remove 3
2 > 1 → insert here
```

Insert 2

```
[1,2]
```

Reinsert removed elements

```
[1,2,3,4]
```

Thus the array of size **n** becomes sorted.

---

# Recursion Dry Run

Original Array

```
[3,1,4,2]
```

Remove elements until base case:

```
[3,1,4,2]
[3,1,4]
[3,1]
[3]
```

Base condition reached.

Now insert elements back:

```
[3] + 1 → [1,3]
[1,3] + 4 → [1,3,4]
[1,3,4] + 2 → [1,2,3,4]
```

Final sorted array

```
[1,2,3,4]
```

---

# Algorithm

Two recursive functions are used:

1. `sort()` → sorts the array
2. `insert()` → inserts an element in sorted order

---

# Pseudocode

```
sort(arr)

if size(arr) == 1
    return

temp = remove last element

sort(arr)

insert(arr, temp)



insert(arr, temp)

if arr empty OR last element <= temp
    push temp
    return

val = remove last element

insert(arr, temp)

push val
```

---

# C++ Implementation

```cpp
#include <iostream>
#include <vector>
using namespace std;

void insertElement(vector<int> &arr, int temp)
{
    if(arr.size() == 0 || arr.back() <= temp)
    {
        arr.push_back(temp);
        return;
    }

    int val = arr.back();
    arr.pop_back();

    insertElement(arr, temp);

    arr.push_back(val);
}

void sortArray(vector<int> &arr)
{
    if(arr.size() == 1)
        return;

    int temp = arr.back();
    arr.pop_back();

    sortArray(arr);

    insertElement(arr, temp);
}

int main()
{
    vector<int> arr = {3,1,4,2};

    sortArray(arr);

    for(int i : arr)
        cout << i << " ";

    return 0;
}
```

Output

```
1 2 3 4
```

---

# Java Implementation

```java
import java.util.ArrayList;

public class RecursiveSort {

    static void insertElement(ArrayList<Integer> arr, int temp)
    {
        if(arr.size() == 0 || arr.get(arr.size()-1) <= temp)
        {
            arr.add(temp);
            return;
        }

        int val = arr.remove(arr.size()-1);

        insertElement(arr, temp);

        arr.add(val);
    }

    static void sortArray(ArrayList<Integer> arr)
    {
        if(arr.size() == 1)
            return;

        int temp = arr.remove(arr.size()-1);

        sortArray(arr);

        insertElement(arr, temp);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(2);

        sortArray(arr);

        System.out.println(arr);
    }
}
```

Output

```
[1, 2, 3, 4]
```

---

# Time Complexity

```
O(n²)
```

Reason:

Each element insertion may take **O(n)** time and we perform it **n times**.

---

# Space Complexity

```
O(n)
```

Due to the recursion call stack.

---

# Recursion Structure

```
sort(n)
 ├─ sort(n-1)
 │   ├─ sort(n-2)
 │   │   └─ base case
 │   └─ insert
 └─ insert
```

---

# Key Takeaway

This problem teaches the **three-step recursion thinking process**:

```
1. Base Condition
2. Hypothesis
3. Induction
```

Break the problem into **smaller subproblems**, solve them recursively, and then **rebuild the final solution**.
















