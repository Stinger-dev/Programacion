inferior = int(input(" Indice inferior: "))
superior = int(input(" Indice superior: "))

tmp = -1
sumadorDentro = 0
contadorFuera = 0
contadorIgual = 0
    
while inferior > superior:
    inferior = int(input(" Limite inferior no valido, introduzca uno nuevo: "))
    
while tmp:
    tmp = int(input(" Indique un numero: "))
    
    if tmp:
        if tmp == inferior or tmp == superior:
            contadorIgual = contadorIgual + 1
        elif inferior < tmp < superior:
            sumadorDentro = sumadorDentro + tmp
        else: 
            contadorFuera = contadorFuera + 1
        
print(" Han sido %s numeros iguales a alguno de los dos intervalos, %s fuera del intervalo y la suma de todos los datos que estaban dentro es %s" % (contadorIgual, contadorFuera, sumadorDentro))
