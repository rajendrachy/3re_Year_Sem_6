## TypeScript Basic Types Notes

---

### 1. null vs undefined

- They are not the same  

| null                          | undefined                         |
|------------------------------|----------------------------------|
| Intentional empty value       | Variable declared but not assigned |
| Assigned by developer         | Assigned automatically by JavaScript |

Example:
    let a = null;        // intentional empty value
    let b;               // undefined

- null = empty by choice  
- undefined = value not assigned  

---

### 2. number (int and float)

- There is only one `number` type in TypeScript/JavaScript  

It supports:
- Integer (10)  
- Float (10.5)  
- Negative (-5)  
- Decimal (3.14)  

Example:
    let a: number = 10;     // integer
    let b: number = 10.5;   // float

- No separate int or float type  

---

### 3. undefined

- Default value of uninitialized variable  
- Type is `undefined`  

Example:
    let x;
    console.log(x); // undefined

In TypeScript:
    let y: undefined = undefined;

---

### 4. symbol

- `symbol` is a primitive data type  
- Used to create unique values  
- Mostly used as object keys  

Example:
    let sym1 = Symbol("id");
    let sym2 = Symbol("id");

    console.log(sym1 === sym2); // false

- Even if description is same, symbols are always unique  

---

### Summary
- null is not equal to undefined  
- number includes integer and float  
- undefined means variable not assigned  
- symbol creates unique values  

