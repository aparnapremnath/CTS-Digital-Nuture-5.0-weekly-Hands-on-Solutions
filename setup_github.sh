#!/bin/bash
# ===========================================
# GitHub Repository Setup Script
# Run this inside your solutions/ folder
# ===========================================

echo "🚀 Setting up GitHub repository..."

# Step 1: Initialize git
git init
git add .
git commit -m "Initial commit: Week-wise solutions structure"

# Step 2: Create remote repo using GitHub CLI (if installed)
# OR manually go to github.com and create a repo named 'weekly-solutions'

echo ""
echo "✅ Local git repo initialized!"
echo ""
echo "📌 NEXT STEPS:"
echo "   1. Go to https://github.com/new"
echo "   2. Create a NEW PUBLIC repository named: weekly-solutions"
echo "   3. Do NOT initialize with README (we already have one)"
echo "   4. Then run these commands:"
echo ""
echo "      git remote add origin https://github.com/YOUR_USERNAME/weekly-solutions.git"
echo "      git branch -M main"
echo "      git push -u origin main"
echo ""
echo "   5. Share the URL: https://github.com/YOUR_USERNAME/weekly-solutions"
