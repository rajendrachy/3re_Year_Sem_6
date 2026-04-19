# TypeScript Tutorial #15  
## Function Return Type

---

# 1. What is a Return Type in TypeScript?

A **return type** in TypeScript defines **what type of value a function will return** after execution.

It helps TypeScript ensure that the function always returns the **correct data type**.

### Syntax

```typescript
function functionName(): returnType {
  // code
}
```

---

# 2. Example of Function Return Type

```typescript
function add(a: number, b: number): number {
  return a + b;
}
```

Explanation:

- `a` and `b` are numbers
- The function returns a **number**
- TypeScript will show an error if something else is returned

---

# 3. Using `string` as Return Type

```typescript
function getMessage(): string {
  return "Hello TypeScript";
}
```

Here the function always returns a **string value**.

---

# 4. Using `number` as Return Type

```typescript
function multiply(a: number, b: number): number {
  return a * b;
}
```

The return value is a **number**.

---

# 5. Using Union Types with Return Type

Sometimes a function may return **multiple types of values**.

In that case we use **Union Types**.

### Example

```typescript
function getValue(value: number): string | number {
  
  if (value > 10) {
    return "Greater than 10";
  }

  return value;
}
```

Explanation:

The function can return:

- `string`
- `number`

So the return type is:

```
string | number
```

---

# 6. Using `void` Return Type

The **`void`** return type means that **the function does not return any value**.

It only performs an action.

### Example

```typescript
function printMessage(message: string): void {
  console.log(message);
}
```

Explanation:

- The function prints a message
- It does **not return anything**

---

# 7. What is the `any` Return Type?

The **`any`** return type means the function can return **any type of value**.

However, this **removes type safety**, so it should be used carefully.

### Example

```typescript
function getData(): any {
  return "Hello";
}
```

Later the function could also return:

```typescript
return 100;
return true;
```

TypeScript will not show errors.

---

# 8. When Should You Use `any`?

You should use `any` only in special situations such as:

- When the return type is unknown
- When working with external libraries
- During JavaScript to TypeScript migration
- When handling dynamic API responses

Example:

```typescript
function fetchData(): any {
  return fetch("api/data");
}
```

---

# 9. Return Type Inference

If you do not define the return type, TypeScript will **automatically detect it**.

Example:

```typescript
function sum(a: number, b: number) {
  return a + b;
}
```

TypeScript automatically understands that the return type is **number**.

---

# 10. Real Example

```typescript
function checkAge(age: number): string | boolean {

  if (age >= 18) {
    return "Adult";
  }

  return false;
}
```

The function may return:

- `"Adult"` (string)
- `false` (boolean)

So the return type is:

```
string | boolean
```

---

# Interview Questions

### 1. What is a return type in TypeScript?

A return type defines the **type of value that a function returns**.

---

### 2. Why should we define return types?

To ensure **type safety and predictable function outputs**.

---

### 3. What does `void` mean in TypeScript functions?

`void` means the function **does not return any value**.

---

### 4. What is a union return type?

A union return type allows a function to return **multiple types of values**.

Example:

```
string | number
```

---

### 5. When should `any` be used as a return type?

Only when the **type of the returned data is unknown or dynamic**.

---

# Summary

- Return types define **what a function returns**
- Common return types include:
  - `string`
  - `number`
  - `boolean`
  - `void`
  - `any`
- Use **union types** when multiple return values are possible
- Avoid using **`any`** whenever possible
- TypeScript can also **infer return types automatically**

---












