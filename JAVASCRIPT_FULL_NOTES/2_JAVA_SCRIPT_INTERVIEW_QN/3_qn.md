# JavaScript Interview Question

## 2. Explain Hoisting in JavaScript

### Definition

Hoisting in JavaScript is a behavior where **variable and function declarations are moved to the top of their scope during the compilation phase**, before the code is executed.

This means you can **use variables and functions before they are declared in the code**.

---

## Example of Variable Hoisting

```javascript
console.log(x); 
var x = 5;
```

### How JavaScript Interprets It

```javascript
var x;
console.log(x); // undefined
x = 5;
```

Output:
```
undefined
```

Explanation:
- The declaration `var x` is hoisted to the top.
- The **initialization (`= 5`) is not hoisted**.

---

## Example of Function Hoisting

```javascript
greet();

function greet() {
  console.log("Hello");
}
```

Output:
```
Hello
```

Explanation:
- Function declarations are **fully hoisted**, so they can be called before their definition.

---

## Hoisting with `let` and `const`

Variables declared with **let** and **const** are also hoisted but **not initialized**.

They stay in a **Temporal Dead Zone (TDZ)** until the declaration line is executed.

```javascript
console.log(a);
let a = 10;
```

Output:
```
ReferenceError
```

---

## Summary

| Type | Hoisted | Initialization |
|-----|--------|---------------|
| var | Yes | No |
| let | Yes | No (TDZ) |
| const | Yes | No (TDZ) |
| function | Yes | Yes |

---

## Short Interview Answer

Hoisting in JavaScript is the default behavior where **variable and function declarations are moved to the top of their scope during the compilation phase**, allowing them to be used before they are declared in the code.



