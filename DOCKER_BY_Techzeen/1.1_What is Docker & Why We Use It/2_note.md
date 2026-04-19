## Docker Basics Notes

---

### 1. What is Docker?

Docker is a platform used to develop, ship, and run applications inside containers.

- It allows developers to package an application with all its dependencies  
- Ensures the application runs the same in every environment  

Definition:
Docker = Tool to create and manage containers

---

### 2. Why Docker is Important for DevOps

- Eliminates "works on my machine" problem  
- Makes deployment fast and consistent  
- Improves collaboration between development and operations teams  
- Supports CI/CD pipelines  
- Reduces environment setup time  

---

### 3. What are Containers?

- Containers are lightweight, standalone packages  
- They include:
  - Application code  
  - Runtime  
  - Libraries  
  - Dependencies  

- Containers share the host OS but run in isolation  

Example:
An app + Node.js + dependencies packaged together = container  

---

### 4. How Containers Work

- Docker uses OS-level virtualization  
- Each container runs as an isolated process  
- Uses Docker Engine to manage containers  

Basic flow:
1. Create Dockerfile  
2. Build Image  
3. Run Container  

---

### 5. Problems Without Docker

#### Environment Issues
- Code works on developer machine but fails on server  

#### Dependency Conflicts
- Different versions of libraries cause errors  

#### Setup Time
- Manual installation of tools is time-consuming  

#### Deployment Complexity
- Difficult to maintain consistency across environments  

---

### 6. How Docker Solves These Problems

#### Consistent Environment
- Same container runs everywhere  

#### Dependency Management
- All dependencies are bundled inside container  

#### Fast Deployment
- Containers start quickly  

#### Scalability
- Easy to run multiple containers  

#### Isolation
- Applications do not interfere with each other  

---

### 7. Basic Docker Workflow

1. Write a Dockerfile  
2. Build image:
    docker build -t app-name .
3. Run container:
    docker run -d -p 3000:3000 app-name  

---

### 8. Key Docker Terms

- Image: Blueprint of application  
- Container: Running instance of image  
- Dockerfile: Instructions to build image  
- Docker Hub: Online repository for images  

---

### Summary
- Docker helps run applications in containers  
- Containers package code with dependencies  
- Solves environment and deployment issues  
- Essential tool in DevOps workflows  
