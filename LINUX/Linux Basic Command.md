# Linux Command Notes

## 1. File & Directory Commands

| Command             | Description                                       |
| ------------------- | ------------------------------------------------- |
| `pwd`               | Print working directory (shows current directory) |
| `ls`                | List files and directories                        |
| `cd <directory>`    | Change directory                                  |
| `mkdir <directory>` | Create a new directory                            |
| `rmdir <directory>` | Delete an empty directory                         |
| `rm <file>`         | Delete a file                                     |
| `rm -rf <file/dir>` | Force delete files or directories                 |
| `touch <file>`      | Create an empty file                              |
| `cat <file>`        | Display file content                              |
| `more <file>`       | Read file content page by page (forward only)     |
| `less <file>`       | Read file content forward and backward            |
| `head <file>`       | Show the first 10 lines of a file                 |
| `tail <file>`       | Show the last 10 lines of a file                  |

## 2. File Management

| Command                   | Description                               |
| ------------------------- | ----------------------------------------- |
| `cp <src> <dest>`         | Copy files or directories                 |
| `mv <src> <dest>`         | Move or rename files/directories          |
| `nano <file>`             | Terminal-based text editor (like Notepad) |
| `echo <text>`             | Print string/text on terminal             |
| `chmod 777 <file>`        | Change file permissions                   |
| `chown user:group <file>` | Change file ownership                     |

## 3. System Information

| Command    | Description                                                     |
| ---------- | --------------------------------------------------------------- |
| `uname -a` | Display detailed system information                             |
| `lscpu`    | Show CPU information                                            |
| `free -h`  | Show memory usage in human-readable format                      |
| `df`       | Show available disk space                                       |
| `du`       | Show disk usage of directories/files                            |
| `lsblk`    | List block devices (disks & partitions)                         |
| `top`      | Real-time system performance monitoring                         |
| `htop`     | Advanced real-time system performance with search & interaction |

## 4. User & Session

| Command              | Description                              |
| -------------------- | ---------------------------------------- |
| `whoami`             | Display current logged-in user           |
| `who`                | Show all logged-in users                 |
| `tty`                | Show terminal session (e.g., tty1, tty2) |
| `ctrl + alt + F1-F7` | Switch between terminal sessions         |

## 5. Networking

| Command       | Description                 |
| ------------- | --------------------------- |
| `ping <host>` | Check network connectivity  |
| `ip a`        | Show IP address information |
| `ip route`    | Show routing table          |

## 6. Package Management (Debian/Ubuntu)

| Command           | Description               |
| ----------------- | ------------------------- |
| `apt`             | Package manager           |
| `sudo apt update` | Update package repository |

## 7. Services & Background

| Command                     | Description                                  |
| --------------------------- | -------------------------------------------- |
| `systemctl start <service>` | Start a system service                       |
| `tmux`                      | Terminal multiplexer (run multiple sessions) |
