# Cloud Computing / Infrastructure Evolution
## Lec-38: Development ➝ Deployment | Pre-Virtualization Era

Before virtualization and cloud computing existed, applications were deployed directly on **physical servers**.  
This period is called the **Pre-Virtualization Era**.

In this model, each application usually required **its own dedicated server**.

---

# 1. What is the Pre-Virtualization Era?

The **Pre-Virtualization Era** refers to the time when:

- Applications were deployed directly on **physical machines**
- Each server handled **only one application**
- Hardware resources were often **underutilized**

Simple definition:

> Pre-Virtualization Era is the time when applications were run on dedicated physical servers without virtualization technology.

---

# 2. Development Phase

In the development phase, developers build the application.

Typical development process:

```
Development Team
│
├── Write Code
├── Test Application
└── Prepare for Deployment
```

Example technologies used:

- Programming languages
- Databases
- Libraries
- Frameworks

After development is completed, the application moves to **deployment**.

---

# 3. Deployment in Pre-Virtualization Era

Deployment means **installing and running the application on a production server**.

Process:

```
Developer
   ↓
System Administrator
   ↓
Physical Server Setup
   ↓
Application Deployment
```

Steps involved:

1. Purchase a physical server
2. Install Operating System
3. Install required software
4. Deploy the application
5. Configure network and security

---

# 4. Example of Traditional Deployment

Imagine a company running three applications.

```
Application 1 → Server 1
Application 2 → Server 2
Application 3 → Server 3
```

Each application requires a **separate physical server**.

This leads to **high infrastructure cost**.

---

# 5. Problems in Pre-Virtualization Era

There were several major challenges.

---

## 1. High Hardware Cost

Companies had to buy **multiple physical servers**.

Example:

```
10 Applications → 10 Physical Servers
```

This increased infrastructure cost.

---

## 2. Low Resource Utilization

Most servers used only **10%–20% of their capacity**.

Example:

```
CPU Usage = 15%
Memory Usage = 20%
```

Remaining resources were wasted.

---

## 3. Difficult Scalability

If traffic increased, companies had to:

```
Buy new servers
Install OS
Configure system
Deploy application
```

This process was slow and expensive.

---

## 4. Complex Maintenance

Managing many servers required:

- Hardware maintenance
- Software updates
- Security management

This increased operational workload.

---

## 5. Deployment Delay

Deploying applications took a long time because infrastructure had to be prepared manually.

Example timeline:

```
Buy server → Setup → Configure → Deploy
```

This could take **days or weeks**.

---

# 6. Evolution to Virtualization

To solve these problems, **virtualization technology** was introduced.

Virtualization allows multiple virtual machines to run on one physical server.

Example:

```
Physical Server
│
├── Virtual Machine 1
├── Virtual Machine 2
├── Virtual Machine 3
```

Benefits:

- Better resource utilization
- Lower cost
- Faster deployment

---

# 7. Evolution to Cloud Computing

Virtualization eventually led to **cloud computing**.

Cloud platforms provide:

- On-demand servers
- Automatic scaling
- Pay-as-you-go pricing

Example providers:

- AWS
- Azure
- Google Cloud

---

# Key Points to Remember

- Pre-Virtualization Era used **dedicated physical servers**
- Each application required **separate hardware**
- Resource utilization was **very low**
- Deployment was **slow and expensive**
- Virtualization solved these problems

---

# Summary

In the Pre-Virtualization Era, applications were deployed directly on physical servers, leading to high costs, poor resource utilization, and complex management. The introduction of virtualization allowed multiple virtual machines to run on a single server, improving efficiency and eventually paving the way for modern cloud computing.

---









