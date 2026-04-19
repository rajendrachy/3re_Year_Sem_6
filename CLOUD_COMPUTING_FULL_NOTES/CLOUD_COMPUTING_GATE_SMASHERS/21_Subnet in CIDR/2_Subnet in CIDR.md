# Cloud Computing / Computer Networks  
## Lec-20: Subnet in CIDR Addressing (Subnetting)

Subnetting is a technique used to **divide a large network into smaller networks** called **subnets**.

It is very important in:

- Cloud Computing
- Data Centers
- Enterprise Networks
- Internet Infrastructure

Subnetting helps improve **network management, security, and performance**.

---

# 1. What is a Subnet?

A **Subnet (Sub-network)** is a smaller section of a large network.

Instead of using one large network for all devices, the network is divided into **multiple smaller networks**.

Example:

Large network:

```
192.168.1.0/24
```

This network can be divided into smaller subnets.

---

# 2. Why Subnetting is Needed

Subnetting provides several benefits:

### Efficient IP Address Usage

Prevents wastage of IP addresses.

### Better Network Organization

Different departments can use different subnets.

### Improved Security

Sensitive systems can be placed in private subnets.

### Reduced Network Traffic

Broadcast traffic stays inside each subnet.

---

# 3. Example of CIDR Network

Consider a network:

```
192.168.1.0/24
```

Total bits in IPv4:

```
32 bits
```

Network bits:

```
24 bits
```

Host bits:

```
32 - 24 = 8
```

Total IP addresses:

```
2^8 = 256
```

Usable hosts:

```
256 - 2 = 254
```

Reserved:

- Network ID
- Broadcast Address

---

# 4. Creating Subnets

Suppose we divide:

```
192.168.1.0/24
```

into **two subnets**.

We borrow **1 bit** from host bits.

New prefix:

```
/25
```

Host bits:

```
32 - 25 = 7
```

Total addresses per subnet:

```
2^7 = 128
```

Usable hosts:

```
126
```

---

# 5. Example Subnets

Original network:

```
192.168.1.0/24
```

Subnets:

### Subnet 1

```
Network ID: 192.168.1.0/25
Range: 192.168.1.1 – 192.168.1.126
Broadcast: 192.168.1.127
```

### Subnet 2

```
Network ID: 192.168.1.128/25
Range: 192.168.1.129 – 192.168.1.254
Broadcast: 192.168.1.255
```

---

# 6. Bitwise Division

Subnetting works by **borrowing bits from the host portion** of the IP address.

Example:

Original:

```
Network bits: 24
Host bits: 8
```

After subnetting:

```
Network bits: 25
Host bits: 7
```

More borrowed bits → **more subnets but fewer hosts per subnet**.

---

# 7. Subnet Mask

Subnet masks identify which part of an IP address is:

- Network
- Host

Example:

```
/24 → 255.255.255.0
```

Example:

```
/25 → 255.255.255.128
```

Subnet mask helps routers determine **where to send packets**.

---

# 8. Subnetting in Cloud Computing

Cloud providers use subnetting to organize infrastructure.

Example AWS architecture:

```
VPC: 10.0.0.0/16
        │
        ├── Public Subnet → 10.0.1.0/24
        ├── App Subnet → 10.0.2.0/24
        └── Database Subnet → 10.0.3.0/24
```

Benefits:

- Web servers in public subnet
- Applications in private subnet
- Databases secured in isolated subnet

---

# 9. Key Points to Remember

- Subnetting divides large networks into smaller networks.
- CIDR notation determines network size.
- Borrowing bits creates subnets.
- More subnets → fewer hosts per subnet.
- Subnet masks help routers identify networks.

---

# Summary

- **Subnet** is a smaller network inside a larger network.
- Subnetting improves **network efficiency, security, and management**.
- CIDR notation defines network size using `/prefix`.
- Subnetting works by **borrowing host bits**.
- Subnets are widely used in **cloud computing, enterprise networks, and data centers**.

---












