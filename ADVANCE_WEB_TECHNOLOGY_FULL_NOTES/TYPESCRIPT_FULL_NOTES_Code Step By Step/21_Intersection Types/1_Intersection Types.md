# Intersection Types

Reference Video: https://youtu.be/vVMpMTSrHAE?si=bQLjJ3Khsv60rOkX

---

## What are Intersection Types?

Intersection types allow you to combine multiple types into one using the `&` operator.

---

## Syntax

type A = { name: string }  
type B = { age: number }  
type C = A & B  

---

## Example

type User = { name: string }  
type Employee = { id: number }  

type Staff = User & Employee  

A Staff object must contain both name and id.

---

## Rules

- Must include all properties from combined types  
- Missing any property will cause an error  
- Types must not conflict  

---

## Invalid Case

If two types have the same property with different types, it causes an error.

Example:  
type A = { name: string }  
type B = { name: number }  

Combining them will result in a conflict.

---

## Use Cases

- Combining multiple object types  
- Reusing type definitions  
- Creating complex data structures  

---

## Interview Questions

Q1. What is an intersection type?  
It combines multiple types into one using `&`.

Q2. Difference between union and intersection?  
Union (`|`) means one of many types.  
Intersection (`&`) means all types combined.

Q3. What happens if types conflict?  
TypeScript throws an error.

---

## Summary

- `&` is used for intersection  
- Combines multiple types  
- Result must satisfy all combined types  