# TypeScript Tutorial #16  
## Never Type in TypeScript

Welcome to the 16th episode of our **TypeScript Tutorial series**.  
In this tutorial, we will learn about the **`never` type** in TypeScript, when to use it, and how it differs from other types like `void`.

---

# 1. What is the `never` Type in TypeScript?

The **`never`** type represents values that **never occur**.

It is used for functions that:

- **Never return a value**
- **Always throw an error**
- **Run in an infinite loop**

In simple terms:

> A function that never successfully finishes execution returns `never`.

---

# 2. Example of `never` Type (Error Throwing Function)

A function that always throws an error will have the `never` return type.

```typescript
function throwError(message: string): never {
  throw new Error(message);
}
```

Explanation:

- The function throws an error.
- Execution stops immediately.
- It never returns a value.

---

# 3. Example of `never` with Infinite Loop

If a function runs forever and never finishes, it returns `never`.

```typescript
function infiniteLoop(): never {
  while (true) {
    console.log("Running forever...");
  }
}
```

Explanation:

- The function never stops.
- It never reaches the end of execution.

---

# 4. `never` in Type Narrowing

The `never` type can appear when TypeScript determines that **a condition can never happen**.

Example:

```typescript
function processValue(value: string | number) {

  if (typeof value === "string") {
    console.log("String:", value);
  }

  else if (typeof value === "number") {
    console.log("Number:", value);
  }

  else {
    const neverValue: never = value;
  }

}
```

Explanation:

- `value` can only be `string` or `number`.
- The `else` block is impossible.
- TypeScript treats it as `never`.

---

# 5. Why Use the `never` Type?

The `never` type helps developers:

- Detect **unreachable code**
- Improve **type safety**
- Handle **unexpected cases**
- Write **more predictable programs**

It is commonly used in:

- Error handling
- Exhaustive checks
- Infinite processes

---

# 6. Difference Between `never` and `void`

| Feature | never | void |
|------|------|------|
| Meaning | Function never returns | Function returns nothing |
| Execution | Never completes | Completes normally |
| Example | Throw error / infinite loop | Console log function |

---

# 7. Example of `void`

```typescript
function logMessage(message: string): void {
  console.log(message);
}
```

Explanation:

- The function executes normally.
- It does not return any value.

---

# 8. Example Comparison

### `void`

```typescript
function sayHello(): void {
  console.log("Hello");
}
```

### `never`

```typescript
function crash(): never {
  throw new Error("Application crashed");
}
```

---

# 9. When Should You Use `never`?

Use `never` when:

- A function **always throws an error**
- A function **never finishes execution**
- You want to **ensure all cases are handled in a condition**
- You want **strict type checking**

---

# Interview Questions

### 1. What is the `never` type in TypeScript?

`never` represents values that **never occur**. It is used for functions that never return.

---

### 2. When should `never` be used?

- Functions that throw errors
- Infinite loops
- Exhaustive condition checks

---

### 3. What is the difference between `never` and `void`?

- `void` → function finishes execution but returns nothing  
- `never` → function never finishes execution

---

### 4. Can a function return `never` and still finish execution?

No. If a function returns `never`, it **cannot reach the end of execution**.

---

# Summary

- `never` represents values that **never occur**
- Used in **error functions and infinite loops**
- Helps detect **unreachable code**
- Different from `void`
- Useful for **type safety and strict checks**

---




