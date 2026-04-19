# TypeScript Tutorial #36  
## Utility Types Part-2 in TypeScript

Welcome to **TypeScript Tutorial #36**.  
In this tutorial, we continue learning **Utility Types** to simplify **type transformations** and make TypeScript code **more readable and maintainable**.

---

# 1. Introduction

- **Utility Types** help modify or compose existing types  
- Part-2 covers **more advanced utility types**  
- Useful for **complex applications and reusable components**

---

# 2. `Omit<Type, Keys>`

- Creates a type by **removing specific properties** from an existing type  
- Opposite of `Pick<Type, Keys>`

### Example

```typescript
interface User {
  id: number;
  name: string;
  email: string;
  password: string;
}

type PublicUser = Omit<User, "password">;

const user: PublicUser = {
  id: 1,
  name: "Rahul",
  email: "rahul@example.com",
  // password: "1234" // ❌ Error
};
```

---

# 3. `Exclude<Type, ExcludedUnion>`

- Removes **specific union members** from a type  
- Useful for narrowing union types

### Example

```typescript
type Role = "admin" | "user" | "guest";

type NonAdmin = Exclude<Role, "admin">; 
// "user" | "guest"
```

---

# 4. `Extract<Type, Union>`

- Extracts **only the members of a union type** that are assignable to another type

### Example

```typescript
type Role = "admin" | "user" | "guest";

type AdminOrUser = Extract<Role, "admin" | "user">; 
// "admin" | "user"
```

---

# 5. `NonNullable<Type>`

- Removes **`null` and `undefined`** from a type  
- Useful for stricter type safety

### Example

```typescript
type UserId = string | null | undefined;

type ValidUserId = NonNullable<UserId>; 
// string
```

---

# 6. `ReturnType<Type>`

- Extracts the **return type of a function**

### Example

```typescript
function getUser() {
  return { id: 1, name: "Rahul" };
}

type UserReturn = ReturnType<typeof getUser>;
// { id: number; name: string }
```

---

# 7. `InstanceType<Type>`

- Extracts the **instance type** from a class constructor type

### Example

```typescript
class Person {
  constructor(public name: string, public age: number) {}
}

type PersonInstance = InstanceType<typeof Person>;

const p: PersonInstance = new Person("Amit", 25);
```

---

# 8. Benefits of Advanced Utility Types

1. Create **flexible, type-safe transformations**  
2. Avoid **duplicate code** and manual type definitions  
3. Improve **code readability and maintainability**  
4. Essential for **large-scale TypeScript projects**  

---

# Interview Questions

### 1. What is `Omit` used for?

Removes specific properties from a type to create a **subset type**.

---

### 2. Difference between `Exclude` and `Extract`?

- `Exclude` → removes members from a union  
- `Extract` → keeps only the members present in another union

---

### 3. What does `NonNullable` do?

Removes `null` and `undefined` from a type to ensure **valid values only**.

---

### 4. How to get the return type of a function?

Use **`ReturnType<typeof functionName>`**.

---

### 5. How to get the instance type of a class?

Use **`InstanceType<typeof ClassName>`**.

---

# Summary

- Utility Types Part-2 provides **advanced type transformations**  
- Includes: `Omit`, `Exclude`, `Extract`, `NonNullable`, `ReturnType`, `InstanceType`  
- Helps create **type-safe, reusable, and maintainable code**  
- Key tool for **professional TypeScript development**

---








