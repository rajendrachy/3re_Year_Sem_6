# TypeScript Tutorial #20  
## Intersection Types in TypeScript

Welcome to the **20th episode of our TypeScript Tutorial Series**.  
In this tutorial, we will learn about **Intersection Types**, how they work, and how they differ from **Union Types**.

Intersection types allow you to **combine multiple types into a single type**.

---

# 1. What are Intersection Types?

An **Intersection Type** combines **two or more types into one**.

This means the resulting type will contain **all properties from the combined types**.

It is defined using the **`&` (ampersand) operator**.

### Syntax

```typescript
type NewType = Type1 & Type2;
```

The new type will include **all properties from both Type1 and Type2**.

---

# 2. Basic Example of Intersection Types

```typescript
type Person = {
  name: string;
};

type Employee = {
  salary: number;
};

type Staff = Person & Employee;

let staffMember: Staff = {
  name: "Rahul",
  salary: 50000
};
```

Explanation:

`Staff` includes:

- `name` from **Person**
- `salary` from **Employee**

---

# 3. Using Intersection Types with Interfaces

Intersection types can also be used with interfaces.

### Example

```typescript
interface User {
  name: string;
}

interface Admin {
  role: string;
}

type AdminUser = User & Admin;

let admin: AdminUser = {
  name: "Amit",
  role: "Manager"
};
```

The object must contain **all properties from both interfaces**.

---

# 4. Intersection Types with Functions

Intersection types can also define combined function parameter types.

### Example

```typescript
type A = {
  name: string;
};

type B = {
  age: number;
};

function printUser(user: A & B) {
  console.log(user.name);
  console.log(user.age);
}

printUser({
  name: "Rahul",
  age: 25
});
```

Explanation:

The function requires an object that has **both name and age**.

---

# 5. Practical Example

```typescript
type Contact = {
  email: string;
};

type Profile = {
  username: string;
};

type UserAccount = Contact & Profile;

let account: UserAccount = {
  email: "user@email.com",
  username: "typescriptUser"
};
```

Here the object must contain:

- email
- username

---

# 6. Difference Between Intersection and Union Types

| Feature | Union Type (`|`) | Intersection Type (`&`) |
|------|------|------|
| Meaning | One of multiple types | All combined types |
| Operator | `|` | `&` |
| Required properties | Only one type | All types |
| Flexibility | More flexible | More strict |

### Union Example

```typescript
let value: string | number;

value = "Hello";
value = 10;
```

### Intersection Example

```typescript
type A = { name: string };
type B = { age: number };

let obj: A & B = {
  name: "Rahul",
  age: 25
};
```

---

# 7. When to Use Intersection Types

Use intersection types when:

- You want to **combine multiple object types**
- You need **all properties from multiple types**
- You want to create **reusable type compositions**
- You are building **complex data models**

---

# Interview Questions

### 1. What is an Intersection Type in TypeScript?

An **Intersection Type** combines multiple types into one using the `&` operator.

Example:

```
TypeA & TypeB
```

---

### 2. What operator is used for Intersection Types?

The **`&` (ampersand)** operator.

---

### 3. What is the difference between Union and Intersection Types?

- **Union (`|`)** → allows one of multiple types  
- **Intersection (`&`)** → requires all combined types

---

### 4. Can Intersection Types combine interfaces?

Yes, intersection types can combine **interfaces, object types, or both**.

---

# Summary

- Intersection types combine **multiple types into one**
- Defined using the **`&` operator**
- The resulting type must contain **all properties from the combined types**
- Useful for **complex object structures**
- Different from **Union Types**, which allow multiple possible types

---











