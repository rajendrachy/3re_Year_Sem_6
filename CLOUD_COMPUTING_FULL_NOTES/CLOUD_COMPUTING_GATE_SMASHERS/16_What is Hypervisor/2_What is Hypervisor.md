# Cloud Computing  
## Lec-15: What is Hypervisor | Types of Hypervisor

Virtualization allows multiple **operating systems (OS)** to run on a single physical machine.  
The technology that makes this possible is called a **Hypervisor**.

Hypervisors are widely used in **cloud computing, data centers, and server virtualization**.

---

# 1. What is a Hypervisor?

A **Hypervisor** is a software layer that creates and manages **Virtual Machines (VMs)**.

It sits between **hardware and operating systems** and allows multiple OS to run on the same machine.

### Simple Definition

A **Hypervisor is software that allows multiple operating systems to share a single physical computer.**

---

# 2. Role of Hypervisor in Virtualization

The hypervisor performs several important tasks:

- Creates and manages **Virtual Machines**
- Allocates **CPU, RAM, and storage**
- Ensures **isolation between VMs**
- Improves **hardware utilization**
- Enables **multiple OS to run simultaneously**

---

# 3. Real-Life Analogy

Imagine a **large apartment building**.

- The **building** → Physical hardware
- **Apartments** → Virtual machines
- **Building manager** → Hypervisor
- **People living in apartments** → Operating systems

The manager ensures:

- Every apartment gets proper space
- Resources are shared fairly
- Apartments do not interfere with each other

Similarly, the **hypervisor manages virtual machines**.

---

# 4. Types of Hypervisors

There are **two main types of hypervisors**:

1. Type 1 Hypervisor (Bare-Metal)
2. Type 2 Hypervisor (Hosted)

---

# 5. Type 1 Hypervisor (Bare-Metal)

A **Type 1 hypervisor runs directly on the physical hardware** without needing a host operating system.

### Architecture

```
Hardware
   ↓
Hypervisor
   ↓
Virtual Machines
   ↓
Guest Operating Systems
```

### Features

- Direct access to hardware
- High performance
- Strong security
- Used in enterprise and cloud environments

### Examples

- VMware ESXi
- Microsoft Hyper-V
- Xen
- KVM

### Where It Is Used

- Data centers
- Cloud computing platforms
- Enterprise servers

---

# 6. Type 2 Hypervisor (Hosted)

A **Type 2 hypervisor runs on top of an existing operating system**.

### Architecture

```
Hardware
   ↓
Host Operating System
   ↓
Hypervisor
   ↓
Virtual Machines
   ↓
Guest Operating Systems
```

### Features

- Installed like normal software
- Easy to use
- Suitable for personal computers
- Lower performance compared to Type 1

### Examples

- VMware Workstation
- Oracle VirtualBox
- Parallels Desktop

### Where It Is Used

- Software testing
- Learning operating systems
- Development environments

---

# 7. Comparison: Type 1 vs Type 2 Hypervisor

| Feature | Type 1 Hypervisor | Type 2 Hypervisor |
|------|------|------|
| Runs On | Directly on hardware | On top of OS |
| Performance | High | Lower |
| Security | More secure | Less secure |
| Setup | Complex | Easy |
| Usage | Cloud, Data Centers | Personal computers |

---

# 8. Which Hypervisor Should You Use?

It depends on the **use case**.

### Use Type 1 Hypervisor when:

- Running **cloud infrastructure**
- Managing **large data centers**
- Need **high performance and security**

### Use Type 2 Hypervisor when:

- Learning virtualization
- Testing applications
- Running multiple OS on personal computer

---

# 9. Importance of Hypervisors in Cloud Computing

Hypervisors are a **core technology behind cloud platforms**.

They allow cloud providers to:

- Run multiple customers on the same hardware
- Allocate resources dynamically
- Reduce hardware costs
- Scale services easily

Examples:

- AWS
- Microsoft Azure
- Google Cloud

---

# Summary

- A **Hypervisor** is software that manages virtual machines.
- It allows **multiple operating systems to run on one physical machine**.
- Two main types:
  - **Type 1 (Bare-Metal)** → runs directly on hardware
  - **Type 2 (Hosted)** → runs on top of an OS
- Type 1 is used in **cloud and enterprise servers**.
- Type 2 is used for **testing and personal virtualization**.

---








