maximo = int(input(" Enter one number grater than 0: "))

while maximo <= 0:
    maximo = int(input(" The number is not right, try again: "))
    
suma = 0    
for n in range (maximo + 1):
    suma = suma + n 

print(f" The sum of the {maximo} first numbers is {suma}")

input("\n Push enter to exit")
