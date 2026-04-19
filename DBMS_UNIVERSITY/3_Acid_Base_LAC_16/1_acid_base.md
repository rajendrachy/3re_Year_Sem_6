# Database Properties: ACID vs BASE

---

## ACID Properties

### Video Resource

* [https://youtu.be/-GS0OxFJsYQ?si=hnfAgAQZbUGpO2Tg](https://youtu.be/-GS0OxFJsYQ?si=hnfAgAQZbUGpO2Tg)

### Article Resource

* [https://www.geeksforgeeks.org/dbms/acid-properties-in-dbms/](https://www.geeksforgeeks.org/dbms/acid-properties-in-dbms/)

### Definition

ACID properties ensure reliable processing of database transactions.

### Components

1. **Atomicity**

   * Transaction is all or nothing.

2. **Consistency**

   * Database remains in a valid state before and after the transaction.

3. **Isolation**

   * Transactions do not interfere with each other.

4. **Durability**

   * Once committed, data is permanently stored.

---

## BASE Properties

### Video Resource

* [https://youtu.be/qrwhdNf51aU?si=_w8Jf9qsSPGBzCi1](https://youtu.be/qrwhdNf51aU?si=_w8Jf9qsSPGBzCi1)

### Article Resource

* [https://www.geeksforgeeks.org/dbms/base-properties-in-dbms/](https://www.geeksforgeeks.org/dbms/base-properties-in-dbms/)

### Definition

BASE properties are used in distributed systems focusing on availability rather than consistency.

### Components

1. **Basically Available**

   * System guarantees availability.

2. **Soft State**

   * System state may change over time, even without input.

3. **Eventual Consistency**

   * Data will become consistent over time.

---

## ACID vs BASE (Quick Comparison)

| Feature         | ACID                  | BASE                        |
| --------------- | --------------------- | --------------------------- |
| Consistency     | Strong                | Eventual                    |
| Availability    | Lower                 | High                        |
| Use Case        | Traditional databases | Distributed / NoSQL systems |
| Example Systems | MySQL, PostgreSQL     | Cassandra, MongoDB          |

---

## Summary

* ACID focuses on reliability and correctness
* BASE focuses on scalability and availability

---

End of Notes
