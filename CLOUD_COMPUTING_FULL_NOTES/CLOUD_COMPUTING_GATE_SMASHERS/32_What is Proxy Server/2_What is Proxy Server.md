# Cloud Computing / Networking  
## Lec-31: What is Proxy Server & Reverse Proxy

In networking, a **proxy server** acts as an intermediary between users and servers.  
It helps control requests, improve security, and manage internet traffic.

There are two important types:

1. Forward Proxy (Proxy Server)
2. Reverse Proxy

---

# 1. What is a Proxy Server?

A **Proxy Server** is an intermediate server that sits between a **client (user)** and the **internet**.

Simple definition:

> A proxy server forwards user requests to the internet and returns the response back to the user.

It hides the **real identity (IP address)** of the user.

---

# 2. How a Proxy Server Works

Normal internet communication:

```
User → Web Server → Response
```

With proxy server:

```
User → Proxy Server → Web Server → Proxy Server → User
```

The web server only sees the **proxy server**, not the actual user.

---

# 3. Real-Life Example of Proxy Server

Imagine a **company office receptionist**.

```
Employee → Receptionist → Manager
```

The receptionist communicates with the manager instead of the employee directly.

Similarly:

```
User → Proxy Server → Internet
```

The proxy acts as the **middle layer**.

---

# 4. Why Proxy Servers are Used

Proxy servers provide several benefits.

### Privacy Protection

They hide the user's real IP address.

---

### Access Control

Organizations can restrict access to certain websites.

Example:

```
Company blocks social media websites
```

---

### Caching

Proxy servers store frequently accessed web pages to improve speed.

Example:

```
Popular website stored in cache
→ Faster loading
```

---

### Network Security

Proxy servers can filter harmful traffic.

---

# 5. Forward Proxy (Standard Proxy)

A **Forward Proxy** works on behalf of the **client (user)**.

It is mainly used by:

- Individuals
- Organizations
- Internal networks

Architecture:

```
Client → Forward Proxy → Internet Server
```

Purpose:

- Hide user identity
- Control user internet access

---

# 6. What is a Reverse Proxy?

A **Reverse Proxy** sits between **clients and web servers**, but it works on behalf of the **server**.

Simple definition:

> A reverse proxy receives client requests and forwards them to the appropriate backend server.

Architecture:

```
Client → Reverse Proxy → Web Server
```

The client does not directly interact with the backend server.

---

# 7. Real-Life Example of Reverse Proxy

Imagine a **hotel reception desk**.

```
Guest → Reception → Hotel Staff
```

The guest communicates only with the reception, not the individual staff members.

Similarly:

```
Client → Reverse Proxy → Application Servers
```

---

# 8. Features of Reverse Proxy

Reverse proxies provide several important features.

### Load Balancing

Distributes incoming traffic across multiple servers.

Example:

```
Request 1 → Server A
Request 2 → Server B
Request 3 → Server C
```

This improves system performance.

---

### Security Protection

Reverse proxy hides the real backend servers from users.

This helps protect against:

- DDoS attacks
- Unauthorized access

---

### SSL Termination

Handles encryption and decryption of secure traffic.

Example:

```
HTTPS traffic handled by reverse proxy
```

---

### Caching

Stores frequently requested content to improve response speed.

---

# 9. Forward Proxy vs Reverse Proxy

| Feature | Forward Proxy | Reverse Proxy |
|------|------|------|
| Works for | Client | Server |
| Purpose | Hide client identity | Protect backend servers |
| Location | Between client and internet | Between client and servers |
| Example Use | Corporate internet filtering | Load balancing for websites |

---

# 10. Examples of Proxy Technologies

Common proxy tools include:

Forward Proxy:

- Squid Proxy
- Corporate proxy servers

Reverse Proxy:

- Nginx
- HAProxy
- Cloudflare
- AWS Elastic Load Balancer

---

# Key Points to Remember

- A **proxy server** acts as an intermediary between users and the internet
- It helps with **privacy, caching, and security**
- **Forward Proxy** works on behalf of the client
- **Reverse Proxy** works on behalf of the server
- Reverse proxies are widely used for **load balancing and security**

---

# Summary

Proxy servers and reverse proxies are important networking components that manage communication between clients and servers.  
A **forward proxy protects the client and controls internet access**, while a **reverse proxy protects servers and distributes incoming traffic**, improving security, performance, and scalability in modern web architectures.

---







