# AWS DynamoDB – Create Table using CloudShell and Perform CRUD Operations

## Task:
Create a DynamoDB table using AWS CloudShell and perform CRUD operations using AWS CLI.

---

## (a) Open AWS CloudShell:
Login to AWS Management Console → Click CloudShell icon → Wait for terminal to open

---

## (b) Create DynamoDB Table:
```bash
aws dynamodb create-table \
--table-name StudentTable \
--attribute-definitions AttributeName=StudentID,AttributeType=S \
--key-schema AttributeName=StudentID,KeyType=HASH \
--billing-mode PAY_PER_REQUEST



(c) Check Table Created:
aws dynamodb list-tables



(d) Insert Data (Create Operation):
aws dynamodb put-item \
--table-name StudentTable \
--item '{
  "StudentID": {"S": "101"},
  "Name": {"S": "Rahul"},
  "Department": {"S": "CSE"}
}'




(e) Read Data (Get Operation):
aws dynamodb get-item \
--table-name StudentTable \
--key '{"StudentID": {"S": "101"}}'




(f) Update Data:
aws dynamodb update-item \
--table-name StudentTable \
--key '{"StudentID": {"S": "101"}}' \
--update-expression "SET Department = :d" \
--expression-attribute-values '{":d":{"S":"IT"}}'




(g) Delete Data:
aws dynamodb delete-item \
--table-name StudentTable \
--key '{"StudentID": {"S": "101"}}'





(h) Verify Data:
aws dynamodb scan --table-name StudentTable
Result:

DynamoDB table created successfully using AWS CloudShell and all CRUD operations (Create, Read, Update, Delete) were performed successfully using AWS CLI commands.
