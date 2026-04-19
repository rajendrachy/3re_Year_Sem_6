# Hosting a React Website Using NGINX and Git

This guide explains how to host a React website on an **Ubuntu EC2 instance** using **NGINX** and **Git**.

---

## Step 1: Launch an Ubuntu EC2 Instance

1. Navigate to **EC2 → Launch Instance**.
2. Select **Ubuntu Server 22.04 LTS**.
3. Choose an instance type (e.g., t2.micro).
4. Configure security group to allow **SSH (22)** and **HTTP (80)**.
5. Launch the instance with a key pair.

## Step 2: Connect to EC2 Instance

```bash
ssh -i /path/to/key.pem ubuntu@<EC2_PUBLIC_IP>
```

## Step 3: Install Node.js, NPM, and Git

```bash
curl -fsSL https://deb.nodesource.com/setup_18.x | sudo -E bash -
sudo apt install -y nodejs git nginx
node -v
npm -v
git --version
```

## Step 4: Clone React Project from Git Repository

```bash
git clone <YOUR_REPO_URL> my-react-app
cd my-react-app
```

## Step 5: Build the React App

```bash
npm install
npm run build
```
- The build will generate a `build` folder with static files.

## Step 6: Configure NGINX to Serve React App

1. Backup default configuration:

```bash
sudo mv /etc/nginx/sites-available/default /etc/nginx/sites-available/default.backup
```

2. Create new config:

```bash
sudo nano /etc/nginx/sites-available/default
```

3. Add the following:

```
server {
    listen 80;
    server_name <EC2_PUBLIC_IP>;

    root /home/ubuntu/my-react-app/build;
    index index.html index.htm;

    location / {
        try_files $uri /index.html;
    }
}
```

4. Test and restart NGINX:

```bash
sudo nginx -t
sudo systemctl restart nginx
```

## Step 7: Verify Hosting

- Open a browser and navigate to `http://<EC2_PUBLIC_IP>`.
- The React website should load correctly.

---

## Step 8: Optional: Pull Updates from Git

```bash
cd my-react-app
git pull origin main
npm install
npm run build
sudo systemctl restart nginx
```

---

## Summary

You have successfully hosted a React website on an Ubuntu EC2 instance using NGINX and Git.

