# TypeScript Tutorial #34  
## Index Signature in TypeScript

Welcome to **TypeScript Tutorial #34**.  
In this tutorial, we will learn about **Index Signatures**, which allow us to define **flexible object shapes** and enforce type safety for dynamically named properties.

---

# 1. What is an Index Signature?

An **Index Signature** allows a type to have **any number of properties**, where all properties **share the same type**.

### Syntax

```typescript
interface InterfaceName {
  [key: string]: type;
}
```

- `[key: string]` → any property name as string
- `type` → type of property values

---

# 2. Basic Example

```typescript
interface StringDictionary {
  [key: string]: string;
}

const colors: StringDictionary = {
  red: "RED",
  blue: "BLUE",
};

colors.green = "GREEN";  // ✅ Works
// colors.yellow = 123;  // ❌ Error: Type 'number' is not assignable to type 'string'
```

Explanation:

- `colors` can have **any string keys**
- All values must be **string**

---

# 3. Flexible Object Shapes

Index signatures are useful when you **don’t know all property names in advance**.

```typescript
interface Scores {
  [player: string]: number;
}

const gameScores: Scores = {};
gameScores["Alice"] = 100;
gameScores["Bob"] = 150;

console.log(gameScores);
```

- Can dynamically add properties
- Ensures all values are of the **correct type**

---

# 4. Using `readonly` with Index Signature

You can make properties **read-only** to prevent modification.

```typescript
interface ReadonlyScores {
  readonly [player: string]: number;
}

const scores: ReadonlyScores = {
  Alice: 100,
  Bob: 150,
};

// scores.Alice = 200; // ❌ Error: Cannot assign to 'Alice' because it is a read-only property
```

- Makes object properties **immutable**
- Useful for **constants or fixed configuration objects**

---

# 5. Real-World Example

```typescript
interface Config {
  readonly [key: string]: string | number | boolean;
}

const appConfig: Config = {
  appName: "MyApp",
  version: 1.0,
  debugMode: true,
};

// appConfig.version = 2.0; // ❌ Error
console.log(appConfig["appName"]);
```

- Flexible keys with **restricted value types**
- Readonly ensures **safety from accidental changes**

---

# 6. Best Practices

1. Use index signatures for **dynamic or unknown keys**
2. Use `readonly` to protect values that **should not change**
3. Prefer **specific types** when possible for better clarity
4. Combine with **union types** for flexible values

---

# Interview Questions

### 1. What is an Index Signature?

An **Index Signature** allows a type to have **arbitrary property names** with a **consistent value type**.

---

### 2. How do you define an index signature?

```typescript
interface Example {
  [key: string]: type;
}
```

---

### 3. What is the use of `readonly` in index signatures?

`readonly` makes all properties defined by the index signature **immutable**.

---

### 4. Why use index signatures?

- For **dynamic object keys**
- Ensures **type safety** for all values
- Useful for **configuration objects, dictionaries, and maps**

---

# Summary

- Index signatures provide **flexible object shapes**
- All properties share a **common type**
- Can use `readonly` to make properties **immutable**
- Ideal for **dynamic data and key-value structures**
- Enhances **type safety and maintainability**

---




