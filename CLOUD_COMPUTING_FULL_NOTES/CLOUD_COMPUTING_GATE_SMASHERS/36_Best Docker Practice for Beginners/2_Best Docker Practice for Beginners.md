# Cloud Computing / DevOps
## Lec-35: Best Docker Practices for Beginners | How Containers Run in Docker

Docker containers allow applications to run consistently across different environments.

This lecture explains **how containers run in Docker and best practices for using Docker effectively**.

---

# 1. How Containers Run in Docker

Containers run using the **Docker Engine**.

Basic flow:

```
Docker Image → Docker Container → Running Application
```

Steps:

1. Developer creates a **Docker Image**
2. Docker Engine uses the image to create a **Container**
3. The container runs the **application**

Example:

```
Docker Image (Node.js App)
        ↓
Docker Container
        ↓
Application Running
```

---

# 2. What is a Docker Image?

A **Docker Image** is a template used to create containers.

It contains:

- Application code
- Dependencies
- Libraries
- Runtime
- Configuration

Example:

```
Docker Image
│
├── Application Code
├── Node.js Runtime
├── Libraries
└── Dependencies
```

When the image runs, it becomes a **container**.

---

# 3. Container Lifecycle

A container goes through several stages.

```
Create → Start → Run → Stop → Delete
```

Example commands:

Create container

```
docker create image_name
```

Run container

```
docker run image_name
```

Stop container

```
docker stop container_id
```

Remove container

```
docker rm container_id
```

---

# 4. Best Docker Practices for Beginners

To use Docker effectively, follow these best practices.

---

## 1. Use Official Images

Always use official Docker images from **Docker Hub**.

Example:

```
docker pull nginx
docker pull node
docker pull mysql
```

Benefits:

- Secure
- Maintained
- Stable

---

## 2. Keep Images Small

Smaller images load faster and consume fewer resources.

Example practice:

- Use **Alpine Linux images**
- Remove unnecessary packages

Example:

```
node:18-alpine
```

---

## 3. Use One Process per Container

Each container should run **only one main service**.

Example:

Good practice:

```
Container 1 → Node App
Container 2 → Database
Container 3 → Redis Cache
```

Bad practice:

```
One container running everything
```

---

## 4. Use Environment Variables

Sensitive data should not be hardcoded.

Example:

```
docker run -e DB_PASSWORD=12345 my_app
```

This keeps configurations flexible and secure.

---

## 5. Use Docker Volumes for Data

Containers are temporary. If they are removed, data may be lost.

Volumes store data **outside the container**.

Example:

```
docker volume create mydata
```

Run container with volume:

```
docker run -v mydata:/data mysql
```

This keeps database data safe.

---

## 6. Use Version Tags

Always specify image versions instead of using "latest".

Example:

Good practice:

```
node:18
```

Bad practice:

```
node:latest
```

Version tags ensure consistent environments.

---

# 5. Real-Life Example

Imagine **shipping food in containers**.

Without containers:

```
Food spills or gets mixed during transport
```

With containers:

```
Each food item is packed separately
```

Similarly in Docker:

```
Each application runs inside its own container
```

This ensures **isolation and stability**.

---

# Key Points to Remember

- Docker containers run from **Docker images**
- Docker Engine manages container execution
- Each container should run **one service**
- Use **official images**
- Keep images **small and optimized**
- Use **volumes for persistent data**

---

# Summary

Docker containers provide a lightweight and efficient way to run applications. By following best practices such as using official images, keeping images small, separating services into different containers, and using volumes for data persistence, developers can build scalable and reliable containerized applications.

---










