# AWS S3 – Create Bucket and Upload Files

## Task:
Create an S3 bucket and upload files to it.

---

## (a) Create S3 Bucket:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open S3 Service  
   Search for **S3** in services  

3. Click **Create bucket**

4. Enter Bucket Details:
   - Bucket Name: `my-first-s3-bucket-12345` (must be unique)
   - AWS Region: Choose nearest region (e.g., ap-south-1)

5. Block Public Access Settings:
   - Keep default (recommended for security)
   - OR uncheck if public access is needed

6. Click **Create bucket**

---

## (b) Upload Files to S3 Bucket:

1. Open created bucket  
   Example: `my-first-s3-bucket-12345`

2. Click **Upload**

3. Click **Add files**

4. Select file from local system  
   Example:
   - image.jpg
   - document.pdf

5. Click **Upload**

6. Wait for upload to complete

---

## (c) Verify Uploaded Files:

1. Open S3 bucket  
2. Check list of uploaded files  
3. Click file name to view details  
4. Copy **Object URL** (if public access is enabled)

---

## Example:
- Bucket Name: my-first-s3-bucket-12345  
- File Uploaded: testfile.txt  

---

## Result:
- S3 bucket created successfully  
- Files uploaded to S3 bucket  
- Objects stored securely in cloud storage  