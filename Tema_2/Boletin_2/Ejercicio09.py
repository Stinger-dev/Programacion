def isPrimer(num):
    encontrado = False
    k = 2
    while ((not encontrado) and (k < ((num + 1) / 2))):
        if num % k == 0:
            encontrado = True
        k += 1
    return not(encontrado)


def getPrimeDivisors(num):
    tmp = []
    for n in range (1, (num + 1) // 2):
        if num % n == 0:
            if isPrimer(n):
                tmp.append(n)
    return tmp

    
print(getPrimeDivisors(22))
print(getPrimeDivisors(120))
