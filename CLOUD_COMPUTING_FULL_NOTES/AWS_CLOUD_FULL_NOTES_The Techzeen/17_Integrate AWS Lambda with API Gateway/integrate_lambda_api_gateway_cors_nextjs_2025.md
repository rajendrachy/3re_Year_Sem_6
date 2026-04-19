# Integrate AWS Lambda with API Gateway & CORS | Next.js Form Submit | 2025

---

## 📌 Introduction
In this tutorial, we will learn how to:

- Connect AWS Lambda with API Gateway
- Enable CORS properly
- Submit a form from Next.js frontend
- Receive and process data in Lambda

This is a practical real-world serverless integration guide.

---

# 🧱 Architecture Overview

Next.js Frontend  →  API Gateway  →  AWS Lambda  →  Response Back to Frontend

---

# Step 1: Create AWS Lambda Function

1. Go to AWS Console → Lambda
2. Click **Create function**
3. Choose **Author from scratch**
4. Function name: `form-submit-function`
5. Runtime: Node.js 18.x (or latest)
6. Create new role with basic Lambda permissions
7. Click **Create function**

---

# Step 2: Add Lambda Code

Replace default code with:

```javascript
exports.handler = async (event) => {
    try {
        const body = JSON.parse(event.body);

        const name = body.name;
        const email = body.email;

        return {
            statusCode: 200,
            headers: {
                "Access-Control-Allow-Origin": "*",
                "Access-Control-Allow-Headers": "Content-Type",
                "Access-Control-Allow-Methods": "OPTIONS,POST,GET"
            },
            body: JSON.stringify({
                message: "Form submitted successfully",
                data: { name, email }
            })
        };
    } catch (error) {
        return {
            statusCode: 500,
            headers: {
                "Access-Control-Allow-Origin": "*"
            },
            body: JSON.stringify({ error: error.message })
        };
    }
};
```

Click **Deploy**.

---

# Step 3: Create API Gateway

1. Go to API Gateway service
2. Click **Create API**
3. Choose **HTTP API** (recommended)
4. Click **Build**

---

# Step 4: Connect Lambda to API Gateway

1. Add integration
2. Select **Lambda**
3. Choose your function: `form-submit-function`
4. Create route:
   - Method: POST
   - Path: `/submit`

---

# Step 5: Enable CORS in API Gateway

1. Go to CORS settings
2. Enable CORS
3. Allow origin:
   ```
   *
   ```
   (Or your frontend domain in production)
4. Allow methods:
   - GET
   - POST
   - OPTIONS
5. Save changes

---

# Step 6: Deploy API

Click **Deploy**.

Copy the **Invoke URL**.

Example:

```
https://abc123.execute-api.region.amazonaws.com
```

Your final endpoint will be:

```
https://abc123.execute-api.region.amazonaws.com/submit
```

---

# Step 7: Create Next.js Form

Inside your Next.js app:

```javascript
import { useState } from "react";

export default function Home() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    const response = await fetch(
      "https://your-api-id.execute-api.region.amazonaws.com/submit",
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ name, email }),
      }
    );

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
        />
        <br /><br />
        <input
          type="email"
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}
```

Replace API URL with your real endpoint.

---

# Step 8: Test the Integration

1. Run Next.js app:

```
npm run dev
```

2. Open:

```
http://localhost:3000
```

3. Submit form

If everything is correct:
- Lambda executes
- API Gateway responds
- Browser shows success alert

---

# 🚨 Common CORS Errors & Fix

If you see:

```
CORS policy blocked request
```

Check:
- CORS enabled in API Gateway
- Lambda response headers include Access-Control-Allow-Origin
- OPTIONS method allowed

---

# 🔐 Production Best Practices

- Do not use "*" in production
- Use specific domain in CORS
- Add validation inside Lambda
- Use environment variables
- Add logging & monitoring

---

# 🎯 Conclusion

In this tutorial, we successfully:

- Created Lambda function
- Connected it with API Gateway
- Enabled CORS properly
- Submitted form from Next.js
- Received response successfully

This setup is perfect for:
- Contact forms
- Feedback systems
- Registration forms
- Serverless APIs

---

If you want next tutorial:
- Store form data in D





