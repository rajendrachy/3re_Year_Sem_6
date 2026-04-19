# TypeScript Tutorial #11 – Array Data Type (Complete Notes)

## Video Reference
https://youtu.be/hbKGfxPvZZA?si=xqQHWFL20-UMODSO

---

## Introduction
Arrays are used to store multiple values in a single variable. TypeScript adds type safety, ensuring all elements follow a specific type.

---

## What is an Array?
An array is a collection of elements (usually same type).

Example:
let numbers: number[] = [1, 2, 3];
let names: string[] = ["Ram", "Shyam"];

---

## Declaring Arrays

let arr: number[] = [10, 20, 30];
let arr2: Array<number> = [10, 20, 30];

---

## Type Safety

let users: string[] = ["Aman"];
users.push("Rahul"); // allowed
users.push(10);      // error

---

## Mixed Types

let data: (string | number)[] = ["Ram", 25];

---

## Access and Update

let fruits: string[] = ["apple", "banana"];
console.log(fruits[0]);

fruits[0] = "mango";

---

## Array Methods

arr.push(4);
arr.pop();
arr.shift();
arr.unshift(0);

---

## Looping

for (let i = 0; i < arr.length; i++) {
  console.log(arr[i]);
}

arr.forEach(item => console.log(item));

---

## map, filter, reduce

let nums = [1, 2, 3];

nums.map(n => n * 2);
nums.filter(n => n > 1);
nums.reduce((a, b) => a + b, 0);

---

## Array of Objects

type User = {
  name: string;
  age: number;
};

let users: User[] = [
  { name: "Aman", age: 22 }
];

---

## Use Cases
- User lists
- Product lists
- API data
- Form data

---

## Advantages
- Type safety
- Fewer errors
- Better readability

---

## Interview Questions

Q1. What is an array?
A collection of elements of the same type

Q2. Difference between number[] and Array<number>?
No difference, only syntax

Q3. Can we store multiple types?
Yes, using union types

let data: (string | number)[];

---

## Summary
- Arrays store multiple values
- TypeScript enforces types
- Use [] or Array<>
- Supports methods like map, filter, reduce

---

## Tip
Always use typed arrays to avoid bugs.