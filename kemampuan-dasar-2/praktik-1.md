# Kemampuan Teknis Dasar 2 : Git
mkdir rhymes
cd rhymes

# Create a folder for your project.
mkdir rhymes

a). untuk membuat folder baru.
![praktik 1](https://github.com/FatkhanZakia/rhymes/blob/master/praktik1.png)

b). Untuk masuk kedalam repository yang telah dibuat
![praktik 2](https://github.com/FatkhanZakia/rhymes/blob/master/praktik2.png)

c). Untuk membuat direktori dan mengosongkan repo Git, lakukanlah langkah berikut ini:
![praktik 3](https://github.com/FatkhanZakia/rhymes/blob/master/praktik3.png)

d). Untuk membuat file baru bernama README.md lakukanlah hal berikut ini:
![praktik 4](https://github.com/FatkhanZakia/rhymes/blob/master/praktik4.png)

e). Kemudian tambahkan beberapa penjelasan tentang proyek ke file README.
![praktik 5](https://github.com/FatkhanZakia/rhymes/blob/master/praktik5.png)

f). Kemudian tinjau perubahan yang tidak dikomit. Lalu lakukan itu.
![praktik 6](https://github.com/FatkhanZakia/rhymes/blob/master/praktik6.png)
![praktik 7](https://github.com/FatkhanZakia/rhymes/blob/master/praktik7.png)





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