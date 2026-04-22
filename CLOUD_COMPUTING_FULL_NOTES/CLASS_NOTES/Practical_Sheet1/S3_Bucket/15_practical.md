# AWS S3 – Configure Bucket Permissions (Public Access using ACL and Bucket Policy)

## Task:
Create an S3 bucket, disable Block Public Access (for testing only), and provide public access using ACL and Bucket Policy.

---

## (a) Create S3 Bucket:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open S3 Service  
   Search and select **S3**

3. Click **Create bucket**

4. Enter Bucket Details:
   - Bucket Name: `my-public-bucket-12345` (must be unique)
   - Region: Choose nearest region (e.g., ap-south-1)

5. Click **Create bucket**

---

## (b) Disable Block Public Access:

1. Open created bucket  
2. Go to **Permissions tab**  
3. Click **Block public access (bucket settings)**  
4. Click **Edit**  
5. Uncheck:
   - Block all public access  
6. Confirm warning and click **Save changes**

---

## (c) Enable Public Access using ACL:

1. Go to **Permissions tab**  
2. Find **Access Control List (ACL)**  
3. Click **Edit**

4. Under **Public access**, enable:
   - Everyone (public access)

5. Select permission:
   - ✔ Read object

6. Save changes  

---

## (d) Give Public Access using Bucket Policy:

1. Go to **Permissions tab**  
2. Click **Bucket policy**  
3. Paste the following policy:

```json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "PublicReadAccess",
      "Effect": "Allow",
      "Principal": "*",
      "Action": "s3:GetObject",
      "Resource": "arn:aws:s3:::my-public-bucket-12345/*"
    }
  ]
}
