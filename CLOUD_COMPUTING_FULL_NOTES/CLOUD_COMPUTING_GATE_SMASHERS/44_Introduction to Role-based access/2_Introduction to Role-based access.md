# Cloud Computing / Security & Access Management
## Lec-43: Role-Based Access Control (RBAC) | RBAC vs ABAC

Access control is an important part of cloud security.  
It ensures that **only authorized users can access specific resources**.

Two common access control models are:

- RBAC (Role-Based Access Control)
- ABAC (Attribute-Based Access Control)

---

# 1. What is Access Control?

Access control is a security mechanism used to **control who can access resources in a system**.

Example resources:

- Databases
- Files
- Cloud services
- Applications

Example rule:

```
Admin → Full access
Employee → Limited access
Guest → Read-only access
```

---

# 2. What is RBAC (Role-Based Access Control)?

RBAC is an access control model where **permissions are assigned based on user roles**.

Simple definition:

> RBAC is a system where users are given permissions according to their role in an organization.

Example roles:

```
Admin
Manager
Developer
User
```

Each role has predefined permissions.

---

# 3. How RBAC Works

Instead of assigning permissions directly to users, permissions are assigned to **roles**.

Workflow:

```
User → Assigned Role → Role Permissions → Resource Access
```

Example structure:

```
Role: Admin
Permissions:
- Read
- Write
- Delete
```

```
Role: Developer
Permissions:
- Read
- Write
```

```
Role: User
Permissions:
- Read
```

Users inherit permissions from their roles.

---

# 4. Real-Life Example of RBAC

Consider a **hospital system**.

```
Doctor → Access patient records
Nurse → Limited patient data
Receptionist → Appointment information
```

Each role has **different access levels**.

---

# 5. Benefits of RBAC

RBAC simplifies permission management.

Advantages:

### 1. Easy Management

Permissions are managed at the **role level**.

---

### 2. Better Security

Users only get access required for their job.

---

### 3. Scalable System

Adding a new user only requires assigning a role.

Example:

```
New Developer → Assign Developer Role
```

---

# 6. Limitations of RBAC

RBAC may not handle complex access rules.

Example scenario:

```
Allow access only during office hours
Allow access only from specific locations
```

RBAC cannot easily handle such conditions.

This leads to **ABAC**.

---

# 7. What is ABAC (Attribute-Based Access Control)?

ABAC is a more flexible access control model.

Simple definition:

> ABAC grants access based on attributes such as user details, environment conditions, and resource properties.

Attributes can include:

- User role
- Location
- Time
- Device type

---

# 8. How ABAC Works

ABAC evaluates multiple attributes before granting access.

Example rule:

```
Allow access if:
User Role = Manager
AND Location = Office
AND Time = 9 AM – 6 PM
```

Workflow:

```
User → Attribute Evaluation → Access Decision
```

---

# 9. RBAC vs ABAC

| Feature | RBAC | ABAC |
|------|------|------|
| Access Based On | Roles | Attributes |
| Flexibility | Limited | Highly flexible |
| Complexity | Simple | More complex |
| Example | Admin / User roles | Role + location + time |

---

# 10. Example in Cloud Systems

Cloud platforms use access control models to manage permissions.

Example:

```
Cloud Admin → Full access
Developer → Manage applications
User → Access services
```

Advanced systems may use **ABAC for more dynamic policies**.

---

# Key Points to Remember

- Access control protects system resources
- RBAC assigns permissions based on **roles**
- ABAC assigns permissions based on **attributes**
- RBAC is **simple and widely used**
- ABAC is **more flexible but complex**

---

# Summary

Role-Based Access Control (RBAC) is a widely used access management model that assigns permissions based on user roles within an organization. While RBAC simplifies access management, Attribute-Based Access Control (ABAC) provides more flexibility by considering attributes such as user identity, location, and time. Both models play an important role in securing cloud systems and controlling resource access.

---










