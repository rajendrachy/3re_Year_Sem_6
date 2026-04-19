# Lec-12: Storage in Cloud 🌧️ | Microsoft Azure Storage 🗃️ Services with Real-Life Examples
## Cloud Computing for Beginners – Azure Storage Explained

---

# 🕒 Lecture Timestamps

- **00:00 - Introduction**  
- **00:24 – Azure Example & Introduction to Storage Types**  
- **01:31 – Types of Storage in Azure**  
- **05:02 – Importance of Redundancy in Cloud Storage**  
- **06:54 – Tier-based Data Management**  
- **09:10 – Interview Tips**  

---

# 1️⃣ Introduction (00:00)

In cloud computing, storage plays a very important role. Every application, website, database, and backup system requires reliable storage.

Cloud storage allows:
✔ Data to be stored securely  
✔ Access from anywhere  
✔ High scalability  
✔ Cost optimization  

Microsoft Azure provides multiple storage services depending on business needs.

---

# 2️⃣ Azure Example & Introduction to Storage Types (00:24)

## 🔹 Real-Life Example

Imagine you are running:
- A website with images  
- A banking application with transaction records  
- A company storing employee documents  

Each type of data needs different storage solutions.

Azure provides different storage types to handle:
- Structured data  
- Unstructured data  
- Large files  
- Backup data  

---

# 3️⃣ Types of Storage in Azure (01:31)

Azure mainly provides the following storage services:

---

## 🔹 1. Blob Storage (Object Storage)

Used for storing:
- Images  
- Videos  
- Backups  
- Logs  
- Large files  

Real-life example:
- Storing product images for an e-commerce website.

---

## 🔹 2. File Storage

- Fully managed file shares  
- Accessible via SMB protocol  

Real-life example:
- Shared company folders accessible by employees.

---

## 🔹 3. Disk Storage (Managed Disks)

- Block storage  
- Used with Virtual Machines  

Real-life example:
- Operating system disk for a virtual server.

---

## 🔹 4. Queue Storage

- Used for message queuing  
- Communication between application components  

Real-life example:
- Order processing system in an online shopping app.

---

## 🔹 5. Table Storage

- NoSQL key-value storage  
- Stores structured but non-relational data  

Real-life example:
- Storing user session data.

---

# 4️⃣ Importance of Redundancy in Cloud Storage (05:02)

## 🔹 What is Redundancy?
Redundancy means storing multiple copies of data to prevent data loss.

If one server fails, data is still available from another copy.

---

## 🔹 Types of Redundancy in Azure

### ✔ LRS (Locally Redundant Storage)
- Data copied within a single data center.

### ✔ ZRS (Zone Redundant Storage)
- Data replicated across availability zones.

### ✔ GRS (Geo-Redundant Storage)
- Data replicated to another region.

### ✔ RA-GRS
- Read access available in secondary region.

---

## 🔹 Why Redundancy is Important?

✔ Protects against hardware failure  
✔ Prevents data loss  
✔ Ensures high availability  
✔ Supports disaster recovery  

---

# 5️⃣ Tier-Based Data Management (06:54)

Azure Blob Storage provides access tiers to optimize cost.

---

## 🔹 1. Hot Tier
- Frequently accessed data  
- Higher storage cost, lower access cost  

Example:
- Active website content  

---

## 🔹 2. Cool Tier
- Less frequently accessed data  
- Lower storage cost than Hot  

Example:
- Monthly reports  

---

## 🔹 3. Archive Tier
- Rarely accessed data  
- Very low storage cost  
- Higher retrieval time  

Example:
- Old compliance records  

---

## 🔹 Why Tiering is Important?

✔ Reduces storage cost  
✔ Improves cost management  
✔ Optimizes resource usage  

---

# 6️⃣ Interview Tips (09:10)

Here are some common interview questions related to Azure Storage:

### 🔹 Q1: What is Azure Blob Storage?
Answer: It is an object storage service used to store unstructured data such as images, videos, and backups.

### 🔹 Q2: What is the difference between LRS and GRS?
Answer: LRS stores copies in a single data center, while GRS replicates data to another geographic region.

### 🔹 Q3: What are Azure Storage Tiers?
Answer: Hot, Cool, and Archive tiers used for cost optimization based on data access frequency.

### 🔹 Q4: Difference between Blob Storage and File Storage?
Answer: Blob storage is for object data, while file storage provides shared file systems.

---

# 📌 Final Summary

Azure Storage provides multiple services for different data needs:

✔ Blob Storage – Object storage  
✔ File Storage – Shared file system  
✔ Disk Storage – VM disks  
✔ Queue & Table – Application support  

Key Concepts to Remember:
- Redundancy ensures data protection  
- Tiering reduces cost  
- Different storage types serve different use cases  

Understanding Azure Storage is essential for:
- Azure certifications  
- Cloud administrator roles  
- Cloud architect interviews  

---

**End of Lecture 12 Notes – Microsoft Azure Storage Services**
















