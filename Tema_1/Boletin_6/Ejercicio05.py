numero = int(input(" Enter a number (negative to finish): "))
k=0
while (numero > 0):
    k = k+1
    numero = int(input(" Enter a number (negative to finish): "))

print(" You have entered %s positive numbers." %(k))


input("\n Push enter to exit")