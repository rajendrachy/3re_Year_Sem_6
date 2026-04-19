## Docker: Create and Manage Multiple Docker Images

---

### 1. What are Multiple Docker Images?

- You can create multiple images for different applications  
- Each image represents a separate project or version  

Example:
- node-app-v1  
- node-app-v2  
- backend-api  
- frontend-app  

---

### 2. Create Multiple Docker Images

Command:
    docker build -t app1 .

Create another image:
    docker build -t app2 .

Using version tags:
    docker build -t node-app:1.0 .
    docker build -t node-app:2.0 .

---

### 3. List All Docker Images

Command:
    docker images

Shows:
- Repository name  
- Tag (version)  
- Image ID  
- Size  

---

### 4. Run Containers from Different Images

Command:
    docker run -it app1
    docker run -it app2

Each image runs in its own container  

---

### 5. Remove Docker Images

Remove single image:
    docker rmi <image_id>

Remove by name:
    docker rmi app1

Force remove:
    docker rmi -f <image_id>

---

### 6. Remove Unused Containers

Command:
    docker container prune

- Removes all stopped containers  

---

### 7. Remove Unused Images

Command:
    docker image prune

Remove all unused images:
    docker image prune -a

---

### 8. Clean Entire System

Command:
    docker system prune

Remove everything (advanced):
    docker system prune -a

Explanation:
- Removes unused containers  
- Removes unused images  
- Clears cache  
- Frees disk space  

---

### 9. Best Practices

- Use proper naming and version tags  
- Remove unused images regularly  
- Avoid keeping large unused images  
- Use `.dockerignore` to reduce image size  

---

### 10. Real Use Case

- Project 1 → image: app1  
- Project 2 → image: app2  
- Run both separately without conflict  

---

### Summary
- Multiple images allow multiple projects  
- Use docker build to create images  
- Use docker images to view  
- Use prune commands to clean system  
