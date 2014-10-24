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

#5 : You are given a file of text,which contains temperature information about American cities, in TSV (tab-separated) format. The first column is the name of the city and the next four columns are the average temperature in the months of Jan, Feb, March and April.
#    Rearrange the rows of the table in descending order of the values for the average temperature in January. 

#6 : You are given a file of tab separated weather data (TSV). There is no header column in this data file.
#    The first five columns of this data are: (a) the name of the city (b) the average monthly temperature in Jan (in Fahreneit). (c) the average monthly temperature in April (in Fahreneit). (d) the average monthly temperature in July (in Fahreneit). (e) the average monthly temperature in October (in Fahreneit).
#    Sort this file in ascending order of the second column (i.e. the average monthly temperature in January). 