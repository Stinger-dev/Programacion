
'''
la suma de los divisores es igual al otro y viceversa
ni idea si es asi, lo tengo que buscar en google
'''
def getDivisor(a):
    tmp = []
    for n in range(1,a):
        if a%n == 0:
            tmp.append(n)
    return tmp

def sumatorio (a):
    tmp = 0
    for n in a:
        tmp += n
    
    return tmp
    
def isFriendNumber(a,b):
    solucion = False
    if ((sumatorio(getDivisor(a)) ==  b) and (sumatorio(getDivisor(b)) ==  a)):
        solucion = True
    return solucion

print(isFriendNumber(284, 220))
print(isFriendNumber(1184 , 1210))
