time | author
-|-
2020-06-13 02:46:00 | [Fatkhan Zakia](https://github.com/FatkhanZakia)

# Install MongoDB on Linux


1. Import the public key used by the package management system
```
$ wget -qO - https://www.mongodb.org/static/pgp/server-4.2.asc | sudo apt-key add -
``` 
The operation should respond with an `OK`. However, if you receive an error indicating that `gnupg` is not installed, you can : 

a. Install `gnupg` and its required libraries using the following command :
```
$ sudo apt-get install gnupg
``` 
b. Once installed, retry importing the key :
```
$ wget -qO - https://www.mongodb.org/static/pgp/server-4.2.asc | sudo apt-key add -
``` 

2. `Create a /etc/apt/sources.list.d/mongodb-org-4.2.list file for MongoDB`
   
**a. Debian 10 "`Buster`"**
```
$ echo "deb http://repo.mongodb.org/apt/debian buster/mongodb-org/4.2 main" | sudo tee /etc/apt/sources.list.d/mongodb-org-4.2.list
``` 
**b. Debian 9 "`Stretch`"**
```
$ echo "deb http://repo.mongodb.org/apt/debian stretch/mongo*db-org/4.2 main" | sudo tee /etc/apt/sources.list.d/mongodb-org-4.2.list
``` 

3. Import the public key used by the package management system
```
$ sudo apt-get update
``` 

4. Install the MongoDB packages
   
**a. Install the latest version of MongoDB**
```
$ sudo apt-get install -y mongodb-org
``` 
**b. Install a specific release of MongoDB**
```
$ sudo apt-get install -y mongodb-org=4.2.7 mongodb-org-server=4.2.7 mongodb-org-shell=4.2.7 mongodb-org-mongos=4.2.7 mongodb-org-tools=4.2.7
``` 

If you only install `mongodb-org=4.2.7` and do not include the component packages, the latest version of each MongoDB package will be installed regardless of what version you specified.

Optional. Although you can specify any available version of MongoDB, `apt-get` will upgrade the packages when a newer version becomes available. To prevent unintended upgrades, you can pin the package at the currently installed version :
```
$ echo "mongodb-org hold" | sudo dpkg --set-selections
echo "mongodb-org-server hold" | sudo dpkg --set-selections
echo "mongodb-org-shell hold" | sudo dpkg --set-selections
echo "mongodb-org-mongos hold" | sudo dpkg --set-selections
echo "mongodb-org-tools hold" | sudo dpkg --set-selections
``` 

> **Noted :**
> 
> I hope you learn something and happy coding.

