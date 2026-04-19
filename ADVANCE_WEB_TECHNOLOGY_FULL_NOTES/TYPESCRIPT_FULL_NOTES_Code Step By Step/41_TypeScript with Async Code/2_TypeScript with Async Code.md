# TypeScript Tutorial #40  
## Typed Promise in TypeScript (Async Code)

Welcome to **TypeScript Tutorial #40**.  
In this tutorial, we will learn about **Typed Promises in TypeScript** and how they help us write **type-safe asynchronous code** using `Promise` and `async/await`.

---

# 1. What is a Promise?

A **Promise** represents the **result of an asynchronous operation**.

It can have three states:

1. **Pending** – Operation is still running  
2. **Fulfilled** – Operation completed successfully  
3. **Rejected** – Operation failed  

### Basic Promise Example

```typescript
const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Data received");
  }, 1000);
});
```

---

# 2. Typed Promise in TypeScript

In TypeScript, we can **define the type of value returned by a Promise**.

### Syntax

```typescript
Promise<Type>
```

This ensures that the resolved value always matches the specified type.

---

# 3. Example of Typed Promise

```typescript
function getNumber(): Promise<number> {
  return new Promise((resolve) => {
    resolve(100);
  });
}

getNumber().then((result) => {
  console.log(result); // number
});
```

Explanation:

- `Promise<number>` means the promise will resolve with a **number**.

---

# 4. Using Typed Promise with Async/Await

```typescript
async function getUserName(): Promise<string> {
  return "Rahul";
}

async function printUser() {
  const name = await getUserName();
  console.log(name);
}

printUser();
```

Explanation:

- `async` functions **always return a Promise**
- Return type should be defined as `Promise<Type>`

---

# 5. Custom Type with Promise

We can define **custom interfaces or types** for promise results.

### Example

```typescript
interface User {
  id: number;
  name: string;
}

function getUser(): Promise<User> {
  return new Promise((resolve) => {
    resolve({
      id: 1,
      name: "Rahul"
    });
  });
}

getUser().then((user) => {
  console.log(user.name);
});
```

Explanation:

- Promise resolves with an object of type `User`.

---

# 6. Promise with API Example

```typescript
interface Post {
  id: number;
  title: string;
}

async function fetchPost(): Promise<Post> {
  const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
  const data: Post = await response.json();
  return data;
}

fetchPost().then(post => {
  console.log(post.title);
});
```

- Ensures **API response structure is type-safe**

---

# 7. Benefits of Typed Promises

1. Ensures **type safety for async data**
2. Prevents **runtime errors**
3. Improves **developer experience with IntelliSense**
4. Makes async code **cleaner and easier to maintain**

---

# Interview Questions

### 1. What is a Promise in TypeScript?

A **Promise** represents the **future result of an asynchronous operation**.

---

### 2. How do you define a typed promise?

```typescript
function example(): Promise<string> {
  return Promise.resolve("Hello");
}
```

---

### 3. What does an async function return?

An `async` function **always returns a Promise**.

Example:

```typescript
async function getData(): Promise<number> {
  return 10;
}
```

---

### 4. Why use typed promises?

- To ensure **correct data types**
- Avoid **runtime errors**
- Improve **code readability and maintainability**

---

# Summary

- Promises handle **asynchronous operations**
- TypeScript allows defining **typed promises using `Promise<Type>`**
- `async/await` simplifies working with promises
- Custom types improve **type safety for API responses**
- Essential for **modern TypeScript applications**

---





