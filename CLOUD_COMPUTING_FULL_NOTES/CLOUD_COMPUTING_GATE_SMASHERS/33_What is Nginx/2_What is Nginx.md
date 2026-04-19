# Cloud Computing / Web Infrastructure  
## Lec-32: What is Nginx? | Web Server, Reverse Proxy & Load Balancer

Nginx (pronounced **Engine-X**) is one of the most popular web servers used to deliver web applications efficiently.

It is widely used for:

- Web serving
- Reverse proxy
- Load balancing
- Security and performance optimization

Large companies like **Netflix, Airbnb, and Instagram** use Nginx to handle heavy web traffic.

---

# 1. What is Nginx?

**Nginx** is a high-performance **web server and reverse proxy server** designed to handle large numbers of concurrent connections.

Simple definition:

> Nginx is software that helps deliver websites and applications to users over the internet.

It can also act as:

- Reverse Proxy
- Load Balancer
- API Gateway
- Static file server

---

# 2. What is an HTTP Request?

When a user visits a website, the browser sends an **HTTP request** to a server.

Example:

```
User → Browser → HTTP Request → Web Server
```

Example request:

```
GET /index.html HTTP/1.1
Host: example.com
```

The server processes the request and sends back a **response**.

```
Server → HTTP Response → Browser → User
```

---

# 3. Nginx as a Web Server

Nginx can serve **static files** such as:

- HTML
- CSS
- JavaScript
- Images
- Videos

Example architecture:

```
User → Nginx → Website Files → Response
```

Because Nginx is optimized for speed, it can handle **thousands of simultaneous users**.

---

# 4. Nginx as a Reverse Proxy

Nginx is commonly used as a **reverse proxy server**.

It sits between users and backend servers.

Architecture:

```
Client → Nginx → Application Server
```

Benefits:

- Hides backend servers
- Improves security
- Manages incoming traffic

Example:

```
User Request
     ↓
Nginx Reverse Proxy
     ↓
Backend Server (Node.js / Python / Java)
```

---

# 5. Nginx as a Load Balancer

When many users access a website, traffic must be distributed across multiple servers.

Nginx can act as a **load balancer**.

Example:

```
User Requests
      ↓
     Nginx
  ┌────┼────┐
Server1 Server2 Server3
```

Nginx distributes requests evenly to avoid overloading one server.

Benefits:

- Better performance
- High availability
- Scalability

---

# 6. SSL Termination in Nginx

SSL encryption secures communication between users and servers.

Example:

```
HTTPS connection
```

Nginx can handle **SSL/TLS encryption**.

Architecture:

```
User → HTTPS → Nginx → HTTP → Backend Server
```

Advantages:

- Offloads encryption workload from backend servers
- Improves application performance

---

# 7. Compression and Segmentation

Nginx improves performance using **compression techniques**.

### Compression

Nginx compresses files before sending them.

Example:

```
Large HTML file
→ Compressed with GZIP
→ Faster transfer
```

---

### Segmentation

Large files can be sent in smaller segments to improve delivery speed.

This helps users receive content **faster and more efficiently**.

---

# 8. Nginx vs Apache

Both Nginx and Apache are popular web servers.

| Feature | Nginx | Apache |
|------|------|------|
| Performance | Very high performance | Good but heavier |
| Architecture | Event-driven | Process-based |
| Concurrency | Handles many connections efficiently | Uses more resources |
| Static Content | Faster | Slower compared to Nginx |

Nginx is often preferred for **high-traffic websites**.

---

# Real-Life Example

Imagine a **restaurant receptionist**.

```
Customers → Receptionist → Kitchen Staff
```

The receptionist receives orders and distributes them to the right staff.

Similarly:

```
Users → Nginx → Application Servers
```

Nginx manages requests efficiently.

---

# Key Points to Remember

- Nginx is a **high-performance web server**
- It can act as a **reverse proxy**
- It can perform **load balancing**
- It improves **security and performance**
- It is widely used in **modern web infrastructure**

---

# Summary

Nginx is a powerful web server and reverse proxy widely used in modern cloud architectures.  
It efficiently handles HTTP requests, distributes traffic across multiple servers, improves application performance, and enhances security through SSL termination and request management.

---







