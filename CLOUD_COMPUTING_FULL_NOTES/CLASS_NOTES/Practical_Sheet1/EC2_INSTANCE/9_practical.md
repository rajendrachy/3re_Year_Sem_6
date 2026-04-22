# AWS EC2 – Create Instance and Assign Elastic IP

## Task:
Create an EC2 instance and assign an Elastic IP so that the public IP does not change after restart.

---

## (a) Create EC2 Instance:

1. Login to AWS Management Console  
   - Open https://aws.amazon.com/  
   - Sign in to your account  

2. Open EC2 Dashboard  
   - Search and select **EC2**  

3. Click **Launch Instance**  

4. Enter Instance Name  
   - Example: `StaticIPServer`

5. Choose AMI  
   - Select **Ubuntu Server 22.04 LTS** or **Amazon Linux 2**

6. Choose Instance Type  
   - Select `t2.micro` (Free Tier)

7. Create Key Pair  
   - Name: `mykey`  
   - Format: `.pem`  
   - Download and save securely  

8. Configure Security Group  
   - Allow **SSH (Port 22)**  
   - Allow **HTTP (Port 80)** (optional)

9. Launch Instance  
   - Wait until instance is in **Running state**

---

## (b) Allocate Elastic IP:

1. Go to EC2 Dashboard  
2. In left menu, click **Elastic IPs**  
3. Click **Allocate Elastic IP Address**  
4. Click **Allocate**

---

## (c) Associate Elastic IP with EC2 Instance:

1. Select the allocated Elastic IP  
2. Click **Actions → Associate Elastic IP**  
3. Choose:
   - Instance: Select your EC2 instance (`StaticIPServer`)
   - Private IP: Default selected  
4. Click **Associate**

---

## (d) Verify Elastic IP:

1. Go to **EC2 Instances**
2. Check Public IPv4 address
3. It will now show the **Elastic IP**

---

## (e) Test IP Stability:

1. Restart EC2 instance  
2. Check public IP again  
3. IP remains same (Elastic IP does not change)

---

## Example:
- Instance Name: StaticIPServer  
- Elastic IP: 3.110.25.60  
- OS: Ubuntu / Amazon Linux  
- Type: t2.micro  

---

## Result:
- EC2 instance created successfully  
- Elastic IP assigned and associated  
- Public IP remains fixed even after restart  
