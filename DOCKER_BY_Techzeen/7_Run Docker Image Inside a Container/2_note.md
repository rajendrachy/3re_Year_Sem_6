## Docker: Run Docker Image Inside a Container

---

### 1. What Does "Run Image in Container" Mean?

- Docker Image = blueprint  
- Docker Container = running instance  

Running an image means:
- Creating a container from that image  
- Executing the application inside it  

---

### 2. Basic Command to Run Container

Command:
    docker run node

Explanation:
- docker run → creates and starts container  
- node → image name  

---

### 3. Run Container with Interactive Mode

Command:
    docker run -it node

Explanation:
- -it → interactive terminal  
- Allows you to interact with container  

---

### 4. Run Container in Background

Command:
    docker run -d node

Explanation:
- -d → detached mode  
- Runs container in background  

---

### 5. Run Container with Custom Name

Command:
    docker run -it --name my-container node

Explanation:
- --name → assign custom name to container  

---

### 6. Run Container with Port Mapping

Command:
    docker run -d -p 3000:3000 node-app

Explanation:
- -p → maps ports  
- 3000:3000 → local port : container port  

---

### 7. Check Running Containers

Command:
    docker ps

Show all containers (including stopped):
    docker ps -a

---

### 8. Stop and Start Container

Stop container:
    docker stop <container_id>

Start container:
    docker start <container_id>

---

### 9. Remove Container

Command:
    docker rm <container_id>

Remove all stopped containers:
    docker container prune

---

### 10. Real-Life Workflow

1. Build image:
    docker build -t node-app .

2. Run container:
    docker run -d -p 3000:3000 node-app

3. Access app:
    http://localhost:3000

---

### 11. Important Options Summary

- docker run → start container  
- -it → interactive mode  
- -d → background mode  
- --name → container name  
- -p → port mapping  

---

### Summary
- Image is used to create container  
- Container runs the application  
- docker run is the main command  
- Use flags like -it, -d, -p for control  
