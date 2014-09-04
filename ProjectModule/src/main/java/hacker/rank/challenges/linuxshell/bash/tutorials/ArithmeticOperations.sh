read -e x

value=$(echo "$x" | bc -l)

echo $(printf "%.3f" "$value")