# Practical 6: Install Nginx Using User Data

## Steps:

1.  Launch Amazon Linux EC2
2.  In Advanced Details → User Data, add:

``` bash
#!/bin/bash
yum update -y
yum install nginx -y
systemctl start nginx
systemctl enable nginx
echo "<h1>Welcome to Nginx Server</h1>" > /usr/share/nginx/html/index.html
```

3.  Launch Instance
4.  Access using Public IP
