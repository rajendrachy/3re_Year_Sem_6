# DynamoDB Integration with Next.js App | Form Data Save in AWS DB | 2025

---

## 📌 Introduction
In this tutorial, we will learn how to save form data from a Next.js application into AWS DynamoDB step by step.

We will cover:
- Creating DynamoDB table
- Creating IAM user/role
- Connecting DynamoDB with Next.js API route
- Saving form data
- Testing the application

This is a real-world serverless database integration guide.

---

# 🧱 Architecture Overview

Next.js Frontend → Next.js API Route → DynamoDB → Response Back to Frontend

---

# Step 1: Create DynamoDB Table

1. Login to AWS Console
2. Go to DynamoDB service
3. Click **Create table**
4. Table name: `contacts`
5. Partition key: `id` (String)
6. Keep default settings
7. Click **Create table**

Wait until table status becomes **Active**.

---

# Step 2: Create IAM User for DynamoDB Access

1. Go to IAM service
2. Click **Users → Create User**
3. Username: `nextjs-dynamodb-user`
4. Attach policy:
   - AmazonDynamoDBFullAccess (for learning purpose only)
5. Create user
6. Save:
   - Access Key ID
   - Secret Access Key

⚠️ Never expose secret keys in frontend code.

---

# Step 3: Install AWS SDK in Next.js App

Inside your project:

```bash
npm install @aws-sdk/client-dynamodb @aws-sdk/lib-dynamodb uuid
```

---

# Step 4: Configure Environment Variables

Create `.env.local` file:

```
AWS_ACCESS_KEY_ID=your_access_key
AWS_SECRET_ACCESS_KEY=your_secret_key
AWS_REGION=your_region
DYNAMODB_TABLE=contacts
```

Restart the server after adding environment variables.

---

# Step 5: Create API Route to Save Data

Create file:

```
pages/api/submit.js
```

Add this code:

```javascript
import { DynamoDBClient } from "@aws-sdk/client-dynamodb";
import { DynamoDBDocumentClient, PutCommand } from "@aws-sdk/lib-dynamodb";
import { v4 as uuidv4 } from "uuid";

const client = new DynamoDBClient({
  region: process.env.AWS_REGION,
  credentials: {
    accessKeyId: process.env.AWS_ACCESS_KEY_ID,
    secretAccessKey: process.env.AWS_SECRET_ACCESS_KEY,
  },
});

const docClient = DynamoDBDocumentClient.from(client);

export default async function handler(req, res) {
  if (req.method !== "POST") {
    return res.status(405).json({ message: "Method Not Allowed" });
  }

  try {
    const { name, email } = req.body;

    const params = {
      TableName: process.env.DYNAMODB_TABLE,
      Item: {
        id: uuidv4(),
        name,
        email,
        createdAt: new Date().toISOString(),
      },
    };

    await docClient.send(new PutCommand(params));

    return res.status(200).json({ message: "Data saved successfully" });
  } catch (error) {
    return res.status(500).json({ error: error.message });
  }
}
```

---

# Step 6: Create Next.js Form

Update `pages/index.js`:

```javascript
import { useState } from "react";

export default function Home() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    const response = await fetch("/api/submit", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ name, email }),
    });

    const data = await response.json();
    alert(data.message);
  };

  return (
    <div style={{ padding: "50px" }}>
      <h1>Contact Form</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />
        <br /><br />
        <input
          type="email"
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
        <br /><br />
        <button type="submit">Submit</button>
      </form>
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

Submit the form.

---

# Step 8: Verify Data in DynamoDB

1. Go to DynamoDB → Tables → `contacts`
2. Click **Explore table items**
3. You should see stored records

---

# 🔐 Production Best Practices

- Do NOT use full access policy
- Use IAM role if deploying to AWS
- Add input validation
- Add error logging
- Use API rate limiting
- Secure environment variables

---

# 🎯 Conclusion

In this tutorial, we successfully:

- Created DynamoDB table
- Connected Next.js backend with DynamoDB
- Saved form data securely
- Verified stored records

This setup is useful for:
- Contact forms
- Registration systems
- Feedback collection
- User data storage

---

If you want next tutorial:
- Fetch & display data from DynamoDB
- Delete & update records
- Deploy on AWS EC2
- Serverless full stack deployment

Let me know 🚀

