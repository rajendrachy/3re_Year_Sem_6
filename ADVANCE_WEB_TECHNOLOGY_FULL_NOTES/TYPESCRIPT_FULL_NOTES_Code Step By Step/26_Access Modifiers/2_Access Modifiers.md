
# TypeScript Tutorial #25  
## Access Modifiers in TypeScript

Welcome to **TypeScript Tutorial #25**.  
In this tutorial, we will learn about **Access Modifiers**, which control the **visibility of class properties and methods**.

---

# 1. What are Access Modifiers?

Access modifiers are keywords that **define the accessibility of class members** (properties and methods).

TypeScript has three main access modifiers:

1. **public**
2. **private**
3. **protected**

---

# 2. Public Access Modifier

- Default access modifier
- Members are accessible **anywhere**, inside and outside the class

### Example

```typescript
class Person {
  public name: string;

  constructor(name: string) {
    this.name = name;
  }
}

let person1 = new Person("Rahul");
console.log(person1.name); // Accessible outside the class
```

---

# 3. Private Access Modifier

- Members are accessible **only within the class**
- Cannot be accessed from outside or by subclasses

### Example

```typescript
class Employee {
  private salary: number;

  constructor(salary: number) {
    this.salary = salary;
  }

  showSalary() {
    console.log(this.salary);
  }
}

let emp = new Employee(50000);
emp.showSalary(); // Works
// emp.salary; // Error: Property 'salary' is private
```

---

# 4. Protected Access Modifier

- Members are accessible **within the class and subclasses**
- Not accessible from outside

### Example

```typescript
class Person {
  protected age: number;

  constructor(age: number) {
    this.age = age;
  }
}

class Employee extends Person {
  showAge() {
    console.log(this.age); // Accessible in subclass
  }
}

let emp = new Employee(25);
// emp.age; // Error: age is protected
```

---

# 5. Summary Table

| Modifier   | Accessible in Class | Subclass | Outside Class |
|------------|------------------|----------|---------------|
| public     | ✅ Yes            | ✅ Yes   | ✅ Yes        |
| private    | ✅ Yes            | ❌ No    | ❌ No         |
| protected  | ✅ Yes            | ✅ Yes   | ❌ No         |

---

# 6. Practical Example

```typescript
class BankAccount {
  public accountNumber: string;
  private balance: number;
  protected pin: number;

  constructor(accNum: string, balance: number, pin: number) {
    this.accountNumber = accNum;
    this.balance = balance;
    this.pin = pin;
  }

  showBalance() {
    console.log(this.balance);
  }
}

class SavingsAccount extends BankAccount {
  showPin() {
    console.log(this.pin); // Accessible because protected
  }
}

let account = new SavingsAccount("12345", 10000, 1234);
console.log(account.accountNumber); // Public
account.showBalance(); // Private accessed via method
```

---

# 7. Best Practices

1. Use **private** for sensitive data
2. Use **protected** for data that should be inherited
3. Use **public** only for properties/methods meant to be accessed externally
4. Avoid exposing class internals unnecessarily

---

# Interview Questions

### 1. What are access modifiers in TypeScript?

Access modifiers control **the visibility of class members** (public, private, protected).

---

### 2. What is the default access modifier?

`public` is the default.

---

### 3. What is the difference between private and protected?

- **private** → accessible only inside the class  
- **protected** → accessible inside the class and its subclasses

---

### 4. When should you use access modifiers?

To **control class member visibility** and **protect sensitive data**.

---

# Summary

- **Public** → accessible everywhere  
- **Private** → accessible only inside the class  
- **Protected** → accessible inside class and subclasses  
- Access modifiers improve **encapsulation and maintainability** in OOP
- Always follow **best practices** for secure and readable code

---










