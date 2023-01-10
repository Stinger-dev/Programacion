numero1 = int(input(" Multiplos desde: "))
numero2 = int(input(" Multiplos de: "))

cantidad = int(input(" Cuantos numeros quieres: "))

numeros = []

k = numero1

for n in range(cantidad):
    encontrado = False
    while not encontrado:
        if k % numero2 == 0:
            numeros.append(k)
            numeros.append(",")
            encontrado = True
        k += 1
numeros = numeros[:-1]
numeros = map(str, numeros)
print("".join(numeros))



    
input ("\n Pulsa para salir") 

'''
Mi forma de solucionarlo es muy poco eficiente, hago muchas comprobaciones

Otra menera mas eficiente sera, buscar el primer multipo y luego simplemente hacerle sumas a ese numero para encontrar mas 
puede incluso que la solucion de la suma sea mas facil de  hacer

'''