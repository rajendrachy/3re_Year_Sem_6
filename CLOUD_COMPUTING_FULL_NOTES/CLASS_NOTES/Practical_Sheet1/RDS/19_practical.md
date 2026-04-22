# AWS RDS – Create MySQL Database and Connect using EC2 CLI

## Task:
Create a MySQL database using AWS RDS and connect it using an EC2 instance command line interface.

---

## (a) Create RDS MySQL Database:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open **RDS Service**  
   Search and select RDS  

3. Click **Create database**

4. Choose Database creation method:
   - Standard create  

5. Engine Options:
   - Select **MySQL**

6. Template:
   - Free tier (for practice)

7. Settings:
   - DB instance identifier: `mydb`
   - Master username: `admin`
   - Master password: `Admin@12345`

8. Instance Configuration:
   - Choose `db.t2.micro` (Free tier)

9. Connectivity:
   - VPC: default
   - Public access: Yes
   - Security group: allow MySQL (Port 3306)

10. Click **Create database**

---

## (b) Create EC2 Instance:

1. Go to EC2 Dashboard  
2. Click **Launch Instance**  
3. Choose:
   - Amazon Linux 2 / Ubuntu  
   - t2.micro  

4. Security Group:
   - Allow SSH (22)  
   - Allow outbound internet access  

5. Launch instance  

---

## (c) Install MySQL Client on EC2:

### For Amazon Linux:

```bash id="rds_mysql01"
sudo yum update -y
sudo yum install mysql -y


For Ubuntu:
sudo apt update -y
sudo apt install mysql-client -y



(d) Connect to RDS from EC2 CLI:
Get RDS Endpoint:
Go to RDS → Databases → Select DB
Copy Endpoint
Run connection command:
mysql -h mydb.xxxxxx.ap-south-1.rds.amazonaws.com -P 3306 -u admin -p
Enter password:
Admin@12345



(e) Verify Connection:

After login, you will see MySQL prompt:

mysql>

Run:

SHOW DATABASES;