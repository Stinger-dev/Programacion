flag = "Y"
tmp = False

while flag != "N" and flag == "Y":
    
    number = int(input(" Enter one number: "))
    if tmp == False:
        minimo = number
        
    tmp = True
    
    if minimo > number:
        minimo = number
    
    flag = input(" Do you want to  enter more number (Y/N): ").upper()

print(f" The smallest number is {minimo}")

input("\n Push enter to exit")
