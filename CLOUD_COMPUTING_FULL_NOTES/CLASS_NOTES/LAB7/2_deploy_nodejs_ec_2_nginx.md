# Deploying a Node.js App on AWS EC2 with NGINX

This guide explains how to deploy a **Node.js application** on **AWS EC2** with **NGINX** as a reverse proxy.

---

## Step 1: Launch an Ubuntu EC2 Instance

1. Navigate to **EC2 → Launch Instance**.
2. Choose **Ubuntu Server 22.04 LTS**.
3. Select instance type (e.g., t2.micro).
4. Configure security group to allow **SSH (22)**, **HTTP (80)**, and **HTTPS (443)**.
5. Launch instance with a key pair.

## Step 2: Connect to EC2 Instance

```bash
ssh -i /path/to/key.pem ubuntu@<EC2_PUBLIC_IP>
```

## Step 3: Install Node.js and NPM

```bash
curl -fsSL https://deb.nodesource.com/setup_18.x | sudo -E bash -
sudo apt install -y nodejs
node -v
npm -v
```

## Step 4: Upload/Clone Your Node.js Application

1. Clone from Git or upload files using SCP/SFTP.

```bash
git clone <YOUR_REPO_URL> app
cd app
npm install
```

## Step 5: Install and Configure PM2 to Run the App

```bash
sudo npm install -g pm2
pm2 start app.js --name my-node-app
pm2 startup systemd
pm2 save
```

## Step 6: Install NGINX

```bash
sudo apt update
sudo apt install nginx -y
sudo systemctl start nginx
sudo systemctl enable nginx
```

## Step 7: Configure NGINX as a Reverse Proxy

1. Edit NGINX configuration:

```bash
sudo nano /etc/nginx/sites-available/default
```

2. Replace contents with:

```
server {
    listen 80;
    server_name <EC2_PUBLIC_IP>;

    location / {
        proxy_pass http://localhost:3000;
        proxy_http_version 1.1;
        proxy_set_header Upgrade $http_upgrade;
        proxy_set_header Connection 'upgrade';
        proxy_set_header Host $host;
        proxy_cache_bypass $http_upgrade;
    }
}
```

3. Test and restart NGINX:

```bash
sudo nginx -t
sudo systemctl restart nginx
```

## Step 8: Verify Deployment

- Access your EC2 public IP in a browser: `http://<EC2_PUBLIC_IP>`
- The Node.js app should be served via NGINX.

---

## Summary

You have successfully deployed a Node.js app on EC2 and configured NGINX as a reverse proxy.

