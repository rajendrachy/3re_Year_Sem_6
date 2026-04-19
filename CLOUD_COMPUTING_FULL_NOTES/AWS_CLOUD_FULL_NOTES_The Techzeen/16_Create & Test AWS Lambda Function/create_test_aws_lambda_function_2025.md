# Create & Test AWS Lambda Function | 2025

---

## 📌 Introduction
In this tutorial, we will learn how to create and test an AWS Lambda function step by step using the AWS Management Console.

This guide is beginner-friendly and easy to follow.

---

# Step 1: Login to AWS Console

Go to https://aws.amazon.com and sign in to your AWS account.

---

# Step 2: Open Lambda Service

In the AWS search bar, type **Lambda** and open the Lambda service.

---

# Step 3: Click "Create Function"

Click on the **Create function** button.

You will see three options:
- Author from scratch
- Use a blueprint
- Container image

Select **Author from scratch**.

---

# Step 4: Configure Basic Settings

Fill the following details:

- Function name: `my-first-lambda`
- Runtime: Choose **Node.js 18.x** (or latest available)
- Architecture: Keep default (x86_64)

Under Permissions:
- Choose **Create a new role with basic Lambda permissions**

Click **Create function**.

---

# Step 5: Write Lambda Function Code

After creation, scroll to the **Code** section.

Replace existing code with this example:

```javascript
exports.handler = async (event) => {
    return {
        statusCode: 200,
        body: JSON.stringify({
            message: "Hello from AWS Lambda!",
        }),
    };
};
```

Click **Deploy**.

---

# Step 6: Create a Test Event

1. Click on the **Test** tab.
2. Click **Create new test event**.
3. Event name: `test-event`
4. Keep default JSON payload.
5. Click **Save**.

---

# Step 7: Test the Function

Click the **Test** button.

If successful, you will see:

- Status: Succeeded
- Response:

```
{
  "statusCode": 200,
  "body": "{\"message\":\"Hello from AWS Lambda!\"}"
}
```

---

# Step 8: View Logs in CloudWatch

To see logs:

1. Go to **Monitor** tab.
2. Click **View CloudWatch logs**.

You can see execution details, logs, and errors there.

---

# Step 9: Configure Memory & Timeout (Optional)

Go to:

Configuration → General configuration → Edit

You can modify:
- Memory (MB)
- Timeout duration

Save changes.

---

# Step 10: Delete Lambda Function (Optional Cleanup)

If you are practicing and want to avoid charges:

1. Go back to Lambda dashboard.
2. Select your function.
3. Click **Delete**.

---

# 🔐 Best Practices (Production)

- Use environment variables for secrets.
- Use IAM roles with minimum required permissions.
- Enable monitoring and alarms.
- Keep function lightweight.
- Use proper error handling.

---

# 🎯 Conclusion

In this tutorial, we successfully:

- Created an AWS Lambda function
- Wrote simple Node.js code
- Created a test event
- Executed and verified output
- Viewed logs in CloudWatch

You can now connect Lambda with:

- API Gateway
- S3 Triggers
- DynamoDB
- EventBridge

---

If you want next tutorial:
- Lambda + API Gateway integration
- Lambda with S3 trigger
- Deploy Lambda using CLI
- Deploy using Terraform

Let me know 🚀






