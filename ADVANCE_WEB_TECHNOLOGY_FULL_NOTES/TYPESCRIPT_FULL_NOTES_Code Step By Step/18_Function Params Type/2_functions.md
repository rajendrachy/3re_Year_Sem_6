# TypeScript Tutorial #17  
## Function Parameters Type in TypeScript

In this tutorial, we will learn how to define **types for function parameters in TypeScript**.  
TypeScript allows us to specify the **type of each parameter**, which helps prevent errors and improves code readability.

---

# 1. What are Function Parameter Types?

Function parameter types define **what type of data a function expects when it is called**.

By adding type annotations, TypeScript ensures that the correct type of data is passed to the function.

### Syntax

```typescript
function functionName(parameter: type) {
  // code
}
```

---

# 2. Basic Parameter Type Annotations

TypeScript allows us to define parameter types such as:

- `string`
- `number`
- `boolean`
- `array`
- `object`

### Example

```typescript
function greet(name: string) {
  console.log("Hello " + name);
}

greet("Rahul");
```

Explanation:

- The `name` parameter must be a **string**
- Passing a different type will cause an error

---

# 3. Multiple Parameters with Types

You can define types for multiple parameters.

### Example

```typescript
function add(a: number, b: number): number {
  return a + b;
}
```

Explanation:

- `a` and `b` must be **numbers**
- The function returns a **number**

---

# 4. Optional Parameters

Sometimes a function parameter is **not required**.  
In that case, we use the **optional parameter syntax (`?`)**.

### Syntax

```typescript
parameterName?: type
```

### Example

```typescript
function greetUser(name: string, age?: number) {
  console.log("Name:", name);
  console.log("Age:", age);
}

greetUser("Amit");
```

Explanation:

- `name` is required
- `age` is optional

---

# 5. Optional Parameter Rules

1. Optional parameters must come **after required parameters**.
2. They are defined using the **`?` symbol**.

### Correct Example

```typescript
function userInfo(name: string, city?: string) {
  console.log(name, city);
}
```

### Incorrect Example

```typescript
function userInfo(city?: string, name: string) {
}
```

This will cause an error because **optional parameters must be last**.

---

# 6. Default Parameters

You can also give **default values** to parameters.

### Example

```typescript
function greet(name: string = "Guest") {
  console.log("Hello", name);
}

greet();
greet("Rahul");
```

Explanation:

- If no value is passed, `"Guest"` will be used.

---

# 7. Benefits of Type Annotations in Functions

Type annotations improve code quality in many ways.

### Advantages

- Improves **code readability**
- Provides **better error detection**
- Improves **code maintainability**
- Helps developers understand expected input types

Example:

```typescript
function calculateTotal(price: number, tax: number): number {
  return price + tax;
}
```

Here it is clear that both inputs must be **numbers**.

---

# 8. Real Example

```typescript
function createUser(name: string, age: number, isAdmin?: boolean) {

  console.log("Name:", name);
  console.log("Age:", age);

  if (isAdmin) {
    console.log("User is an Admin");
  }

}
```

---

# Interview Questions

### 1. What are parameter types in TypeScript?

Parameter types define the **type of data that a function expects as input**.

---

### 2. What is an optional parameter?

An optional parameter is a parameter that **does not need to be provided when calling the function**.

Example:

```
age?: number
```

---

### 3. What symbol is used to define optional parameters?

The **`?` (question mark)** symbol.

---

### 4. What is the rule for optional parameters?

Optional parameters must always come **after required parameters**.

---

### 5. Why are type annotations important in functions?

They help with:

- Type safety
- Code readability
- Error prevention
- Better maintainability

---

# Summary

- Function parameters can have **specific data types**
- Common types include `string`, `number`, and `boolean`
- Optional parameters use the **`?` symbol**
- Optional parameters must be **placed after required parameters**
- Type annotations make code **safer and easier to maintain**

---








