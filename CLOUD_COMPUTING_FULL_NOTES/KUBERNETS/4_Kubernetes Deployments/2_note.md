# Kubernetes Pods, Deployments and Scaling — Notes

## Overview

This note explains core Kubernetes concepts using a simple analogy and practical commands:

* Pods
* ReplicaSets
* Deployments
* Scaling
* Labels and Selectors

---

## Core Concepts

### Pod

* Smallest unit in Kubernetes
* Runs one or more containers
* Represents a single instance of an application

Analogy:
A Pod is like a single chef in a restaurant kitchen preparing food.

---

### ReplicaSet

* Ensures a specified number of Pods are always running
* Automatically replaces failed Pods

Analogy:
If one chef leaves, the manager hires another to maintain the required number of chefs.

---

### Deployment

* Manages ReplicaSets and Pods
* Provides updates, rollbacks, and scaling

Analogy:
The restaurant manager who decides:

* How many chefs are needed
* When to hire more
* When to replace them

---

## YAML Example (Pod Creation)

```yaml id="y1k3pl"
apiVersion: v1
kind: Pod
metadata:
  name: mypod
  labels:
    app: myapp
spec:
  containers:
  - name: nginx-container
    image: nginx
```

Apply the Pod:

```bash id="g2m91z"
kubectl apply -f pod.yaml
```

---

## Deployment Example

```bash id="u0q2hx"
kubectl create deployment myapp --image=nginx
```

Check deployment:

```bash id="6q3s9c"
kubectl get deployments
```

---

## Scaling Applications

Scale up:

```bash id="mfk3a2"
kubectl scale deployment myapp --replicas=3
```

Scale down:

```bash id="k92pzx"
kubectl scale deployment myapp --replicas=1
```

---

## Labels and Selectors

### Labels

* Key-value pairs attached to resources

Example:

```yaml id="l3x9df"
labels:
  app: myapp
  env: production
```

### Selectors

* Used to find matching resources based on labels

Example:

```bash id="z9c1pw"
kubectl get pods -l app=myapp
```

---

## Useful kubectl Commands

Check Pods:

```bash id="r4d8hj"
kubectl get pods
```

Detailed info:

```bash id="n2k7vb"
kubectl describe pod <pod-name>
```

Logs:

```bash id="x8w3pl"
kubectl logs <pod-name>
```

Delete resource:

```bash id="q1m6ty"
kubectl delete pod <pod-name>
```

Delete deployment:

```bash id="h7z2ka"
kubectl delete deployment myapp
```

---

## Key Understanding

* Pod = single running instance
* ReplicaSet = maintains number of Pods
* Deployment = manages everything above
* Scaling = increasing or decreasing Pods
* Labels = identification tags
* Selectors = filtering mechanism

---

## Summary

* Kubernetes manages applications through Pods
* Deployments automate scaling and updates
* ReplicaSets ensure availability
* Scaling allows handling traffic changes
* Labels and selectors help organize and manage resources

---

## Goal

Be able to:

* Create Pods using YAML
* Deploy applications
* Scale applications up and down
* Use kubectl for managing resources
* Understand how Kubernetes maintains application availability

