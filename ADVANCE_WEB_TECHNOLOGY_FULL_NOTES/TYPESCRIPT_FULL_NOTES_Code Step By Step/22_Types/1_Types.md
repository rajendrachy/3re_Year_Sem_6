# Types

Reference Video: https://youtu.be/3rJq6oOLB-8?si=scWFyCARQdzyziH5

---

## What are Types?

Types define the kind of data a variable can hold.

They help ensure correctness and prevent errors in code.

---

## Common Types in TypeScript

- string → text values  
- number → numeric values  
- boolean → true or false  
- any → any type (not recommended)  
- unknown → safer alternative to any  
- void → no return value  
- never → function never returns  

---

## Example

let name: string = "Anil"  
let age: number = 25  
let isActive: boolean = true  

---

## Type Inference

TypeScript can automatically detect the type of a variable.

Example:  
let x = 10  

Here, TypeScript infers x as number.

---

## Rules

- Type must match the assigned value  
- Wrong type assignment causes error  
- Types improve code readability and safety  

---

## Use Cases

- Prevent runtime errors  
- Improve code quality  
- Make code easier to understand  

---

## Interview Questions

Q1. What are types in TypeScript?  
Types define what kind of value a variable can store.

Q2. What is type inference?  
Automatic detection of variable type by TypeScript.

Q3. Difference between any and unknown?  
any allows anything without checks  
unknown requires type checking before use  

---

## Summary

- Types define data structure  
- TypeScript enforces type safety  
- Helps in writing reliable code  