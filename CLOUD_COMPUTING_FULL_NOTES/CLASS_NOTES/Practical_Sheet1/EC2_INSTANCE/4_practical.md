# AWS EC2 Ubuntu Instance – Connect Using PuTTY (Windows)

## Task:
Create an EC2 instance using Ubuntu OS and connect to it using PuTTY from Windows.

---

## (a) Steps to Create EC2 Instance (Ubuntu):

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

7. **Create Key Pair**
   - Click **Create new key pair**
   - Name: `mykey`
   - Format: `.pem`
   - Download the file

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

## (b) Convert .pem File to .ppk (PuTTY Format):

1. Open **PuTTYgen** (PuTTY Key Generator)
2. Click **Load**
3. Select `mykey.pem`
4. Click **Save private key**
5. Save as `mykey.ppk`

---

## (c) Connect Using PuTTY:

1. Open **PuTTY**
2. In **Host Name**, enter:
   ubuntu@3.110.25.60

3. Go to:
   Connection → SSH → Auth

4. Click **Browse**
   - Select `mykey.ppk`

5. Go back to **Session**
6. Click **Open**

7. Click **Yes** if security alert appears

8. Login successful:
   ubuntu@ip-172-31-xx-xx:~$

---

## Example Summary:
- Instance Name: MyUbuntuServer  
- OS: Ubuntu 22.04 LTS  
- Key Pair: mykey.pem → converted to mykey.ppk  
- Public IP: 3.110.25.60  

---

## Result:
- EC2 Ubuntu instance created successfully  
- Connected using PuTTY from Windows system  