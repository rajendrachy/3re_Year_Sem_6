# TypeScript Notes – Lesson 1 (Introduction)

## Why This Course?
- Designed for complete beginners
- Explained in simple Hindi
- Covers basics to advanced
- Useful for modern web development

---

## What is TypeScript?
- TypeScript is a superset of JavaScript
- Developed by Microsoft
- Adds static typing
- Compiles into JavaScript using `tsc`

Definition:  
TypeScript = JavaScript + Types

---

## Why Use TypeScript?

### Error Detection
- Finds errors before running code
- Saves debugging time

### Code Quality
- Type safety
- Predictable behavior

### Maintenance
- Easier for large projects
- Clean and readable code

### IDE Support
- Autocomplete
- Smart suggestions

---

## Key Features

### Static Typing
    let age: number = 25;

### Type Inference
    let name = "Anil";

### Interface
    interface User {
      name: string;
      age: number;
    }

### Classes (OOP)
    class Person {
      constructor(public name: string) {}
    }

### Modern JavaScript Support
- Supports ES6+ features

---

## How TypeScript Works
- Write code in `.ts` file  
- Compile using:
    tsc file.ts  
- Generates `.js` file  
- Run in browser or Node.js  

---

## JavaScript vs TypeScript

| Feature        | JavaScript | TypeScript |
|----------------|-----------|-----------|
| Typing         | Dynamic   | Static    |
| Error Checking | Runtime   | Compile-time |
| Scalability    | Medium    | High      |

---

## Installation
    npm install -g typescript

Check version:
    tsc -v

---

## Key Takeaways
- TypeScript improves JavaScript development  
- Helps catch errors early  
- Widely used in React, Angular, Node.js  
- Best for large-scale applications  

---

## Next Topics
- TypeScript setup  
- First `.ts` program  
- Basic data types  


