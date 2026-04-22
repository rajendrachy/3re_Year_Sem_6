# AWS EC2 Ubuntu Instance – Creation and Connection (Full Answer)

## Task:
Create an EC2 instance using Ubuntu OS and connect using Command Prompt.

---

## (a) Steps to Create EC2 Instance:

1. **Login to AWS Management Console**
   - Open browser and go to https://aws.amazon.com/
   - Click **Sign In** and enter your credentials.

2. **Open EC2 Dashboard**
   - In the search bar, type **EC2**
   - Click on **EC2 Dashboard**

3. **Launch Instance**
   - Click on **Launch Instance** button

4. **Enter Instance Name**
   - Example: `MyUbuntuServer`

5. **Choose Operating System (AMI)**
   - Select **Ubuntu Server 22.04 LTS (64-bit)**

6. **Choose Instance Type**
   - Select `t2.micro` (Free Tier Eligible)
   - Example:
     - vCPU: 1
     - RAM: 1 GB

7. **Create Key Pair**
   - Click **Create new key pair**
   - Name: `mykey`
   - Type: RSA
   - Format: `.pem`
   - Download the file and keep it safe

8. **Configure Network Settings**
   - Allow **SSH (Port 22)**
   - Source: Anywhere (0.0.0.0/0) for testing

9. **Configure Storage**
   - Default: 8 GB SSD (can keep default)

10. **Launch Instance**
   - Click **Launch Instance**
   - Wait until instance state shows **Running**

11. **Copy Public IP**
   - Select instance → Copy **Public IPv4 address**
   - Example: `3.110.25.60`

---

## (b) Steps to Connect Using Command Prompt:

1. **Open Command Prompt**
   - Press `Win + R` → type `cmd` → Enter

2. **Go to Key Pair Location**
   - Example:
     cd Downloads

3. **(Optional) Set Permission (if using Git Bash / WSL)**
     chmod 400 mykey.pem

4. **Connect Using SSH Command**
     ssh -i mykey.pem ubuntu@3.110.25.60

5. **First Time Connection**
   - Type `yes` when asked:
     "Are you sure you want to continue connecting?"

6. **Successful Login**
   - You will see Ubuntu terminal like:
     ubuntu@ip-172-31-xx-xx:~$

---

## Example Summary:
- Instance Name: MyUbuntuServer  
- OS: Ubuntu 22.04 LTS  
- Instance Type: t2.micro  
- Key Pair: mykey.pem  
- Public IP: 3.110.25.60  

---

## Result:
- EC2 Ubuntu instance created successfully.
- Connected to instance using Command Prompt via SSH.
