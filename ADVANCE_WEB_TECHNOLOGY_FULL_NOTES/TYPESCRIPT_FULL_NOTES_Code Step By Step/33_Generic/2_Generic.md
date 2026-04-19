
# TypeScript Tutorial #32  
## Generics in TypeScript

Welcome to **TypeScript Tutorial #32**.  
In this tutorial, we will learn about **Generics**, which allow us to create **reusable, type-safe components** in TypeScript.

---

# 1. What are Generics?

**Generics** enable you to write functions, classes, or interfaces that work with **any data type**, while still **preserving type safety**.

- Helps create **reusable code**
- Prevents **type errors**
- Improves **flexibility and scalability**

---

# 2. Generic Functions

### Syntax

```typescript
function functionName<T>(param: T): T {
  return param;
}
```

### Example

```typescript
function identity<T>(value: T): T {
  return value;
}

console.log(identity<number>(123)); // 123
console.log(identity<string>("Hello")); // Hello
```

Explanation:

- `<T>` is a **generic type parameter**
- `identity` works with **any type** while retaining type safety

---

# 3. Generic with Arrays

```typescript
function getArray<T>(items: T[]): T[] {
  return new Array().concat(items);
}

let numberArray = getArray<number>([1, 2, 3]);
let stringArray = getArray<string>(["a", "b", "c"]);
```

- Works with **any type of array**
- Preserves **type safety**

---

# 4. Generic Constraints

Sometimes we want to **restrict the type** that a generic can accept.

### Syntax

```typescript
function functionName<T extends Type>(param: T): T {
  return param;
}
```

### Example

```typescript
interface Lengthwise {
  length: number;
}

function loggingIdentity<T extends Lengthwise>(arg: T): T {
  console.log(arg.length);
  return arg;
}

loggingIdentity([1, 2, 3]); // Array has length
loggingIdentity("Hello");   // String has length
```

Explanation:

- `<T extends Lengthwise>` ensures `T` has a **length property**
- Prevents passing types **without length**

---

# 5. Generic Classes

```typescript
class GenericNumber<T> {
  zeroValue: T;
  add: (x: T, y: T) => T;
}

let myGenericNumber = new GenericNumber<number>();
myGenericNumber.zeroValue = 0;
myGenericNumber.add = (x, y) => x + y;

console.log(myGenericNumber.add(10, 20));
```

- Class can work with **any type**
- `T` is replaced with the specific type when creating an instance

---

# 6. Generic Interfaces

```typescript
interface GenericIdentityFn<T> {
  (arg: T): T;
}

function identity<T>(arg: T): T {
  return arg;
}

let myIdentity: GenericIdentityFn<number> = identity;
console.log(myIdentity(100));
```

- Interfaces can also **accept generic types**
- Useful for **type-safe callbacks and function signatures**

---

# 7. Real-World Example

```typescript
function getFirstElement<T>(arr: T[]): T | undefined {
  return arr[0];
}

let firstNumber = getFirstElement([1, 2, 3]);
let firstString = getFirstElement(["a", "b", "c"]);

console.log(firstNumber); // 1
console.log(firstString); // "a"
```

---

# 8. Benefits of Generics

1. **Reusable code** across types
2. **Type-safe** and prevents runtime errors
3. Flexible and **scalable** solutions
4. Works with **functions, classes, and interfaces**
5. Can use **constraints** for more precise types

---

# Interview Questions

### 1. What are generics in TypeScript?

Generics allow creating **reusable, type-safe components** that can work with **any type**.

---

### 2. How do you define a generic function?

```typescript
function identity<T>(value: T): T {
  return value;
}
```

---

### 3. What are generic constraints?

Generic constraints **restrict the type** that a generic can accept, e.g., `<T extends Type>`.

---

### 4. Can classes and interfaces use generics?

Yes, both **classes** and **interfaces** can use generics for type-safe reusable code.

---

# Summary

- Generics improve **flexibility, reusability, and type safety**
- Use `<T>` to define a **generic type parameter**
- Can be applied to **functions, classes, and interfaces**
- Use **constraints** to limit types when necessary
- Ideal for building **scalable and maintainable code**

---











