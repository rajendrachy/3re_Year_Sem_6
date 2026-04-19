## Docker: .dockerignore File

---

### 1. What is .dockerignore?

- `.dockerignore` is a file used to ignore unnecessary files and folders  
- Works similar to `.gitignore`  
- Prevents files from being sent to Docker during build  

Definition:
.dockerignore = file to exclude unwanted files from Docker image  

---

### 2. Why .dockerignore is Important

- Reduces image size  
- Improves build speed  
- Avoids sending sensitive files  
- Keeps Docker image clean  

---

### 3. How Docker Build Works

When you run:
    docker build -t app .

- Docker sends all files from current folder to Docker daemon  
- Without `.dockerignore`, everything is included  

---

### 4. Create .dockerignore File

Create file:
    .dockerignore

Add rules inside it  

---

### 5. Ignore Files and Folders

Example:
    node_modules
    .git
    .env
    logs

Explanation:
- node_modules → large dependencies  
- .git → version control files  
- .env → sensitive data  
- logs → unnecessary files  

---

### 6. Ignore Specific File Types

Example:
    *.log
    *.tmp
    *.cache

Explanation:
- Ignores all files with these extensions  

---

### 7. Ignore Multiple Files

Example:
    file1.txt
    file2.txt

---

### 8. Ignore Folders with Pattern

Example:
    temp/
    build/

---

### 9. Important Rules

- Each line = one rule  
- Supports wildcards (*)  
- Similar syntax as `.gitignore`  

---

### 10. Best Practices

- Always ignore `node_modules`  
- Ignore `.env` files (security)  
- Ignore logs and temporary files  
- Keep `.dockerignore` minimal and clean  

---

### 11. Real Example

Project structure:
    app.js
    node_modules/
    .env
    Dockerfile

.dockerignore:
    node_modules
    .env

Result:
- Only necessary files go into Docker image  

---

### Summary
- `.dockerignore` excludes files from Docker build  
- Improves performance and security  
- Works like `.gitignore`  
- Helps create smaller and cleaner images  







