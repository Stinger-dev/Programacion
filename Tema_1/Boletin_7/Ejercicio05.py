'''
En este resolvemos la conjetura de Collatz

Todo lo relacionado con el segundo numero y la comparacion es añadido

'''
numero1 = int(input(" Numero 1: "))
numero2 = int(input(" Numero 2: "))

historial1 = [numero1]
historial2 = [numero2]

while numero1 != 1:
    if numero1 % 2 == 0:
        numero1 = numero1 / 2
    else:
        numero1 = numero1 * 3 + 1
    historial1.append(numero1)
print(historial1[:])  

while numero2 != 1:
    if numero2 % 2 == 0:
        numero2 = numero2 / 2
    else:
        numero2 = numero2 * 3 + 1
    historial2.append(numero2)
print(historial2[:]) 

if len(historial1) > len(historial2):
    print(f' La longitud de Collatz de {historial1[0]} es mayor que la de {historial2[0]}')
elif len(historial1) == len(historial2):
    print(f' {historial1[0]} y {historial2[0]} tienen la misma longitud de Collatz')
else:
    print(f' La longitud de Collatz de {historial2[0]} es mayor que la de {historial1[0]}')

input ("\n Pulsa para salir")  
