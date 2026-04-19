# Sort a Stack Using Recursion

## Problem

Sort a stack using **recursion only** (no loops and no extra data structures except the recursion stack).

Example

Input Stack (Top → Bottom)

```
3
1
4
2
```

Output Stack (Top → Bottom)

```
4
3
2
1
```

---

# Core Idea

To sort the stack using recursion:

1. Remove the **top element** from the stack.
2. Recursively **sort the remaining stack**.
3. Insert the removed element back into the **correct position** in the sorted stack.

This problem follows the **three-step recursion method**:

1. Base Condition
2. Hypothesis
3. Induction

---

# Step 1 — Base Condition

The base condition occurs when the stack has **only one element**.

A stack with one element is already sorted.

```
if stack.size() == 1
    return
```

Example

```
[5]
```

Already sorted.

---

# Step 2 — Hypothesis

Assume that the recursive function correctly sorts a stack of **size n-1**.

Example stack:

```
3
1
4
2
```

Remove the top element:

```
temp = 3
remaining stack:

1
4
2
```

Assume recursion sorts it correctly:

```
1
2
4
```

---

# Step 3 — Induction

Now we insert the removed element (`temp`) into the correct position in the sorted stack.

Example:

Sorted stack:

```
1
2
4
```

Insert:

```
temp = 3
```

Steps:

```
3 < 4 → remove 4
3 > 2 → correct position
```

Insert 3:

```
1
2
3
```

Push removed element back:

```
1
2
3
4
```

Thus the stack of size **n** becomes sorted.

---

# Recursion Dry Run

Original Stack

```
Top
3
1
4
2
```

Remove elements until base case:

```
3 removed
1 removed
4 removed
2 remaining
```

Base case reached.

Now insert elements back:

```
2
→ insert 4 → 2 4
→ insert 1 → 1 2 4
→ insert 3 → 1 2 3 4
```

Sorted stack obtained.

---

# Algorithm

Two recursive functions are required:

1. `sortStack()` → sorts the stack
2. `insert()` → inserts an element in the sorted stack

---

# Pseudocode

```
sortStack(stack)

if size == 1
    return

temp = pop()

sortStack(stack)

insert(stack, temp)



insert(stack, temp)

if stack empty OR stack.top() <= temp
    push(temp)
    return

val = pop()

insert(stack, temp)

push(val)
```

---

# C++ Implementation

```cpp
#include <iostream>
#include <stack>
using namespace std;

void insert(stack<int> &st, int temp)
{
    if(st.empty() || st.top() <= temp)
    {
        st.push(temp);
        return;
    }

    int val = st.top();
    st.pop();

    insert(st, temp);

    st.push(val);
}

void sortStack(stack<int> &st)
{
    if(st.size() == 1)
        return;

    int temp = st.top();
    st.pop();

    sortStack(st);

    insert(st, temp);
}

int main()
{
    stack<int> st;

    st.push(3);
    st.push(1);
    st.push(4);
    st.push(2);

    sortStack(st);

    while(!st.empty())
    {
        cout << st.top() << " ";
        st.pop();
    }
}
```

Output

```
4 3 2 1
```

---

# Java Implementation

```java
import java.util.Stack;

public class SortStack {

    static void insert(Stack<Integer> st, int temp)
    {
        if(st.isEmpty() || st.peek() <= temp)
        {
            st.push(temp);
            return;
        }

        int val = st.pop();

        insert(st, temp);

        st.push(val);
    }

    static void sortStack(Stack<Integer> st)
    {
        if(st.size() == 1)
            return;

        int temp = st.pop();

        sortStack(st);

        insert(st, temp);
    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        sortStack(st);

        while(!st.isEmpty())
        {
            System.out.print(st.pop() + " ");
        }
    }
}
```

Output

```
4 3 2 1
```

---

# Time Complexity

```
O(n²)
```

Reason:

Each insertion may take **O(n)** time and this occurs **n times**.

---

# Space Complexity

```
O(n)
```

Due to the recursion call stack.

---

# Recursion Structure

```
sortStack(n)
 ├─ sortStack(n-1)
 │   ├─ sortStack(n-2)
 │   │   └─ base case
 │   └─ insert
 └─ insert
```

---

# Key Learning

Sorting a stack recursively follows the **recursion thinking process**:

```
1. Base Condition
2. Hypothesis
3. Induction
```

Break the problem into **smaller stacks**, solve them recursively, and then **reinsert elements in sorted order**.








