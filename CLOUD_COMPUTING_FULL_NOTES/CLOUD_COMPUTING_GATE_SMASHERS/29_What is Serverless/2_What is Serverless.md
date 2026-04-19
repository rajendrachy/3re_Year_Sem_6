# Cloud Computing  
## Lec-28: What is Serverless? | AWS Lambda vs EC2 | Serverless vs Server-Based

In cloud computing, applications can be deployed using two main approaches:

1. Server-Based Architecture
2. Serverless Architecture

These approaches differ in **how infrastructure is managed and how applications run**.

---

# 1. What is Server-Based Architecture?

In a **server-based architecture**, developers must create and manage servers where the application runs.

This includes managing:

- Virtual machines
- Operating systems
- Security patches
- Scaling servers
- Server monitoring

Example service:

```
AWS EC2 (Elastic Compute Cloud)
```

In this model, developers are responsible for **server management**.

---

# 2. Example of Server-Based Architecture

Example web application:

```
User Request
     ↓
Load Balancer
     ↓
EC2 Server (Application running)
     ↓
Database
```

Here the company must manage:

- EC2 instances
- Server scaling
- OS updates
- Security configuration

---

# 3. What is Serverless Architecture?

**Serverless architecture** allows developers to run applications **without managing servers**.

The cloud provider automatically handles:

- Infrastructure
- Scaling
- Server management
- Availability

Developers only focus on **writing and deploying code**.

Example service:

```
AWS Lambda
```

Simple definition:

> Serverless means running applications **without directly managing servers**.

---

# 4. How Serverless Works

In serverless architecture:

1. A user request triggers an event
2. The cloud platform runs the function automatically
3. The function processes the request
4. The response is returned

Example flow:

```
User Request
     ↓
API Gateway
     ↓
AWS Lambda Function
     ↓
Database / Storage
```

---

# 5. AWS Lambda vs EC2

AWS provides both serverless and server-based services.

### AWS EC2

- Virtual machines in the cloud
- Requires server management
- Used for long-running applications

---

### AWS Lambda

- Serverless compute service
- Runs code in response to events
- Automatically scales

---

# 6. Server-Based vs Serverless Comparison

| Feature | Server-Based | Serverless |
|------|------|------|
| Infrastructure | Managed by developer | Managed by cloud provider |
| Scaling | Manual or configured | Automatic |
| Cost Model | Pay for running servers | Pay only when code runs |
| Maintenance | Requires updates and patches | No server maintenance |
| Deployment | Deploy full applications | Deploy functions |

---

# 7. Benefits of Serverless Architecture

### No Server Management

Developers do not manage infrastructure.

---

### Automatic Scaling

Applications scale automatically based on traffic.

---

### Cost Efficiency

You only pay when your code executes.

Example:

```
Function runs for 2 seconds
→ Pay only for that time
```

---

### Faster Development

Developers can focus only on **business logic**.

---

# 8. Limitations of Serverless

Despite benefits, serverless also has limitations.

### Cold Start Delay

Functions may take slightly longer to start if inactive.

---

### Execution Time Limits

Serverless functions usually have **maximum execution time limits**.

---

### Limited Control

Developers have less control over the underlying infrastructure.

---

# 9. When to Use Server-Based Architecture

Server-based architecture is useful for:

- Long-running applications
- Complex systems
- Custom server configurations

Example:

```
Large enterprise web applications
Game servers
```

---

# 10. When to Use Serverless Architecture

Serverless is ideal for:

- Event-driven applications
- APIs
- Microservices
- Background processing

Example:

```
Image processing
Email notifications
API endpoints
```

---

# Key Points to Remember

- Server-based architecture requires **server management**
- Serverless architecture removes **infrastructure management**
- AWS EC2 represents **server-based computing**
- AWS Lambda represents **serverless computing**
- Serverless improves **scalability and cost efficiency**

---

# Summary

Serverless architecture allows developers to run applications **without worrying about server infrastructure**, while server-based architecture requires managing servers manually.  
Services like **AWS Lambda** enable event-driven computing with automatic scaling, whereas **AWS EC2** provides full control over virtual machines for traditional server-based deployments.

---








