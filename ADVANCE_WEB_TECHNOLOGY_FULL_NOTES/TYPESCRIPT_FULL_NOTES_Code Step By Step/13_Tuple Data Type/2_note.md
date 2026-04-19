# Tuple Data Type

## Video Reference
https://youtu.be/lMQaXMnX0jA?si=91iPYq2Mduu-aq6L

---

## Introduction
Tuples allow us to define fixed-length arrays with specific types at each position, making TypeScript code more structured and predictable.

---

## What are Tuples?
A tuple is a special type of array where:
- The number of elements is fixed
- Each element has a specific type
- Order matters

Example:
let person: [string, number] = ["Aman", 22];

---

## How to Define Tuples

let user: [string, number] = ["Rahul", 25];

---

## Access Tuple Values

let user: [string, number] = ["Rahul", 25];

console.log(user[0]); // Rahul
console.log(user[1]); // 25

---

## Updating Tuple Values

let user: [string, number] = ["Rahul", 25];

user[0] = "Aman";
user[1] = 30;

---

## Tuple with Multiple Types

let data: [string, number, boolean] = ["Ram", 20, true];

---

## Tuple vs Array

Tuple:
- Fixed length
- Fixed types
- Order is important

Array:
- Dynamic length
- Same type (usually)
- Order is flexible

---

## Practical Examples

1. User Data
let user: [string, number] = ["Aman", 22];

2. API Response
let response: [number, string] = [200, "Success"];

3. Product Info
let product: [string, number] = ["Mobile", 15000];

---

## Use Cases
- Fixed data structures
- API responses
- Form data
- Coordinates (x, y)

---

## Advantages
- Type safety
- Fixed structure
- Better readability

---

## Limitations
- Fixed size
- Less flexible than arrays

---

## Interview Questions

Q1. What is a tuple?
A fixed-length array with specific types at each position

Q2. Difference between tuple and array?
Tuple has fixed length and types, array is flexible

Q3. Can tuple store multiple types?
Yes

Example:
let data: [string, number];

---

## Summary
- Tuples are fixed-length typed arrays
- Each position has a specific type
- Useful for structured data
- Improves type safety

---

## Tip
Use tuples when the structure and order of data are fixed.
