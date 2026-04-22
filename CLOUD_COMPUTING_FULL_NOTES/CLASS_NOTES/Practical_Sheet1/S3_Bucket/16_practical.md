# AWS S3 – Enable Versioning and Data Recovery

## Objective:
To protect data using S3 Versioning and understand how to recover deleted or modified objects.

---

## (a) Create S3 Bucket:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open **S3 Service**  
   Search and select S3  

3. Click **Create bucket**  
   - Bucket Name: `my-versioning-bucket-12345` (must be unique)  
   - Region: choose nearest region  

4. Click **Create bucket**

---

## (b) Enable Versioning:

1. Open created bucket  
2. Go to **Properties tab**  
3. Find **Bucket Versioning**  
4. Click **Edit**  
5. Select **Enable**  
6. Click **Save changes**

---

## (c) Upload File (Version 1):

1. Go to **Objects tab**  
2. Click **Upload**  
3. Add file  
   Example: `file.txt` (content: Hello World)  
4. Click **Upload**

---

## (d) Modify and Upload Same File (Version 2):

1. Edit same file locally  
   Example: change content to `Hello AWS Version 2`

2. Upload same file again  
3. AWS automatically creates a **new version**

---

## (e) View Object Versions:

1. Open bucket  
2. Enable **Show versions** option  
3. You will see:
   - Version 1  
   - Version 2  

---

## (f) Download Older Version:

1. Select file  
2. Choose **Version 1**  
3. Click **Download**  
4. Old content is restored locally  

---

## (g) Delete Object:

1. Select file  
2. Click **Delete**  
3. AWS does NOT permanently delete (creates delete marker)

---

## (h) Restore Deleted Object:

1. Enable **Show versions**  
2. Select delete marker  
3. Click **Delete delete marker**  
4. Object is restored  

---

## (i) Permanently Delete a Version:

1. Enable **Show versions**  
2. Select specific version (Version 1 or 2)  
3. Click **Delete**  
4. This removes version permanently  

---

## Result:
- Versioning enabled successfully  
- Multiple versions of file created  
- Older versions restored successfully  
- Deleted objects recovered using versioning  
- Permanent deletion done at version level  
- 