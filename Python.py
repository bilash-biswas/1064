count = 0
s = 0
for i in range(0,6):
    a = float(input())
    if a > 0 :
        count = count + 1
        s = s + a

print("{} valores positivos".format(count))
print("{0:.1f}".format(s / count))
