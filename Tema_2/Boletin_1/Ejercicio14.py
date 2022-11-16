lista = ['hola', 'Buenos dias', 'Bienos dias']
def contarLetra(cadena,letra):
    k = 0
    letra = letra.lower()
    cadena = cadena.lower()
    for n in cadena:
        if letra == n:
            k += 1
    return [letra, k]

def esta(letra, lista):
    
    for n in lista:
        if letra in n:
            return True
    return False

def contarRepetidos(cadena):
    cadena = cadena.lower()
    tmp = []
    tmp.append(contarLetra(cadena, cadena[0]))
    for n in cadena.lower():
        if not (esta(n,tmp)):
            tmp.append(contarLetra(cadena, n))
    return tmp


    
maximo = lista[0]
for n in lista:
    if len(n) > len(maximo):
        maximo = n
    elif len(n) == len(maximo):
        if len(contarRepetidos(n)) < len(contarRepetidos(maximo)):
            maximo = n
        
        
print(maximo)
            
