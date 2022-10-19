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


'''
En este se podria hacer algunos de los calculos en el propio print, pero creo que asi esta "mejor" a nivel de limpieza en codigo

'''