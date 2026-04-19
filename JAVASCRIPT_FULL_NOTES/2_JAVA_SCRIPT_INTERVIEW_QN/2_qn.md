# JavaScript Interview Question

## 1. What are the different data types present in JavaScript?

JavaScript data types are divided into **two main categories**:

1. Primitive Data Types  
2. Non-Primitive (Reference) Data Types

---

## 1. Primitive Data Types

Primitive data types store **single simple values** and are **immutable**.

### Types of Primitive Data Types

- Number
- String
- Boolean
- Undefined
- Null
- BigInt
- Symbol

### Example

```javascript
let age = 25;          // Number
let name = "Rahul";    // String
let isStudent = true;  // Boolean
let data;              // Undefined
let value = null;      // Null
```

---

## 2. Non-Primitive (Reference) Data Types

Non-primitive data types store **collections of values or complex data**.

### Types of Non-Primitive Data Types

- Object
- Array
- Function
- Date

### Example

```javascript
let student = {
  name: "Rahul",
  age: 20
};

let numbers = [10, 20, 30];

function greet() {
  console.log("Hello");
}
```

---

## Summary

| Category | Data Types |
|--------|-------------|
| Primitive | Number, String, Boolean, Undefined, Null, BigInt, Symbol |
| Non-Primitive | Object, Array, Function, Date |

---

## Short Interview Answer

JavaScript has **two categories of data types**:  
**Primitive** (Number, String, Boolean, Undefined, Null, BigInt, Symbol) and **Non-Primitive** (Object, Array, Function, etc.).



