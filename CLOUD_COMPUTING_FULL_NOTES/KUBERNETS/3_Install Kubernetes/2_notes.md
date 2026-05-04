# Kubernetes Setup on Windows (Minikube + Docker) — Notes

## Overview

This guide explains how to set up a local Kubernetes environment on Windows using:

* Chocolatey (package manager)
* Docker (container runtime)
* Minikube (local Kubernetes cluster)
* kubectl (CLI tool)

---

## Tools and Purpose

| Tool       | Purpose                           |
| ---------- | --------------------------------- |
| Chocolatey | Install software via command line |
| Docker     | Run containers                    |
| Minikube   | Create a local Kubernetes cluster |
| kubectl    | Interact with Kubernetes          |

---

## Installation Steps

### 1. Install Chocolatey

Run PowerShell as Administrator:

```bash
Set-ExecutionPolicy Bypass -Scope Process -Force
```

Then install Chocolatey using the official script.

---

### 2. Install Required Tools

```bash
choco install docker-desktop
choco install minikube
choco install kubernetes-cli
```

---

### 3. Start Docker

* Open Docker Desktop
* Ensure it is running before using Minikube

---

### 4. Start Kubernetes Cluster

```bash
minikube start --driver=docker
```

---

### 5. Verify Installation

```bash
kubectl cluster-info
kubectl get nodes
```

Expected:

* One node (Minikube)

---

## Deploy First Application

### Create Deployment

```bash
kubectl create deployment myapp --image=nginx
```

---

### Expose Deployment

```bash
kubectl expose deployment myapp --type=NodePort --port=80
```

---

### Access Application

```bash
minikube service myapp
```

This opens the application in your browser.

---

## Key Concepts

### Cluster

Group of machines running Kubernetes

### Node

A machine inside the cluster

### Pod

Smallest unit that runs a container

### Deployment

Manages pods and scaling

### Service

Exposes application to the network

---

## Common Issues

* Docker not running leads to Minikube failure
* Not using administrator PowerShell
* Missing `--driver=docker` flag
* Port conflicts

---

## Summary

* Minikube creates a local cluster
* Docker runs the containers
* kubectl controls the cluster
* You can deploy and expose applications locally

---

## Next Steps

* Learn more kubectl commands
* Understand Pods vs Deployments
* Try scaling applications:

```bash
kubectl scale deployment myapp --replicas=3
```

---

## Goal

Be able to:

* Run Kubernetes locally
* Deploy applications
* Understand basic architecture
