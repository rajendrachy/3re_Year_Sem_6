# CI/CD Pipeline with Jenkins, GitHub, Webhook & AWS EC2 for Next.js Deployment | 2025

---

## 📌 Introduction
In this tutorial, we will build a complete CI/CD pipeline for a Next.js application using:

- GitHub (Source Code)
- Jenkins (Automation Server)
- Webhook (Auto Trigger)
- AWS EC2 (Deployment Server)

This setup will automatically deploy your Next.js app to EC2 whenever you push code to GitHub.

---

# 🧱 Architecture Overview

Developer → GitHub → Webhook → Jenkins → Build → Deploy to AWS EC2 → Live App

---

# Step 1: Launch AWS EC2 Instance

1. Login to AWS Console
2. Launch Ubuntu EC2 instance
3. Allow ports:
   - 22 (SSH)
   - 3000 (App)
   - 8080 (Jenkins)
4. Connect via SSH

---

# Step 2: Install Node.js on EC2

```bash
sudo apt update -y
curl -fsSL https://deb.nodesource.com/setup_18.x | sudo -E bash -
sudo apt install -y nodejs
node -v
npm -v
```

---

# Step 3: Install Jenkins on EC2

```bash
sudo apt install openjdk-17-jdk -y
wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb https://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt update
sudo apt install jenkins -y
```

Start Jenkins:

```bash
sudo systemctl start jenkins
sudo systemctl enable jenkins
```

Access Jenkins:

```
http://your-ec2-public-ip:8080
```

Unlock Jenkins using:

```bash
sudo cat /var/lib/jenkins/secrets/initialAdminPassword
```

Install suggested plugins.

---

# Step 4: Install Git on EC2

```bash
sudo apt install git -y
```

---

# Step 5: Setup Next.js App on EC2

Clone your repository manually first:

```bash
git clone https://github.com/your-username/your-repo.git
cd your-repo
npm install
npm run build
npm start
```

Ensure app works on:

```
http://your-ec2-ip:3000
```

---

# Step 6: Install PM2 (Process Manager)

```bash
sudo npm install -g pm2
pm2 start npm --name "nextjs-app" -- start
pm2 save
pm2 startup
```

---

# Step 7: Configure Jenkins Job

1. Go to Jenkins Dashboard
2. Click **New Item**
3. Enter name: `nextjs-deployment`
4. Select **Freestyle Project**
5. Click OK

---

# Step 8: Configure Source Code Management

Inside job configuration:

- Select Git
- Enter repository URL
- Add GitHub credentials if private repo

---

# Step 9: Add Build Step

Scroll to **Build → Execute shell**

Add:

```bash
cd /home/ubuntu/your-repo
git pull origin main
npm install
npm run build
pm2 restart nextjs-app || pm2 start npm --name "nextjs-app" -- start
```

Save job.

---

# Step 10: Configure GitHub Webhook

Go to GitHub Repository → Settings → Webhooks → Add Webhook

Payload URL:

```
http://your-ec2-ip:8080/github-webhook/
```

Content type:

```
application/json
```

Select:

- Just the push event

Save webhook.

---

# Step 11: Enable GitHub Hook Trigger in Jenkins

Open Jenkins job → Configure

Under **Build Triggers**, check:

✔ GitHub hook trigger for GITScm polling

Save.

---

# Step 12: Test CI/CD Pipeline

1. Make change in Next.js project
2. Push to GitHub:

```bash
git add .
git commit -m "Update"
git push origin main
```

3. Jenkins automatically triggers build
4. App redeploys automatically

---

# 🔐 Production Best Practices

- Use NGINX reverse proxy
- Enable HTTPS with SSL
- Restrict Jenkins port (8080)
- Use environment variables
- Use separate staging & production branches
- Enable Jenkins authentication

---

# 🎯 Final Result

Now your CI/CD pipeline does:

✔ Automatic build on GitHub push  
✔ Automatic deployment to EC2  
✔ Zero manual deployment steps  
✔ Faster development workflow  

---

# 🚀 Next Level Improvements

- Dockerize the application
- Use Jenkins Pipeline (Jenkinsfile)
- Deploy using GitHub Actions instead of Jenkins
- Use AWS CodeDeploy
- Blue-Green deployment strategy

---

If you want next tutorial:

- CI/CD with Docker + Jenkins
- GitHub Actions deployment
- Kubernetes deployment
- Production-ready DevOps setup

Let me know 🚀






