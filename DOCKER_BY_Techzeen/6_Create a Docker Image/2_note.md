## Docker: Create Image for Node.js App using Dockerfile

---

### 1. What is a Dockerfile?

- A Dockerfile is a text file with instructions to build a Docker image  
- It automates the process of creating images  

Definition:
Dockerfile = Instructions to build Docker Image  

---

### 2. Why Dockerfile is Needed

- No need to manually install dependencies  
- Ensures same setup everywhere  
- Easy to share and deploy applications  
- Used in CI/CD pipelines  

---

### 3. Basic Structure of Dockerfile

Example:
    FROM node:18
    WORKDIR /app
    COPY package.json .
    RUN npm install
    COPY . .
    CMD ["node", "app.js"]

---

### 4. Explanation of Each Command

#### FROM
    FROM node:18
- Base image  
- Node.js environment ready  

#### WORKDIR
    WORKDIR /app
- Sets working directory inside container  

#### COPY (package.json)
    COPY package.json .
- Copies package.json file  

#### RUN
    RUN npm install
- Installs dependencies  

#### COPY (all files)
    COPY . .
- Copies all project files  

#### CMD
    CMD ["node", "app.js"]
- Default command to run app  

---

### 5. Create Node.js App

Step 1: Create file
    app.js

Example:
    console.log("Hello from Dockerfile Node App");

Optional package.json:
    {
      "name": "node-docker-app",
      "version": "1.0.0",
      "main": "app.js"
    }

---

### 6. Build Docker Image

Command:
    docker build -t node-app .

Explanation:
- -t → tag (name of image)  
- node-app → image name  
- . → current directory  

Check image:
    docker images

---

### 7. Run Container from Image

Command:
    docker run -it node-app

Explanation:
- Runs container using created image  

---

### 8. Run in Background

Command:
    docker run -d node-app

Check running containers:
    docker ps

---

### 9. Best Practices

- Use specific version (node:18 instead of latest)  
- Use .dockerignore to avoid unnecessary files  
- Keep image size small  
- Copy only required files first (for caching)  

---

### 10. Complete Workflow

1. Create app.js  
2. Create Dockerfile  
3. Build image:
    docker build -t node-app .
4. Run container:
    docker run -it node-app  

---

### Summary
- Dockerfile is used to create images  
- FROM → base image  
- WORKDIR → working folder  
- COPY → add files  
- RUN → install dependencies  
- CMD → run application  
- 