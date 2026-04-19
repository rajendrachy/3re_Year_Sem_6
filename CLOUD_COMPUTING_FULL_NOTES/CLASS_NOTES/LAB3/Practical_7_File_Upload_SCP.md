# Practical 7: Upload File from Local System to EC2 Using SCP

## Using SCP:

``` bash
scp -i "mykey.pem" file.txt ubuntu@<Public-IP>:/home/ubuntu/
```

## Using WinSCP:

1.  Open WinSCP
2.  Host Name: Public IP
3.  User: ubuntu
4.  Authentication → Select .pem file
5.  Login and upload file using drag and drop
