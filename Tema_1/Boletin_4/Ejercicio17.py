comienzo = int(input(" Indique el primer numero: "))
final = int(input(" Indique el segundo numero: "))

k=comienzo

if (final > comienzo):
    
    for n in range(final+1-comienzo):
        if k%2 == 0:
            print(k)
        k = k+1
else:
    print(" El rango no es valido ")
    
    
    
input("\n Pulse enter para salir")