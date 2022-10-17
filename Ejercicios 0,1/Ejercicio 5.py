print(" Contador de numeros positivos y negativos")

positivos = 0
negativos = 0
for n in range(10):
    k = float (input(" Introduzca el numero: "))
    if k>=0:
        positivos = positivos + 1
    elif k<=0:
        negativos = negativos + 1
        
print(positivos, "numeros positivos y", negativos, "numeros negativos" )


input ("\n Pulsa para salir")