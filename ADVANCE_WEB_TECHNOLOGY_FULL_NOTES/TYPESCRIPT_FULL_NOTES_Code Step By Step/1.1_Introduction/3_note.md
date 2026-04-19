## Difference Between var, let, and const

| Feature           | var                     | let                      | const                    |
|------------------|------------------------|--------------------------|--------------------------|
| Scope            | Function-scoped        | Block-scoped             | Block-scoped             |
| Re-declaration   | Allowed                | Not allowed              | Not allowed              |
| Re-assignment    | Allowed                | Allowed                  | Not allowed              |

---

## Explanation

### Scope
- `var` is function-scoped → accessible throughout the function  
- `let` and `const` are block-scoped → only accessible inside `{}`  

Example:
    if (true) {
      var a = 10;
      let b = 20;
      const c = 30;
    }

    console.log(a); // works
    console.log(b); // error
    console.log(c); // error

---

### Re-declaration
- `var` allows re-declaration  
- `let` and `const` do not allow re-declaration in same scope  

Example:
    var x = 10;
    var x = 20; // allowed

    let y = 10;
    // let y = 20; // error

    const z = 10;
    // const z = 20; // error

---

### Re-assignment
- `var` and `let` allow reassignment  
- `const` does not allow reassignment  

Example:
    let a = 10;
    a = 20; // allowed

    const b = 10;
    // b = 20; // error

---

## Best Practice
- Use `const` by default  
- Use `let` if value needs to change  
- Avoid `var`