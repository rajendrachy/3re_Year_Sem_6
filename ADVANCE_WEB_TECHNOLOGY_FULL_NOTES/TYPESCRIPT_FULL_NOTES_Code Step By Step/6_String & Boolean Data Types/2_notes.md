# TypeScript Notes – String, Number & Boolean Data Types

This note covers:

* String types (single, double, backtick)
* Template literals
* Type conversion
* Boolean data type
* Variable redeclaration (var vs let)
* TypeScript compilation to JavaScript

---

## 1. String Data Type

Strings in TypeScript can be defined in three ways:

```typescript
var str: string = "Hello how are you";   // Double quotes
var str2: string = 'Hello how are you';  // Single quotes
var str3: string = `Hello how are you`;  // Backtick (Template string)
```

**Difference:**

* `" "` → Normal string
* `' '` → Normal string
* `` ` ` `` → Template literal (supports interpolation)

---

## 2. Template Literal (Backtick)

Backticks allow variable insertion using `${}`:

```typescript
var age: number = 30;
var userName: string = "Anil Sidhu";
var info: string = `My name is ${userName} and age is ${age}`;
console.log(info);
```

**Output:**

```
My name is Anil Sidhu and age is 30
```

This is called **string interpolation**.

---

## 3. Why Compile TypeScript to JavaScript?

Browsers understand **only JavaScript**, not TypeScript.

Process:

```
TypeScript (.ts) → Compile → JavaScript (.js)
```

**Reasons:**

* TypeScript adds type safety
* Catches errors during development
* JavaScript runs in the browser
* After compilation, all types are removed

Example:

```typescript
var age: number = 30;
```

Becomes:

```javascript
var age = 30;
```

---

## 4. Number to String Conversion

```typescript
var num: number = 100;
```

**Not allowed:**

```typescript
var data: string = num; // Error
```

**Correct ways:**

* Using `toString()`

```typescript
var data: string = num.toString();
```

* Using concatenation

```typescript
var data: string = "" + num;
```

---

## 5. Boolean Data Type

```typescript
var boolData: boolean = true;
console.log(boolData); // true
```

Convert boolean to string:

```typescript
var data: string = boolData.toString();
console.log(data); // "true"
```

**Note:** `true` → "true", `false` → "false"

---

## 6. Boolean Variable Assignment

```typescript
var item: boolean = true;
var other: boolean;
other = item;
console.log(other); // true
```

Boolean variables can store only `true` or `false`.

---

## 7. Type Inference

If a type is not defined, TypeScript automatically detects it:

```typescript
var info1 = "Anil Sidhu"; // inferred as string
var inf = 10;               // inferred as number
```

This is called **type inference**.

---

## 8. var vs let vs const

### var

* Can redeclare
* Can reassign
* Function scoped

```typescript
var a = 10;
var a = 20; // Allowed
```

### let

* Cannot redeclare in the same scope
* Can reassign
* Block scoped

```typescript
let str10 = "Hey I am Anil";
// let str10 = "New value"; // Error
```

### const

* Cannot redeclare
* Cannot reassign

```typescript
const value = 100;
// value = 200; // Error
```

---

## Important Points

* TypeScript supports **string, number, and boolean** types
* Backticks (`` ` ``) allow **variable interpolation**
* TypeScript must be compiled into **JavaScript**
* Use `.toString()` to convert **number/boolean to string**
* **Type inference** automatically detects types
* **let** and **const** are safer than **var**


