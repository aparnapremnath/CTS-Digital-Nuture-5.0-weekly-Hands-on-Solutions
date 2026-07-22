\# Exercise 2: .gitignore



\## Overview

This exercise demonstrates how to use a `.gitignore` file to exclude 

unwanted files and folders (log files) from being tracked by Git.



\## Files

| File | Description |

|------|-------------|

| .gitignore | Excludes `\*.log` files and the `log/` folder from version control |



\## Tech Stack

\- Git 2.54.0

\- GitHub

\- Windows PowerShell



\## Notes

\- Created `error.log` and a `log/` folder containing `debug.log`

\- Confirmed via `git status` that both were initially untracked

\- Added `.gitignore` with the patterns `\*.log` and `log/`

\- Re-ran `git status` and confirmed the log file/folder no longer 

&#x20; appeared as untracked, while `.gitignore` itself did

\- Committed and pushed `.gitignore` to the remote repository

