# Cloud Computing / Security
## Lec-41: Cloud Security Threats and Mitigation Strategies

Cloud computing stores and processes large amounts of data online.  
Because of this, **security threats are a major concern** in cloud environments.

Organizations must understand common threats and apply **mitigation strategies** to protect their systems and data.

---

# 1. Introduction to Cloud Storage

Cloud storage allows data to be stored on **remote servers instead of local machines**.

Example services:

- Object storage
- Database storage
- Backup storage

Example providers:

- AWS S3
- Google Cloud Storage
- Azure Blob Storage

Advantages:

- Scalability
- Accessibility
- Cost efficiency

However, storing data online also introduces **security risks**.

---

# 2. What is a Data Breach?

A **Data Breach** occurs when unauthorized users gain access to sensitive data.

Example sensitive data:

- Personal information
- Passwords
- Financial records
- Company secrets

Example scenario:

```
Hacker → Exploits vulnerability → Accesses database → Steals data
```

Consequences:

- Financial loss
- Reputation damage
- Legal penalties

---

# 3. Common Cloud Security Threats

Several threats can affect cloud systems.

---

## 1. Data Breaches

Unauthorized access to sensitive information.

Causes:

- Weak passwords
- Poor access control
- Misconfigured cloud storage

---

## 2. Account Hijacking

Attackers gain control of user accounts.

Methods used:

- Phishing attacks
- Stolen credentials
- Malware

Example:

```
Hacker steals login credentials
→ Logs into cloud account
→ Gains access to data
```

---

## 3. Distributed Denial of Service (DDoS)

A **DDoS attack** occurs when attackers flood a server with excessive traffic.

Example:

```
Thousands of fake requests
→ Server overloaded
→ Website crashes
```

Effects:

- Service downtime
- Performance degradation
- Business disruption

---

# 4. Mitigation Strategies

Mitigation strategies are techniques used to **prevent or reduce security risks**.

---

## 1. Strong Authentication

Use strong authentication mechanisms such as:

- Strong passwords
- Multi-Factor Authentication (MFA)

Example:

```
Password + OTP verification
```

This prevents unauthorized access.

---

## 2. Encryption

Encryption protects sensitive data.

Types:

- Data at Rest (stored data)
- Data in Transit (data moving across networks)

Example:

```
Plain Data → Encryption → Secure Data
```

---

## 3. Access Control

Use **Identity and Access Management (IAM)** to control permissions.

Example rules:

```
Admin → Full Access
Developer → Limited Access
User → Read-only Access
```

This ensures only authorized users access resources.

---

## 4. DDoS Protection

Cloud providers offer protection against DDoS attacks.

Example techniques:

- Traffic filtering
- Rate limiting
- Load balancing

Example tools:

- AWS Shield
- Cloudflare
- Azure DDoS Protection

---

## 5. Regular Monitoring

Continuous monitoring helps detect suspicious activities.

Example tools:

- Security logs
- Intrusion detection systems
- Cloud monitoring services

---

# 5. Role of Multi-Factor Authentication (MFA)

MFA adds an additional layer of security.

Authentication methods include:

1. Password
2. One-Time Password (OTP)
3. Biometric verification

Example login flow:

```
User enters password
        ↓
OTP sent to phone
        ↓
Access granted
```

This reduces the risk of account hijacking.

---

# 6. Example of Secure Cloud Architecture

```
User
  ↓
Authentication (MFA)
  ↓
Firewall / Security Layer
  ↓
Application Server
  ↓
Encrypted Database
```

Each layer improves overall security.

---

# Key Points to Remember

- Cloud systems face various security threats
- Common threats include:
  - Data breaches
  - Account hijacking
  - DDoS attacks
- Mitigation strategies include:
  - Multi-Factor Authentication
  - Encryption
  - Access control
  - Monitoring

---

# Summary

Cloud security is essential for protecting sensitive data and infrastructure. Organizations must identify potential threats such as data breaches, account hijacking, and DDoS attacks, and implement mitigation strategies like multi-factor authentication, encryption, access control, and continuous monitoring to ensure a secure cloud environment.

---







