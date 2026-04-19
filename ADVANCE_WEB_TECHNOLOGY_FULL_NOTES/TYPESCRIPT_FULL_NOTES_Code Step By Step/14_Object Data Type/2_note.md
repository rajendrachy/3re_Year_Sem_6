# TypeScript – Object Data Type (Complete Notes)

## Overview
This note covers:
- What is Object
- How to define data types in object
- Updating object values
- Nested object
- Examples
- Interview questions

---

## 1. What is an Object?

An object is a collection of properties (key-value pairs).

Each property has:
key : value

Example:
var userData = {
  name: 'rc',
  age: 30
};

Explanation:
- name → key  
- 'rc' → value  
- age → key  
- 30 → value  

---

## 2. Define Data Type in Object (Type Annotation)

In TypeScript, we can define the structure of an object.

var userData: {
  name: string,
  age: number,
  company: string
} = {
  name: "rc",
  age: 30,
  company: "oracle"
};

console.log(userData);

Why define type?
- Prevents wrong data type  
- Makes code safe  
- Improves readability  

---

## 3. Updating Object Value

var userData = {
  name: 'rc',
  age: 30
};

userData.age = 21;
console.log(userData);

Output:
{ name: 'rc', age: 21 }

Properties can be updated if they are not readonly.

---

## 4. Object Type Rules in TypeScript

If type is defined:

var userData: {
  name: string,
  age: number
};

Rules:

Cannot assign wrong type:
userData.age = "twenty"; // Error

Cannot add extra property:
userData.city = "Noida"; // Error

---

## 5. Nested Object

An object inside another object is called a nested object.

Example:

var userData: {
  name: string,
  age: number,
  address: {
    city: string,
    state: string
  }
} = {
  name: "Anil",
  age: 30,
  address: {
    city: "Noida",
    state: "UP"
  }
};

console.log(userData.address.city);

Output:
Noida

---

## 6. Optional Property in Object

You can make properties optional using ?.

var userData: {
  name: string,
  age: number,
  company?: string
} = {
  name: "Anil",
  age: 30
};

company is optional.

---

## 7. Better Way – Using Interface (Recommended)

interface User {
  name: string;
  age: number;
  company?: string;
}

var userData: User = {
  name: "Anil",
  age: 30
};

Advantages:
- Cleaner code  
- Reusable structure  

---

## 8. Important Points

- Object stores key-value pairs  
- TypeScript allows defining object structure  
- Prevents wrong data types  
- Supports nested objects  
- Supports optional properties  
- Interface is best practice  

---

## 9. Interview Questions

Q1. What is an object in TypeScript?  
An object is a collection of key-value pairs with defined data types.

Q2. How do you define object type?  
Using inline type or interface.

Example:
var user: { name: string; age: number };

Q3. What is a nested object?  
An object inside another object.

Q4. How to make property optional?  
Using ? symbol.

Q5. What is difference between object and interface?  
Object → actual data  
Interface → structure/template  

---

## 10. Final Example (Combined)

interface User {
  name: string;
  age: number;
  address: {
    city: string;
    state: string;
  };
}

var userData: User = {
  name: "Anil",
  age: 30,
  address: {
    city: "Noida",
    state: "UP"
  }
};

userData.age = 31;

console.log(userData);

