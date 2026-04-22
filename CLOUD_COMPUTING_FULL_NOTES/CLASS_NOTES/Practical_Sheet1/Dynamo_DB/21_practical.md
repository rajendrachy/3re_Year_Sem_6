# AWS DynamoDB – Create Table and Perform CRUD Operations

## Task:
Create a DynamoDB table using AWS Management Console and perform CRUD operations.

---

## (a) Create DynamoDB Table:

1. Login to AWS Management Console  
   Open https://aws.amazon.com/ and sign in  

2. Open **DynamoDB Service**  
   Search and select DynamoDB  

3. Click **Create table**

4. Table details:
   - Table name: `StudentTable`
   - Partition key: `StudentID` (String)

5. Leave default settings (or choose on-demand mode)

6. Click **Create table**

---

## (b) Insert Data (Create Operation):

1. Open `StudentTable`  
2. Click **Explore table items**  
3. Click **Create item**

4. Add values:
   - StudentID: `101`
   - Name: `Rahul`
   - Department: `CSE`

5. Click **Save**

---

## (c) Read Data (Read Operation):

1. Go to **Explore items**
2. Select item with StudentID = `101`
3. View stored data:
   - StudentID
   - Name
   - Department

---

## (d) Update Data (Update Operation):

1. Select item `StudentID = 101`  
2. Click **Edit item**

3. Change value:
   - Department: `IT`

4. Click **Save changes**

---

## (e) Delete Data (Delete Operation):

1. Select item `StudentID = 101`  
2. Click **Delete item**  
3. Confirm deletion  

---

## Result:
- DynamoDB table created successfully  
- Data inserted, read, updated, and deleted successfully  
- CRUD operations performed using AWS Management Console  
- 