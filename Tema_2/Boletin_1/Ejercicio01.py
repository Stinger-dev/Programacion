from random import randint

numero = []

for n in range(100):
    numero.append(randint(0,1000))
    
def mayor(tmp = []): #hecho
    n = tmp[0]
    for i in tmp:
        if i > n:
            n = i
    return n
def menor (tmp = []): #done
    n = tmp[0]
    for i in tmp:
        if i < n:
            n = i
    return n
def sumatorio (tmp = []):
    n = 0
    for i in tmp:
        n += i
    return n


def media (tmp = []):
    sumatorio(tmp) / 100