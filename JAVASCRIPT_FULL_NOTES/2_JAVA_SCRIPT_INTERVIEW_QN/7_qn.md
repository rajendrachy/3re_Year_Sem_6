# JavaScript Interview Question

## 6. Explain Implicit Type Coercion in JavaScript

### Definition

Implicit Type Coercion in JavaScript means **automatic conversion of one data type to another by JavaScript during operations**.

JavaScript automatically converts the data type when performing operations between different types.

---

## Example 1 (Number + String)

```javascript
let result = 5 + "5";
console.log(result);
```

Output
```
55
```

Explanation:
- JavaScript converts the number **5 → "5"**
- Then performs **string concatenation**
- Result becomes `"55"`

---

## Example 2 (String - Number)

```javascript
let result = "10" - 5;
console.log(result);
```

Output
```
5
```

Explanation:
- JavaScript converts `"10"` into number **10**
- Then performs subtraction **10 - 5**

---

## Example 3 (Boolean Conversion)

```javascript
let result = true + 1;
console.log(result);
```

Output
```
2
```

Explanation:
- `true` is converted to **1**
- Then **1 + 1 = 2**

---

## Common Implicit Conversions

| Value | Converted To |
|-----|-----|
| true | 1 |
| false | 0 |
| null | 0 |
| string number | number |
| number + string | string |

---

## Important Operators that cause Coercion

- `+` (addition / concatenation)
- `-`
- `*`
- `/`
- `==`

---

## Short Interview Answer

Implicit Type Coercion in JavaScript is the **automatic conversion of one data type into another by JavaScript during operations**, without the programmer explicitly converting the types.

