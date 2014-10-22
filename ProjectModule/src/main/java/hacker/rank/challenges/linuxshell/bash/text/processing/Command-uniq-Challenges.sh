#1 : Given a text file, remove consecutive repetitions of any line.
uniq $1

#2 : Given a text file, count the number of times each line repeats itself (only consider consecutive repetitions). 
#    Display the count and the line, separated by a space. There should be no leading or trailing space. Please note that the uniq -c command by itself will generate the output in a different format from the one expected here.
uniq -c $1 | tr -s [:space:] | cut -c 2-

#3 : See #2 except : This time, compare consecutive lines in a case insensitive manner. So, if a line X is followed by case variants, the output should count all of them as the same (but display only the form X in the second column)
uniq -ci $1 | tr -s [:space:] | cut -c 2-

#4 : Given a text file, display only those lines which are not followed or preceded by identical replications. 
uniq -u $1