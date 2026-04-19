# TypeScript Tutorial #28  
## Getter and Setter in TypeScript

Welcome to **TypeScript Tutorial #28**.  
In this tutorial, we will learn about **Getters and Setters**, which help **encapsulate data** within a class and control access to class properties.

---

# 1. What is a Getter?

A **getter** is a method that **retrieves the value of a property**.  
It allows us to **access private properties safely**.

### Syntax

```typescript
get propertyName() {
  // return value
}
```

### Example

```typescript
class Person {
  private _name: string;

  constructor(name: string) {
    this._name = name;
  }

  // Getter
  get name() {
    return this._name;
  }
}

let person = new Person("Rahul");
console.log(person.name); // Access via getter
```

Explanation:

- `_name` is **private**
- `get name()` allows **safe read access** to `_name`

---

# 2. What is a Setter?

A **setter** is a method that **sets or updates the value of a property**.  
It allows us to **control or validate data** before storing it.

### Syntax

```typescript
set propertyName(value: type) {
  // set value
}
```

### Example

```typescript
class Person {
  private _age: number = 0;

  // Setter
  set age(value: number) {
    if (value > 0) {
      this._age = value;
    } else {
      console.log("Invalid age");
    }
  }

  // Getter
  get age() {
    return this._age;
  }
}

let person = new Person();
person.age = 25; // Calls setter
console.log(person.age); // Calls getter
person.age = -5; // Invalid age
```

Explanation:

- `_age` is **private**
- `set age(value)` **validates** before updating
- `get age()` returns the value

---

# 3. Benefits of Getters and Setters

1. Encapsulation – hide internal implementation
2. Validation before setting values
3. Controlled access to private properties
4. Improve maintainability and readability

---

# 4. Real Example

```typescript
class BankAccount {
  private _balance: number = 0;

  // Getter
  get balance() {
    return this._balance;
  }

  // Setter
  set deposit(amount: number) {
    if (amount > 0) {
      this._balance += amount;
    } else {
      console.log("Deposit must be positive");
    }
  }
}

let account = new BankAccount();
account.deposit = 1000; // Setter
console.log(account.balance); // Getter
account.deposit = -500; // Invalid
```

---

# Interview Questions

### 1. What is a getter in TypeScript?

A getter is a method that **retrieves the value of a property** and allows safe read access.

---

### 2. What is a setter in TypeScript?

A setter is a method that **sets or updates the value of a property**, allowing validation or control.

---

### 3. Why use getters and setters?

- To **encapsulate data**
- To **control access and modifications**
- To **validate values** before updating
- To improve **code maintainability**

---

### 4. How do you define a getter and setter?

- Use `get propertyName()` for getter  
- Use `set propertyName(value)` for setter

---

# Summary

- Getters and setters allow **controlled access** to private properties
- **Getters** retrieve values
- **Setters** update values with validation
- They promote **encapsulation and maintainability** in OOP

---











