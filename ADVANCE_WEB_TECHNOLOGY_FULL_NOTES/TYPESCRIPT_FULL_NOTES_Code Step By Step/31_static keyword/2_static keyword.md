# TypeScript Tutorial #30  
## Static Keyword in TypeScript

Welcome to **TypeScript Tutorial #30**.  
In this tutorial, we will learn about the **`static` keyword**, how to use it for **properties and methods**, and its advantages in TypeScript.

---

# 1. What is the `static` Keyword?

The **`static` keyword** allows a property or method to belong to the **class itself**, rather than to instances of the class.

- **Static members** are shared across all instances
- Can be accessed **without creating an object** of the class

---

# 2. Why Use `static`?

- To store **class-level data** shared among all instances
- To define **utility functions** related to the class
- Avoid creating unnecessary objects for common methods or constants

---

# 3. How to Use Static Property

```typescript
class Circle {
  static pi: number = 3.14159;

  radius: number;

  constructor(radius: number) {
    this.radius = radius;
  }

  area(): number {
    return Circle.pi * this.radius * this.radius;
  }
}

console.log(Circle.pi); // Access static property without object

let c1 = new Circle(5);
console.log(c1.area());
```

Explanation:

- `pi` is **static**, shared by all Circle objects
- Accessed as `Circle.pi` (not via instance)

---

# 4. How to Use Static Methods

```typescript
class MathUtils {
  static add(a: number, b: number): number {
    return a + b;
  }
}

console.log(MathUtils.add(10, 20)); // Call static method without object
```

Explanation:

- `add` is static and can be called **directly from the class**
- No need to create an instance of `MathUtils`

---

# 5. Real-World Example

```typescript
class BankAccount {
  static bankName: string = "ABC Bank";

  accountNumber: string;

  constructor(accountNumber: string) {
    this.accountNumber = accountNumber;
  }

  static getBankInfo() {
    return `Bank: ${BankAccount.bankName}`;
  }
}

console.log(BankAccount.bankName);
console.log(BankAccount.getBankInfo());

let acc1 = new BankAccount("12345");
let acc2 = new BankAccount("67890");
```

- `bankName` is shared by all accounts
- `getBankInfo()` can be called without any object

---

# 6. Advantages of Static Keyword

1. Saves memory because shared among all instances
2. Provides **class-level constants**
3. Useful for **utility functions** that don't depend on instance
4. Improves **code readability and maintainability**

---

# Interview Questions

### 1. What is a static property in TypeScript?

A **static property** belongs to the class itself, not to its instances.

---

### 2. How do you access a static method or property?

- Use `ClassName.property` or `ClassName.method()`
- No object creation is required

---

### 3. Can static members be accessed from instance?

No, static members **cannot be accessed using an instance**.

---

### 4. Why use the static keyword?

- For class-level data shared across all instances
- For utility methods related to the class
- To save memory and improve organization

---

# Summary

- `static` members belong to the **class**, not instances
- Can be **properties or methods**
- Accessed using `ClassName.member`
- Useful for **shared data and utility functions**
- Helps improve **memory usage, readability, and maintainability**

---














