# TypeScript Tutorial #18  
## Union Types in TypeScript

Welcome to **TypeScript Tutorial #18**.  
In this tutorial, we will learn about **Union Types**, one of the most useful features in TypeScript that allows a variable to hold **multiple types of values**.

---

# 1. What are Union Types?

A **Union Type** allows a variable, parameter, or function return value to have **more than one possible type**.

It is defined using the **`|` (pipe) symbol**.

### Syntax

```typescript
let variable: type1 | type2;
```

This means the variable can store **either type1 or type2**.

---

# 2. Using Union Type with Variables

Union types allow variables to hold multiple data types.

### Example

```typescript
let value: string | number;

value = "Hello";
value = 100;
```

Explanation:

- The variable `value` can store **string or number**.
- Assigning another type (like boolean) will cause an error.

Example of invalid value:

```typescript
value = true; // Error
```

---

# 3. Using Union Type with Function Return Type

Union types can also be used when a function may return **different types of values**.

### Example

```typescript
function getResult(score: number): string | number {

  if (score >= 50) {
    return "Passed";
  }

  return score;
}
```

Explanation:

The function may return:

- `"Passed"` → string
- `score` → number

---

# 4. Using Union Type with Function Parameters

Union types can also be used for **function parameters**.

### Example

```typescript
function printId(id: number | string) {
  console.log("User ID:", id);
}

printId(101);
printId("A102");
```

Explanation:

The function accepts:

- number
- string

---

# 5. Type Checking with Union Types

When using union types, we often need to **check the type before using it**.

This is called **Type Narrowing**.

### Example

```typescript
function processValue(value: string | number) {

  if (typeof value === "string") {
    console.log(value.toUpperCase());
  } 
  
  else {
    console.log(value + 10);
  }

}
```

Explanation:

- If `value` is a string → use string methods
- If `value` is a number → perform numeric operations

---

# 6. Union Types with Arrays

Union types can also be used in arrays.

### Example

```typescript
let data: (string | number)[] = [10, "Hello", 20, "TypeScript"];
```

Explanation:

The array can contain:

- numbers
- strings

---

# 7. Real Example

```typescript
function formatValue(value: string | number | boolean) {

  if (typeof value === "string") {
    console.log("String value:", value);
  }

  else if (typeof value === "number") {
    console.log("Number value:", value);
  }

  else {
    console.log("Boolean value:", value);
  }

}
```

---

# Interview Questions

### 1. What is a Union Type in TypeScript?

A **Union Type** allows a variable to hold **multiple possible types** using the `|` operator.

Example:

```
string | number
```

---

### 2. What symbol is used to define Union Types?

The **`|` (pipe) symbol**.

---

### 3. Can Union Types be used with function parameters?

Yes. They allow functions to accept **multiple types of inputs**.

Example:

```
function printId(id: number | string)
```

---

### 4. Why is type checking needed with Union Types?

Because a variable can hold multiple types, we must **check its type before using specific methods**.

---

### 5. What is Type Narrowing?

Type Narrowing is the process of **checking a variable's type and narrowing it down to a specific type**.

---

# Summary

- **Union Types allow multiple data types in one variable**
- Defined using the **`|` operator**
- Can be used with:
  - variables
  - function parameters
  - function return types
- Type checking is important when using union types
- Helps create **flexible and safer code**

---











