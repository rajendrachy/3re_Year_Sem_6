
# TypeScript Tutorial #37  
## Namespaces in TypeScript

Welcome to **TypeScript Tutorial #37**.  
In this tutorial, we will learn about **Namespaces**, a feature in TypeScript that helps **organize and structure code**, especially in large projects.

---

# 1. What are Namespaces?

- Namespaces are a way to **group related code** under a single name  
- Helps **avoid naming conflicts**  
- Useful for **large-scale applications** where multiple files or modules exist  

### Example

```typescript
namespace MathUtils {
  export function add(x: number, y: number): number {
    return x + y;
  }

  export function multiply(x: number, y: number): number {
    return x * y;
  }
}

console.log(MathUtils.add(10, 20));      // 30
console.log(MathUtils.multiply(5, 6));   // 30
```

Explanation:

- `namespace MathUtils` groups **related functions**  
- `export` keyword allows **access from outside the namespace**  

---

# 2. Why and When to Use Namespaces

- Organize **large codebases**  
- Avoid **global scope pollution**  
- Encapsulate **related functionalities**  
- Can be combined with **modules**  

---

# 3. Syntax and Usage Examples

### Nested Namespaces

```typescript
namespace Company {
  export namespace Employee {
    export function getInfo(name: string) {
      return `Employee Name: ${name}`;
    }
  }
}

console.log(Company.Employee.getInfo("Rahul"));
```

- Nested namespaces allow **deeper structuring**  

### Aliases for Namespaces

```typescript
import Emp = Company.Employee;
console.log(Emp.getInfo("Amit"));
```

- `import` alias simplifies **long namespace paths**  

---

# 4. Difference Between Namespaces and Modules

| Feature        | Namespace                          | Module                          |
|----------------|-----------------------------------|---------------------------------|
| Scope          | Global (can merge multiple files) | File-level                      |
| Export/Import  | `export` keyword                   | `export` / `import` statements |
| Use Case       | Organize code in **legacy apps**  | Modern **ES modules**           |
| Loading        | Compiled together                  | Loaded asynchronously or bundled |

---

# 5. Real-World Use Cases

- Utilities like `MathUtils`, `StringUtils`  
- Configurations and constants grouped in a **namespace**  
- Legacy projects with multiple **related functions or classes**  
- Avoid naming collisions in **large apps**  

---

# 6. Best Practices

1. Use namespaces **for logically related code**  
2. Use `export` for members needed outside  
3. Prefer **modules** for modern projects  
4. Use **nested namespaces** for deeper organization  
5. Use **aliases** to shorten long namespace paths  

---

# Interview Questions

### 1. What is a namespace in TypeScript?

A **namespace** groups related code under a single name to avoid naming conflicts and organize code.

---

### 2. How do you define a namespace?

```typescript
namespace MyNamespace {
  export function myFunction() {}
}
```

---

### 3. How do you access members of a namespace?

Use the **dot notation** with the namespace name:

```typescript
MyNamespace.myFunction();
```

---

### 4. Difference between Namespace and Module?

- **Namespace** → organizes code in **global scope**, can merge multiple files  
- **Module** → file-level encapsulation, uses **import/export**, modern standard

---

# Summary

- Namespaces group **related code together**  
- Use `export` to expose members outside the namespace  
- Avoid **global naming conflicts** in large projects  
- Nested namespaces and aliases improve **structure and readability**  
- Prefer modules for modern TypeScript, but namespaces are **still useful for legacy code**

---
















