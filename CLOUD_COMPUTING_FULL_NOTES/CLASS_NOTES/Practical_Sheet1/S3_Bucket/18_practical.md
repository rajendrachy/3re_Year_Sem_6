# AWS S3 – Managing Lifecycle of Storage Class

## Task:
Manage S3 lifecycle rules to automatically move objects between storage classes and delete old objects.

---

## (a) Create S3 Bucket:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open **S3 Service**  
   Search and select S3  

3. Click **Create bucket**  
   - Bucket name: `my-lifecycle-bucket-12345` (must be unique)  
   - Region: choose nearest region  

4. Click **Create bucket**

---

## (b) Upload Files:

1. Open created bucket  
2. Go to **Objects tab**  
3. Click **Upload**  
4. Upload files (example: images or documents)  
5. Click **Upload**

---

## (c) Create Lifecycle Rule:

1. Go to **Management tab**  
2. Click **Create lifecycle rule**

---

## (d) Configure Lifecycle Rule:

1. Enter Rule Name:
   - Example: `MoveToIAAndDelete`

2. Choose Scope:
   - Apply to all objects OR specific prefix

3. Set Lifecycle Actions:

### Transition Rules:
- Move to **Standard-IA** after 30 days  
- Move to **Glacier** after 60 days  

### Expiration Rule:
- Delete objects after 90 days  

4. Click **Create rule**

---

## (e) What Happens Automatically:

- Objects are moved to cheaper storage classes over time:
  - Standard → Standard-IA → Glacier  
- Old objects are automatically deleted after defined time  

---

## Result:
- S3 bucket created successfully  
- Files uploaded successfully  
- Lifecycle policy configured  
- Storage cost optimized automatically using lifecycle rules  