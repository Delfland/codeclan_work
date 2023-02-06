git init: Initializes a new Git repository.
git clone [url]: Creates a copy of a remote repository on your local machine.
git add [file]: Adds a file to the staging area.
git commit -m "[message]": Creates a new commit with the changes in the staging area and adds a commit message.
git status: Shows the status of the files in the working directory and the staging area.
git log: Shows the commit history.
git diff: Shows the differences between the working directory and the last commit.
git branch: Shows the branches in the repository and the current branch.
git branch [branch name]: Creates a new branch with the given name.
git checkout [branch name]: Switches to the specified branch.
git merge [branch name]: Merges the specified branch into the current branch.
git pull: Fetches the latest changes from the remote repository and merges them into the current branch.
git push: Pushes the local changes to the remote repository.
git remote -v: shows the remote repository url
git stash: Temporarily saves changes that you have made but do not want to commit.
git stash pop: Restores the changes from the last stash and removes the stash from the list of stashes.
git reset [file]: Unstages a file that has been previously added to the staging area.
git rm [file]: Removes a file from the working directory and stages the deletion for the next commit.
git fetch [remote]: Fetches the latest changes from a remote repository, but does not merge them into the local branches.
git pull --rebase: Fetches the latest changes from the remote repository and applies them on top of the local commits, instead of merging them.
git blame [file]: Shows the last modification and the author for each line of a file.
git cherry-pick [commit]: Applies the changes from a specific commit on top of the current branch.
git reflog: Shows the entire history of refs, including branch and tag updates and resets. (edited) 