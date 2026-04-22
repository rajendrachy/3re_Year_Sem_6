# AWS VPC – Create VPC, Subnets, Route Table, EC2 Instances and Connectivity Test

## Task:
Create a VPC, Internet Gateway, public and private subnets, route table, launch two EC2 instances, and test connectivity between them.

---

## (a) Create VPC:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open **VPC Dashboard**  
   Search and select VPC  

3. Click **Create VPC**

4. Configure:
   - Name: `MyVPC`
   - IPv4 CIDR block: `10.0.0.0/16`
   - Leave other settings default

5. Click **Create VPC**

---

## (b) Create Internet Gateway:

1. Go to **Internet Gateways**  
2. Click **Create internet gateway**  
3. Name: `MyIGW`  
4. Click **Create**

5. Attach to VPC:
   - Select IGW  
   - Click **Actions → Attach to VPC**  
   - Select `MyVPC`  
   - Click Attach  

---

## (c) Create Subnets:

### Public Subnet:
1. Go to Subnets → Create subnet  
2. VPC: `MyVPC`  
3. Name: `PublicSubnet`  
4. CIDR: `10.0.1.0/24`  
5. Click Create  

### Private Subnet:
1. Click Create subnet again  
2. Name: `PrivateSubnet`  
3. CIDR: `10.0.2.0/24`  
4. Click Create  

---

## (d) Create Route Table:

1. Go to Route Tables  
2. Click Create route table  
3. Name: `PublicRouteTable`  
4. VPC: `MyVPC`  
5. Click Create  

6. Edit routes:
   - Add route: `0.0.0.0/0 → Internet Gateway (MyIGW)`

7. Associate subnet:
   - Attach `PublicSubnet`

---

## (e) Create EC2 Instances:

### Instance 1 (Public Subnet):
1. Go to EC2 → Launch Instance  
2. Name: `PublicInstance`  
3. Subnet: `PublicSubnet`  
4. Auto-assign Public IP: Enabled  
5. Launch instance  

---

### Instance 2 (Private Subnet):
1. Launch another instance  
2. Name: `PrivateInstance`  
3. Subnet: `PrivateSubnet`  
4. Auto-assign Public IP: Disabled  
5. Launch instance  

---

## (f) Connect to Public Instance:

```bash id="vpc1"
ssh -i mykey.pem ec2-user@<Public-IP>
(g) Try Ping Between Instances:
Get private IP of PrivateInstance
Example: 10.0.2.10
From PublicInstance, run:
ping 10.0.2.10
