# JavaScript Interview Question

## 5. Difference between `var`, `let`, and `const` in JavaScript

In JavaScript, `var`, `let`, and `const` are used to **declare variables**, but they behave differently in terms of **scope, redeclaration, and reassignment**.

---

## 1. var

`var` is the **old way** of declaring variables in JavaScript.

### Characteristics
- Function scoped
- Can be **redeclared**
- Can be **reassigned**
- Hoisted and initialized with `undefined`

### Example

```javascript
var x = 10;
var x = 20;   // Allowed
x = 30;       // Allowed

console.log(x);
```

---

## 2. let

`let` was introduced in **ES6 (2015)**.

### Characteristics
- **Block scoped**
- Cannot be **redeclared**
- Can be **reassigned**
- Hoisted but in **Temporal Dead Zone (TDZ)**

### Example

```javascript
let a = 10;
a = 20;      // Allowed
// let a = 30;  // Error (cannot redeclare)
```

---

## 3. const

`const` is used to declare **constant variables**.

### Characteristics
- **Block scoped**
- Cannot be **redeclared**
- Cannot be **reassigned**
- Must be **initialized at declaration**

### Example

```javascript
const b = 50;
// b = 60; // Error
```

---

## Differences

| Feature | var | let | const |
|------|------|------|------|
| Scope | Function | Block | Block |
| Redeclaration | Allowed | Not Allowed | Not Allowed |
| Reassignment | Allowed | Allowed | Not Allowed |
| Hoisting | Yes | Yes (TDZ) | Yes (TDZ) |

---

## Example

```javascript
var x = 10;
let y = 20;
const z = 30;

x = 40; // Allowed
y = 50; // Allowed
// z = 60; // Error
```

---

## Short Interview Answer

`var` is **function scoped and allows redeclaration**, `let` is **block scoped and allows reassignment but not redeclaration**, and `const` is **block scoped and cannot be reassigned or redeclared**.


