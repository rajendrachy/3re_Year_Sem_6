
# TypeScript Tutorial #21  
## Types in TypeScript

In this tutorial, we will learn about **Types in TypeScript**.  
Types are one of the most important features of TypeScript because they help ensure **type safety**, improve **code readability**, and reduce **runtime errors**.

---

# 1. What is a Type?

A **Type** defines the **kind of value a variable can store**.

TypeScript uses types to check whether the correct type of data is used in the code.

Example of basic types:

- `string`
- `number`
- `boolean`
- `array`
- `object`
- `any`
- `unknown`
- `void`
- `never`

### Example

```typescript
let name: string = "Rahul";
let age: number = 25;
let isAdmin: boolean = false;
```

Explanation:

- `name` must be a **string**
- `age` must be a **number**
- `isAdmin` must be a **boolean**

---

# 2. Define a Custom Type

In TypeScript, we can create our own **custom types** using the `type` keyword.

This is called a **Type Alias**.

### Syntax

```typescript
type TypeName = {
  property: type;
};
```

---

# 3. Example of Defining a Type

```typescript
type User = {
  name: string;
  age: number;
};
```

Here we defined a **custom type called `User`**.

---

# 4. How to Use a Type

Once a type is defined, it can be used to create variables or objects.

### Example

```typescript
type User = {
  name: string;
  age: number;
};

let user1: User = {
  name: "Amit",
  age: 25
};
```

Explanation:

The object `user1` must follow the structure defined by the `User` type.

---

# 5. Using Type with Union Types

Types can also combine multiple data types.

### Example

```typescript
type ID = string | number;

let userId: ID;

userId = 101;
userId = "A102";
```

Explanation:

`ID` can be either:

- string
- number

---

# 6. Using Type with Functions

Types can also define function structures.

### Example

```typescript
type AddFunction = (a: number, b: number) => number;

let add: AddFunction = (x, y) => {
  return x + y;
};
```

---

# 7. Difference Between `interface` and `type`

| Feature | Interface | Type |
|------|------|------|
| Purpose | Defines object structure | Defines any type |
| Declaration | `interface` keyword | `type` keyword |
| Extension | Uses `extends` | Uses `&` (intersection) |
| Flexibility | Mostly for objects | Can represent unions, primitives, etc |

### Interface Example

```typescript
interface User {
  name: string;
  age: number;
}
```

### Type Example

```typescript
type User = {
  name: string;
  age: number;
};
```

---

# 8. When to Use `type`?

Use `type` when:

- Creating **union types**
- Creating **function types**
- Creating **complex type combinations**
- Defining **custom aliases**

---

# Interview Questions

### 1. What is a Type in TypeScript?

A type defines **what kind of value a variable can store**.

---

### 2. What is a Type Alias?

A **Type Alias** is a custom type created using the `type` keyword.

Example:

```
type User = { name: string; age: number }
```

---

### 3. What is the difference between `type` and `interface`?

- `interface` is mainly used for **object structures**
- `type` is more flexible and can define **unions, primitives, and functions**

---

### 4. Can `type` be used for union types?

Yes.

Example:

```
type ID = string | number
```

---

# Summary

- Types define the **kind of value a variable can store**
- Custom types can be created using the **`type` keyword**
- Types improve **code safety and readability**
- Types can define:
  - objects
  - functions
  - unions
- `type` is more flexible compared to `interface`

---












