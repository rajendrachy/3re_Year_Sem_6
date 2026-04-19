# Docker Compose.yaml – Complete Notes (2025)

---

##  1. What is Docker Compose?

Docker Compose is a tool used to:

* Run **multiple containers together**
* Manage them using a **single YAML file**

Instead of running multiple `docker run` commands 
You define everything in **one file (compose.yaml)** 

---

##  2. What is `compose.yaml` File?

`compose.yaml` (or `docker-compose.yml`) is a configuration file where you define:

* Services (containers)
* Networks
* Volumes
* Environment variables
* Ports
* Dependencies

 It acts as a **blueprint of your entire application**

---

##  3. Why Use Docker Compose?

### Benefits:

* Run multi-container apps easily
* Start everything with one command
* Easy configuration management
* Ideal for development & testing
* Reusable setup
* Simplifies microservices architecture

---

##  4. Basic Structure of compose.yaml

```yaml
version: "3.9"

services:
  web:
    image: nginx
    ports:
      - "3000:80"

  db:
    image: mysql
    environment:
      MYSQL_ROOT_PASSWORD: root
```

---

##  5. Key Components Explained

###  version

Defines the version of the Compose file format

```yaml
version: "3.9"
```

---

###  services

Defines all containers in your app

```yaml
services:
  web:
  db:
```

---

###  image

Specifies which Docker image to use

```yaml
image: nginx
```

---

###  build

Builds image from Dockerfile

```yaml
build: .
```

---

###  ports

Maps container ports to host machine

```yaml
ports:
  - "3000:3000"
```

Format:

```
HOST_PORT:CONTAINER_PORT
```

---

###  environment

Used to define environment variables

```yaml
environment:
  NODE_ENV: production
```

---

###  volumes

Used for persistent storage

```yaml
volumes:
  - data:/var/lib/mysql
```

---

### depends_on

Defines service dependency order

```yaml
depends_on:
  - db
```

---

###  networks

Defines custom networks

```yaml
networks:
  - mynetwork
```

---

##  6. Example: Full Stack App (Node + MongoDB)

```yaml
version: "3.9"

services:
  app:
    build: .
    ports:
      - "5000:5000"
    environment:
      MONGO_URI: mongodb://mongo:27017/mydb
    depends_on:
      - mongo

  mongo:
    image: mongo
    volumes:
      - mongo-data:/data/db

volumes:
  mongo-data:
```

---

##  7. Important Commands

###  Start containers

```bash
docker-compose up
```

---

###  Run in background

```bash
docker-compose up -d
```

---

###  Stop containers

```bash
docker-compose down
```

---

###  Rebuild containers

```bash
docker-compose up --build
```

---

##  8. How Docker Compose Works

1. Reads the `compose.yaml` file
2. Pulls or builds images
3. Creates containers
4. Sets up networking
5. Starts all services together

---

##  9. Real-World Use Cases

* MERN Stack Applications
* Microservices Architecture
* Backend + Database setups
* Dev & Testing environments
* CI/CD pipelines

---

##  10. Best Practices

* Use `.env` file for secrets
* Use named volumes for data persistence
* Keep services small and modular
* Avoid hardcoding values
* Use separate configs for dev & production
* Use proper container naming

---

##  11. compose.yaml vs Dockerfile

| Feature  | Dockerfile       | Compose.yaml             |
| -------- | ---------------- | ------------------------ |
| Purpose  | Build image      | Run multi-container apps |
| Scope    | Single container | Multiple containers      |
| Use case | App build        | App orchestration        |

---

##  Final Summary

* Docker Compose = Tool for managing multi-container apps
* `compose.yaml` = Configuration file for entire application
* Helps run full-stack apps using **one command**
* Essential tool in modern DevOps workflows 

---


