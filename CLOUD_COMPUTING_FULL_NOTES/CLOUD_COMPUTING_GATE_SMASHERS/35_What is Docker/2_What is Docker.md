# Cloud Computing / DevOps
## Lec-34: What is Docker | Containers Explained

Docker is a popular platform used to build, package, and run applications in **containers**.

It allows developers to bundle an application along with its dependencies so it can run **anywhere without environment issues**.

---

# 1. What is Docker?

Docker is a **containerization platform** that packages an application with all required libraries, dependencies, and configurations.

Simple definition:

> Docker is a tool that allows applications to run consistently across different environments using containers.

This solves the common problem:

```
"It works on my computer but not on the server."
```

---

# 2. Why Docker is Needed

Before Docker, applications often failed when moved from one environment to another.

Example:

```
Developer PC → Testing Server → Production Server
```

Problems could occur due to:

- Different OS versions
- Different libraries
- Different runtime environments

Docker solves this by packaging everything together.

---

# 3. What is a Container?

A **container** is a lightweight unit that includes:

- Application code
- Runtime
- Libraries
- Dependencies
- Configuration

Example structure:

```
Container
│
├── Application
├── Libraries
├── Dependencies
└── Runtime
```

Containers ensure the application runs the same everywhere.

---

# 4. Real-Life Example

Imagine sending a **parcel**.

Without packaging:

```
Items may get damaged during transport
```

With packaging (container):

```
Items are protected and transported safely
```

Similarly:

```
Application + Dependencies
→ Packed into Docker Container
→ Runs anywhere
```

---

# 5. Microservices Using Multiple Containers

Modern applications are often built using **microservices architecture**.

Each service runs in a separate container.

Example:

```
Application
│
├── User Service Container
├── Payment Service Container
├── Order Service Container
└── Database Container
```

Benefits:

- Independent scaling
- Easy updates
- Better reliability

---

# 6. Docker Engine

Docker Engine is the **core component of Docker**.

It is responsible for:

- Building containers
- Running containers
- Managing container lifecycle

Architecture:

```
Docker Engine
│
├── Docker Daemon
├── Docker CLI
└── Containers
```

### Docker Daemon
Background service that manages containers.

### Docker CLI
Command-line tool used by developers to interact with Docker.

---

# 7. What is Docker Hub?

Docker Hub is an **online repository for Docker images**.

Developers can:

- Store Docker images
- Share images
- Download images

Example:

```
Docker Hub
│
├── Node.js Image
├── Python Image
├── MySQL Image
└── Nginx Image
```

Example command:

```
docker pull nginx
```

This downloads the Nginx container image.

---

# 8. Introduction to Kubernetes

When many containers run together, managing them becomes complex.

**Kubernetes** is used to manage and orchestrate containers.

It helps with:

- Container deployment
- Scaling
- Load balancing
- Self-healing

Example architecture:

```
Users
  ↓
Kubernetes
  ↓
Multiple Docker Containers
```

---

# Key Advantages of Docker

- Portability (Run anywhere)
- Lightweight compared to VMs
- Faster deployment
- Easy scaling
- Consistent environments

---

# Key Points to Remember

- Docker is a **containerization platform**
- Containers package applications with dependencies
- Docker Engine manages containers
- Docker Hub stores container images
- Kubernetes manages multiple containers

---

# Summary

Docker simplifies application deployment by packaging applications and their dependencies into lightweight containers. This ensures that software runs consistently across development, testing, and production environments, making Docker a critical tool in modern cloud computing and DevOps workflows.

---













