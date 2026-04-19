# SQL Database Commands: CREATE DATABASE & DROP DATABASE

## 1. CREATE DATABASE

The `CREATE DATABASE` command is used to **create a new database** in a SQL database management system.

### Syntax

```sql
CREATE DATABASE db_name;
```

### Example

```sql
CREATE DATABASE school_db;
```

### How It Works

* The SQL server creates a **new empty database** with the specified name.
* After creation, you can add **tables, views, and other database objects** inside it.
* The database will appear in the list of available databases.

### Steps

1. Connect to the SQL server.
2. Run the `CREATE DATABASE` command.
3. The server allocates storage for the new database.
4. The database becomes available for use.

---

## 2. DROP DATABASE

The `DROP DATABASE` command is used to **delete an existing database permanently**.

### Syntax

```sql
DROP DATABASE db_name;
```

### Example

```sql
DROP DATABASE school_db;
```

### How It Works

* The SQL server **removes the entire database** from the system.
* All tables, data, and objects inside the database are **deleted permanently**.
* This action **cannot be undone**.

### Important Notes

* Make sure you **backup important data** before using this command.
* You must have the **required permissions** to drop a database.

---

## Summary

| Command                    | Purpose                      | Effect                           |
| -------------------------- | ---------------------------- | -------------------------------- |
| `CREATE DATABASE db_name;` | Creates a new database       | Adds a new empty database        |
| `DROP DATABASE db_name;`   | Deletes an existing database | Permanently removes the database |

---

✅ **Tip:** Always double-check the database name before using `DROP DATABASE` to avoid accidental data loss.





