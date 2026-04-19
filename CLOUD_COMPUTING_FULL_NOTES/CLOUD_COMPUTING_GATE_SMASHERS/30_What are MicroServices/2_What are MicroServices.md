# Cloud Computing  
## Lec-29: What are Microservices? | Microservice Architecture vs Monolithic

Modern applications are often large and complex.  
To manage this complexity, developers use different **software architecture styles**.

Two common architectures are:

1. Monolithic Architecture
2. Microservices Architecture

---

# 1. What is Monolithic Architecture?

In **Monolithic Architecture**, the entire application is built as **one single unit**.

All components are combined into one codebase.

Components include:

- User interface
- Business logic
- Database access
- APIs

Example structure:

```
Application
 ├── User Interface
 ├── Business Logic
 ├── Authentication
 ├── Payment System
 └── Database
```

All parts run together as **one large application**.

---

# 2. Example of Monolithic Application

Example: **Traditional E-commerce Application**

```
Single Application

Features:
- User login
- Product catalog
- Payment system
- Order management
```

If one feature fails, the **entire application may be affected**.

---

# 3. Problems with Monolithic Architecture

As applications grow, monolithic systems become difficult to manage.

Common problems:

### Difficult to Scale

You must scale the **entire application**, even if only one part needs more resources.

---

### Hard to Maintain

Large codebases become complex and difficult to modify.

---

### Slow Development

Developers must work on a **single codebase**, which slows development.

---

# 4. What are Microservices?

**Microservices** architecture breaks a large application into **small independent services**.

Each service performs a **specific function**.

Simple definition:

> Microservices are small, independent services that work together to build a complete application.

Each service:

- Runs independently
- Has its own logic
- Communicates with other services using APIs

---

# 5. Microservices Architecture Structure

Example microservices for an e-commerce system:

```
E-Commerce Application

User Service
Product Service
Payment Service
Order Service
Notification Service
```

Each service runs independently and communicates through **APIs**.

---

# 6. Example of Microservices

Example architecture:

```
User Request
     ↓
API Gateway
     ↓
Microservices
 ├── User Service
 ├── Product Service
 ├── Payment Service
 └── Order Service
```

Each microservice can be developed and deployed **separately**.

---

# 7. Why Microservices Architecture?

Microservices became popular because modern applications need:

- Scalability
- Faster development
- Independent deployment
- High availability

Large companies like:

- Netflix
- Amazon
- Uber

use **microservice architecture**.

---

# 8. Advantages of Microservices

### Independent Development

Teams can work on different services independently.

---

### Easy Scalability

Only the required service can be scaled.

Example:

```
High traffic on payment service
→ Scale only payment service
```

---

### Faster Deployment

Services can be deployed separately without affecting the entire system.

---

### Fault Isolation

If one service fails, the rest of the system can continue running.

---

# 9. Challenges of Microservices

Although microservices provide benefits, they also introduce challenges.

### System Complexity

Managing many services can be complex.

---

### Network Communication

Services communicate over networks, which may introduce latency.

---

### Monitoring and Debugging

Tracking issues across multiple services can be difficult.

---

### Security Management

Each service must have proper security configuration.

---

# 10. Microservices vs Monolithic Architecture

| Feature | Monolithic | Microservices |
|------|------|------|
| Structure | Single large application | Multiple small services |
| Scalability | Entire app must scale | Individual services scale |
| Deployment | Deploy whole app | Deploy services independently |
| Maintenance | Difficult for large apps | Easier with modular services |
| Complexity | Simple architecture | More complex system |

---

# Real-Life Example

### Monolithic

A restaurant kitchen where **one chef prepares everything**.

---

### Microservices

A restaurant where **different chefs specialize in different dishes**.

Example:

```
Chef 1 → Appetizers
Chef 2 → Main Course
Chef 3 → Desserts
```

Each chef handles a **specific task**.

---

# Key Points to Remember

- Monolithic architecture combines everything into **one application**
- Microservices divide applications into **independent services**
- Microservices improve **scalability and flexibility**
- They also introduce **system complexity**

---

# Summary

Microservices architecture breaks large applications into **small, independent services**, allowing better scalability, faster development, and easier maintenance.  
In contrast, monolithic architecture builds the entire system as **one large application**, which can become difficult to manage as the system grows.

---









