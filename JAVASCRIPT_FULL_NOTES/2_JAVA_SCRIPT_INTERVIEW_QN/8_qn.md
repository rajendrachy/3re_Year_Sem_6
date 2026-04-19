# JavaScript Interview Question

## 7. Is JavaScript a statically typed or a dynamically typed language?

JavaScript is a **dynamically typed language**.

### Definition

In a dynamically typed language, the **data type of a variable is determined at runtime**, and you **do not need to declare the type of the variable explicitly**.

This means a variable can store **different types of values at different times**.

---

## Example

```javascript
let data = 10;      // Number
data = "Hello";     // String
data = true;        // Boolean

console.log(data);
```

Explanation:
- The same variable `data` first stores a **number**
- Then it stores a **string**
- Then it stores a **boolean**

JavaScript automatically handles the **type changes**.

---

## Dynamic Typing Characteristics

- No need to declare variable types
- Type is decided **during execution**
- A variable can hold **different data types**
- Flexible but may cause runtime errors

---

## Comparison

| Feature | Static Typing | Dynamic Typing |
|-------|---------------|---------------|
| Type declaration | Required | Not required |
| Type checking | Compile time | Runtime |
| Flexibility | Less | More |

Example of **statically typed languages**:
- C
- C++
- Java

Example of **dynamically typed languages**:
- JavaScript
- Python
- Ruby

---

## Short Interview Answer

JavaScript is a **dynamically typed language**, meaning the data type of a variable is determined automatically at runtime and can change during program execution.
