# TypeScript Tutorial #22  
## Enums in TypeScript

Welcome to the **22nd video of our TypeScript Tutorial Series**.  
In this tutorial, we will learn about **Enums in TypeScript**. Enums help us define **a set of named constants**, which makes our code easier to read and maintain.

---

# 1. What is an Enum Type?

An **Enum (Enumeration)** is a special type in TypeScript that allows us to define **a collection of related constants**.

Enums make code **more readable and organized** by replacing numeric or string values with meaningful names.

Example:

Instead of writing:

```
status = 0
status = 1
status = 2
```

We can write:

```
Status.Pending
Status.Approved
Status.Rejected
```

---

# 2. How to Define Enums

Enums are defined using the **`enum` keyword**.

### Syntax

```typescript
enum EnumName {
  Value1,
  Value2,
  Value3
}
```

### Example

```typescript
enum Direction {
  Up,
  Down,
  Left,
  Right
}
```

Explanation:

TypeScript automatically assigns numeric values:

```
Up = 0
Down = 1
Left = 2
Right = 3
```

---

# 3. How to Use Enums

Once an enum is defined, we can use it like a type.

### Example

```typescript
enum Direction {
  Up,
  Down,
  Left,
  Right
}

let move: Direction = Direction.Up;

console.log(move);
```

---

# 4. Enum with Custom Values

We can also assign **custom numeric values**.

### Example

```typescript
enum Status {
  Pending = 1,
  Approved = 2,
  Rejected = 3
}

let currentStatus: Status = Status.Approved;
```

---

# 5. String Enums

Enums can also store **string values**.

### Example

```typescript
enum Role {
  Admin = "ADMIN",
  User = "USER",
  Guest = "GUEST"
}

let userRole: Role = Role.Admin;
```

Explanation:

Each enum value is assigned a **string constant**.

---

# 6. Using Enums in Functions

Enums can be used as function parameters.

### Example

```typescript
enum Direction {
  Up,
  Down,
  Left,
  Right
}

function movePlayer(direction: Direction) {
  console.log("Moving:", direction);
}

movePlayer(Direction.Left);
```

---

# 7. Real Example

```typescript
enum PaymentStatus {
  Pending,
  Completed,
  Failed
}

function checkPayment(status: PaymentStatus) {

  if (status === PaymentStatus.Completed) {
    console.log("Payment successful");
  }

}
```

---

# Interview Questions

### 1. What is an Enum in TypeScript?

An **Enum** is a special data type used to define a **set of named constants**.

---

### 2. Why are Enums used?

Enums help:

- Improve code readability
- Organize related constants
- Avoid using magic numbers or strings

---

### 3. What keyword is used to define enums?

The **`enum` keyword**.

---

### 4. Can enums store string values?

Yes. TypeScript supports **string enums**.

Example:

```
enum Role {
  Admin = "ADMIN"
}
```

---

### 5. What is the default value of enums?

By default, enums start from **0** and increase by **1**.

Example:

```
Up = 0
Down = 1
Left = 2
Right = 3
```

---

# Summary

- Enums define **a set of named constants**
- Declared using the **`enum` keyword**
- Improve **readability and maintainability**
- Can contain:
  - numeric values
  - string values
- Often used for **status values, roles, and fixed options**

---







