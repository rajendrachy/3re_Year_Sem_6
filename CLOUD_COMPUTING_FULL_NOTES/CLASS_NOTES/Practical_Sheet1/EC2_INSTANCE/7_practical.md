# AWS EC2 – Amazon Linux Instance with Nginx using User Data (Detailed)

## Task:
Launch an Amazon Linux EC2 instance and automatically install and configure Nginx using User Data script, then access the web page using public IP.

---

## (a) Step 1: Login to AWS Console

1. Open browser and go to:
   https://aws.amazon.com/
2. Click **Sign In**
3. Enter your AWS account credentials
4. Open **EC2 Dashboard** from Services menu

---

## (b) Step 2: Launch EC2 Instance

1. Click **Launch Instance**
2. Enter Instance Name:
   Example: `NginxWebServer`

3. Select Amazon Machine Image (AMI):
   - Choose **Amazon Linux 2 (64-bit)**

4. Select Instance Type:
   - Choose `t2.micro` (Free Tier eligible)

5. Create Key Pair:
   - Name: `mykey`
   - Type: RSA
   - Format: `.pem`
   - Download key and save it safely

---

## (c) Step 3: Configure Network Settings

1. Allow Security Group rules:
   - SSH (Port 22) → for login
   - HTTP (Port 80) → for web access

2. Keep default VPC settings

---

## (d) Step 4: Add User Data Script (IMPORTANT)

1. Scroll to **Advanced Details**
2. Find **User data** section
3. Paste the following script:

```bash
#!/bin/bash

# Update system packages
yum update -y

# Install Nginx web server
amazon-linux-extras install nginx1 -y

# Start Nginx service
systemctl start nginx

# Enable Nginx on boot
systemctl enable nginx

# Create custom web page
echo "<h1>Welcome to EC2 Nginx Server (User Data Installed)</h1>" > /usr/share/nginx/html/index.html
