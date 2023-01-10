def numeroValido(cad):
    cad = str(cad)
    for n in range(len(cad)):
        if (cad[n] not in '1234567890'):
            return None
    return True

def isPrimer(num):
    if numeroValido(num):
        encontrado = False
        k = 2
        while ((not encontrado) and (k < ((num + 1) / 2))):
            if num % k == 0:
                encontrado = True
            k += 1
        return not(encontrado)
    else:
        return None
    


print(isPrimer(12))
