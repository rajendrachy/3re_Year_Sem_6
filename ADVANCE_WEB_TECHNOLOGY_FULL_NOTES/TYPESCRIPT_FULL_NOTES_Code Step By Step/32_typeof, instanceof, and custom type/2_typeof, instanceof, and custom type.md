# TypeScript Tutorial #31  
## Type Guards in TypeScript

Welcome to **TypeScript Tutorial #31**.  
In this tutorial, we will learn about **Type Guards**, which help **narrow down types at runtime** for safer code execution.

---

# 1. What are Type Guards?

**Type Guards** are expressions that **perform runtime checks** to ensure a variable is of a specific type.  
They help TypeScript **narrow the type** inside a conditional block.

---

# 2. Using `typeof` for Type Guard

`typeof` checks the **primitive type** of a variable.

### Example

```typescript
function printValue(value: string | number) {
  if (typeof value === "string") {
    console.log("String value:", value.toUpperCase());
  } else {
    console.log("Number value:", value.toFixed(2));
  }
}

printValue("Hello");
printValue(123.456);
```

Explanation:

- `typeof value === "string"` → TypeScript knows `value` is string
- `typeof value === "number"` → TypeScript knows `value` is number

---

# 3. Using `instanceof` for Type Guard

`instanceof` checks if an object **is an instance of a specific class**.

### Example

```typescript
class Person {
  constructor(public name: string) {}
}

class Employee extends Person {
  constructor(name: string, public salary: number) {
    super(name);
  }
}

function printInfo(obj: Person) {
  if (obj instanceof Employee) {
    console.log(`Employee: ${obj.name}, Salary: ${obj.salary}`);
  } else {
    console.log(`Person: ${obj.name}`);
  }
}

let p1 = new Person("Rahul");
let e1 = new Employee("Amit", 50000);

printInfo(p1);
printInfo(e1);
```

Explanation:

- `obj instanceof Employee` ensures `obj` is **Employee type**
- Otherwise, TypeScript treats it as **Person**

---

# 4. Custom Type Guards

Custom type guards allow you to **define a function that checks a type**.

### Syntax

```typescript
function isType(obj: any): obj is Type {
  // return true if obj is Type
}
```

### Example

```typescript
interface Cat {
  meow(): void;
}

interface Dog {
  bark(): void;
}

function isCat(animal: Cat | Dog): animal is Cat {
  return (animal as Cat).meow !== undefined;
}

function makeSound(animal: Cat | Dog) {
  if (isCat(animal)) {
    animal.meow();
  } else {
    animal.bark();
  }
}
```

Explanation:

- `animal is Cat` tells TypeScript that inside `if` block, `animal` is of type `Cat`
- Allows safe property access without type errors

---

# 5. Real-World Example

```typescript
type Shape = Circle | Rectangle;

interface Circle {
  radius: number;
}

interface Rectangle {
  width: number;
  height: number;
}

function isCircle(shape: Shape): shape is Circle {
  return (shape as Circle).radius !== undefined;
}

function area(shape: Shape) {
  if (isCircle(shape)) {
    return Math.PI * shape.radius * shape.radius;
  } else {
    return shape.width * shape.height;
  }
}
```

- Custom type guard `isCircle` narrows `Shape` to `Circle`
- Helps **safely calculate area** depending on type

---

# 6. Best Practices

1. Use **`typeof`** for primitive types (`string`, `number`, `boolean`)
2. Use **`instanceof`** for class instances
3. Use **custom type guards** for interfaces or complex types
4. Always **narrow the type** before accessing type-specific properties

---

# Interview Questions

### 1. What is a type guard?

A **type guard** is a runtime check that **narrows the type** of a variable inside a block.

---

### 2. How to use `typeof` for type guard?

```typescript
if (typeof value === "string") {
  // value is string here
}
```

---

### 3. How to use `instanceof` for type guard?

```typescript
if (obj instanceof ClassName) {
  // obj is ClassName type here
}
```

---

### 4. What is a custom type guard?

A custom function that returns `obj is Type` and **narrows complex types or interfaces**.

---

# Summary

- Type guards help **safely work with multiple types**
- Use `typeof` for **primitives**, `instanceof` for **class objects**
- Custom type guards allow **interface and complex type checks**
- Improves **type safety and avoids runtime errors**

---











