#1 - use grep to display all those lines which contain the word "the" in them
grep "\bthe\b" $1

#2 - use grep to display all those lines which contain the word "the" in them. The search should NOT be sensitive to case.
grep -i "\bthe\b" $1

#3 - use grep to remove all those lines which contain the word "that". The search should NOT be sensitive to case.
grep -iv "\bthat\b" $1