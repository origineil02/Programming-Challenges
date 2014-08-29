#1: Display the third character from each line of text. 
cut -c3 $1

#2: Display the second and seventh character from each line of text. 
cut -c2,7 $1

#3: Display a range of characters starting at the second position of a string and ending at the seventh position (both positions included).
cut -c 2-7  $1

#4: Display the first four characters from each line of text.
cut -c 1-4  $1

#5: Given a tab delimited file with several columns (tsv format) print the first three fields.
cut -f1-3 $1

#6: Print the characters from thirteenth position to the end.
cut -c 13-  $1

#7: Given a sentence, identify and display its fourth word. Assume that the space (' ') is the only delimiter between words. 
cut -d ' ' -f4 $1

#8: Given a sentence, identify and display its first three words. Assume that the space (' ') is the only delimiter between words. 
cut -d ' ' -f1-3

#9: Given a tab delimited file with several columns (tsv format) print the fields from second fields to last field.
cut -f2- $1