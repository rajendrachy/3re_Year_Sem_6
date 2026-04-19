# Computer Networks / Cloud Computing  
## Lec-19: What is CIDR Addressing (Classless Inter-Domain Routing)

CIDR is a method used in networking to **allocate IP addresses efficiently** and **improve routing on the internet**.

It is widely used in **cloud platforms, data centers, and modern networking systems**.

---

# 1. Importance of Networking

Networking allows devices to **communicate with each other** using IP addresses.

In large systems such as:

- Cloud platforms
- Data centers
- Internet infrastructure

Efficient IP management is required to:

- Avoid IP address wastage
- Improve routing efficiency
- Support large-scale networks

CIDR helps solve these problems.

---

# 2. What is CIDR?

**CIDR (Classless Inter-Domain Routing)** is a method of allocating IP addresses and routing IP packets.

It replaces the old **class-based IP addressing system (Class A, B, C)**.

### Simple Definition

CIDR allows networks to be divided **based on required size instead of fixed classes**.

This makes IP allocation **more flexible and efficient**.

---

# 3. CIDR Notation

CIDR uses a **slash notation**.

Example:

```
192.168.1.0/24
```

### Meaning

- `192.168.1.0` → Network address
- `/24` → Number of bits used for the network portion

This indicates how many bits belong to:

- Network
- Host

---

# 4. Understanding CIDR Prefix

Example:

```
/24
```

Means:

- 24 bits for network
- Remaining bits for hosts

IPv4 address has **32 bits**.

So:

```
Host bits = 32 - 24 = 8
```

---

# 5. Calculating Total Hosts in a Network

Formula:

```
Total Hosts = 2^(Host Bits)
```

Example:

CIDR Block:

```
192.168.1.0/24
```

Host bits:

```
32 - 24 = 8
```

Total addresses:

```
2^8 = 256
```

But two addresses are reserved:

- Network ID
- Broadcast Address

So usable hosts:

```
256 - 2 = 254
```

---

# 6. Reserved IP Addresses

In every network two IP addresses are reserved.

### 1. Network ID

- First IP address
- Represents the network itself
- Cannot be assigned to a device

Example:

```
192.168.1.0
```

---

### 2. Broadcast Address

- Last IP address
- Used to send messages to all devices in the network

Example:

```
192.168.1.255
```

---

# 7. Example of CIDR Addressing

CIDR Block:

```
192.168.10.0/26
```

Step 1: Calculate host bits

```
32 - 26 = 6
```

Step 2: Total addresses

```
2^6 = 64
```

Step 3: Usable hosts

```
64 - 2 = 62
```

So the network supports **62 devices**.

---

# 8. Advantages of CIDR

CIDR provides several benefits:

### Efficient IP Usage

Reduces wastage of IP addresses.

### Flexible Network Design

Networks can be sized according to requirements.

### Improved Routing

CIDR allows **route aggregation**, reducing routing table size.

### Scalability

Supports large cloud infrastructures.

---

# 9. CIDR in Cloud Computing

Cloud providers use CIDR to allocate IP ranges for:

- Virtual Private Clouds (VPC)
- Subnets
- Virtual machines
- Cloud services

Example:

```
AWS VPC → 10.0.0.0/16
```

Subnets inside VPC:

```
10.0.1.0/24
10.0.2.0/24
```

This helps organize cloud networks efficiently.

---

# 10. CIDR vs Classful Addressing

| Feature | Classful Addressing | CIDR |
|------|------|------|
| Network Division | Fixed classes | Flexible |
| IP Utilization | Inefficient | Efficient |
| Routing | Large routing tables | Smaller routing tables |
| Scalability | Limited | Highly scalable |

---

# Summary

- **CIDR (Classless Inter-Domain Routing)** is used for efficient IP address allocation.
- It uses **slash notation (/prefix)** to define network size.
- Total hosts can be calculated using:

```
2^(host bits)
```

- Two addresses are reserved:
  - Network ID
  - Broadcast address
- CIDR is widely used in **cloud computing, networking, and internet routing**.

---







