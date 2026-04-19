# Database Normalization (GATE-Oriented Notes)

## Introduction to Normalization

Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity.

### Objectives:

* Eliminate redundant data
* Ensure data consistency
* Improve data integrity

---

## Functional Dependency (FD)

A functional dependency X → Y means attribute Y is dependent on attribute X.

### Types:

* **Trivial FD**: Y ⊆ X
* **Non-Trivial FD**: Y ⊄ X

---

## Keys

### Super Key:

A set of attributes that can uniquely identify a tuple.

### Candidate Key:

Minimal super key (no extra attributes).

### Prime Attribute:

Attribute that is part of any candidate key.

### Non-Prime Attribute:

Attribute not part of any candidate key.

---

## Closure of Attributes

Used to find candidate keys.

Steps:

1. Start with given attribute set
2. Apply FD repeatedly
3. If closure gives all attributes → candidate key

---

## Normal Forms (NF)

## 1NF (First Normal Form)

* All attributes must be atomic (indivisible)
* No repeating groups

---

## 2NF (Second Normal Form)

* Must be in 1NF
* No **partial dependency**

### Partial Dependency:

A non-prime attribute depends on part of a candidate key

---

## 3NF (Third Normal Form)

* Must be in 2NF
* No **transitive dependency**

### Transitive Dependency:

Non-prime → Non-prime

### Condition for 3NF:

For every FD X → Y:

* X is a super key OR
* Y is a prime attribute

---

## BCNF (Boyce-Codd Normal Form)

* Stronger version of 3NF

### Condition:

For every FD X → Y:

* X must be a super key

---

## 4NF (Fourth Normal Form)

* Must be in BCNF
* No multi-valued dependency

---

## 5NF (Fifth Normal Form)

* Must be in 4NF
* No join dependency

---

## Important GATE Points

* Candidate key must be minimal
* Super key = candidate key + extra attributes
* 2NF removes partial dependency
* 3NF removes transitive dependency
* BCNF is stricter than 3NF

---

## Quick Summary Table

| NF   | Condition                |
| ---- | ------------------------ |
| 1NF  | Atomic values            |
| 2NF  | No partial dependency    |
| 3NF  | No transitive dependency |
| BCNF | LHS is super key         |
| 4NF  | No MVD                   |
| 5NF  | No join dependency       |

---

## Exam Tips (GATE)

* Always find candidate keys first
* Identify prime & non-prime attributes
* Check dependencies step-by-step
* BCNF questions are very common
* Practice closure problems

---

**End of Notes**
