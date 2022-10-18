cantidad = int(input(" Indique cuantos numeros primos quiere: "))
primos = []
contadorPrimos = 0
n = 2

while contadorPrimos < cantidad:
    i = 2
    encontrado = False
    
    while  (i < (1 + n) // 2 and encontrado == False):
        
        if n % i == 0:
            encontrado = True
        else:
            i = i + 1
    
    if encontrado == False:
        primos.append(n)
        contadorPrimos = contadorPrimos + 1
        
    n = n + 1

print("", primos[:])
    
input("\n Pulse enter para salir")
