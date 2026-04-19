# JavaScript Interview Question

## 4. Difference between "==" and "===" operators

In JavaScript, both `==` and `===` are **comparison operators**, but they work differently.

---

## 1. `==` (Equality Operator)

The `==` operator compares **two values after converting their data types if necessary**.  
This is called **type coercion**.

### Example

```javascript
5 == "5"
```

Output
```
true
```

Explanation:
- `"5"` is converted to the number `5`
- Then `5 == 5`
- Result is **true**

---

## 2. `===` (Strict Equality Operator)

The `===` operator compares **both value and data type**.

If the **data types are different**, it returns **false**.

### Example

```javascript
5 === "5"
```

Output
```
false
```

Explanation:
- `5` is a number
- `"5"` is a string
- Different data types → **false**

---

## Differences

| Feature | `==` | `===` |
|------|------|------|
| Comparison | Value only | Value and type |
| Type Conversion | Yes | No |
| Strict Check | No | Yes |
| Recommended | Less | Yes (best practice) |

---

## Example

```javascript
10 == "10"   // true
10 === "10"  // false
```

---

## Short Interview Answer

`==` compares values after **type conversion**, while `===` compares **both value and data type without conversion**, making it the **strict equality operator**.

