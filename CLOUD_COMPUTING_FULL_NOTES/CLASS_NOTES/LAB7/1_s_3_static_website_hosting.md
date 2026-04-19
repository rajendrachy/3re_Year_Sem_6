# Hosting a Static Website Using Amazon S3

This guide explains how to host a static website using **Amazon S3**.

---

## Step 1: Create an S3 Bucket

1. Log in to the [AWS Management Console](https://aws.amazon.com/console/).
2. Navigate to **S3 → Create bucket**.
3. Enter a **unique bucket name**.
4. Select a region.
5. Uncheck **Block all public access** to allow public access.
6. Click **Create bucket**.

## Step 2: Upload Website Files

1. Open the bucket.
2. Click **Upload → Add files**.
3. Upload your HTML, CSS, and JS files.
4. Click **Upload**.

## Step 3: Configure Bucket for Static Website Hosting

1. Go to **Properties → Static website hosting**.
2. Enable **Use this bucket to host a website**.
3. Set **Index document** (e.g., `index.html`).
4. Set **Error document** (optional, e.g., `error.html`).
5. Save changes.

## Step 4: Set Bucket Policy for Public Access

1. Go to **Permissions → Bucket Policy**.
2. Add a policy to allow public read access:

```json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "PublicReadGetObject",
      "Effect": "Allow",
      "Principal": "*",
      "Action": "s3:GetObject",
      "Resource": "arn:aws:s3:::<BUCKET_NAME>/*"
    }
  ]
}
```

3. Replace `<BUCKET_NAME>` with your bucket name and save.

## Step 5: Access Your Website

- Use the **Bucket Website Endpoint** from the **Static website hosting** section to access your static website.

---

## Summary

You have successfully hosted a static website using Amazon S3.

