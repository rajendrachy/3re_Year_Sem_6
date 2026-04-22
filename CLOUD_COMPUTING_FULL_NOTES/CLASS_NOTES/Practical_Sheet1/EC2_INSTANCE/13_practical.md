# AWS EC2 – Application Load Balancer with Two EC2 Instances (Full Practical)

## Task:
Create two EC2 instances, install Nginx on both, and configure an Application Load Balancer to distribute traffic between them.

---

## (a) Create Two EC2 Instances:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open EC2 Dashboard  
   Go to Services → EC2  

3. Click Launch Instance  

4. Create First Instance:
   - Name: WebServer1  
   - AMI: Amazon Linux 2 / Ubuntu 22.04  
   - Instance Type: t2.micro  
   - Key Pair: mykey.pem  
   - Security Group:
     - Allow SSH (22)  
     - Allow HTTP (80)  
   - Click Launch  

5. Create Second Instance:
   - Name: WebServer2  
   - Same configuration as above  
   - Click Launch  

6. Wait until both instances are Running  

---

## (b) Install Nginx on Both Instances:

### Connect:
```bash
ssh -i mykey.pem ec2-user@<Public-IP>
Install Nginx (Amazon Linux):
sudo yum update -y
sudo amazon-linux-extras install nginx1 -y
sudo systemctl start nginx
sudo systemctl enable nginx


OR (Ubuntu):
sudo apt update -y
sudo apt install nginx -y
sudo systemctl start nginx
sudo systemctl enable nginx



(c) Create Custom Pages:
On WebServer1:
echo "<h1>Server 1</h1>" | sudo tee /usr/share/nginx/html/index.html
On WebServer2:
echo "<h1>Server 2</h1>" | sudo tee /usr/share/nginx/html/index.html



(d) Create Target Group:
Go to EC2 Dashboard
Click Target Groups
Click Create Target Group
Set:
Target Type: Instances
Name: MyTargetGroup
Protocol: HTTP
Port: 80
Click Next
Select both instances
Click Create Target Group



(e) Create Application Load Balancer:
Go to EC2 Dashboard
Click Load Balancers
Click Create Load Balancer
Choose Application Load Balancer
Configure:
Name: MyALB
Scheme: Internet-facing
IP type: IPv4
Network:
Select VPC
Select at least 2 subnets
Security Group:
Allow HTTP (Port 80)
Listener:
HTTP (Port 80)
Select Target Group:
MyTargetGroup
Click Create Load Balancer




(f) Test Load Balancer:
Copy DNS name of ALB
Example:
http://myalb-123456.ap-south-1.elb.amazonaws.com


Open in browser
Refresh multiple times:
Output alternates between:
Server 1
Server 2
Result:

Two EC2 instances created, Nginx installed, ALB configured, and traffic successfully distributed between both servers.