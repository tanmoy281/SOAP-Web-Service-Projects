Github
==============
Commit new Projects
===========================

git init

git remote add [remote repository name which already exist] https://github.com/[username]/[remote repository name which already exist].git

git add . 

git ls-files

git commit -a -m "Initial commit"


if it asks for credentials run below two
[
git config --global user.name tanmoy281

git config --global user.email tanmoy.banerjee@outlook.in

]

git push -u  [aforementioned remote repository name which already exist] --all

===================================================================================================

For adding new files / updating files in an already committed project
==========================================================================
clone the project(s) by entering desired location and open cmd there and run the clone command 

git clone https://github.com/tanmoy281/SOAP-Web-Service-Projects.git

(you can get it from github ui)

now open the project in IDE(eclipse) and make necessary changes



now go to the location of file(in cmd) which is added or changed 

git add Changed_file_name_with_extension

git status    (using this command you would be able to see the files in green color which you will be able to commit)

git commit -m "some comment"

now run command: git push




