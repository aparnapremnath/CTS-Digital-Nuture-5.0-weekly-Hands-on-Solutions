\# Exercise 3: Branching and Merging



\## Overview

This exercise covers Git branching fundamentals — creating a branch, 

committing changes to it, comparing it against the trunk (both via 

command line and visually), merging it back into master, and cleaning 

up the branch post-merge.



\## Files

| File | Description |

|------|-------------|

| branchfile.txt | File created and committed on the `GitNewBranch` branch |

| branch\_diff.txt | Command-line diff output between `master` and `GitNewBranch`, viewed visually in VS Code |



\## Tech Stack

\- Git 2.54.0

\- GitHub

\- Windows PowerShell

\- VS Code (used in place of P4Merge for visual diff comparison)



\## Notes

\- Created a new branch `GitNewBranch` from `master`

\- Listed local and remote branches with `git branch -a`, observing the 

&#x20; `\*` marker for the current branch

\- Switched to `GitNewBranch`, added `branchfile.txt`, committed the change

\- Verified clean status with `git status`

\- Switched back to `master` and compared branches with `git diff master GitNewBranch`

\- Viewed the diff visually in VS Code (P4Merge substitute)

\- Merged `GitNewBranch` into `master` (fast-forward merge)

\- Reviewed history with `git log --oneline --graph --decorate`

\- Deleted `GitNewBranch` post-merge with `git branch -d`

