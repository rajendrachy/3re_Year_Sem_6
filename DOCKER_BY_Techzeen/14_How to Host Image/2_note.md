#  Play With Docker (PWD) – Hosting Docker Images (2025)

---

##  1. What is Play With Docker?

Play With Docker (PWD) is an **online Docker playground** that allows you to:

* Run Docker containers in your browser 
* Test Docker commands without installing Docker
* Host and run Docker images for free (temporary)

 It provides a **real Docker environment in the cloud**

---

##  2. Why Use Play With Docker?

###  Benefits:

* No installation required
* Free to use
* Great for beginners
* Practice Docker commands online
* Test and run Docker images quickly

---

##  3. Key Features

* Browser-based Docker environment
* Temporary instances (4 hours session )
* Supports Docker CLI commands
* Can run multiple containers
* Provides public URL for apps

---

##  4. Prerequisites

Before using PWD:

* Docker Hub account 
* Internet connection 
* Basic Docker knowledge 

---

##  5. Steps: How to Host Docker Image on Play With Docker

---

###  Step 1: Open Play With Docker

 Visit:

```
https://labs.play-with-docker.com/
```

 Login using Docker Hub account

---

###  Step 2: Start a New Instance

* Click **"Start"**
* Click **"+ Add New Instance"**

 This creates a virtual Docker machine

---

###  Step 3: Pull Your Docker Image

```bash
docker pull username/app-name:latest
```

---

###  Step 4: Run Your Container

```bash
docker run -d -p 3000:3000 username/app-name
```

 `-d` → run in background
 `-p` → expose port

---

###  Step 5: Access Your App

* Click on **"Open Port"** (top UI)
* Enter port (e.g., 3000)

 You’ll get a **public URL** 

---

##  6. Full Example

```bash
# Pull image
docker pull rajendra/node-app:latest

# Run container
docker run -d -p 5000:5000 rajendra/node-app

# Access via browser
# Open port 5000 from UI
```

---

##  7. Important Commands

###  Check running containers

```bash
docker ps
```

---

###  Stop container

```bash
docker stop container_id
```

---

###  Remove container

```bash
docker rm container_id
```

---

###  List images

```bash
docker images
```

---

##  8. Real-World Use Cases

* Testing Docker apps quickly
* Demo projects
* Learning Docker commands
* Sharing live apps temporarily
* Debugging containers

---

##  9. Limitations of Play With Docker

* Session expires after few hours 
* Not for production use 
* Limited resources (CPU/RAM)
* Data not persistent

---

##  10. Best Practices

* Use small/lightweight images
* Expose correct ports
* Stop unused containers
* Save work externally (GitHub)

---

##  11. PWD vs Local Docker

| Feature   | Play With Docker | Local Docker     |
| --------- | ---------------- | ---------------- |
| Setup     | No install       | Requires install |
| Usage     | Temporary        | Permanent        |
| Resources | Limited          | Full control     |
| Use case  | Learning/testing | Production/dev   |

---

##  12. PWD in DevOps Learning

PWD is useful for:

* Practicing CI/CD pipelines
* Testing container deployments
* Learning Kubernetes basics
* Quick demos during interviews

---

##  Final Summary

* Play With Docker = Online Docker lab
* Pull → Run → Expose port → Access app
* Best for learning & testing
* Not for production use

 Perfect tool for beginners in DevOps!

---



