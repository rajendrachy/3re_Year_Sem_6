# Cloud Computing  
## Lec-18: Amazon AWS VPC & Microsoft Azure VNet

Cloud platforms like **Amazon AWS** and **Microsoft Azure** provide networking systems that allow users to build **secure and private cloud environments**.

Two important networking services are:

- **AWS VPC (Virtual Private Cloud)**
- **Azure VNet (Virtual Network)**

These services help create **private networks inside the cloud**.

---

# 1. Importance of Networking in Cloud Setup

In cloud computing, networking is required to:

- Connect virtual machines
- Control traffic between services
- Secure resources
- Allow communication between systems

Without proper networking, cloud resources cannot **communicate or remain secure**.

---

# 2. What is AWS VPC?

**AWS VPC (Virtual Private Cloud)** is a service that allows users to create a **private network inside AWS cloud**.

It works similar to a **private data center network** but exists in the cloud.

### Features of AWS VPC

- Create isolated network environments
- Control IP address ranges
- Configure routing tables
- Manage security groups and firewalls
- Connect cloud resources securely

### Example

A company can create a VPC to host:

- Web servers
- Application servers
- Databases

All these resources communicate **inside a private cloud network**.

---

# 3. What is Azure VNet?

**Azure Virtual Network (VNet)** is Microsoft Azure's networking service.

It allows Azure resources like **Virtual Machines, databases, and applications** to communicate securely.

### Features of Azure VNet

- Private communication between resources
- IP address management
- Network segmentation
- Secure connectivity to on-premise networks

### Example

A business using Azure can deploy:

- Virtual machines
- Cloud storage
- Databases

All connected through a **secure virtual network**.

---

# 4. AWS VPC vs Azure VNet

Both services provide **virtual networking in the cloud**, but they belong to different cloud providers.

| Feature | AWS VPC | Azure VNet |
|------|------|------|
| Cloud Provider | Amazon AWS | Microsoft Azure |
| Purpose | Private network in AWS | Private network in Azure |
| IP Addressing | Supports CIDR | Supports CIDR |
| Network Isolation | Yes | Yes |
| Security Control | Security Groups | Network Security Groups |

Both services allow organizations to **build secure and scalable cloud infrastructure**.

---

# 5. Role of CIDR in Cloud Networking

**CIDR (Classless Inter-Domain Routing)** is used to define **IP address ranges**.

Example:

```
192.168.1.0/24
```

### Meaning

- `192.168.1.0` → Network address
- `/24` → Subnet mask

CIDR helps:

- Allocate IP addresses efficiently
- Create subnetworks
- Control network size

---

# 6. What is Subnetting?

**Subnetting** divides a large network into **smaller networks called subnets**.

Example:

A VPC may contain multiple subnets:

- Public subnet
- Private subnet
- Database subnet

### Benefits of Subnetting

- Better network management
- Improved security
- Traffic control

---

# 7. Security in Cloud Networking

Cloud providers provide several security mechanisms.

### Security Groups

Act as **virtual firewalls** controlling inbound and outbound traffic.

Example:

Allow:

- HTTP (Port 80)
- HTTPS (Port 443)

Block:

- Unnecessary traffic

---

### Network Security Groups (Azure)

Similar to AWS security groups.

Used to control:

- Incoming traffic
- Outgoing traffic

---

# 8. Real-World Example

A company builds a **web application in the cloud**.

Network setup:

```
VPC / VNet
   ↓
Public Subnet → Web Server
   ↓
Private Subnet → Application Server
   ↓
Database Subnet → Database Server
```

Security rules ensure:

- Users can access web servers
- Databases remain private

---

# Summary

- **AWS VPC** and **Azure VNet** provide private cloud networking.
- They allow secure communication between cloud resources.
- **CIDR** defines IP address ranges.
- **Subnetting** divides networks into smaller segments.
- Security is controlled using **security groups and firewall rules**.
- These technologies are essential for **building scalable and secure cloud systems**.

---










