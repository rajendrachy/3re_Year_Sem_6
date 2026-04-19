# AWS EC2 Guide: Custom AMI and Elastic IP

This guide explains how to create a custom Amazon Machine Image (AMI) in AWS with Ubuntu OS and Nginx installed, and how to allocate and attach an Elastic IP (EIP) to an EC2 instance.

---

## Part 1: Creating a Custom AMI with Ubuntu OS and Nginx

### Prerequisites

* An AWS account with EC2 and AMI permissions.
* Basic knowledge of EC2 and SSH.
* AWS CLI installed (optional).

### Step 1: Launch an Ubuntu EC2 Instance

1. Log in to the [AWS Management Console](https://aws.amazon.com/console/).
2. Navigate to **EC2** service.
3. Click **Launch Instance**.
4. Choose **Ubuntu Server 22.04 LTS**.
5. Select an **Instance Type** (e.g., t2.micro).
6. Configure instance details, storage, and tags as needed.
7. Configure security group: allow **SSH (22)** and **HTTP (80)**.
8. Launch instance with a key pair.

### Step 2: Connect to the EC2 Instance

```bash
ssh -i /path/to/key.pem ubuntu@<EC2_PUBLIC_IP>
```

### Step 3: Update the System

```bash
sudo apt update && sudo apt upgrade -y
```

### Step 4: Install Nginx

```bash
sudo apt install nginx -y
sudo systemctl start nginx
sudo systemctl enable nginx
```

Test Nginx via browser: `http://<EC2_PUBLIC_IP>`

### Step 5: Clean Up the Instance (Optional)

```bash
sudo apt autoremove -y
sudo apt clean
```

### Step 6: Create a Custom AMI

1. In EC2 Dashboard, select your instance.
2. Click **Actions → Image and templates → Create image**.
3. Enter name and description.
4. Click **Create Image**.

### Step 7: Launch Instances Using Custom AMI

1. Navigate to **AMIs**.
2. Select the AMI → **Launch instance from AMI**.
3. Configure instance and security settings.
4. Launch and connect to verify Nginx.

### Step 8: Optional Automation with AWS CLI

```bash
aws ec2 create-image --instance-id <INSTANCE_ID> --name "Ubuntu-Nginx-AMI" --description "Custom Ubuntu with Nginx" --no-reboot
aws ec2 describe-images --owners self
```

---

## Part 2: Allocate and Attach an Elastic IP (EIP) to an EC2 Instance

### Step 1: Allocate an Elastic IP

1. Log in to the [AWS Management Console](https://aws.amazon.com/console/).
2. Navigate to **EC2 → Network & Security → Elastic IPs**.
3. Click **Allocate Elastic IP address**.
4. Select **Amazon's pool of IPv4 addresses**.
5. Click **Allocate**.
6. Note the newly allocated Elastic IP.

### Step 2: Attach Elastic IP to an EC2 Instance

1. Select the allocated Elastic IP.
2. Click **Actions → Associate Elastic IP address**.
3. Choose **Instance** and select your EC2 instance.
4. Optionally, select a **private IP** if multiple exist.
5. Click **Associate**.

### Step 3: Verify the Elastic IP

* The EC2 instance now has the static Elastic IP.
* Test connectivity by pinging the Elastic IP or accessing the instance via SSH:

```bash
ssh -i /path/to/key.pem ubuntu@<ELASTIC_IP>
```

### Step 4: Optional AWS CLI Commands

Allocate EIP via CLI:

```bash
aws ec2 allocate-address --domain vpc
```

Attach EIP to instance:

```bash
aws ec2 associate-address --instance-id <INSTANCE_ID> --allocation-id <ALLOCATION_ID>
```

---

## Summary

You have successfully:

* Created a custom Ubuntu AMI with Nginx installed.
* Allocated an Elastic IP.
* Attached the Elastic IP to an EC2 instance for a static public IP.



