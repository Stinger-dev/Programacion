def binarioValido (cad):
    valido = True
    k = 0
    cad = cad.upper()
    while k<len(cad[:-1]) and valido:
        if cad[k] not in map(str,[0,1]):
            valido = False
        k += 1
    if valido and cad[-1] != 'B':
        valido = False
         
    return valido

def invertirCadena (cad):
    tmp = ''
    for n in range(len(cad)-1,-1,-1):
        tmp = tmp + cad[n]
    return tmp

def binario2decimal(cad):
    tmp = 1
    cad = cad[:-1]    
    cad = invertirCadena(cad)
      
    for n in range(len(cad)):
        if cad[n] == '1':
            tmp += 2**n
            
    return (tmp -1)

def decimalValido (cad):
    valido = True
    k = 0
    cad = cad.upper()
    while k<len(cad[:-1]) and valido:
        if not (cad[k].isnumeric()):
            valido = False
        k += 1
    if valido and cad[-1] != 'D':
        valido = False
         
    return valido

def maximoBinario(num):
    maximoValor = 0
    while (2**(maximoValor+1)) <= num:
        maximoValor += 1
    return maximoValor
    
def decimal2binario (cad):
    num = int(cad[:-1])
    tmp = ''
    maxi =  maximoBinario(num)   
    for n in range(maxi,-1,-1):
        if (num - 2**n) >= 0:
            tmp += '1'
            num = (num - 2**n) 
        else:
            tmp += '0'
    return tmp

print(' Conversor binario-decimal y decimal-binario')
cadena = input(' Introduzca el numero (formato 120D o 010101B): ')

if binarioValido(cadena):
    print(f' {cadena[:-1]} en decimal es {binario2decimal(cadena)}')
elif decimalValido(cadena):
    print(f' {cadena[:-1]} en binario es {decimal2binario(cadena)}')
else:
    print(' No validos')