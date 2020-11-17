a = Array.new()
for j in 1..6
  a[j] = gets().chomp().to_f
end
count = 0
sum = 0
for j in 1..6
  if a[j] > 0
    count = count + 1
    sum = sum + a[j]
  end
end
printf("%d valores positivos\n", count);
printf("%.1f\n", sum / count.to_f);
