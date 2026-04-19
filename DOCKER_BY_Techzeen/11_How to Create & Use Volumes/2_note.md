## Docker: Volumes (Create and Use with Containers)

---

### 1. What is a Docker Volume?

- A Docker Volume is used to store data outside the container  
- Data remains safe even if the container is deleted  

Definition:
Volume = Persistent storage for containers  

---

### 2. Why Volumes are Needed

- Containers are temporary (data lost when deleted)  
- Volumes keep data permanent  
- Used for databases, logs, and project files  

---

### 3. Create Docker Volume

Command:
    docker volume create my-volume

Check volumes:
    docker volume ls

---

### 4. Use Volume with Container

Command:
    docker run -it -v my-volume:/app node

Explanation:
- -v → attach volume  
- my-volume → volume name  
- /app → path inside container  

---

### 5. Bind Mount (Local Folder Sync)

Windows:
    docker run -it -v %cd%:/app node

Linux / Mac:
    docker run -it -v $(pwd):/app node

Explanation:
- Syncs local folder with container  
- Any change in local file reflects in container  

---

### 6. Difference: Volume vs Bind Mount

| Feature        | Volume                     | Bind Mount                  |
|----------------|--------------------------|-----------------------------|
| Location       | Managed by Docker        | Local system folder         |
| Use Case       | Persistent storage       | Development (live sync)     |
| Performance    | Better                   | Depends on system           |

---

### 7. Check Volume Details

Command:
    docker volume inspect my-volume

---

### 8. Remove Volume

Command:
    docker volume rm my-volume

Remove unused volumes:
    docker volume prune

---

### 9. Real Use Case

- Run database container  
- Store data in volume  
- Even if container stops or deletes → data stays safe  

---

### 10. Workflow Example

1. Create volume:
    docker volume create my-volume

2. Run container:
    docker run -it -v my-volume:/app node

3. Data stored in volume persists  

---

### Summary
- Volume stores data permanently  
- Prevents data loss  
- Use -v to attach volume  
- Bind mount is used for local development  




