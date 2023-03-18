numero = int(input(" Indique el tamaño: "))


cadena = ""
tmp = 1
print(" a. ")
for i in range(numero):
    cadena += str(((-5) ** i)) + ", "

cadena = cadena[:len(cadena)-2]
print(cadena[:])



cadena = ""
tmp = 1
print(" b. ")
for i in range(numero):
    
    cadena += str(tmp) + ", "
    match tmp:
        case 1:
            tmp = -1    
        case - 1:
            tmp = 0
        case _:
            tmp = 1 
            
'''
la opcion sin match 

if tmp == 1:
    tmp = -1
elif tmp == -1:
    tmp = 0
else:
    tmp = 1
'''
cadena = cadena[:len(cadena)-2]
print(cadena[:])


cadena = ""
print(" c. ")
for i in range(numero):
    
    cadena += str(3 ** i) + ", "
    
cadena = cadena[:len(cadena)-2]
print(cadena[:])

input ("\n Pulsa para salir")  