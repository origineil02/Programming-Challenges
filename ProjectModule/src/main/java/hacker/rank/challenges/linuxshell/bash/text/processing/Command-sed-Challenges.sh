#1 - transform the first occurrence of the word 'the' with 'this'
sed s/"\bthe\b"/this/ $1

#2 - transform all the occurrences of the word 'thy' with 'your'. The search should be case insensitive
sed s/[tT]hy/your/g  $1

#3 - highlight all the occurrences of 'thy' by wrapping them up in brace brackets. The search should be case-insensitive.
sed s/thy/{\&}/g $1