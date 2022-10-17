print(" Distancia entre dos numeros (Valor absoluto)")

numero1 = float (input(" Primer numero: "))
numero2 = float (input(" Segundo numero: "))


distancia = numero1-numero2

if distancia < 0:
    distancia = distancia*-1


print (" La distancia entre ambos numeros es de",distancia)

input ("\n Pulsa para salir")