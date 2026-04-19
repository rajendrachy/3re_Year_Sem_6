# Cloud Computing / Security
## Lec-40: OAuth 2.0 Explained | How Login with Google & Facebook Works

OAuth 2.0 is an **authorization framework** that allows applications to access user data from another service **without sharing the user’s password**.

It is commonly used in features like:

- Login with Google
- Login with Facebook
- Login with GitHub

---

# 1. What is OAuth 2.0?

OAuth 2.0 is a secure method that allows **third-party applications to access user resources without exposing user credentials**.

Simple definition:

> OAuth 2.0 is an authorization framework that allows users to grant limited access to their data without sharing passwords.

Example services using OAuth:

- Google
- Facebook
- GitHub
- Twitter

---

# 2. Real-Life Example of OAuth

Imagine you stay at a **hotel**.

Instead of giving someone your **room key**, you give them a **temporary access card** that only allows limited access.

```
Room Key → Full Access
Access Card → Limited Access
```

Similarly in OAuth:

```
Password → Full Access
Access Token → Limited Access
```

Applications get **tokens instead of passwords**.

---

# 3. Example: Login with Google

When you click:

```
Login with Google
```

The process looks like this:

```
User
 ↓
Application (Website/App)
 ↓
Google Authorization Server
 ↓
Access Granted
```

The application **never sees the user's password**.

---

# 4. How OAuth Works (Simplified Flow)

OAuth follows a structured authorization flow.

Step-by-step process:

### Step 1: User requests login

```
User → Application
```

Example:

```
Click "Login with Google"
```

---

### Step 2: Application redirects to Authorization Server

```
Application → Google Authorization Server
```

User is redirected to Google login page.

---

### Step 3: User gives permission

The user logs in and allows the application to access data.

Example permissions:

- Email address
- Profile information

---

### Step 4: Authorization Server sends Access Token

```
Google → Application
```

An **Access Token** is provided.

---

### Step 5: Application accesses user data

```
Application → Google API → User Data
```

The application retrieves allowed information.

---

# 5. Why Do We Need OAuth?

OAuth improves **security and user convenience**.

Benefits:

### 1. No Password Sharing

Applications never see user passwords.

---

### 2. Secure API Access

Only authorized apps can access data.

---

### 3. Limited Permissions

Apps only get access to specific data.

Example:

```
Email only
Profile picture only
```

---

### 4. Better User Experience

Users can log in quickly without creating new accounts.

Example:

```
Sign up using Google
Sign up using Facebook
```

---

# 6. Access Token

An **Access Token** is a temporary key that allows applications to access specific user data.

Characteristics:

- Short-lived
- Limited permissions
- Used for API requests

Example:

```
Application → API Request → Access Token
```

If the token is valid, the request succeeds.

---

# 7. Refresh Token

A **Refresh Token** is used to generate a new access token when the old one expires.

Example flow:

```
Access Token Expired
        ↓
Application sends Refresh Token
        ↓
New Access Token Generated
```

This allows the user to stay logged in without logging in again.

---

# 8. Access Token vs Refresh Token

| Feature | Access Token | Refresh Token |
|------|------|------|
| Purpose | Access APIs | Generate new access tokens |
| Lifetime | Short | Long |
| Usage | Sent with API requests | Used to request new tokens |

---

# Key Points to Remember
- OAuth 2.0 is an **authorization framework**
- It allows apps to access user data **without sharing passwords**
- Uses **Access Tokens and Refresh Tokens**
- Widely used for **social logins**

---

# Summary

OAuth 2.0 is a secure authorization framework that enables applications to access user data without exposing user credentials. By using tokens instead of passwords, OAuth improves security, simplifies authentication, and powers modern login systems such as "Login with Google" and "Login with Facebook".

---




