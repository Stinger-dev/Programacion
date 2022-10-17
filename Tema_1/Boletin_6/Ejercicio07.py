total = int(input(" How many numbers do you want input?: "))
suma=0
tmpInput= 0


while total < 0:
    total = int(input(" You should input more than 0 numbers "))



for n in range(total): 
    tmpInput = int(input(" Enter one number greater than 0: "))

    while tmpInput < 0:
        tmpInput = int(input(" The number is not valid, it should be greater than 0: "))
        
    suma = suma + tmpInput

print(f" The medium in {suma / total}")



input("\n Push enter to exit")