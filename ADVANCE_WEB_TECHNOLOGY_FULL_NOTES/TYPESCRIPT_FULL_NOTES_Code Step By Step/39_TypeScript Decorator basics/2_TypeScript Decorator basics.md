# TypeScript Tutorial #38  
## Decorators in TypeScript

Welcome to **TypeScript Tutorial #38**.  
In this tutorial, we will learn about **Decorators**, a powerful feature used for **meta-programming** in TypeScript.

Decorators allow you to **add extra behavior to classes, methods, properties, or parameters** without modifying their original code.

---

# 1. What are Decorators?

A **Decorator** is a special kind of function that is applied to:

- Classes
- Methods
- Properties
- Parameters

Decorators use the **`@` symbol** before the declaration.

### Basic Idea

```typescript
@DecoratorName
class MyClass {}
```

Decorators **modify or extend the behavior** of the target.

---

# 2. Enabling Decorators in TypeScript

To use decorators, you must enable them in **tsconfig.json**.

```json
{
  "compilerOptions": {
    "experimentalDecorators": true
  }
}
```

---

# 3. Class Decorator Example

A **Class Decorator** is applied to a class and can modify the class behavior.

### Example

```typescript
function Logger(constructor: Function) {
  console.log("Class Created:", constructor.name);
}

@Logger
class Person {
  name = "Rahul";
}
```

Explanation:

- `@Logger` runs when the class is created
- It receives the **constructor function**

---

# 4. Property Decorator Example

Property decorators are applied to **class properties**.

```typescript
function LogProperty(target: any, propertyName: string) {
  console.log("Property:", propertyName);
}

class User {
  @LogProperty
  username: string = "Admin";
}
```

Explanation:

- Decorator runs when the property is defined
- Useful for **validation, logging, metadata**

---

# 5. Method Decorator Example

Method decorators modify or observe **class methods**.

```typescript
function LogMethod(target: any, methodName: string, descriptor: PropertyDescriptor) {
  console.log("Method:", methodName);
}

class Calculator {
  @LogMethod
  add(a: number, b: number) {
    return a + b;
  }
}
```

Explanation:

- `descriptor` allows modification of method behavior

---

# 6. Real-World Example

Decorators are heavily used in frameworks like **Angular** and **NestJS**.

Example in Angular:

```typescript
@Component({
  selector: 'app-root',
  template: '<h1>Hello World</h1>'
})
export class AppComponent {}
```

Here `@Component` is a **decorator**.

---

# 7. Benefits of Decorators

1. Add behavior without modifying original code  
2. Improve **code reusability**  
3. Used in **frameworks and large applications**  
4. Enable **meta-programming capabilities**  

---

# Interview Questions

### 1. What is a decorator in TypeScript?

A decorator is a **function that modifies classes, methods, or properties** using the `@` syntax.

---

### 2. How do you enable decorators?

Enable **`experimentalDecorators`** in `tsconfig.json`.

---

### 3. What are the types of decorators?

1. Class Decorators  
2. Method Decorators  
3. Property Decorators  
4. Parameter Decorators  

---

### 4. Where are decorators commonly used?

- Angular
- NestJS
- Dependency Injection
- Logging and validation systems

---

# Summary

- Decorators allow **modifying or extending behavior** of classes and members
- Use `@DecoratorName` syntax
- Must enable **experimentalDecorators** in TypeScript
- Common types: **Class, Method, Property, Parameter**
- Widely used in **modern frameworks like Angular and NestJS**

---





