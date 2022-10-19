numero = int(input(" Indique el tamaño: "))

tmp = 1
print("a. ")
for i in range(numero):
    
    print((5 ** i) * tmp, end=",")
    tmp *= -1
print("")

tmp = 1
print("b. ")
for i in range(numero):
    
    print(tmp, end=",")
    match tmp:
        case 1:
            tmp = -1
        case - 1:
            tmp = 0
        case _:
            tmp = 1 
print("")

print("c. ")
for i in range(numero):
    
    print(3 ** i, end=",")
print(" ")

input ("\n Pulsa para salir")  
