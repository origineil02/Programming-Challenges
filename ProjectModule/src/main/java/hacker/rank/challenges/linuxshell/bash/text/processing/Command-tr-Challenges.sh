#1 : In a given fragment of text, replace all box-brackets ([]) with parenthesis ().
tr "()" "[]"

#2 : In a given fragment of text, delete all lower case characters a-z. 
tr -d [:lower:]

#3 : In a given fragment of text, replace all sequences of multiple spaces with just one space.
tr -s [:space:]