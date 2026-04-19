# TypeScript Notes – var and Type Annotations

## Type Annotation with var
    var age: number = 20; // only number allowed
    age = 30;             // valid

- `: number` is a type annotation  
- Only values of type number can be assigned  

Example error:
    // age = "Rajendra";  Error: Type 'string' is not assignable to type 'number'

---

## Re-declaration with var
    var age = 20;
    var age = 25; // Allowed

- var allows re-declaration in the same scope  
- This can sometimes cause confusion or bugs  

---

## let Does NOT Allow Re-declaration
    let age = 20;
    let age = 25; // Error: Cannot redeclare block-scoped variable

- let is block-scoped  
- Re-declaration in the same scope is not allowed  
- Safer and recommended over var  

---

## Key Differences: var vs let

| Feature           | var                     | let                  |
|------------------|------------------------|----------------------|
| Scope            | Function-scoped        | Block-scoped         |
| Re-declaration   | Allowed                | Not allowed          |
| Re-assignment    | Allowed                | Allowed              |
| Hoisting         | Yes (initialized undefined) | Yes (not usable before declaration) |

---

## Best Practice
- Prefer `let` or `const` instead of `var` in modern TypeScript
