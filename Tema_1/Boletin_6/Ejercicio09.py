numero = int(input(" Enter an integer positive number grater than 0: "))

while numero < 0:
    numero = int(input(" The number is not valid, try again: "))

suma = 0

for n in range((numero // 2) + 1, 0, -1):
    
    if numero % n == 0:
        suma = suma + n

if suma == numero:
    print(" The number is perfect(like u <3)")
else: 
    print(f" The number {numero} is not perfect")
    
input("\n Push enter to exit")
