# TypeScript Tutorial #33  
## `keyof` Operator in TypeScript

Welcome to **TypeScript Tutorial #33**.  
In this tutorial, we will learn about the **`keyof` operator**, which allows us to **extract the keys of an object type** for flexible and type-safe code.

---

# 1. What is `keyof`?

The `keyof` operator returns a **union of string literal types** representing the **keys of a type**.

- Useful for **type-safe property access**
- Helps create **generic functions** that operate on object keys

---

# 2. Basic Example

```typescript
interface Person {
  name: string;
  age: number;
  isEmployee: boolean;
}

// keyof Person creates: "name" | "age" | "isEmployee"
type PersonKeys = keyof Person;

let key: PersonKeys;

key = "name";       // ✅ OK
key = "age";        // ✅ OK
// key = "salary";  // ❌ Error: 'salary' does not exist in type 'Person'
```

Explanation:

- `PersonKeys` is now a **union of all keys in `Person`**
- Provides **type safety** for accessing properties

---

# 3. Using `keyof` with Functions

You can create a **generic function** to get property values safely.

```typescript
function getProperty<T, K extends keyof T>(obj: T, key: K): T[K] {
  return obj[key];
}

const person = { name: "Rahul", age: 25, isEmployee: true };

let personName = getProperty(person, "name");        // type: string
let personAge = getProperty(person, "age");          // type: number
// let invalid = getProperty(person, "salary");      // ❌ Error
```

Explanation:

- `K extends keyof T` ensures **key exists in object**
- Return type `T[K]` gives **exact property type**

---

# 4. Using `keyof` for Type-Safe Object Keys

```typescript
interface Car {
  brand: string;
  model: string;
  year: number;
}

type CarKeys = keyof Car; // "brand" | "model" | "year"

function printCarProperty(car: Car, key: CarKeys) {
  console.log(car[key]);
}

const myCar = { brand: "Toyota", model: "Corolla", year: 2023 };
printCarProperty(myCar, "model"); // Corolla
```

- Prevents **accessing invalid keys**
- TypeScript enforces **compile-time safety**

---

# 5. Real-World Example

```typescript
interface Settings {
  theme: string;
  fontSize: number;
  showNotifications: boolean;
}

function updateSetting<K extends keyof Settings>(key: K, value: Settings[K]) {
  console.log(`Updated ${key} to ${value}`);
}

updateSetting("theme", "dark");        // ✅ OK
updateSetting("fontSize", 14);         // ✅ OK
// updateSetting("language", "en");    // ❌ Error
```

- Ensures **only valid keys** and correct **value types** are used
- Improves **maintainability and type safety**

---

# 6. Benefits of `keyof`

1. Helps create **generic, type-safe code**
2. Avoids **runtime errors** due to invalid keys
3. Useful for **object manipulation and utility functions**
4. Works well with **mapped types and generics**

---

# Interview Questions

### 1. What does the `keyof` operator do?

- Returns a **union of keys** of an object type
- Provides **compile-time type safety** for property access

---

### 2. How do you use `keyof` in functions?

- Use with generics: `K extends keyof T`  
- Ensures **key exists in object**  
- Return type `T[K]` gives **exact property type**

---

### 3. Can `keyof` be used with interfaces and type aliases?

Yes, works with **interfaces**, **type aliases**, and **classes**.

---

### 4. Why use `keyof`?

- For **type-safe access to object properties**
- To **prevent errors at compile time**
- To build **flexible and reusable functions**

---

# Summary

- `keyof` extracts **keys of a type** as a **union of string literals**
- Provides **type safety** for property access
- Works well with **generics and mapped types**
- Ideal for **building reusable, maintainable code**
- Prevents **invalid key access** at compile time

---









