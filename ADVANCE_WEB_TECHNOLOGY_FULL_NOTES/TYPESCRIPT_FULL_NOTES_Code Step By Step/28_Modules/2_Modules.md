# TypeScript Tutorial #27  
## Modules in TypeScript

Welcome to **TypeScript Tutorial #27**.  
In this tutorial, we will learn about **Modules in TypeScript**, which help organize and reuse code efficiently.

---

# 1. What are Modules?

Modules are **self-contained pieces of code** that can:

- Export variables, functions, classes, or interfaces
- Be imported in other files
- Help keep code **organized and maintainable**

---

# 2. Creating and Exporting Modules

You can **export** code from a file using **`export` keyword**.

### Example (module.ts)

```typescript
// Exporting a function
export function greet(name: string) {
  console.log("Hello " + name);
}

// Exporting a variable
export const pi = 3.14159;

// Exporting a class
export class Person {
  constructor(public name: string) {}
}
```

---

# 3. Importing Modules

You can **import code** from another module using the **`import` keyword**.

### Named Import

```typescript
import { greet, pi } from "./module";

greet("Rahul");
console.log(pi);
```

### Importing Everything as a Namespace

```typescript
import * as Utils from "./module";

Utils.greet("Amit");
console.log(Utils.pi);
```

---

# 4. Default Exports

You can also export a **default value** from a module.

### module.ts

```typescript
export default function sayHello() {
  console.log("Hello!");
}
```

### Importing Default Export

```typescript
import sayHello from "./module";

sayHello();
```

---

# 5. Combining Named and Default Exports

```typescript
export default class Person {
  constructor(public name: string) {}
}

export const pi = 3.14;
```

Importing:

```typescript
import Person, { pi } from "./module";

let p = new Person("Rahul");
console.log(pi);
```

---

# 6. Real-World Use Case

- **Organizing large projects** into smaller files
- **Reusing functions or classes** across multiple files
- **Separating concerns** (e.g., utilities, models, services)

---

# 7. Best Practices

1. Use **named exports** for multiple items
2. Use **default exports** when a module has a single main functionality
3. Keep module files **small and focused**
4. Use consistent **naming conventions** for modules
5. Avoid circular dependencies

---

# Interview Questions

### 1. What is a module in TypeScript?

A module is a **self-contained file** that can export code to be reused in other files.

---

### 2. What is the difference between default and named exports?

- **Default export** → the module exports **one main value**
- **Named export** → the module can export **multiple values**

---

### 3. How do you import a default export?

```typescript
import defaultName from "./module";
```

---

### 4. How do you import named exports?

```typescript
import { item1, item2 } from "./module";
```

---

### 5. Why use modules?

- Organize code
- Reuse functions, classes, constants
- Improve maintainability

---

# Summary

- Modules help **structure and organize TypeScript projects**
- Use `export` to make code available
- Use `import` to use exported code
- Named vs Default exports allow flexibility
- Modules improve **code maintainability and reuse**

---



