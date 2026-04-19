# TypeScript Datatypes

## 1. Type Annotation vs Type Inference

* **Type Annotation** → Manually specifying the type

```typescript
let age: number = 25;
```

* **Type Inference** → TypeScript automatically detects the type

```typescript
let age = 25;
```

---

## 2. Primitive Types

### Boolean

```typescript
let isDone: boolean = false;
let isLoggedIn: boolean = true;
```

### Number

```typescript
let decimal: number = 42;
let hex: number = 0xf00d;
let binary: number = 0b1010;
let octal: number = 0o744;
```

### String

```typescript
let color: string = "blue";
let fullName: string = `Bob`;
let sentence: string = `Hello ${fullName}`;
```

### Null & Undefined

```typescript
let u: undefined = undefined;
let n: null = null;
```

---

## 3. Special Types

### Any

```typescript
let value: any = 10;
value = "text";
```

### Unknown

```typescript
let value: unknown = 10;
```

### Void

```typescript
function log(): void {
  console.log("Hello");
}
```

### Never

```typescript
function error(): never {
  throw new Error("Error");
}
```

---

## 4. Collection Types

### Array

```typescript
let numbers: number[] = [1, 2, 3];
let names: Array<string> = ["A", "B"];
```

### Tuple

```typescript
let user: [string, number] = ["Alice", 25];
```

### Mixed Array

```typescript
let arr: (number | string)[] = [23, "hello"];
```

---

## 5. Object Type

```typescript
function printCoord(pt: { x: number; y: number }) {
  console.log(pt.x, pt.y);
}
```

---

## 6. Advanced Types

### Union

```typescript
let value: string | number;
```

### Intersection

```typescript
type A = { name: string };
type B = { age: number };
type Person = A & B;
```

### Type Alias

```typescript
type ID = string | number;
```

### Nullable

```typescript
let data: string | null = null;
```

---

## 7. Enum

```typescript
enum OrderStatus {
  Pending = "PENDING",
  Shipped = "SHIPPED",
  Delivered = "DELIVERED"
}

function updateStatus(status: OrderStatus) {
  console.log(status);
}
```

---

## Summary

* Primitive: number, string, boolean
* Special: any, unknown, void, never
* Collections: array, tuple
* Advanced: union, intersection, enum
