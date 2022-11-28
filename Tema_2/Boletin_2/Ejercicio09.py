def numeroValido(cad):
    cad = str(cad)
    for n in range(len(cad)):
        if (cad[n] not in '1234567890'):
            return None
    return True

def isPrimer(num):
    encontrado = False
    k = 2
    while ((not encontrado) and (k < ((num + 1) / 2))):
        if num % k == 0:
            encontrado = True
        k += 1
    return not(encontrado)


def getPrimeDivisors(num):
    if numeroValido(num):
        tmp = []
        for n in range (1, (num + 1) // 2):
            if num % n == 0:
                if isPrimer(n):
                    tmp.append(n)
    else:
        tmp = None
    return tmp

    
print(getPrimeDivisors(22))
print(getPrimeDivisors(120))
