# AWS EC2 – Create Instance and Upload File using SCP / WinSCP

## Task:
Create an EC2 instance and upload a file from local system to EC2 using SCP or WinSCP.

---

## (a) Step 1: Create EC2 Instance

1. Login to AWS Management Console
   - Open https://aws.amazon.com/
   - Sign in with your account

2. Open EC2 Dashboard
   - Search and select **EC2**

3. Click **Launch Instance**

4. Enter Instance Name:
   Example: `FileTransferServer`

5. Select AMI:
   - Choose **Ubuntu Server 22.04 LTS**

6. Select Instance Type:
   - Choose `t2.micro` (Free Tier)

7. Create Key Pair:
   - Name: `mykey`
   - Format: `.pem`
   - Download and save file

8. Configure Security Group:
   - Allow **SSH (Port 22)**

9. Launch Instance and copy Public IP:
   Example: `3.110.25.60`

---

## (b) Step 2: Prepare Local File

1. Create a file in local system:
   Example:
   `testfile.txt`

2. Save it in a known folder:
   Example:
   `C:\Users\Student\Downloads`

---

## (c) Step 3: Upload File using SCP (Command Prompt / Git Bash)

### Command:
```bash
scp -i mykey.pem testfile.txt ubuntu@3.110.25.60:/home/ubuntu/