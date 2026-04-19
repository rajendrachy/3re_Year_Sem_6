# TypeScript Tutorial #29  
## Interface with Class in TypeScript

Welcome to **TypeScript Tutorial #29**.  
In this tutorial, we will learn how **Interfaces can work with Classes** in TypeScript to enforce structure and ensure type safety.

---

# 1. What is an Interface with Class?

An **Interface** defines a **contract** that a class must follow.  
When a class implements an interface, it must provide **all properties and methods defined in the interface**.

### Syntax

```typescript
interface InterfaceName {
  property: type;
  method(): returnType;
}

class ClassName implements InterfaceName {
  // Must implement all properties and methods
}
```

---

# 2. Example of Interface with Class

```typescript
interface PersonInterface {
  name: string;
  age: number;
  greet(): void;
}

class Person implements PersonInterface {
  name: string;
  age: number;

  constructor(name: string, age: number) {
    this.name = name;
    this.age = age;
  }

  greet() {
    console.log(`Hello, my name is ${this.name}`);
  }
}

let person = new Person("Rahul", 25);
person.greet();
```

Explanation:

- `PersonInterface` defines **name, age, and greet()**
- `Person` class **implements all interface members**
- Ensures **type safety** and consistent structure

---

# 3. Interface with Optional Properties

Interfaces can have **optional properties** using `?`.

```typescript
interface PersonInterface {
  name: string;
  age?: number;
}

class Person implements PersonInterface {
  name: string;
  constructor(name: string) {
    this.name = name;
  }
}

let p1 = new Person("Amit");
```

Explanation:

- `age` is optional
- Class only needs to implement **required members**

---

# 4. Multiple Interfaces

A class can implement **multiple interfaces** using a comma-separated list.

```typescript
interface PersonInterface {
  name: string;
  greet(): void;
}

interface EmployeeInterface {
  salary: number;
  showSalary(): void;
}

class Employee implements PersonInterface, EmployeeInterface {
  name: string;
  salary: number;

  constructor(name: string, salary: number) {
    this.name = name;
    this.salary = salary;
  }

  greet() {
    console.log(`Hello, ${this.name}`);
  }

  showSalary() {
    console.log(`Salary: ${this.salary}`);
  }
}

let emp = new Employee("Amit", 50000);
emp.greet();
emp.showSalary();
```

---

# 5. Real-World Use Case

- Enforcing consistent structure in **large projects**
- Ensuring that **classes follow certain rules**
- Useful in **OOP design patterns** like service or repository classes

---

# Interview Questions

### 1. How does a class implement an interface?

- Use the `implements` keyword
- Class must provide all **properties and methods** defined in the interface

---

### 2. Can a class implement multiple interfaces?

Yes, a class can implement **multiple interfaces** separated by commas.

---

### 3. What is the benefit of using interface with class?

- Enforces **consistent structure**
- Provides **type safety**
- Helps in **maintainable and scalable code**

---

### 4. Can interface properties be optional?

Yes, optional properties are defined using the `?` symbol.

---

# Summary

- Interfaces define a **contract** for classes
- Classes use `implements` to follow that contract
- Ensures **all required properties and methods** are present
- Classes can implement **multiple interfaces**
- Optional properties in interfaces are **not required in the class**

---










