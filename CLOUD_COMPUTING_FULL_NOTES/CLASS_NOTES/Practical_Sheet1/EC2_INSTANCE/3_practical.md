# AWS EC2 Windows Instance – Creation and Connection using RDP

## Task:
Create an EC2 instance using Windows OS and connect to it using Remote Desktop Protocol (RDP).

---

## (a) Steps to Create Windows EC2 Instance:

1. **Login to AWS Management Console**
   - Open https://aws.amazon.com/
   - Click **Sign In** and enter credentials.

2. **Open EC2 Dashboard**
   - Search for **EC2** in the services menu
   - Click on **EC2 Dashboard**

3. **Launch Instance**
   - Click **Launch Instance**

4. **Enter Instance Name**
   - Example: `MyWindowsServer`

5. **Choose Operating System (AMI)**
   - Select **Microsoft Windows Server 2019/2022 Base**

6. **Choose Instance Type**
   - Select `t2.micro` (Free Tier Eligible, if available)

7. **Create Key Pair**
   - Click **Create new key pair**
   - Name: `winkey`
   - Format: `.pem`
   - Download and save the file

8. **Configure Network Settings**
   - Allow **RDP (Port 3389)**
   - Source: Anywhere (0.0.0.0/0) for testing

9. **Configure Storage**
   - Default: 30 GB (Windows requires more storage)

10. **Launch Instance**
   - Click **Launch Instance**
   - Wait until instance state shows **Running**

11. **Get Public IP**
   - Select instance → Copy **Public IPv4 address**
   - Example: `13.233.120.45`

---

## (b) Steps to Connect Using RDP:

1. **Get Administrator Password**
   - Select instance → Click **Connect**
   - Go to **RDP Client** tab
   - Click **Get Password**
   - Upload `winkey.pem`
   - Click **Decrypt Password**
   - Copy the username (Administrator) and password

2. **Open Remote Desktop Connection**
   - Press `Win + R`
   - Type `mstsc` and press Enter

3. **Enter IP Address**
   - In Computer field, type:
     `13.233.120.45` (example)

4. **Login Credentials**
   - Username: Administrator
   - Password: (decrypted password)

5. **Connect**
   - Click **Connect**
   - Accept security certificate if prompted

---

## Example Summary:
- Instance Name: MyWindowsServer  
- OS: Windows Server 2022  
- Instance Type: t2.micro  
- Key Pair: winkey.pem  
- Public IP: 13.233.120.45  

---

## Result:
- Windows EC2 instance created successfully.
- Connected to instance using Remote Desktop (RDP).
- 