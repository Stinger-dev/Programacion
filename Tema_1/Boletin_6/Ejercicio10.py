numero = int(input(" Enter an integer positive number: "))
factorial = 1

while numero < 0:
    numero = int(input(" The number is not valid, try again: "))

for n in range (1, numero + 1):
    factorial = factorial * n
   
print(f" The factorial is {factorial}")

input("\n Push enter to exit")
