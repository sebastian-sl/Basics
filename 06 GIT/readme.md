# GIT Basics

&nbsp;

### Starting a repository

** git init ** Starts a repository from scratch in the current Directory
** git clone <url> ** Clones the repository from given url
** git fork <url> ** Clones the repository to your github (i.e repository from other sources)

&nbsp;

### Modifying files in the repository
** git status ** lists the current status of your repository, which files changed, which files were added already etc.
** git log ** lists all commits to the repository
&nbsp;
** git add <file> ** adds the given file or all (*) to the staging area
** git reset <file> ** removes the modified files or all () from the staging area
&nbsp;
** git commit -m <msg>** adds all files from the staging area to the repository
** git reset HEAD~ ** will remove the latest commit
** git reset --hard <hash> will reset the repository to the state before the given hash from git log

&nbsp;
### Creating a new Branch
** git checkout <name> ** creates a new branch including switching to the branch
** git branch <name> ** creates a new branch without switching
** git switch <name> ** switches to the branch
** git branch -d <name> ** deletes the branch under given name
** git merge <name> ** merges the given name to the current working branch


&nbsp;

### Connecting and Modifying external repositories
** git remote add origin <url> ** creates a connection to given url (github)
** git push -u origin <branch> ** uploads the local repository to the connected repository
** pull request <url> ** after pushing, you create a request to an external repository owner to accept your made changes

