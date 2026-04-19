# TypeScript Tutorial #19  
## Interface in TypeScript

In this tutorial, we will learn about **Interfaces in TypeScript**.  
Interfaces help define the **structure of objects** and make code more organized, reusable, and type-safe.

---

# 1. What is an Interface?

An **Interface** in TypeScript is used to define the **shape or structure of an object**.

It specifies **what properties and types an object should have**, but it does not provide the actual implementation.

In simple words:

> An interface is a blueprint for an object.

---

# 2. Syntax of Interface

```typescript
interface InterfaceName {
  propertyName: type;
}
```

The interface defines the **expected properties and their types**.

---

# 3. Define an Interface

### Example

```typescript
interface User {
  name: string;
  age: number;
}
```

Explanation:

The `User` interface defines that an object must have:

- `name` → string
- `age` → number

---

# 4. Using an Interface

You can use an interface to type objects.

### Example

```typescript
interface User {
  name: string;
  age: number;
}

let user1: User = {
  name: "Rahul",
  age: 25
};
```

Explanation:

The object `user1` must follow the **structure defined by the interface**.

If a property is missing or has the wrong type, TypeScript will show an error.

---

# 5. Optional Properties in Interface

Interfaces can also define **optional properties** using the `?` symbol.

### Example

```typescript
interface User {
  name: string;
  age?: number;
}

let user1: User = {
  name: "Amit"
};
```

Explanation:

- `name` is required
- `age` is optional

---

# 6. Interface with Functions

Interfaces can also define **function structures**.

### Example

```typescript
interface AddFunction {
  (a: number, b: number): number;
}

let add: AddFunction = function (a, b) {
  return a + b;
};
```

---

# 7. Extending an Interface

Interfaces can **extend other interfaces**.

This allows us to reuse properties from another interface.

### Syntax

```typescript
interface NewInterface extends ExistingInterface {
}
```

### Example

```typescript
interface Person {
  name: string;
}

interface Employee extends Person {
  salary: number;
}

let emp: Employee = {
  name: "Rahul",
  salary: 50000
};
```

Explanation:

The `Employee` interface now includes:

- `name` (from Person)
- `salary`

---

# 8. Multiple Interface Extension

An interface can extend **multiple interfaces**.

### Example

```typescript
interface A {
  name: string;
}

interface B {
  age: number;
}

interface C extends A, B {}

let obj: C = {
  name: "Rahul",
  age: 25
};
```

---

# 9. Real Example

```typescript
interface Product {
  id: number;
  name: string;
  price: number;
}

let product1: Product = {
  id: 1,
  name: "Laptop",
  price: 60000
};
```

---

# Interview Questions

### 1. What is an Interface in TypeScript?

An **interface** defines the **structure of an object**, including property names and their types.

---

### 2. Why are interfaces used?

Interfaces help:

- Define object structure
- Improve code readability
- Increase code reusability
- Provide better type safety

---

### 3. What is an optional property in an interface?

An optional property is defined using the **`?` symbol** and is not required in the object.

Example:

```
age?: number
```

---

### 4. What is Interface Extension?

Interface extension allows one interface to **inherit properties from another interface** using the `extends` keyword.

---

### 5. Can an interface extend multiple interfaces?

Yes, an interface can extend multiple interfaces.

Example:

```
interface C extends A, B
```

---

# Summary

- Interfaces define the **structure of objects**
- They improve **type safety and code readability**
- Optional properties can be defined using **`?`**
- Interfaces can **extend other interfaces**
- They are widely used in **large TypeScript applications**

---










