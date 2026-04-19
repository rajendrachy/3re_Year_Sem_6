# AWS EC2 Practical Tasks

## List of Practicals Completed

1. Create an EC2 instance using Ubuntu OS and connect using Command Prompt.
2. Create an EC2 instance using Windows OS and connect to it using RDP.
3. Create an EC2 instance using Ubuntu OS and connect to it using PuTTY from Windows.
4. Launch an EC2 instance and create multiple users with access.
5. Launch an Amazon Linux EC2 instance, install Apache/Nginx web server, and display a custom HTML page using the public IP.
6. Launch an Amazon Linux EC2 instance and install Nginx using User Data.
7. Create an EC2 instance and upload a file from your local system to EC2 using SCP or WinSCP.

---

# Practical Task

## Create an EC2 Instance Using Ubuntu OS and Connect Using Command Prompt

---

### Step 1: Open EC2 Service

- In the AWS search bar, type **EC2**
- Click **EC2 → Instances**
- Click **Launch Instance**

---

### Step 2: Name and Tags

- Give a name to your EC2 instance

---

### Step 3: Choose an Amazon Machine Image (AMI)

- Select the operating system: **Ubuntu**

---

### Step 4: Choose Instance Type

- Select **t2.micro** or **t3.micro**

---

### Step 5: Create or Select Key Pair

- Click **Create new key pair**
- Key pair name: `mykey`
- Key type: `.pem`
- Download and save the key file securely

---

### Step 6: Configure Network Settings

- VPC: Default
- Subnet: Default
- Auto-assign Public IP: **Enable**

---

### Step 7: Configure Security Group

Add the following inbound rules:

| Type | Port | Source |
|------|------|--------|
| SSH  | 22   | Anywhere (0.0.0.0/0) |
| HTTP | 80   | Anywhere (0.0.0.0/0) |

---

### Step 8: Configure Storage

- Default: **8 GB gp3**

---

### Step 9: Connect to EC2 Instance

1. Open **Command Prompt**
2. Go to the key file location
3. Give read-only permission to the `.pem` file (if required)
4. Connect using SSH command:

```bash
ssh -i "mykey.pem" ubuntu@<Public-IP>
