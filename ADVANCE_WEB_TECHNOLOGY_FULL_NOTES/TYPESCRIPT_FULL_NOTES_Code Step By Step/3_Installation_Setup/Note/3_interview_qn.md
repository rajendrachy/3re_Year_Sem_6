## NPM and TSC Basics

---

### 1. NPM Full Form
NPM = Node Package Manager

- Default package manager for Node.js  
- Used to install and manage project dependencies  

Example:
    npm install
    npm install typescript

---

### 2. TSC Full Form
TSC = TypeScript Compiler

- Converts `.ts` files into `.js` files  

Example:
    tsc app.ts

#### Watch Mode
    tsc --watch

- Automatically recompiles when file changes  
- No need to run `tsc` again and again  

---

### 3. Cannot Redeclare Block Scoped Variable

Example:
    let name = "sam";
    let name = "raj"; // Error

- `let` and `const` cannot be redeclared in the same scope  

Correct way:
    let userName = "sam";

---

### Summary
- NPM → Package manager  
- TSC → TypeScript compiler  
- --watch → Auto compile  
- let cannot redeclare in same block  
- 