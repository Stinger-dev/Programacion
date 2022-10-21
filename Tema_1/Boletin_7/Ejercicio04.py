numero = int(input(" Indique el tamaño: "))


cadena = []
tmp = 1
print(" a. ")
for i in range(numero):
    cadena.append((5 ** i) * tmp)
    cadena.append(",")
    tmp *= -1
cadena = cadena[:len(cadena)-1]
print(*cadena[:])



cadena = []
tmp = 1
print(" b. ")
for i in range(numero):
    
    cadena.append(tmp)
    cadena.append(",")
    match tmp:
        case 1:
            tmp = -1
        case - 1:
            tmp = 0
        case _:
            tmp = 1 
cadena = cadena[:len(cadena)-1]
print(*cadena[:])


cadena = []
print(" c. ")
for i in range(numero):
    
    cadena.append(3 ** i)
    cadena.append(",")
cadena = cadena[:len(cadena)-1]
print(*cadena[:])

input ("\n Pulsa para salir")  




'''
La estructura del end no me gusta mucho, es un poco fea, pero creo que es la mas facil para esa situacio

'''