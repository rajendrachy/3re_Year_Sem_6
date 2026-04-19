

🌐 Host a Static Website on EC2 Using Apache Web Server

Step-by-Step Guide:

1. **Launch EC2 Instance**

   * AWS Console → EC2 → Launch Instance.
   * Select AMI (Amazon Linux 2 / Ubuntu).
   * Choose Instance Type (`t2.micro`).
   * Configure Network & Security Group (Allow SSH 22 & HTTP 80).
   * Use/Create Key Pair (.pem).

2. **Connect via SSH**

   ```bash
   ssh -i mykey.pem ec2-user@<public-ip>
   ```

3. **Update Packages**

   * Amazon Linux / CentOS: `sudo yum update -y`
   * Ubuntu / Debian: `sudo apt update -y && sudo apt upgrade -y`

4. **Install Apache**

   * Amazon Linux / CentOS: `sudo yum install httpd -y`
   * Ubuntu / Debian: `sudo apt install apache2 -y`

5. **Start and Enable Apache**

   * Amazon Linux / CentOS:

     ```bash
     sudo systemctl start httpd
     sudo systemctl enable httpd
     ```
   * Ubuntu / Debian:

     ```bash
     sudo systemctl start apache2
     sudo systemctl enable apache2
     ```

6. **Adjust Security Group**

   * Allow HTTP (Port 80) from Anywhere (0.0.0.0/0)

7. **Create Static Website**

   ```bash
   cd /var/www/html
   sudo rm index.html  # optional
   sudo nano index.html
   ```

   * Add HTML content.

8. **Set Permissions (Optional)**

   ```bash
   sudo chown -R ec2-user:ec2-user /var/www/html
   sudo chmod -R 755 /var/www/html
   ```

9. **Verify Website**

   * Open browser: `http://<public-ip>`

10. **Add More Pages (Optional)**

    ```bash
    sudo nano about.html
    ```

    * Link in index.html using `<a href="about.html">About</a>`

11. **Restart Apache After Changes**

    ```bash
    sudo systemctl restart httpd       # Amazon Linux / CentOS
    sudo systemctl restart apache2     # Ubuntu
    ```

**Summary:** Launch EC2 → Install Apache → Start & enable → Open port 80 → Upload HTML files → Access via public IP.
