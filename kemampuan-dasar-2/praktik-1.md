# Kemampuan Teknis Dasar 2 : Git
mkdir rhymes
cd rhymes

# Create a folder for your project.
mkdir rhymes

untuk membuat folder baru.

![praktik 1](https://github.com/FatkhanZakia/rhymes/blob/master/praktik1.png)

# I usually create an empty README.txt file for the first commit in my project
# history. 
touch README.txt 
git add README.txt 
git commit -m 'First commit.' 

# Add some explanation about the project to the README file.
echo 'This repo is a collection of my favorite nursery rhymes.' >> README.txt

# Review uncommitted changes. Then commit them.
git status
git diff
git add README.txt
git commit -m 'Added project overview to README.txt'