# AWS EC2 – Create AMI from Existing Instance and Launch New Instance

## Task:
Create an AMI from an existing EC2 instance and launch a new EC2 instance using that AMI.

---

## (a) Create EC2 Instance:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in.

2. Open EC2 Dashboard  
   Go to Services → EC2.

3. Click Launch Instance  

4. Enter Instance Name  
   Example: `BaseServer`

5. Choose AMI  
   Select Ubuntu Server 22.04 LTS or Amazon Linux 2  

6. Select Instance Type  
   Choose `t2.micro` (Free Tier)

7. Create Key Pair  
   Name: `mykey`  
   Format: `.pem`  
   Download and save file  

8. Configure Security Group  
   Allow SSH (Port 22)

9. Launch Instance  
   Wait until instance is Running  

---

## (b) Create AMI from Existing Instance:

1. Go to EC2 Dashboard  
2. Select running instance (`BaseServer`)  
3. Click **Actions → Image and templates → Create Image**  
4. Enter details:
   - Image name: `MyCustomAMI`
   - Description: Custom AMI from EC2 instance  
5. Click **Create Image**  
6. Wait until AMI status becomes **Available**

---

## (c) Launch New Instance Using AMI:

1. Go to EC2 Dashboard  
2. Click **AMIs** from left panel  
3. Select `MyCustomAMI`  
4. Click **Launch Instance from AMI**  
5. Configure:
   - Instance Name: `NewServerFromAMI`
   - Instance Type: `t2.micro`
   - Key Pair: same or new (`mykey.pem`)
   - Security Group: allow SSH (22)

6. Click **Launch Instance**

---

## (d) Verify New Instance:

1. Go to EC2 Instances  
2. Check new instance status = Running  
3. Connect using SSH:

```bash id="ami_conn"
ssh -i mykey.pem ubuntu@<Public-IP>

