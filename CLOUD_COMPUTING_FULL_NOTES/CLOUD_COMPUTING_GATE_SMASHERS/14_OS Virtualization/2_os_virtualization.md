# 📚 Lec-13: OS Virtualization with Examples
### Virtualization Types with Real-Life Example

This document explains **Operating System Virtualization**, its **working mechanism**, **hypervisors**, and **real-life applications**.

---

# 📑 Table of Contents

1. Introduction
2. Definition of OS Virtualization
3. Example using Oracle VirtualBox
4. Role of Hypervisor
5. Types of Hypervisors
6. Benefits of OS Virtualization
7. Real-Life Analogy
8. Summary

---

# 🧠 00:36 – Introduction

**Virtualization** is a technology that allows a computer to run **multiple operating systems on a single physical machine**.

Instead of requiring separate computers for different operating systems, virtualization allows **virtual versions of hardware resources** to be created.

These resources include:

- CPU
- Memory (RAM)
- Storage
- Network

The virtual systems created are called **Virtual Machines (VMs)**.

A **Virtual Machine** behaves like a real computer but runs **inside software**.

## Example

A single computer can run:

- Windows (Host OS)
- Linux (Virtual Machine)
- Kali Linux (Virtual Machine)

All these systems run on the **same physical hardware**.

## Where Virtualization is Used

Virtualization is widely used in:

- Cloud computing
- Software testing
- Cybersecurity labs
- Server management
- Development environments

---

# 📖 01:41 – Definition of OS Virtualization

**Operating System Virtualization** is the process of running **multiple operating systems on a single physical computer using virtualization software**.

Each operating system runs inside a **Virtual Machine (VM)**.

### Features of Virtual Machines

Each VM contains its own:

- Operating System
- Virtual CPU
- Allocated RAM
- Virtual storage
- Network interface

Although they behave like independent computers, all VMs **share the same physical hardware**.

## Virtualization Concept



---

# 💻 02:22 – Example using Oracle VirtualBox

One common virtualization tool is **Oracle VM VirtualBox**.

It allows users to **create and manage virtual machines easily**.

## Steps to Use VirtualBox

### Step 1 – Install VirtualBox

Download and install **Oracle VM VirtualBox** on your computer.

### Step 2 – Create a Virtual Machine

Open VirtualBox and click **New** to create a VM.

### Step 3 – Allocate Resources

Assign hardware resources to the VM:

- RAM (Example: 2GB – 8GB)
- CPU cores
- Disk storage

### Step 4 – Install an Operating System

Install an OS using an ISO file such as:

- Ubuntu
- Windows
- Kali Linux

### Step 5 – Run the Virtual Machine

The OS now runs **inside the virtual environment** without affecting the main system.

### Real-Life Example

A developer using **Windows** can run **Linux inside VirtualBox** to test applications.

---

# ⚙️ 03:43 – Role of Hypervisor Explained

A **Hypervisor** is the software that **creates and manages virtual machines**.

It sits between:

- Physical hardware
- Virtual machines

## Hypervisor Architecture





## Functions of Hypervisor

1. Resource Allocation  
   Allocates CPU, RAM, and storage to virtual machines.

2. Isolation  
   Ensures each VM runs independently.

3. VM Management  
   Starts, stops, and monitors virtual machines.

4. Hardware Virtualization  
   Provides virtual hardware resources to operating systems.

## Examples of Hypervisors

- Oracle VirtualBox
- VMware
- Microsoft Hyper-V

---

# 🧩 Types of Hypervisors

## Type 1 Hypervisor (Bare Metal)

Runs **directly on the physical hardware**.





### Examples

- VMware ESXi
- Microsoft Hyper-V
- Xen

### Used In

- Data centers
- Cloud computing environments

---

## Type 2 Hypervisor (Hosted)

Runs **on top of an existing operating system**.





### Examples

- Oracle VirtualBox
- VMware Workstation

### Used For

- Learning virtualization
- Software testing
- Development environments

---

# 🚀 05:16 – Benefits of OS Virtualization

## 1. Better Hardware Utilization

Multiple operating systems share the same hardware resources.

Example:

One server can run **many virtual servers**.

---

## 2. Cost Reduction

Organizations reduce hardware costs.

Example:

Instead of buying **10 physical servers**, a company can run **10 virtual machines on one powerful server**.

---

## 3. Easy Testing and Development

Developers can test applications on different operating systems.

Example testing environments:

- Windows
- Linux
- macOS

---

## 4. Isolation and Security

Each virtual machine operates independently.

If one VM crashes or gets infected with malware:

- Other VMs remain unaffected.

---

## 5. Easy Backup and Recovery

Virtual machines are stored as **files**.

Advantages include:

- Easy backup
- Quick recovery
- Easy system migration

---

# 🏢 Real-Life Analogy

Virtualization can be compared to an **apartment building**.

| Real World | Virtualization |
|-------------|---------------|
| Building | Physical Computer |
| Apartments | Virtual Machines |
| Building Manager | Hypervisor |

Each apartment works independently but **shares the same building infrastructure**.

---

# 📌 Summary

Operating System Virtualization allows multiple operating systems to run on a single computer using **virtual machines**.

## Key Components

- Virtual Machines (VMs)
- Hypervisors
- Shared hardware resources

## Advantages

- Efficient hardware utilization
- Reduced infrastructure cost
- Secure testing environments
- Flexible development setups

Tools like **Oracle VirtualBox** make virtualization simple for students, developers, and organizations.

---

⭐ End of Lecture 13 Notes






