# Cloud Computing / API & Network Security
## Lec-42: What Are Endpoints? | API & Cloud Security

In cloud computing and networking, **endpoints** are locations where communication happens between systems.

They act as **entry or exit points** where data is sent or received.

---

# 1. What is an Endpoint?

An **Endpoint** is a network location where a client application can access a service.

Simple definition:

> An endpoint is a point where two systems communicate and exchange data.

Example:

```
Client Application → Endpoint → Server
```

Endpoints are commonly used in:

- APIs
- Cloud services
- Web applications

---

# 2. Real-Life Example

Imagine a **restaurant ordering counter**.

```
Customer → Order Counter → Kitchen
```

Explanation:

- Customer = Client
- Order Counter = Endpoint
- Kitchen = Server

The counter is the point where requests are placed.

Similarly in networking:

```
User → Endpoint → Cloud Service
```

---

# 3. Types of Endpoints

There are several types of endpoints used in cloud systems.

---

## 1. API Endpoints

API endpoints allow applications to interact with services.

Example API endpoint:

```
https://api.example.com/users
```

When a request is sent to this endpoint:

```
Client → API Endpoint → Server → Response
```

API endpoints are widely used in:

- Web apps
- Mobile apps
- Microservices

---

## 2. Virtual Machine Endpoints

Virtual machines (VMs) in the cloud also have endpoints.

Example:

```
Public IP Address
```

Users connect to the VM using protocols like:

- SSH
- HTTP
- HTTPS

Example connection:

```
User → VM Endpoint → Application
```

---

## 3. Storage Endpoints

Cloud storage services also expose endpoints for accessing data.

Example:

```
Storage Service Endpoint
```

Example request:

```
Client → Storage Endpoint → File Retrieval
```

Example services:

- Object storage
- File storage
- Backup storage

---

# 4. Role of Endpoints in API Communication

Endpoints define **where requests should be sent**.

Example API request:

```
GET https://api.example.com/products
```

Flow:

```
Client
   ↓
API Endpoint
   ↓
Application Server
   ↓
Response Sent Back
```

Endpoints act as the **gateway to services**.

---

# 5. Security Risks of Endpoints

Endpoints can become security vulnerabilities if not managed properly.

Common risks:

- Unauthorized access
- Data leakage
- API abuse
- Malware attacks

Example attack:

```
Hacker → Unsecured API Endpoint → Data Access
```

---

# 6. Endpoint Security Practices

Organizations follow several practices to secure endpoints.

---

## 1. Authentication

Ensure only authorized users can access endpoints.

Example:

```
API Keys
OAuth Tokens
JWT Tokens
```

---

## 2. Encryption

Use secure protocols to protect data.

Example:

```
HTTPS instead of HTTP
```

This encrypts communication.

---

## 3. Access Control

Limit access based on user roles.

Example:

```
Admin → Full Access
User → Limited Access
```

---

## 4. Monitoring and Logging

Track endpoint usage and detect suspicious activity.

Example:

```
Request Logs
Security Alerts
```

---

# 7. Example Endpoint Architecture

```
User
  ↓
API Endpoint
  ↓
Authentication Layer
  ↓
Application Server
  ↓
Database / Storage
```

Each layer improves security and control.

---

# Key Points to Remember

- Endpoints are **communication points between systems**
- Used in **APIs, virtual machines, and cloud storage**
- API endpoints allow applications to access services
- Endpoint security is essential for protecting systems
- Use **authentication, encryption, and monitoring**

---

# Summary

Endpoints are critical communication points in cloud systems where applications exchange data. They are widely used in APIs, virtual machines, and storage services. Proper endpoint security practices such as authentication, encryption, and monitoring are essential to protect cloud infrastructure and ensure secure communication.

---








