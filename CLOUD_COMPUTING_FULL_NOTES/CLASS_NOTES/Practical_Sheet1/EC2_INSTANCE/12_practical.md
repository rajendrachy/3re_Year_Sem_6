# AWS EC2 – Auto Scaling Based on CPU Utilization (>70%)

## Task:
Configure Auto Scaling so that new EC2 instances are automatically launched when CPU usage exceeds 70%.

---

## Important Concept:
In Auto Scaling, we do NOT manually create an EC2 instance first.  
Instead, AWS creates instances automatically using a Launch Template.

---

## (a) Step 1: Create Launch Template

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in.

2. Open EC2 Dashboard  
   Go to Services → EC2

3. Click **Launch Templates** (left panel)

4. Click **Create launch template**

5. Enter Details:
   - Launch template name: `AutoScaleTemplate`
   - Description: Template for Auto Scaling

6. Choose AMI:
   - Select **Amazon Linux 2** or **Ubuntu 22.04 LTS**

7. Select Instance Type:
   - `t2.micro` (Free Tier)

8. Key Pair:
   - Select existing key pair (example: `mykey.pem`)

9. Security Group:
   - Allow SSH (Port 22)
   - Allow HTTP (Port 80)

10. Click **Create launch template**

---

## (b) Step 2: Create Auto Scaling Group

1. Go to EC2 Dashboard  
2. Click **Auto Scaling Groups** (left panel)  
3. Click **Create Auto Scaling group**

4. Enter Name:
   - Example: `MyAutoScalingGroup`

5. Select Launch Template:
   - Choose `AutoScaleTemplate`

6. Click **Next**

7. Select Network:
   - Choose VPC and subnets

8. Set Group Size:
   - Desired capacity: 1
   - Minimum capacity: 1
   - Maximum capacity: 3

9. Click **Next → Next → Create Auto Scaling Group**

---

## (c) Step 3: Configure Scaling Policy (CPU > 70%)

1. Open created Auto Scaling Group  
2. Go to **Automatic scaling → Add policy**

3. Choose Policy Type:
   - Target tracking scaling

4. Set Metric:
   - Average CPU Utilization

5. Set Target Value:
   - 70%

6. Click **Create Policy**

---

## (d) Step 4: How Auto Scaling Works

- If CPU usage > 70%:
  - New EC2 instance is automatically launched
- If CPU usage decreases:
  - Extra instances are automatically terminated

---

## (e) Step 5: Verify Auto Scaling

1. Go to EC2 → Instances  
2. Monitor running instances  
3. Use CloudWatch to check CPU usage  
4. When load increases:
   - New instance is created automatically  
5. When load decreases:
   - Instances are removed automatically  

---

## Result:
- Launch template created successfully  
- Auto Scaling Group configured  
- CPU-based scaling policy set at 70%  
- EC2 instances automatically scale based on workload  