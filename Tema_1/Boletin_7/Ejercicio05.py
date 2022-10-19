numero = int(input(" Numero: "))

historial = [numero]

while numero != 1:
    if numero % 2 == 0:
        numero = numero / 2
    else:
        numero = numero * 3 + 1
    historial.append(numero)
print(historial[:])  

input ("\n Pulsa para salir")  
