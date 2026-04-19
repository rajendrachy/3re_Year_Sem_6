# TypeScript Tutorial #41  
## API Call in TypeScript

Welcome to **TypeScript Tutorial #41**.  
In this tutorial, we will learn how to **make API calls in TypeScript**, define **types for API responses**, and apply **type safety** to asynchronous data.

Handling API requests properly helps create **clean, scalable, and maintainable applications**.

---

# 1. What is an API Call?

An **API call** is a request sent to a server to **retrieve or send data**.

Common HTTP methods:

- **GET** → Retrieve data
- **POST** → Create data
- **PUT** → Update data
- **DELETE** → Remove data

In TypeScript, API calls are usually made using:

- `fetch()`
- `axios`
- `XMLHttpRequest` (older method)

---

# 2. Basic API Call Using `fetch`

### Example

```typescript
async function getData() {
  const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
  const data = await response.json();

  console.log(data);
}

getData();
```

Explanation:

- `fetch()` sends the request
- `response.json()` converts response into JavaScript object

---

# 3. Defining Type for API Response

We should define a **TypeScript interface** for the response.

### Example

```typescript
interface Post {
  userId: number;
  id: number;
  title: string;
  body: string;
}
```

This ensures the API response **matches the expected structure**.

---

# 4. Applying Type to API Response

Now we apply the interface to the response.

```typescript
async function getPost(): Promise<Post> {
  const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");

  const data: Post = await response.json();

  return data;
}

getPost().then((post) => {
  console.log(post.title);
});
```

Explanation:

- `Promise<Post>` ensures the function returns a **Post object**
- `data: Post` enforces **type safety**

---

# 5. API Call with Array Response

Sometimes APIs return **multiple items**.

### Example

```typescript
interface User {
  id: number;
  name: string;
  email: string;
}

async function getUsers(): Promise<User[]> {
  const response = await fetch("https://jsonplaceholder.typicode.com/users");
  const users: User[] = await response.json();

  return users;
}

getUsers().then((users) => {
  users.forEach(user => console.log(user.name));
});
```

Explanation:

- `User[]` means an **array of User objects**

---

# 6. Error Handling with API Calls

```typescript
async function fetchData(): Promise<Post | null> {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");

    if (!response.ok) {
      throw new Error("API Error");
    }

    const data: Post = await response.json();
    return data;
  } catch (error) {
    console.error(error);
    return null;
  }
}
```

Explanation:

- `try/catch` handles **API failures**
- Prevents application crashes

---

# 7. Best Practices for API Calls

1. Always **define types for API responses**
2. Use **async/await for cleaner code**
3. Add **error handling**
4. Keep API logic **separate from UI logic**
5. Use **interfaces or types** for response models

---

# Interview Questions

### 1. How do you make an API call in TypeScript?

Using `fetch()` or libraries like `axios`.

Example:

```typescript
const response = await fetch(url);
const data = await response.json();
```

---

### 2. Why define types for API responses?

To ensure:

- **Type safety**
- Correct data structure
- Better IntelliSense support

---

### 3. What is the return type of an async API function?

Async functions return a **Promise**.

Example:

```typescript
async function getData(): Promise<Post> {}
```

---

### 4. How do you handle API errors?

Using **try/catch** or checking `response.ok`.

---

# Summary

- API calls allow applications to **fetch or send data to servers**
- Use `fetch()` with **async/await**
- Define **interfaces for API responses**
- Apply types to responses for **type safety**
- Always implement **error handling**

---











