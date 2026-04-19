# Cloud Computing  
## Lec-30: How to Create Instance on AWS EC2 | Amazon EC2 Explained

Amazon EC2 (Elastic Compute Cloud) is one of the most widely used services in AWS.  
It allows users to **create virtual servers in the cloud** and run applications without buying physical hardware.

---

# 1. What is Amazon EC2?

**Amazon EC2 (Elastic Compute Cloud)** is a cloud service that provides **virtual machines (VMs)** on demand.

Simple definition:

> EC2 allows users to launch and manage **virtual servers in the cloud**.

These virtual servers are called **EC2 Instances**.

Example:

```
Physical Server → AWS Data Center
Virtual Server → EC2 Instance
```

---

# 2. Why EC2 is Used

EC2 is used to run applications in the cloud.

Common use cases:

- Web hosting
- Application servers
- Database hosting
- Testing and development
- Big data processing

Example:

```
Website hosted on EC2 server
```

---

# 3. Key Features of EC2

### On-Demand Servers

Servers can be created whenever needed.

---

### Scalability

Servers can be increased or decreased depending on traffic.

Example:

```
Low traffic → 1 server
High traffic → 10 servers
```

---

### Pay-as-you-go Pricing

Users only pay for the time the server is running.

---

### Flexible Configuration

Users can choose:

- Operating system
- CPU and memory
- Storage
- Network configuration

---

# 4. What is an EC2 Instance?

An **EC2 Instance** is a **virtual machine running in AWS cloud infrastructure**.

It includes:

- CPU
- RAM
- Storage
- Operating system
- Network configuration

Example:

```
Ubuntu Server
2 vCPU
4 GB RAM
20 GB Storage
```

---

# 5. Steps to Create an EC2 Instance

Creating an EC2 instance involves several steps.

---

# Step 1: Create an AWS Account

First, sign up on AWS.

Website:

```
https://aws.amazon.com
```

After creating an account, log in to the **AWS Management Console**.

---

# Step 2: Go to EC2 Dashboard

Steps:

```
AWS Console → Services → EC2
```

This opens the **EC2 Dashboard** where instances can be created.

---

# Step 3: Launch Instance

Click:

```
Launch Instance
```

Now configure the server.

---

# Step 4: Choose Amazon Machine Image (AMI)

AMI is the **operating system template** for the server.

Examples:

- Amazon Linux
- Ubuntu
- Windows Server
- Red Hat Linux

Example selection:

```
Ubuntu Server 22.04
```

---

# Step 5: Choose Instance Type

Instance type defines:

- CPU
- RAM
- Performance

Example instance types:

```
t2.micro (Free Tier eligible)
t3.medium
m5.large
```

For beginners:

```
t2.micro
```

---

# Step 6: Create or Select Key Pair

A **key pair** is used to securely connect to the server.

Components:

```
Public Key → Stored on AWS server
Private Key → Downloaded to your computer
```

The private key allows SSH access to the instance.

Example:

```
my-key.pem
```

---

# Step 7: Configure Security Group

Security groups act as **virtual firewalls**.

They control which traffic is allowed.

Example rules:

| Protocol | Port | Purpose |
|------|------|------|
| SSH | 22 | Remote server access |
| HTTP | 80 | Website traffic |
| HTTPS | 443 | Secure web traffic |

---

# Step 8: Configure Storage

Choose storage size for the instance.

Example:

```
20 GB SSD storage
```

---

# Step 9: Launch Instance

After configuration:

```
Click → Launch Instance
```

AWS will start the virtual server.

The instance will appear in the **EC2 dashboard**.

---

# 6. Connecting to the EC2 Instance

Once the instance is running, you can connect using **SSH**.

Example command:

```
ssh -i my-key.pem ubuntu@public-ip-address
```

This connects your computer to the EC2 server.

---

# 7. Serverless vs EC2 (Quick Comparison)

| Feature | EC2 | Serverless |
|------|------|------|
| Infrastructure | Managed by user | Managed by cloud provider |
| Server Management | Required | Not required |
| Example | AWS EC2 | AWS Lambda |
| Use Case | Long-running applications | Event-driven functions |

---

# Key Points to Remember

- EC2 stands for **Elastic Compute Cloud**
- It provides **virtual machines in the cloud**
- Servers are called **EC2 instances**
- Instances can be created in minutes
- Users only pay for **running time**

---

# Summary

Amazon EC2 allows users to create and manage **virtual servers in the cloud**.  
It provides flexible computing resources, scalability, and pay-as-you-go pricing. By following simple steps such as selecting an AMI, choosing an instance type, configuring security, and launching the instance, users can deploy cloud servers quickly and efficiently.

---










