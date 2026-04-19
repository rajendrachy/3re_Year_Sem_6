# Cloud Computing / DevOps
## Lec-37: What is Kubernetes? | Architecture Explained

Kubernetes (K8s) is a container orchestration platform used to manage, deploy, and scale containerized applications automatically.

It helps organizations handle **large numbers of Docker containers efficiently**.

---

# 1. What is Kubernetes?

Kubernetes is an **open-source container orchestration system** that automates the deployment, scaling, and management of containerized applications.

Simple definition:

> Kubernetes is a platform that manages multiple containers automatically.

It was originally developed by **Google**.

---

# 2. Why Do We Need Kubernetes?

When applications use many containers, managing them manually becomes difficult.

Example problem:

```
Application
│
├── 50 Containers
├── 100 Containers
└── 500 Containers
```

Manual management becomes impossible.

Kubernetes solves this by automating:

- Container deployment
- Scaling
- Load balancing
- Monitoring
- Self-healing

---

# 3. Kubernetes in DevOps

Kubernetes plays a major role in **modern DevOps workflows**.

It helps teams:

- Deploy applications quickly
- Scale services automatically
- Maintain high availability

Typical DevOps workflow:

```
Developer → Docker Container → Kubernetes → Production
```

---

# 4. Kubernetes Architecture

Kubernetes architecture mainly consists of two components:

```
Kubernetes Cluster
│
├── Master Node (Control Plane)
└── Worker Nodes
```

---

# 5. Master Node (Control Plane)

The **Master Node** manages the entire Kubernetes cluster.

Responsibilities:

- Scheduling containers
- Managing cluster state
- Monitoring system health

Main components of Master Node:

```
Master Node
│
├── API Server
├── ETCD
└── Scheduler
```

---

# 6. API Server

The **API Server** is the main communication gateway.

All commands and requests pass through the API server.

Example:

```
User → API Server → Kubernetes Cluster
```

Responsibilities:

- Accepts requests
- Validates requests
- Updates cluster state

---

# 7. ETCD

ETCD is a **distributed key-value database**.

It stores all cluster data such as:

- Configuration
- Cluster state
- Container details

Example stored data:

```
Cluster Information
│
├── Nodes
├── Pods
├── Services
└── Configuration
```

---

# 8. Scheduler

The **Scheduler** decides where containers should run.

Example:

```
Worker Node 1
Worker Node 2
Worker Node 3
```

The scheduler determines:

```
Which node has enough resources?
```

Then it assigns the container to that node.

---

# 9. Worker Node

Worker Nodes are machines where **containers actually run**.

Structure:

```
Worker Node
│
├── Kubelet
├── Kube-proxy
└── Containers / Pods
```

---

# 10. Kubelet

Kubelet is an agent running on each worker node.

Responsibilities:

- Communicates with the Master Node
- Ensures containers are running
- Monitors container health

Example:

```
Master Node → Kubelet → Container Execution
```

---

# 11. Kube-proxy

Kube-proxy handles **network communication between containers**.

Responsibilities:

- Network routing
- Load balancing
- Service communication

Example:

```
User Request
      ↓
Kube-proxy
      ↓
Correct Container
```

---

# 12. Real-Life Example

Imagine a **large restaurant kitchen**.

```
Customers → Manager → Chefs
```

Explanation:

- Customers = Users
- Manager = Kubernetes Master Node
- Chefs = Worker Nodes
- Dishes = Containers

The manager assigns work to the chefs and ensures everything runs smoothly.

---

# 13. Kubernetes Architecture Diagram

```
                 Users
                   │
               API Server
                   │
        ┌──────────┴──────────┐
        │                     │
      Scheduler             ETCD
        │
   ┌────┴─────┐
   │          │
Worker Node  Worker Node
   │          │
Kubelet     Kubelet
   │          │
Containers  Containers
```

---

# Key Advantages of Kubernetes

- Automatic container deployment
- Auto-scaling
- Self-healing containers
- Load balancing
- High availability

---

# Key Points to Remember

- Kubernetes manages **containerized applications**
- It automates **deployment and scaling**
- Uses **Master Node and Worker Nodes**
- Master Node controls the cluster
- Worker Nodes run containers

---

# Summary

Kubernetes is a powerful container orchestration platform that manages Docker containers at scale. By automating deployment, scaling, monitoring, and load balancing, Kubernetes allows organizations to build highly scalable and reliable cloud-native applications.

---








