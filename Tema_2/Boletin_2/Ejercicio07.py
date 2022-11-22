def isPrimer(num):
    encontrado = False
    k = 2
    while ((not encontrado) and (k < ((num+1)/2))):
        if num%k == 0:
            encontrado = True
        k += 1
    return not(encontrado)


print(isPrimer(11))