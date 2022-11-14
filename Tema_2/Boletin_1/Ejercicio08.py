numeros = []
tmp = int(input(' Numero:'))
while tmp>= 0:
    numeros.append(tmp)  
    tmp = int(input(' Numero:'))

  


def esPrimo(num):    
    valido = True
    k=2
    while (k<num and esPrimo):
        if num%k==0:
            valido = False
        k += 1
    return valido       
     
def primosLista(aList):
    tmp = []
    for n in aList:
        if esPrimo(n):
            tmp.append(n)
    return tmp
    
    
            
print(numeros)
print(primosLista(numeros))  