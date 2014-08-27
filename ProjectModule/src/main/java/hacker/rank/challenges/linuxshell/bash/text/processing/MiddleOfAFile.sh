#Print lines 12 - 22
awk 'NR>11&&NR<23{print $0}' $1
head -n 22 $1 | tail -n 11 
sed -n "12,22p" $1 