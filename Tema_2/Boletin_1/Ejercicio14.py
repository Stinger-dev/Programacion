#descomentar la lista que se quiera probar
#lista = ['hola', 'Buenos dias', 'Bienos dias']
#lista = ['El otro dia', 'pase el dia', 'en estocolmo', 'con la reina de', 'de valencia']
lista = ['lleva', 'la tarara','un vestido', 'lleno de ', 'cascabeles']


def letrasUnicas(cadena):
    tmp = []
    for n in cadena:
        if n not in tmp:
            tmp.append(n)
    return tmp
    
maximo = lista[0]
for n in lista:
    if len(n) > len(maximo):
        maximo = n
    elif len(n) == len(maximo): 
        if len(letrasUnicas(n)) < len(letrasUnicas(maximo)):#mientras menor sea el tamaño mas letras repetidas tiene
            maximo = n
        
        
print(maximo)