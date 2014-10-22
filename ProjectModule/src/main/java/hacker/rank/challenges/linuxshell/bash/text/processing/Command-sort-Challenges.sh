#1 : Given a file of text, re-order the lines in lexicographical order. 
sort -M $1

#2 : Given a file of text, re-order the lines in reverse lexicographical order (i.e. Z-A instead of A-Z)
sort -r $1

#3 : You are given a file of text, where each line contains a number (which may be either an integer or have decimal places). There will be no extra characters other than the number or the newline at the end of each line. 
#    Sort the lines in ascending order - such that the first line holds the (numerically) smallest number and the last line hold the (numerically) largest number.
sort -n $1

#4 : You are given a file of text, where each line contains a number (which may be either an integer or have decimal places). There will be no extra characters other than the number or the newline at the end of each line. 
#    Sort the lines in descending order - such that the first line holds the (numerically) smallest number and the last line hold the (numerically) largest number. 
sort -nr $1