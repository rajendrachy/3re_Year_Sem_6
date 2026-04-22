# AWS S3 – Static Website Hosting using GitHub

## Task:
Host a static website on Amazon S3 using files from GitHub.

---

## (a) Create GitHub Repository:

1. Go to https://github.com  
2. Click **New Repository**
3. Enter details:
   - Repository name: `my-static-website`
   - Set to **Public**
4. Click **Create repository**

---

## (b) Upload Website Files to GitHub:

1. Open your repository  
2. Click **Add file → Upload files**
3. Upload files:
   - index.html
   - error.html
   - style.css (optional)
4. Click **Commit changes**

---

## (c) Create S3 Bucket:

1. Go to AWS Console → S3  
2. Click **Create bucket**
3. Bucket name: `my-github-site-12345` (must be unique)
4. Uncheck **Block all public access**
5. Click **Create bucket**

---

## (d) Enable Static Website Hosting:

1. Open bucket  
2. Go to **Properties tab**  
3. Scroll to **Static website hosting**
4. Click **Edit**
5. Select:
   - Enable
   - Index document: `index.html`
   - Error document: `error.html`
6. Save changes

---

## (e) Download Files from GitHub to S3:

### Method 1 (Manual Download & Upload):
1. Go to GitHub repository  
2. Download ZIP or copy files  
3. Extract files locally  
4. Upload to S3 bucket:
   - Go to **Objects → Upload**
   - Upload all website files

---

## (f) Add Bucket Policy:

Go to **Permissions → Bucket policy** and paste:

```json id="s3githubpolicy01"
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Effect": "Allow",
      "Principal": "*",
      "Action": "s3:GetObject",
      "Resource": "arn:aws:s3:::my-github-site-12345/*"
    }
  ]
}
