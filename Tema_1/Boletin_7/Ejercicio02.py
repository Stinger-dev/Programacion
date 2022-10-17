numero1 = int(input(" Multiplos desdes: "))
numero2 = int(input(" Multiplos de: "))

cantidad = int(input(" Cuantos numeros quieres: "))

numeros = []

k = numero1

for n in range(cantidad):
    encontrado = False
    while not encontrado:
        if k%numero2 == 0:
            numeros.append(k)
            encontrado = True
        k+=1
     
print("",numeros)
    
    
input ("\n Pulsa para salir")