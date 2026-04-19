# Cloud Computing / DevOps
## Lec-36: Image vs Container | Real-Life Example & Demo

In Docker, **Images and Containers** are two core concepts.  
An **image acts as a blueprint**, while a **container is the running instance of that blueprint**.

---

# 1. What is a Docker Image?

A **Docker Image** is a read-only template used to create containers.

It contains everything needed to run an application:

- Application code
- Libraries
- Dependencies
- Runtime
- Configuration

Example structure:

```
Docker Image
│
├── Application Code
├── Libraries
├── Dependencies
└── Runtime Environment
```

Images **do not run directly**. They are used to create containers.

---

# 2. What is a Docker Container?

A **Docker Container** is a running instance of a Docker Image.

It executes the application defined in the image.

Example:

```
Docker Image → Create Container → Application Runs
```

Containers are:

- Lightweight
- Fast
- Isolated from other applications

---

# 3. Image vs Container (Real-Life Analogy)

A common real-life analogy is **class vs object**.

Example:

```
Blueprint → House
```

Explanation:

- **Blueprint = Image**
- **Actual House = Container**

Another example:

```
Recipe → Cooked Food
```

- Recipe = Image
- Cooked food = Container

---

# 4. Image is Immutable

Docker images are **immutable**.

Immutable means:

```
Images cannot be changed after they are created.
```

If changes are needed:

1. Create a new image
2. Build a new container

Example:

```
Image v1
Image v2
Image v3
```

---

# 5. Container is Mutable

Containers are **mutable**, meaning they can change while running.

Examples of changes:

- Install packages
- Modify files
- Generate logs
- Store temporary data

But these changes disappear if the container is removed.

---

# 6. Docker Pull Example

To download an image from Docker Hub:

```
docker pull nginx
```

Explanation:

- Docker connects to **Docker Hub**
- Downloads the **Nginx Image**

Architecture:

```
Docker Hub → Image Downloaded → Local System
```

---

# 7. Docker Run Example

To start a container from an image:

```
docker run nginx
```

This command:

1. Creates a container
2. Starts the Nginx server

Architecture:

```
Docker Image
     ↓
Docker Container
     ↓
Nginx Server Running
```

---

# 8. Output Verification

To check running containers:

```
docker ps
```

This command shows:

- Container ID
- Image used
- Running status
- Ports

Example output:

```
CONTAINER ID   IMAGE   STATUS
123abc         nginx   Running
```

---

# 9. Image vs Container Comparison

| Feature | Image | Container |
|------|------|------|
| Definition | Blueprint of application | Running instance of image |
| Nature | Read-only | Writable |
| State | Static | Dynamic |
| Usage | Used to create containers | Runs the application |

---

# Key Points to Remember

- Docker **Image = Template**
- Docker **Container = Running instance**
- Images are **immutable**
- Containers are **mutable**
- Containers are created using images

---

# Summary

In Docker, images act as the blueprint for applications, while containers are the running instances created from those images. Images remain unchanged and reusable, while containers execute applications and can be modified during runtime. Understanding this difference is fundamental to working effectively with Docker.

---


