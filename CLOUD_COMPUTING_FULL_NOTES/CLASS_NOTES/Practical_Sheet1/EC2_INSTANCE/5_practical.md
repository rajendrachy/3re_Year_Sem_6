# AWS EC2 Instance – Create Multiple Users and Access (Detailed)

## Task:
Launch an EC2 instance and create multiple users with access.

---

## (a) Steps to Launch EC2 Instance (Ubuntu):

1. **Login to AWS Management Console**
   - Open https://aws.amazon.com/
   - Click **Sign In** and enter credentials.

2. **Open EC2 Dashboard**
   - Search for **EC2**
   - Click on **EC2 Dashboard**

3. **Launch Instance**
   - Click **Launch Instance**

4. **Enter Instance Name**
   - Example: `MyUbuntuServer`

5. **Choose Operating System**
   - Select **Ubuntu Server 22.04 LTS (64-bit)**

6. **Select Instance Type**
   - Choose `t2.micro` (Free Tier Eligible)
   - Example:
     - vCPU: 1
     - RAM: 1 GB

7. **Create Key Pair**
   - Click **Create new key pair**
   - Name: `mykey`
   - Format: `.pem`
   - Download and save file

8. **Configure Network Settings**
   - Allow **SSH (Port 22)**
   - Source: Anywhere (0.0.0.0/0)

9. **Configure Storage**
   - Default: 8 GB SSD

10. **Launch Instance**
   - Click **Launch Instance**
   - Wait until status = **Running**

11. **Copy Public IP**
   - Example: `3.110.25.60`

---

## (b) Connect to EC2 Instance:

1. Open Command Prompt / Terminal  
2. Go to folder where key is stored:
   cd Downloads

3. Connect using SSH:
   ssh -i mykey.pem ubuntu@3.110.25.60

4. First time type **yes** to continue

5. Login successful:
   ubuntu@ip-172-31-xx-xx:~$

---

## (c) Create Multiple Users:

1. Create first user:
   sudo adduser user1  
   - Enter password and details

2. Create second user:
   sudo adduser user2  

3. Create third user:
   sudo adduser user3  

---

## (d) Provide Access to Users:

1. **Give Sudo (Admin) Access**
   sudo usermod -aG sudo user1  
   sudo usermod -aG sudo user2  

2. **Allow SSH Access**
   - Users can login using:
     ssh user1@3.110.25.60  

3. **Set Home Directory Permission (Optional)**
   sudo chmod 700 /home/user1  

---

## (e) Verify Users:

1. List all users:
   cat /etc/passwd  

2. Switch to another user:
   su user1  

3. Check current user:
   whoami  

---

## Example Summary:
- Instance Name: MyUbuntuServer  
- OS: Ubuntu 22.04  
- Public IP: 3.110.25.60  
- Users Created: user1, user2, user3  

---

## Result:
- EC2 instance created successfully  
- Multiple users added  
- Users can access system using SSH  