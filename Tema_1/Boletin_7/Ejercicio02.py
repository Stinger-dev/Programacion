numero1 = 10
numero2 = 17

cantidad = 10

numeros = []

k = numero1
for n in range(cantidad):
    encontrado = False
    while not encontrado:
        if k%numero2 == 0:
            numeros.append(k)
            encontrado = True
        else:
            k+=1
            
        
print(numeros[:])
    