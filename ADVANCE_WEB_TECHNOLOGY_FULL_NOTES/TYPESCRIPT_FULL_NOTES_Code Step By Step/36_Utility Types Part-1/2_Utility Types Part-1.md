# TypeScript Utility Types  
## What You’ll Learn

In this tutorial, we will explore **Utility Types in TypeScript**, which are built-in types that help **manipulate and transform existing types** for better type safety and code reuse.

---

# 1. Introduction to Utility Types

- **Utility Types** are TypeScript predefined generic types  
- They help **modify existing types** without creating new interfaces  
- Commonly used for **partial updates, read-only properties, selecting subsets, and mapping types**

---

# 2. Commonly Used Utility Types

## 2.1 `Partial<Type>`

- Makes **all properties optional**  
- Useful for **update operations** where not all fields are required

### Example

```typescript
interface User {
  id: number;
  name: string;
  email: string;
}

function updateUser(user: User, updatedFields: Partial<User>) {
  return { ...user, ...updatedFields };
}

const user1: User = { id: 1, name: "Rahul", email: "rahul@example.com" };
const updatedUser = updateUser(user1, { name: "Amit" });
console.log(updatedUser);
```

---

## 2.2 `Required<Type>`

- Makes **all optional properties required**  
- Useful when you want **strict objects with all fields present**

### Example

```typescript
interface User {
  id: number;
  name?: string;
  email?: string;
}

const completeUser: Required<User> = {
  id: 1,
  name: "Rahul",
  email: "rahul@example.com",
};
```

---

## 2.3 `Readonly<Type>`

- Makes **all properties read-only**  
- Prevents modification of object properties

### Example

```typescript
interface User {
  id: number;
  name: string;
}

const user: Readonly<User> = { id: 1, name: "Rahul" };
// user.name = "Amit"; // ❌ Error
```

---

## 2.4 `Record<Keys, Type>`

- Creates an object type with **keys from `Keys`** and values of type `Type`  
- Useful for **maps or dictionaries**

### Example

```typescript
type Role = "admin" | "user" | "guest";

const rolePermissions: Record<Role, string[]> = {
  admin: ["read", "write", "delete"],
  user: ["read", "write"],
  guest: ["read"],
};
```

---

## 2.5 `Pick<Type, Keys>`

- Creates a type by **selecting specific properties** from an existing type  
- Useful for **subset of fields**

### Example

```typescript
interface User {
  id: number;
  name: string;
  email: string;
  age: number;
}

type UserPreview = Pick<User, "id" | "name">;

const preview: UserPreview = { id: 1, name: "Rahul" };
```

---

# Summary of Utility Types

| Utility Type      | Purpose |
|------------------|---------|
| `Partial<Type>`    | Makes all properties optional |
| `Required<Type>`   | Makes all properties required |
| `Readonly<Type>`   | Makes all properties read-only |
| `Record<Keys,Type>` | Creates object with specified keys and type |
| `Pick<Type,Keys>`   | Creates a type with selected properties |

---

# Benefits of Utility Types

1. Improve **type safety**
2. Reduce **boilerplate code**
3. Make code **flexible and reusable**
4. Useful for **large-scale TypeScript projects**

---








