## Docker: Pull and Run Node.js Image (Detailed Guide)

---

### 1. Pull Node.js Image from Docker Hub

Command:
    docker pull node

Explanation:
- Downloads the official Node.js image from Docker Hub  
- Stores it in your local system  

Pull specific version:
    docker pull node:18

Check downloaded images:
    docker images

---

### 2. Run Node.js Container (Basic)

Command:
    docker run -it node

Explanation:
- docker run → creates and starts container  
- -it → interactive terminal  
- node → image name  

This opens Node.js REPL inside container  

---

### 3. Run Node.js with Specific Version

Command:
    docker run -it node:18

Explanation:
- node:18 → specific version of Node.js  
- Useful to avoid version mismatch  

---

### 4. Run a Simple JavaScript Command

Command:
    docker run node node -e "console.log('Hello from Docker')"

Explanation:
- node → image  
- node -e → execute JS code  
- No need to create file  

---

### 5. Run Your Local JavaScript File in Docker

Step 1: Create a file
    app.js

Example:
    console.log("Hello from Docker Node");

---

Step 2: Run using Docker

Windows (CMD/PowerShell):
    docker run -it -v %cd%:/app -w /app node node app.js

Linux / Mac:
    docker run -it -v $(pwd):/app -w /app node node app.js

Explanation:
- -v → mounts your current folder into container  
- %cd% / $(pwd) → current directory  
- /app → folder inside container  
- -w /app → sets working directory  
- node app.js → runs your file  

---

### 6. Run Container in Background

Command:
    docker run -d node

Explanation:
- -d → detached mode (runs in background)  

Check running containers:
    docker ps

Stop container:
    docker stop <container_id>

---

### 7. Remove Container

Command:
    docker rm <container_id>

Remove all stopped containers:
    docker container prune

---

### 8. Image vs Container

| Feature   | Image                     | Container              |
|----------|--------------------------|------------------------|
| Meaning  | Blueprint                | Running instance       |
| State    | Static                   | Dynamic                |
| Usage    | Used to create container | Executes application   |

---

### 9. Complete Workflow

1. Pull image:
    docker pull node

2. Run container:
    docker run -it node

3. Run your app:
    docker run -it -v %cd%:/app -w /app node node app.js

---

### 10. Real Use Case

- Developer writes Node.js app  
- Runs app inside Docker  
- Shares project or image  
- Works same on all systems  

---

### Summary
- docker pull → download image  
- docker run → start container  
- -v → connect local files  
- -w → set working directory  
- -it → interactive mode  
- -d → background mode  
- 