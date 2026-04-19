# TypeScript Tutorial #24  
## Classes in TypeScript

Welcome to **TypeScript Tutorial #24**.  
In this tutorial, we will learn about **Classes in TypeScript**, how to define them, use constructors, and follow best practices.

---

# 1. What are Classes in TypeScript?

A **class** is a blueprint for creating **objects** with:

- properties
- methods
- constructors

Classes allow us to **organize code** in an object-oriented way.

---

# 2. Defining a Basic Class

### Syntax

```typescript
class ClassName {
  propertyName: type;

  constructor(param: type) {
    this.propertyName = param;
  }

  methodName() {
    // code
  }
}
```

---

# 3. Example of a Class

```typescript
class Person {
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

let person1 = new Person("Rahul", 25);
person1.greet();
```

Explanation:

- `Person` class has **name** and **age**
- `constructor` initializes properties
- `greet()` is a method

---

# 4. Using Constructors

The **constructor** is a special method used to **initialize objects**.

Example:

```typescript
class Car {
  brand: string;

  constructor(brand: string) {
    this.brand = brand;
  }

  showBrand() {
    console.log("Car brand is " + this.brand);
  }
}

let car1 = new Car("Toyota");
car1.showBrand();
```

---

# 5. Class Methods

Methods are functions **inside a class**.

Example:

```typescript
class Calculator {
  add(a: number, b: number): number {
    return a + b;
  }
}

let calc = new Calculator();
console.log(calc.add(10, 20));
```

---

# 6. Best Practices for Classes

1. **Use constructors** to initialize properties
2. **Keep methods concise** and focused
3. **Use proper access modifiers** (`public`, `private`, `protected`)
4. **Use inheritance** for code reuse
5. **Follow naming conventions** for clarity

---

# 7. Real Example

```typescript
class Employee {
  private name: string;
  private salary: number;

  constructor(name: string, salary: number) {
    this.name = name;
    this.salary = salary;
  }

  showDetails() {
    console.log(`Employee: ${this.name}, Salary: ${this.salary}`);
  }
}

let emp1 = new Employee("Amit", 50000);
emp1.showDetails();
```

---

# Interview Questions

### 1. What is a class in TypeScript?

A class is a **blueprint for creating objects** with properties and methods.

---

### 2. What is a constructor?

A constructor is a **special method used to initialize object properties**.

---

### 3. How do you define methods in a class?

Methods are defined **inside the class body** and can access object properties.

---

### 4. What are best practices for using classes?

- Use constructors
- Use proper access modifiers
- Keep methods concise
- Use inheritance when needed
- Follow naming conventions

---

# Summary

- Classes are **blueprints for objects**
- **Constructor** initializes properties
- **Methods** define behaviors
- **Access modifiers** control property/method visibility
- Follow **best practices** for maintainable code

---















