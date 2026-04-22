# AWS RDS – Create MySQL Database and Connect using MySQL Workbench

## Task:
Create a MySQL database using AWS RDS and connect it using MySQL Workbench.

---

## (a) Create RDS MySQL Database:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open **RDS Service**  
   Search and select RDS  

3. Click **Create database**

4. Choose database creation method:
   - Standard create  

5. Engine options:
   - Select **MySQL**

6. Templates:
   - Choose **Free tier**

7. Settings:
   - DB instance identifier: `mydb`
   - Master username: `admin`
   - Master password: `Admin@12345`

8. Instance configuration:
   - DB instance class: `db.t2.micro`

9. Connectivity:
   - VPC: default  
   - Public access: Yes  
   - Security group: allow MySQL (Port 3306)

10. Click **Create database**

---

## (b) Allow Access in Security Group:

1. Go to EC2 → Security Groups  
2. Select RDS security group  
3. Edit inbound rules:
   - Type: MySQL/Aurora  
   - Port: 3306  
   - Source: My IP (or 0.0.0.0/0 for testing)

4. Save rules  

---

## (c) Install MySQL Workbench:

1. Download MySQL Workbench from:
   https://dev.mysql.com/downloads/workbench/

2. Install and open Workbench  

---

## (d) Get RDS Endpoint:

1. Go to RDS Dashboard  
2. Select your database (`mydb`)  
3. Copy **Endpoint**

Example:

mydb.xxxxxx.ap-south-1.rds.amazonaws.com


---

## (e) Connect using MySQL Workbench:

1. Open MySQL Workbench  
2. Click **+ (New Connection)**  

3. Enter details:
   - Connection Name: AWS RDS MySQL  
   - Hostname: RDS Endpoint  
   - Port: 3306  
   - Username: admin  

4. Click **Store Password** and enter:
   - Password: `Admin@12345`

5. Click **Test Connection**  
6. Click **OK**

---

## (f) Verify Connection:

1. Open connection  
2. Run query:

```sql id="rdswb01"
SHOW DATABASES;

