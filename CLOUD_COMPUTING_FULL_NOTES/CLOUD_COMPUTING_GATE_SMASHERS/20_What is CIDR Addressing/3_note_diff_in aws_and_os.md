# Cloud Computing / Computer Networks
## CIDR in AWS vs CIDR in Computer Networks (OS)

CIDR (Classless Inter-Domain Routing) is a method used to define **IP address ranges and subnet sizes**.  
The **core concept of CIDR is the same everywhere**, whether it is used in:

- Computer Networks / Operating Systems
- Cloud platforms like AWS

The main difference is **how it is applied in real systems**.

---

# 1. What is CIDR?

CIDR stands for **Classless Inter-Domain Routing**.

It is used to:

- Allocate IP addresses efficiently
- Divide networks into smaller subnets
- Improve routing performance

Example CIDR Block:

```
192.168.1.0/24
```

Meaning:

- `192.168.1.0` → Network address
- `/24` → 24 bits used for network
- Remaining bits are used for hosts

Total bits in IPv4 = **32 bits**

Host bits:

```
32 - 24 = 8
```

Total addresses:

```
2^8 = 256
```

Usable hosts:

```
256 - 2 = 254
```

Reserved addresses:

- Network ID
- Broadcast Address

---

# 2. CIDR in Computer Networks / OS

In traditional networking, CIDR is used for:

- Internet routing
- LAN network design
- Subnetting
- Efficient IP allocation

Example:

```
192.168.1.0/24
```

Possible host range:

```
192.168.1.1 → 192.168.1.254
```

Reserved addresses:

1. Network Address → `192.168.1.0`
2. Broadcast Address → `192.168.1.255`

So usable hosts = **254**

---

# 3. CIDR in AWS Cloud

In AWS, CIDR is mainly used when creating **VPC (Virtual Private Cloud)**.

Example VPC CIDR:

```
10.0.0.0/16
```

This defines the **IP address range for the entire cloud network**.

Inside the VPC, we create **subnets**.

Example:

```
10.0.1.0/24 → Public Subnet
10.0.2.0/24 → Application Subnet
10.0.3.0/24 → Database Subnet
```

Each subnet contains virtual machines or cloud services.

---

# 4. Special Rule in AWS

AWS reserves **5 IP addresses in every subnet**.

Example subnet:

```
10.0.1.0/24
```

Total addresses:

```
256
```

Reserved by AWS:

1. Network address
2. VPC router
3. DNS server
4. Future use
5. Broadcast

Usable hosts in AWS:

```
256 - 5 = 251
```

---

# 5. CIDR in AWS vs Traditional Networking

| Feature | Computer Networks / OS | AWS Cloud |
|------|------|------|
| CIDR Concept | Same | Same |
| Purpose | IP addressing & routing | VPC and subnet configuration |
| Reserved IPs | 2 | 5 |
| Usage | Routers, LAN, Internet | Cloud networks |

---

# 6. Real-World Example

Example AWS architecture:

```
VPC: 10.0.0.0/16
        │
        ├── Public Subnet → 10.0.1.0/24
        ├── App Subnet → 10.0.2.0/24
        └── DB Subnet → 10.0.3.0/24
```

- Web servers run in the **public subnet**
- Applications run in the **private subnet**
- Databases run in the **database subnet**

CIDR helps manage **IP allocation in cloud infrastructure**.

---

# Summary

- CIDR stands for **Classless Inter-Domain Routing**.
- It defines **IP ranges using slash notation**.
- The **concept of CIDR is the same in networking and AWS**.
- Traditional networks reserve **2 IP addresses**.
- AWS reserves **5 IP addresses per subnet**.
- CIDR is essential for **VPC design and subnetting in cloud computing**.


