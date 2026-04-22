# AWS EC2 Amazon Linux – Install Web Server and Host HTML Page

## Task:
Launch an Amazon Linux EC2 instance, install Apache/Nginx web server, and display a custom HTML page using the public IP.

---

## (a) Steps to Launch Amazon Linux EC2 Instance:

1. **Login to AWS Management Console**
   - Open https://aws.amazon.com/
   - Click **Sign In**

2. **Open EC2 Dashboard**
   - Search for **EC2**
   - Click **EC2 Dashboard**

3. **Launch Instance**
   - Click **Launch Instance**

4. **Enter Instance Name**
   - Example: `MyWebServer`

5. **Choose OS**
   - Select **Amazon Linux 2 (64-bit)**

6. **Select Instance Type**
   - Choose `t2.micro` (Free Tier Eligible)

7. **Create Key Pair**
   - Name: `mykey`
   - Format: `.pem`
   - Download file

8. **Configure Network Settings**
   - Allow:
     - SSH (Port 22)
     - HTTP (Port 80)

9. **Configure Storage**
   - Default: 8 GB

10. **Launch Instance**
   - Click **Launch Instance**
   - Wait until status = **Running**

11. **Copy Public IP**
   - Example: `13.232.101.25`

---

## (b) Connect to EC2 Instance:

1. Open Command Prompt / Terminal  
2. Navigate to key location:
   cd Downloads  

3. Connect using SSH:
   ssh -i mykey.pem ec2-user@13.232.101.25  

---

## (c) Install Apache Web Server:

1. Update system:
   sudo yum update -y  

2. Install Apache:
   sudo yum install httpd -y  

3. Start Apache:
   sudo systemctl start httpd  

4. Enable auto-start:
   sudo systemctl enable httpd  

---

## (Alternative) Install Nginx:

1. Install Nginx:
   sudo amazon-linux-extras install nginx1 -y  

2. Start Nginx:
   sudo systemctl start nginx  

3. Enable Nginx:
   sudo systemctl enable nginx  

---

## (d) Create Custom HTML Page:

1. Go to web directory:
   cd /var/www/html  

2. Create file:
   sudo nano index.html  

3. Add HTML content:
   <html>
   <head><title>My Page</title></head>
   <body>
   <h1>Hello from EC2 Web Server</h1>
   <p>This is my custom web page</p>
   </body>
   </html>

4. Save and exit

---

## (e) Access Web Page:

1. Open browser  
2. Enter Public IP:
   http://13.232.101.25  

3. Your custom page will be displayed  

---

## Example Summary:
- Instance Name: MyWebServer  
- OS: Amazon Linux 2  
- Web Server: Apache / Nginx  
- Public IP: 13.232.101.25  

---

## Result:
- EC2 instance launched successfully  
- Web server installed and running  
- Custom HTML page displayed using public IP  
- 