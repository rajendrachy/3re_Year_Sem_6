# TypeScript Tutorial #39  
## Override Function with Decorator in TypeScript

Welcome to **TypeScript Tutorial #39**.  
In this tutorial, we will learn how to **override or modify a function using Method Decorators** in TypeScript.

Decorators allow us to **intercept, modify, or replace method implementations** without changing the original class code.

---

# 1. What is a Method Decorator?

A **Method Decorator** is applied to a **class method** and allows us to:

- Observe the method
- Modify its behavior
- Replace the function implementation

### Syntax

```typescript
function decoratorName(
  target: any,
  methodName: string,
  descriptor: PropertyDescriptor
) {
  // modify descriptor.value
}
```

Explanation of parameters:

| Parameter | Description |
|-----------|-------------|
| `target` | The prototype of the class |
| `methodName` | Name of the method |
| `descriptor` | Contains method definition |

---

# 2. Basic Method Decorator Example

```typescript
function LogMethod(target: any, methodName: string, descriptor: PropertyDescriptor) {
  console.log("Method decorated:", methodName);
}

class Calculator {
  @LogMethod
  add(a: number, b: number) {
    return a + b;
  }
}
```

Explanation:

- When the class is created, the decorator runs
- Logs the method name

---

# 3. Overriding Function Using Decorator

We can override the method by modifying **`descriptor.value`**.

### Example

```typescript
function OverrideMethod(target: any, methodName: string, descriptor: PropertyDescriptor) {
  const originalMethod = descriptor.value;

  descriptor.value = function (...args: any[]) {
    console.log("Method called with arguments:", args);

    const result = originalMethod.apply(this, args);

    console.log("Original result:", result);

    return result * 2; // Override behavior
  };
}

class Calculator {
  @OverrideMethod
  multiply(a: number, b: number) {
    return a * b;
  }
}

const calc = new Calculator();
console.log(calc.multiply(2, 3));
```

Output conceptually:

```
Method called with arguments: [2,3]
Original result: 6
12
```

Explanation:

- The decorator intercepts the method call
- Executes original method
- Modifies the result before returning

---

# 4. Real-World Use Cases

Decorators for function overriding are commonly used for:

### Logging

```typescript
@LogExecution
function processData() {}
```

### Validation

```typescript
@ValidateInput
function createUser() {}
```

### Authorization

```typescript
@Authorize("admin")
function deleteUser() {}
```

### Performance Monitoring

```typescript
@MeasureTime
function heavyTask() {}
```

---

# 5. Best Practices

1. Keep decorators **simple and reusable**
2. Avoid complex business logic inside decorators
3. Always preserve the **original method behavior**
4. Use decorators for **cross-cutting concerns** like logging or validation
5. Ensure **proper typing** for method parameters

---

# Interview Questions

### 1. What is a method decorator?

A method decorator is a function that **modifies or observes a class method** using the `@` syntax.

---

### 2. How do you override a function using a decorator?

Override the method by modifying:

```typescript
descriptor.value
```

---

### 3. What is `PropertyDescriptor`?

`PropertyDescriptor` is an object that defines how a property behaves.  
It contains properties like:

- `value`
- `writable`
- `enumerable`
- `configurable`

---

### 4. What are real-world uses of decorators?

- Logging
- Input validation
- Authorization
- Performance tracking
- Dependency injection

---

# Summary

- Method decorators allow **intercepting and modifying class methods**
- Override methods by changing **`descriptor.value`**
- Useful for **logging, validation, monitoring**
- Promotes **clean and reusable code**
- Commonly used in **large frameworks and enterprise applications**

---







