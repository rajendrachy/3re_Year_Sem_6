# TypeScript – Number Data Type (Full Notes)

This note explains:
- Number data type
- Adding numbers
- Binary, octal, hexadecimal numbers
- Convert string to number
- Type inference
- Redeclare issue
- Union type

------------------------------------------------------------

## 1. Apply Number Data Type

In TypeScript, `number` is used to store numeric values.

Syntax:
var num1: number = 10;
var num2: number = 32;

Both variables are strictly numbers.

------------------------------------------------------------

## 2. How to Add Numbers

var total: number = num1 + num2;
console.log(total);

Output:
42

### Why string cannot be added directly?

var num3 = "30";
var total = num1 + num3; // Error

Reason:
- num1 is a number
- num3 is a string  
Type mismatch occurs.

------------------------------------------------------------

## 3. Convert String to Number

### Method 1: Using Number()

var item1: number = 100;
var item2 = "50";

var item2Convert = Number(item2);
console.log(item1 + item2Convert);

Output:
150

### Method 2: Using + (Shortcut)

var item2Convert = +item2;

Both methods convert string → number.

------------------------------------------------------------

## 4. Binary, Octal and Hexadecimal Numbers

var oct: number = 0o100001;   // Octal
var bin: number = 0b00001;    // Binary
var hex: number = 0x00001;    // Hexadecimal

console.log(oct + 10);

### Prefix Meaning

0o → Octal (Base 8)  
0b → Binary (Base 2)  
0x → Hexadecimal (Base 16)

### Explanation

0o100001 (octal) = 32769 (decimal)  
32769 + 10 = 32779  

Output:
32779

------------------------------------------------------------

## 5. Type Inference

If you don’t define a type, TypeScript automatically detects it.

var data = 30;

TypeScript infers:
data → number

You cannot assign a string later:

data = "anil"; // Error

This is called Type Inference.

------------------------------------------------------------

## 6. Redeclare Issue (var, let, const)

### var
- Can redeclare
- Can reassign
- Function scoped

### let
- Cannot redeclare in same scope
- Can reassign
- Block scoped

let value = 10;
value = 20;   // allowed
// let value = 30; // Error

### const
- Cannot redeclare
- Cannot reassign

const price = 100;
// price = 200; // Error

------------------------------------------------------------

## 7. Union Type

Allows multiple data types in one variable.

var data: number | string = 30;
data = "anil sidhu"; // allowed

------------------------------------------------------------

## 8. Important Points

- TypeScript has only one numeric type → number
- Supports:
  - Decimal
  - Binary (0b)
  - Octal (0o)
  - Hexadecimal (0x)
- Use Number() or + to convert string to number
- Type inference automatically detects type
- let and const prevent redeclaration issues
- Use Union type (|) for multiple types

------------------------------------------------------------

## Complete Example

var num1: number = 10;
var num2: number = 32;
var num3 = "30";

// Add number
var total: number = num1 + num2;
console.log(total);

// Binary, Octal, Hexa
var oct: number = 0o100001;
var bin: number = 0b00001;
var hex: number = 0x00001;

console.log(oct + 10);

// Convert string to number
var item1: number = 100;
var item2 = "50";
var item2Convert = Number(item2);

console.log(item1 + item2Convert);

// Union type
var data: number | string = 30;
data = "anil sidhu";
