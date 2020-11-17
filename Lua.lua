array = {}
count = 0
sum = 0
for i = 1,6 do
    array[i] = io.read("*n")
end
for i = 1,6 do
    if array[i] > 0 then
        count = count + 1
        sum = sum + array[i]
    end
end
print(count.." valores positivos")
print(string.format( "%.1f",sum / count))
