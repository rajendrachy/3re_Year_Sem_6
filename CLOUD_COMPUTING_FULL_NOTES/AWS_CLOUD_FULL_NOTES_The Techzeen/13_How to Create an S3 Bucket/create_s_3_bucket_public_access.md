# How to Create an S3 Bucket & Upload Files with Public Access

## Step 1: Login to AWS Console
Go to https://aws.amazon.com and sign in to your AWS account.

---

## Step 2: Open S3 Service
In the search bar, type **S3** and open the S3 service from the AWS Management Console.

---

## Step 3: Click "Create Bucket"
Click the **Create bucket** button.

---

## Step 4: Enter Bucket Details
- **Bucket name**: Must be globally unique (Example: `my-website-bucket-12345`)
- **Region**: Choose the region closest to your users

Click **Next** or scroll down.

---

## Step 5: Disable Block Public Access
By default, AWS blocks public access for security.

- In **Block Public Access settings**, uncheck:
  - `Block all public access`
- Confirm the warning message.

---

## Step 6: Create the Bucket
Click **Create bucket**.

Your bucket is now created successfully.

---

# Upload Files to S3

## Step 7: Open the Bucket
Click on the bucket name you just created.

---

## Step 8: Upload Files
1. Click **Upload**
2. Click **Add files**
3. Select files from your computer
4. Click **Upload**

Wait for the upload process to complete.

---

# Make Files Public

## Step 9: Make Object Public
1. Open the uploaded file
2. Go to the **Permissions** tab
3. Click **Edit** under Access Control List (ACL)
4. Enable **Public read access**
5. Save changes

OR

Click **Actions → Make public using ACL**

---

## Step 10: Access the Public File
Copy the **Object URL** from the file details.

Example format:

```
https://your-bucket-name.s3.region.amazonaws.com/filename.jpg
```

Paste the URL in your browser. Your file should now be publicly accessible.

---

# Security Note

Public access means anyone on the internet can view your file.

Do NOT upload:
- Private documents
- Credentials
- Backup files
- Sensitive data

---

## Best Practice (Recommended)
Instead of making the entire bucket public:

- Keep the bucket private
- Use a Bucket Policy to allow specific access
- Use a CDN like CloudFront for secure public distribution

