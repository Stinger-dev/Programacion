numero = int(input(" Numero: "))

while numero != 0:
    tipo = "impar"
    signo = "negativo"
    cuadrado = numero * numero
    if numero % 2 == 0:
        tipo = "par"
    if numero >= 0:
        signo = "positivo"
    print(f" {numero} => es {tipo}, {signo} y su cuadrado es {cuadrado}")
    numero = int(input(" Numero: "))    

input ("\n Pulsa para salir")
