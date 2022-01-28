# GIT Basics

### Starting a repository

<pre>
<b> git init </b>            Starts a repository from scratch in the current Directory  
<b> git clone URL </b>          Clones the repository from given url    
<b> git fork URL </b>           Clones the repository to your github (i.e repository from other sources)  
</pre>

### Modifying files in the repository

<pre>
<b> git status </b>         lists the current status of your repository, which files changed, which files were added already etc.  
<b> git log </b>            lists all commits to the repository
<br>
<b> git add FILE/* </b>           adds the given file or all (*) to the staging area  
<b> git reset </b>         removes the modified files or all () from the staging area  
<br>
<b> git commit -m MSG </b>     adds all files from the staging area to the repository  
<b> git reset HEAD~ </b>    will remove the latest commit or HEAD{n} the last n-th commits
<b> git reset --hard HASH </b>  will reset the repository to the state before the given hash from git log  
</pre>
  
### Creating a new Branch

<pre>
<b> git checkout -b NAME </b>      creates a new branch including switching to the branch  
<b> git branch NAME </b>        creates a new branch without switching  
<b> git switch NAME </b>        switches to the branch 
<b> git branch -d NAME </b>     deletes the branch under given name  
<b> git merge NAME </b>         merges the given name to the current working branch  
</pre>

### Connecting and Modifying to Github

<pre>
<b> git remote add origin <url> </b>  creates a connection to given url (github)  
<b> git pull </b>                will fetch and merge any changes from the connected url to the local repository  
<b> git push </b>                uploads the local repository to the connected repository 
<b> git pull request <url> </b>       after pushing, you create a request to an ext. repository owner to accept changes    

</pre>


