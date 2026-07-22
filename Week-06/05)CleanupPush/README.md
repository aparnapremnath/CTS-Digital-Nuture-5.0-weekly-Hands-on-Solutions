\# Exercise 5: Clean Up and Push Back to Remote



\## Overview

This exercise is a verification/wrap-up step, confirming that the local 

repository is clean, all local branches are accounted for, and any 

pending changes from prior exercises are fully synced with the remote 

GitHub repository.



\## Files

This exercise does not produce new artifacts — it verifies the state 

of the repository set up in Exercises 1–4.



\## Tech Stack

\- Git 2.54.0

\- GitHub

\- Windows PowerShell



\## Notes

\- Verified `master` was in a clean working state with `git status`

\- Listed all available branches with `git branch -a` — confirmed only 

&#x20; `master` remained locally (feature branches were already deleted 

&#x20; after merging in earlier exercises)

\- Ran `git pull origin master` — repository was already up to date

\- Ran `git push` — repository was already up to date, confirming all 

&#x20; prior exercise commits were successfully synced with the remote

\- Verified the remote repository (`https://github.com/aparnapremnath/GitDemo`) 

&#x20; reflects all local commits and history

