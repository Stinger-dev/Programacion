lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10]

k = 5


def menoresQue(aList, num):
    tmp = []
        
    for n in aList:
        if n < num:
            tmp.append(n)
            
    return tmp


def mayoresQue(aList, num):
    tmp = []
        
    for n in aList:
        if n > num:
            tmp.append(n)
            
    return tmp


def multiplosDe(aList, num):
    tmp = []
        
    for n in aList:
        if ((n % num == 0) and (n != 0)):
            tmp.append(n)
            
    return tmp


print(f' Los numeros menores que {k} son {menoresQue(lista,k)}')
print(f' Los numeros mayores que {k} son {mayoresQue(lista,k)}')
print(f' Los numeros multiplos de {k} son {multiplosDe(lista,k)}')
