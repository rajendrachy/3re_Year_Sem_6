# Cloud Computing / Computer Networks  
## Lec-21: What are Ports in Networking | Why Ports are Used

In computer networking, **ports** are used to identify **specific services or applications running on a device**.

While an **IP address identifies a device**, a **port identifies the service or process on that device**.

Example:

- IP address → identifies the computer
- Port number → identifies the application

---

# 1. What is a Port?

A **Port** is a logical communication endpoint used by applications to send and receive data.

Simple definition:

> A port is a **virtual door through which network communication happens between applications**.

Each application uses a **specific port number**.

---

# 2. Why Ports are Needed

A computer can run many services at the same time:

- Web server
- Email server
- FTP server
- Database server

If data arrives at a device, the system must know **which application should receive the data**.

Ports solve this problem.

Example:

```
IP Address → 192.168.1.10
Port → 80
```

This means:

```
Web service on device 192.168.1.10
```

---

# 3. DNS and IP Address

Before data reaches a server, the domain name is converted to an IP address.

Example:

```
google.com → DNS → IP Address
```

After resolving the IP address, the request is sent to a **specific port**.

Example:

```
https://example.com:443
```

Port **443** indicates **HTTPS service**.

---

# 4. Real-Life Analogy (Hostel Example)

Imagine a **hostel building**.

- Hostel building → IP Address
- Rooms → Ports
- Students → Applications

If someone sends a letter to the hostel, they must specify the **room number**.

Example:

```
Hostel Address → Building
Room Number → Port
```

This ensures the letter reaches the **correct person**.

---

# 5. Port Numbers and Services

Different network services use specific port numbers.

Examples:

| Service | Port Number |
|------|------|
| HTTP (Web) | 80 |
| HTTPS (Secure Web) | 443 |
| FTP | 21 |
| SSH | 22 |
| DNS | 53 |
| SMTP (Email) | 25 |

Example:

```
http://example.com:80
```

This means the browser is connecting to **port 80 for web service**.

---

# 6. Port Number Range

Ports are **16-bit numbers**.

Range:

```
0 – 65535
```

Total ports:

```
65,536 ports
```

---

# 7. Categories of Ports

Ports are divided into three categories.

---

## 1. Well-Known Ports

Range:

```
0 – 1023
```

Used by **standard system services**.

Examples:

- HTTP → 80
- HTTPS → 443
- FTP → 21
- DNS → 53

---

## 2. Registered Ports

Range:

```
1024 – 49151
```

Used by **applications and software services**.

Example:

- Database services
- Game servers
- Application servers

---

## 3. Dynamic / Private Ports

Range:

```
49152 – 65535
```

Used temporarily by:

- Client applications
- Operating systems
- Temporary network connections

---

# 8. Ports in Cloud Computing

Ports are important in cloud environments for:

- Web applications
- API services
- Databases
- Secure remote connections

Example:

```
AWS Security Group
Allow:
Port 80 → Web traffic
Port 22 → SSH access
Port 443 → Secure web traffic
```

This controls which services are **accessible from the internet**.

---

# Key Points to Remember

- IP address identifies **device**
- Port identifies **service**
- Ports allow multiple applications to run on one device
- Ports range from **0 to 65535**
- Ports are categorized into:
  - Well-known
  - Registered
  - Dynamic

---

# Summary

- Ports act as **communication endpoints in networking**.
- They allow systems to direct data to the **correct application**.
- Ports work together with **IP addresses**.
- Different services use **standard port numbers**.
- Ports are essential in **network communication and cloud computing systems**.

---












