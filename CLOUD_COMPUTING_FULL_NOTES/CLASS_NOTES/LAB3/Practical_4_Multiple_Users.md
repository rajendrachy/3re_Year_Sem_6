# Practical 4: Launch EC2 and Create Multiple Users

## Steps:

1.  Launch Ubuntu/Amazon Linux EC2
2.  Connect via SSH

## Create Users:

``` bash
sudo adduser user1
sudo adduser user2
sudo passwd user1
sudo passwd user2
```

## Grant Sudo Access (Optional):

``` bash
sudo usermod -aG sudo user1
```


