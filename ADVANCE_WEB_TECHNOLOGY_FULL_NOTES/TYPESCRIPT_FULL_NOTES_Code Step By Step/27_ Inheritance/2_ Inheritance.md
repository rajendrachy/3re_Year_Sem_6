# TypeScript Tutorial #26  
## Inheritance in TypeScript

Welcome to **TypeScript Tutorial #26**.  
In this tutorial, we will learn about **Inheritance**, a key concept in **Object-Oriented Programming (OOP)**.  
Inheritance allows a class to **reuse properties and methods** from another class.

---

# 1. What is Inheritance?

Inheritance allows a class (child/subclass) to **inherit properties and methods** from another class (parent/superclass).

- **Parent class** → base class with common properties/methods
- **Child class** → subclass that extends the parent and can add or override features

---

# 2. Using the `extends` Keyword

The **`extends` keyword** is used to create a subclass.

### Syntax

```typescript
class ParentClass {
  // properties and methods
}

class ChildClass extends ParentClass {
  // additional properties and methods
}
```

---

# 3. Basic Example

```typescript
class Person {
  name: string;

  constructor(name: string) {
    this.name = name;
  }

  greet() {
    console.log(`Hello, my name is ${this.name}`);
  }
}

class Employee extends Person {
  salary: number;

  constructor(name: string, salary: number) {
    super(name); // Call parent constructor
    this.salary = salary;
  }

  showSalary() {
    console.log(`Salary: ${this.salary}`);
  }
}

let emp = new Employee("Rahul", 50000);
emp.greet();       // Inherited from Person
emp.showSalary();  // Defined in Employee
```

Explanation:

- `Employee` **inherits** `greet()` from `Person`
- `super(name)` calls the **parent constructor**
- `Employee` adds a new method `showSalary()`

---

# 4. Method Overriding

A child class can **override parent methods**.

```typescript
class Person {
  greet() {
    console.log("Hello from Person");
  }
}

class Employee extends Person {
  greet() {
    console.log("Hello from Employee");
  }
}

let emp = new Employee();
emp.greet(); // "Hello from Employee"
```

---

# 5. Accessing Parent Methods

Even if a method is overridden, we can still call the **parent method** using `super`.

```typescript
class Person {
  greet() {
    console.log("Hello from Person");
  }
}

class Employee extends Person {
  greet() {
    super.greet();
    console.log("Hello from Employee");
  }
}

let emp = new Employee();
emp.greet();
// Output:
// Hello from Person
// Hello from Employee
```

---

# 6. Practical Example

```typescript
class Vehicle {
  brand: string;

  constructor(brand: string) {
    this.brand = brand;
  }

  showBrand() {
    console.log("Brand:", this.brand);
  }
}

class Car extends Vehicle {
  model: string;

  constructor(brand: string, model: string) {
    super(brand);
    this.model = model;
  }

  showDetails() {
    console.log(`Brand: ${this.brand}, Model: ${this.model}`);
  }
}

let car1 = new Car("Toyota", "Corolla");
car1.showBrand();   // Inherited from Vehicle
car1.showDetails(); // Defined in Car
```

---

# 7. Best Practices

1. Use inheritance to **reuse code** and avoid duplication
2. Keep parent classes **generic and reusable**
3. Use **method overriding** carefully
4. Always call `super()` when extending a class with a constructor

---

# Interview Questions

### 1. What is inheritance in TypeScript?

Inheritance allows a class to **inherit properties and methods** from another class using the `extends` keyword.

---

### 2. What is the purpose of `super()`?

`super()` calls the **parent class constructor** and initializes parent properties.

---

### 3. Can a subclass override parent methods?

Yes, a subclass can **override parent methods** and provide its own implementation.

---

### 4. Why use inheritance?

- Reuse common code  
- Create a clear class hierarchy  
- Follow object-oriented programming principles

---

# Summary

- Inheritance allows **code reuse** and better organization
- Use `extends` to create a subclass
- Use `super()` to call the parent constructor or method
- Child classes can **add or override** properties and methods
- Follow **best practices** for maintainable OOP code

---









