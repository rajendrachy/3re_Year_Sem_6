# AWS DynamoDB CLI Practical Guide (One Copy-Paste Block)

````bash
# Check AWS CLI Installation
aws --version

# Configure AWS CLI
aws configure
# Enter AWS Access Key ID, Secret Access Key, Default region (e.g., ap-south-1), and default output format (json)

# Test AWS CLI Connection
aws sts get-caller-identity

# List DynamoDB Tables
aws dynamodb list-tables
# Optional: specify region
aws dynamodb list-tables --region us-east-1

# Create a DynamoDB Table
aws dynamodb create-table \
--table-name Users \
--attribute-definitions AttributeName=UserId,AttributeType=S \
--key-schema AttributeName=UserId,KeyType=HASH \
--billing-mode PAY_PER_REQUEST
# Wait until table status is ACTIVE

# Describe Table
aws dynamodb describe-table --table-name Users

# Insert Data (PutItem)
aws dynamodb put-item \
--table-name Users \
--item '{
  "UserId": {"S": "1"},
  "Name": {"S": "Aman"},
  "Age": {"N": "22"},
  "City": {"S": "Delhi"}
}'

# Get Data (GetItem)
aws dynamodb get-item \
--table-name Users \
--key '{"UserId": {"S": "1"}}'

# Update Data (UpdateItem)
aws dynamodb update-item \
--table-name Users \
--key '{"UserId": {"S": "1"}}' \
--update-expression "SET Age = :a" \
--expression-attribute-values '{":a":{"N":"23"}}'

# Delete Item
aws dynamodb delete-item \
--table-name Users \
--key '{"UserId": {"S": "1"}}'

# Scan Table (List All Items)
aws dynamodb scan --table-name Users

# Query Table (Search by Key)
aws dynamodb query \
--table-name Users \
--key-condition-expression "UserId = :id" \
--expression-attribute-values '{":id":{"S":"1"}}'

# List Global Secondary Indexes
aws dynamodb describe-table --table-name Users

# List Table Tags
aws dynamodb list-tags-of-resource \
--resource-arn arn:aws:dynamodb:<region>:<account-id>:table/Users

# Delete Table
aws dynamodb delete-table --table-name Users


aws dynamodb scan \
--table-name Users \
--projection-expression "UserId, Name"

aws dynamodb query \
--table-name Users \
--key-condition-expression "UserId = :id" \
--expression-attribute-values '{":id":{"S":"1"}}'

# Quick Workflow Summary
# 1. aws --version → Check CLI
# 2. aws configure → Setup credentials
# 3. aws sts get-caller-identity → Test connection
# 4. aws dynamodb list-tables → List tables
# 5. aws dynamodb create-table → Create table
# 6. aws dynamodb put-item → Insert data
# 7. aws dynamodb get-item / scan / query → Read data
# 8. aws dynamodb update-item → Update data
# 9. aws dynamodb delete-item → Delete an item
# 10. aws dynamodb delete-table → Delete table