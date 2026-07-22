\# Exercise 4: Merge Conflict Resolution



\## Overview

This exercise demonstrates how Git handles and resolves merge conflicts 

when the same file is modified differently on two branches — a common 

scenario when multiple contributors work in parallel.



\## Files

| File | Description |

|------|-------------|

| hello.xml | Final resolved content after manually merging conflicting versions from `master` and `GitWork` |

| conflict\_diff.txt | Command-line diff output between `master` and `GitWork` versions of `hello.xml`, viewed visually in VS Code |



\## Tech Stack

\- Git 2.54.0

\- GitHub

\- Windows PowerShell

\- VS Code (used in place of P4Merge for visual diff comparison)



\## Notes

\- Verified `master` was in a clean state before starting

\- Created branch `GitWork`, added `hello.xml` with one version of content, committed

\- Switched to `master`, added `hello.xml` with different content, committed — 

&#x20; intentionally diverging both branches on the same file

\- Reviewed divergence with `git log --oneline --graph --decorate --all`

\- Compared branches using `git diff` and visually in VS Code

\- Ran `git merge GitWork`, which triggered an add/add CONFLICT on `hello.xml`

\- Resolved the conflict manually by editing `hello.xml` to merge both branches' intent

\- Staged and committed the resolution

\- Added `\*.orig` to `.gitignore` to exclude merge backup files

\- Deleted the merged `GitWork` branch and confirmed final history with 

&#x20; `git log --oneline --graph --decorate`

