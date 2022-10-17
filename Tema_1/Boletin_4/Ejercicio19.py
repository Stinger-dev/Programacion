base = float(input(" Indique la base: "))

exponente = int (input(" Indique el exponente: "))

resultado = 1

while exponente < 0:
    exponente = int (input(" El exponente debe ser mayor que cero, inserte otro: "))

if exponente == 0:
    resultado = 1
else:
    for n in range(exponente):  
        resultado = resultado * base
        
print(" %s ^ %s = %s" %(base, exponente, resultado))

input("\n Pulse enter para salir")