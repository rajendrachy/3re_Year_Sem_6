# AWS EC2 – Attach EBS Volume and Mount Permanently (Full Practical)

## Task:
Create an EC2 instance, attach an additional EBS volume, and mount it permanently.

---

## (a) Create EC2 Instance:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in.

2. Open EC2 Dashboard  
   Go to Services → EC2.

3. Click Launch Instance  

4. Enter Instance Name  
   Example: EBS-Server  

5. Choose AMI  
   Select Ubuntu Server 22.04 LTS or Amazon Linux 2  

6. Select Instance Type  
   Choose t2.micro (Free Tier)  

7. Create Key Pair  
   Name: mykey  
   Format: .pem  
   Download and save it  

8. Configure Security Group  
   Allow SSH (Port 22)  

9. Launch Instance  
   Wait until instance is in Running state  

---

## (b) Create Additional EBS Volume:

1. Go to EC2 Dashboard  
2. Click Elastic Block Store → Volumes  
3. Click Create Volume  
4. Set:
   - Volume Type: gp3  
   - Size: 10 GB  
   - Same Availability Zone as EC2 instance  
5. Click Create Volume  

---

## (c) Attach EBS Volume:

1. Select the created volume  
2. Click Actions → Attach Volume  
3. Select EC2 instance (EBS-Server)  
4. Click Attach  

---

## (d) Connect to EC2 Instance:

```bash
ssh -i mykey.pem ubuntu@3.110.25.60
(e) Check New Disk:
lsblk
(f) Format EBS Volume:
sudo mkfs -t ext4 /dev/xvdf
(g) Create Mount Directory:
sudo mkdir /mnt/myebs
(h) Mount EBS Volume:
sudo mount /dev/xvdf /mnt/myebs
(i) Make Mount Permanent:
sudo nano /etc/fstab

Add this line:

/dev/xvdf   /mnt/myebs   ext4   defaults,nofail   0   2

Save and exit.

(j) Verify Mount:
df -h
Result:

EC2 instance created successfully, EBS volume attached, formatted, mounted, and configured for permanent storage.


This is now **100% everything inside ONE single `.md` file exactly as you asked**
