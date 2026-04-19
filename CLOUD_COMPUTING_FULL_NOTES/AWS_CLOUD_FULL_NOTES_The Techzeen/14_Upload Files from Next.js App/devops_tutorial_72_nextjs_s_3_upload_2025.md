# DevOps Tutorial #72
# AWS: Upload Files from Next.js App to AWS S3 Bucket (Hindi/Urdu) | 2025

---

## 📌 Introduction
In this tutorial, we will learn how to upload files from a Next.js application to an AWS S3 bucket step by step. This guide is beginner-friendly and explained in simple language (Hindi/Urdu style).

We will cover:
- Creating an S3 Bucket
- Creating IAM User with permissions
- Installing AWS SDK in Next.js
- Creating API route for upload
- Uploading file to S3
- Testing the application

---

# Step 1: Create an S3 Bucket

1. Login to AWS Console.
2. Go to S3 service.
3. Click **Create Bucket**.
4. Enter a unique bucket name.
5. Select region.
6. Keep default settings (or configure as needed).
7. Click **Create bucket**.

---

# Step 2: Create IAM User for S3 Access

1. Go to IAM service.
2. Click **Users → Create User**.
3. Give user name (example: nextjs-s3-user).
4. Attach policy:
   - AmazonS3FullAccess (for learning purpose only)
5. Create user.
6. Save:
   - Access Key ID
   - Secret Access Key

⚠️ Never expose secret key publicly.

---

# Step 3: Create Next.js Project

If not created already:

```bash
npx create-next-app@latest my-app
cd my-app
npm install
```

Install required packages:

```bash
npm install @aws-sdk/client-s3 multer
```

---

# Step 4: Configure Environment Variables

Create a `.env.local` file:

```
AWS_ACCESS_KEY_ID=your_access_key
AWS_SECRET_ACCESS_KEY=your_secret_key
AWS_REGION=your_region
AWS_BUCKET_NAME=your_bucket_name
```

Restart the server after adding env variables.

---

# Step 5: Create API Route for Upload

Create file:

```
pages/api/upload.js
```

Add this code:

```javascript
import { S3Client, PutObjectCommand } from "@aws-sdk/client-s3";
import multer from "multer";

const upload = multer();

const s3 = new S3Client({
  region: process.env.AWS_REGION,
  credentials: {
    accessKeyId: process.env.AWS_ACCESS_KEY_ID,
    secretAccessKey: process.env.AWS_SECRET_ACCESS_KEY,
  },
});

export const config = {
  api: {
    bodyParser: false,
  },
};

export default function handler(req, res) {
  upload.single("file")(req, {}, async (err) => {
    if (err) return res.status(500).json({ error: err.message });

    const file = req.file;

    const params = {
      Bucket: process.env.AWS_BUCKET_NAME,
      Key: file.originalname,
      Body: file.buffer,
      ContentType: file.mimetype,
    };

    try {
      await s3.send(new PutObjectCommand(params));
      res.status(200).json({ message: "File uploaded successfully" });
    } catch (error) {
      res.status(500).json({ error: error.message });
    }
  });
}
```

---

# Step 6: Create Frontend Upload Form

Update `pages/index.js`:

```javascript
import { useState } from "react";

export default function Home() {
  const [file, setFile] = useState(null);

  const handleUpload = async () => {
    const formData = new FormData();
    formData.append("file", file);

    await fetch("/api/upload", {
      method: "POST",
      body: formData,
    });

    alert("File uploaded successfully!");
  };

  return (
    <div style={{ padding: "50px" }}>
      <h1>Upload File to S3</h1>
      <input type="file" onChange={(e) => setFile(e.target.files[0])} />
      <br /><br />
      <button onClick={handleUpload}>Upload</button>
    </div>
  );
}
```

---

# Step 7: Run the Application

```bash
npm run dev
```

Open:

```
http://localhost:3000
```

Select file and click Upload.

---

# Step 8: Verify in S3 Bucket

Go to AWS Console → S3 → Your Bucket.

You should see the uploaded file there.

---

# 🔐 Security Best Practice (Production)

For production:
- Do NOT use full S3 access policy.
- Use limited IAM policy.
- Use pre-signed URLs instead of direct upload.
- Store secrets securely.

---

# 🎯 Conclusion

In this tutorial, we learned how to upload files from a Next.js application to AWS S3 bucket using AWS SDK.

This method is suitable for:
- Image upload systems
- Document storage
- User profile pictures
- File management systems

---

If you want next tutorial:
- Pre-signed URL method
- Upload with progress bar
- Deploy Next.js on EC2
- Deploy on Docker + AWS

Let me know 🚀

