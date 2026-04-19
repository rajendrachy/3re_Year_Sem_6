# Launch an EC2 Instance and Attach an EBS Volume in AWS

This guide explains how to launch an EC2 instance and attach an **EBS (Elastic Block Store)** volume.

---

## Step 1: Launch an EC2 Instance

1. Log in to the [AWS Management Console](https://aws.amazon.com/console/).
2. Navigate to **EC2 → Instances → Launch Instance**.
3. Choose an **AMI** (e.g., Ubuntu Server 22.04 LTS).
4. Select an **Instance Type** (e.g., t2.micro).
5. Configure instance details, network, and subnets.
6. Configure security group to allow **SSH (22)**.
7. Launch the instance with a key pair.

## Step 2: Create an EBS Volume

1. Navigate to **EC2 → Volumes → Create Volume**.
2. Select **Volume Type** (e.g., gp3).
3. Specify **Size** (e.g., 10 GB) and **Availability Zone** (must match EC2 instance).
4. Click **Create Volume**.

## Step 3: Attach the EBS Volume to EC2

1. Select the newly created volume.
2. Click **Actions → Attach Volume**.
3. Select the **EC2 instance**.
4. Specify a **device name** (e.g., `/dev/sdf`).
5. Click **Attach**.

## Step 4: Connect to EC2 and Mount the EBS Volume

1. SSH into your EC2 instance:

```bash
ssh -i /path/to/key.pem ubuntu@<EC2_PUBLIC_IP>
```

2. List attached disks:

```bash
lsblk
```

3. Create a filesystem on the new volume:

```bash
sudo mkfs -t ext4 /dev/xvdf
```

4. Create a mount point:

```bash
sudo mkdir /mnt/mydata
```

5. Mount the volume:

```bash
sudo mount /dev/xvdf /mnt/mydata
```

6. Update `/etc/fstab` to mount automatically on reboot:

```bash
echo '/dev/xvdf /mnt/mydata ext4 defaults,nofail 0 2' | sudo tee -a /etc/fstab
```

## Step 5: Verify Mount

```bash
df -h
```
- Confirm that the EBS volume is mounted at `/mnt/mydata`.

---

## Summary

You have successfully:

- Launched an EC2 instance.
- Created and attached an EBS volume.
- Mounted the volume and configured it for persistent storage.

