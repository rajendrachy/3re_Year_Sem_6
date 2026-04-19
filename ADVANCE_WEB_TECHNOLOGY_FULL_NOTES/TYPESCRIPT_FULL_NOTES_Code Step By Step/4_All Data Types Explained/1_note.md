# TypeScript Complete Notes

## Playlist
https://youtu.be/20IKX4QZGrE?si=IEGMj8KswmQwrEkH

## Introduction
TypeScript is a superset of JavaScript that adds static typing. It helps developers write safer, more maintainable, and scalable code by catching errors during development instead of runtime.

## Installation and Setup

Install TypeScript globally:
npm install -g typescript

Check installed version:
tsc -v

Compile a TypeScript file:
tsc index.ts

## Data Types

### Number
Used for numeric values including integers and floating-point numbers.
let age: number = 25;
let price: number = 99.99;

### String
Used for text values.
let name: string = "Rajendra";
let message: string = `Hello ${name}`;

### Boolean
Used for true or false values.
let isLoggedIn: boolean = true;

### Any
Allows any type of value. It removes type safety and should be avoided.
let data: any = 10;
data = "Hello";

### Unknown
A safer alternative to any. Requires type checking before usage.
let value: unknown = "Hello";
if (typeof value === "string") {
  console.log(value.toUpperCase());
}

### Void
Used for functions that do not return a value.
function log(): void {
  console.log("Hello");
}

### Null and Undefined
null represents an intentional empty value.
undefined represents a variable that has not been assigned a value.
let a: null = null;
let b: undefined = undefined;

### Array
Used to store multiple values of the same type.
let numbers: number[] = [1, 2, 3];

### Tuple
Used for fixed-length arrays with multiple data types.
let user: [string, number] = ["Raj", 21];

## Functions

Functions can have typed parameters and return types.

function add(a: number, b: number): number {
  return a + b;
}

Optional parameter:
function greet(name?: string) {
  console.log(name);
}

Default parameter:
function greetUser(name: string = "Guest") {
  console.log(name);
}

## Objects and Interfaces

Object type:
let userObj: { name: string; age: number } = {
  name: "Raj",
  age: 21
};

Interface:
interface User {
  name: string;
  age: number;
}

let u: User = {
  name: "Raj",
  age: 21
};

## Type Alias

type UserType = {
  name: string;
  age: number;
};

## Classes

class Person {
  name: string;

  constructor(name: string) {
    this.name = name;
  }

  greet() {
    console.log("Hello " + this.name);
  }
}

## Generics

Used to create reusable and flexible components.

function identity<T>(value: T): T {
  return value;
}

## Modules

Export:
export const name = "Raj";

Import:
import { name } from "./file";

## Advanced Types

Union type allows multiple types:
let value: string | number;

Literal type restricts values:
let status: "success" | "error";

Type assertion:
let data2: any = "hello";
let length = (data2 as string).length;

## Best Practices

Use strict typing wherever possible  
Avoid using any  
Prefer unknown when type is not known  
Use interfaces for object structure  
Validate data before using it  

## Conclusion

TypeScript enhances JavaScript by adding type safety, improving code quality, and making applications more scalable and maintainable.