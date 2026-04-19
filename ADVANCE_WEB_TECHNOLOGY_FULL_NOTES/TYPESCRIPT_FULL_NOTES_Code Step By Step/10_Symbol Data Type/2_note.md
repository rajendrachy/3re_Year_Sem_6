# TypeScript – Symbol Data Type (Complete Notes)

## 1. What is Symbol Data Type?

* Symbol is a **primitive data type** introduced in ES6.
* It is used to create **unique and immutable values**.
* Even if two symbols look the same, they are always **different**.

---

## 2. Creating Symbols

```typescript
var sym = Symbol();
var sym2 = Symbol();

console.log(sym == sym2); // false
```

**Explanation:** Every `Symbol()` creates a unique value. Even if both are empty, they are not equal.

---

## 3. Printing Symbols

```typescript
console.log(sym);
console.log(sym2);
```

**Output:**

```
Symbol()
Symbol()
```

Even though they look the same, internally they are different.

---

## 4. Symbol with Description

* You can give a **label/description** to a symbol.

```typescript
const s1 = Symbol('id');
const s2 = Symbol('id');
console.log(s1 == s2); // false
```

**Note:** Description is only for debugging and does not make symbols equal.

---

## 5. Using Symbol in Object (Incorrect Way)

```typescript
const did = Symbol('id');
const obj = {
  id: 100,
  name: 'Anil Sidhu'
};
console.log(obj.id); // 100
```

Here, you are using normal string key "id", not the symbol.

---

## 6. Correct Way to Use Symbol as Object Key

```typescript
const did = Symbol('id');
const obj = {
  [did]: 101,
  name: 'Anil Sidhu'
};
console.log(obj[did]); // 101
```

**Benefits:**

* The key is truly unique
* Cannot be accidentally overridden

---

## 7. Why Use Symbol?

1. **Unique Object Keys** → Avoid property name conflicts
2. **Hide Internal Properties** → Symbol properties are **not shown in loops**

```typescript
for (let key in obj) {
  console.log(key); // Symbol keys are skipped
}
```

---

## 8. Important Points

* `Symbol()` always creates a unique value
* Symbols are **immutable**
* Symbols are **primitive data types**
* Mostly used as **object property keys**
* Useful for **avoiding key conflicts**

---

## 9. Interview Questions

* **What is Symbol in TypeScript?**

  * A primitive data type that creates unique identifiers.

* **Are two symbols equal?**

  * No, every symbol is unique.

* **Can we use symbol as object key?**

  * Yes, using bracket notation `[symbolName]`

