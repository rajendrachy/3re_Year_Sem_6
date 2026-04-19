#  Docker Hub & Uploading Images – Complete Notes (2025)

---

##  1. What is Docker Hub?

Docker Hub is a **cloud-based repository** where you can:

* Store Docker images
* Share images with others
* Pull images anywhere
* Manage versions of images

 Think of it like **GitHub for Docker Images**

---

##  2. Why Use Docker Hub?

###  Benefits:

* Central place to store images
* Easy sharing across teams
* Version control for images
* Supports CI/CD pipelines
* Public & private repositories available

---

##  3. Key Concepts

###  Repository

* A collection of Docker images
* Example:

```id="e2c4h1"
username/app-name
```

---

###  Image

* Snapshot of your application
* Contains code + dependencies

---

###  Tag

* Version of an image

```id="u7t9b2"
username/app-name:latest
username/app-name:v1
```

---

##  4. Prerequisites

Before uploading image:

* Docker installed 
* Docker Hub account 
* Image built locally 

---

##  5. Step-by-Step: Upload Image to Docker Hub

---

###  Step 1: Login to Docker Hub

```bash id="n1x7k2"
docker login
```

 Enter:

* Username
* Password

---

###  Step 2: Build Docker Image

```bash id="r8k3p4"
docker build -t myapp .
```

---

###  Step 3: Tag Image

```bash id="m4z9x8"
docker tag myapp username/myapp:latest
```

 Format:

```id="p3w2y1"
local-image-name  username/repository:tag
```

---

###  Step 4: Push Image to Docker Hub

```bash id="q8l2d7"
docker push username/myapp:latest
```

---

###  Step 5: Verify

Go to Docker Hub → Your Repository
 Image should be visible 

---

##  6. Full Example Workflow

```bash id="h3k9d2"
# Build image
docker build -t node-app .

# Tag image
docker tag node-app rajendra/node-app:latest

# Login
docker login

# Push
docker push rajendra/node-app:latest
```

---

##  7. Pull Image from Docker Hub

```bash id="c9x1b5"
docker pull username/myapp:latest
```

---

##  8. Run Pulled Image

```bash id="z2m8y4"
docker run -p 3000:3000 username/myapp
```

---

##  9. Best Practices

* Use meaningful image names
* Always use tags (v1, v2, latest)
* Avoid pushing sensitive data
* Use `.dockerignore`
* Keep images lightweight
* Use official base images

---

##  10. Common Errors & Fixes

###  Access Denied

 Fix:

```bash id="f7g5t1"
docker login
```

---

### Repository does not exist

Fix:

* Create repo on Docker Hub first

---

###  Tag missing

 Fix:

```bash id="x4v6n8"
docker tag image username/repo:tag
```

---

##  11. Public vs Private Repositories

| Type    | Access          |
| ------- | --------------- |
| Public  | Anyone can pull |
| Private | Only you / team |

---

##  12. Real-World Use Cases

* Deploy apps on cloud
* Share images with team
* CI/CD pipelines
* Microservices deployment

---

##  13. Docker Hub in DevOps

Docker Hub is used in:

* CI/CD pipelines (GitHub Actions, Jenkins)
* Kubernetes deployments
* Cloud platforms (AWS, Azure, GCP)

---

##  Final Summary

* Docker Hub = Cloud storage for Docker images
* Push = Upload image
* Pull = Download image
* Tagging is important for versioning
* Essential for DevOps workflows 

---

