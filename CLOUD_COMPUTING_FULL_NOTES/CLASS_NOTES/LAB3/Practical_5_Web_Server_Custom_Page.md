# Practical 5: Install Apache/Nginx and Display Custom HTML Page

## Steps:

1.  Launch Amazon Linux EC2
2.  Connect via SSH

## Install Apache:

``` bash
sudo yum update -y
sudo yum install httpd -y
sudo systemctl start httpd
sudo systemctl enable httpd
```

## Create Custom HTML Page:

``` bash
sudo nano /var/www/html/index.html
```

Add custom HTML content and save.

Access via: http://`<Public-IP>`{=html}
