# JavaScript Interview Question

## 9. Explain Pass by Value and Pass by Reference

In programming, arguments passed to functions can behave in two ways:

1. Pass by Value  
2. Pass by Reference

---

## 1. Pass by Value

In **pass by value**, a **copy of the actual value** is passed to the function.

Any changes made inside the function **do not affect the original variable**.

### Example

```javascript
function changeValue(x) {
  x = 20;
}

let a = 10;

changeValue(a);

console.log(a);
```

Output

```
10
```

Explanation:
- `a` is passed as a **copy**
- Changing `x` does **not change the original value**

Primitive data types use **pass by value**:
- Number
- String
- Boolean
- Null
- Undefined
- BigInt
- Symbol

---

## 2. Pass by Reference

In **pass by reference**, the **reference (memory address)** of the variable is passed to the function.

If the value is changed inside the function, the **original value also changes**.

### Example

```javascript
function changeName(obj) {
  obj.name = "Rahul";
}

let student = {
  name: "Amit"
};

changeName(student);

console.log(student.name);
```

Output

```
Rahul
```

Explanation:
- The object reference is passed
- Changes affect the **original object**

Non-primitive types behave like **pass by reference**:
- Object
- Array
- Function

---

## Differences

| Feature | Pass by Value | Pass by Reference |
|-------|---------------|-------------------|
| What is passed | Copy of value | Reference (address) |
| Original value change | No | Yes |
| Data types | Primitive | Non-primitive |
| Memory | Separate copy | Same memory reference |

---

## Short Interview Answer

Pass by value means **a copy of the value is passed to a function**, so the original variable is not affected.  
Pass by reference means **the reference of the variable is passed**, so changes inside the function affect the original value.



