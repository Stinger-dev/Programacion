'''
Este tambien hay que modificarlo porque el maestro quiere que creeemos nuestra propia funcion que busqeu la palabra en la cadena
en vez de usar el .find() o .index(), aunque sean cosas que hemos dado en teoria
'''

def estaPalabra(cad, buscar):   #Ya es menos spaghetti y esta mas optimizado
    encontrado = False
    k = 0
    s = 0
    while k < len(cad) and not encontrado:
        i = 0
        esta = True
        s = k
        while i < len(buscar) and esta :
            if cad[k] != buscar[i]:
                esta = False
            k += 1
            i += 1              
        if esta:
            encontrado = True 
        else:
            s = -1            
    return s

def encontrarPalabras(frase, buscar):  # devuelve una lista con la posicion inical de una cedena todas las veces que aparezca, -1 si no existe
    solucion = -1
    buscar = ' ' + buscar.upper() + ' '  # asi me aseguro que sea una palabra, ya que esta buscando por esa secuencia de caracteres y esten separados por estacios
    frase = ' ' + frase.upper() + ' '  # asi me aseguro que la primera y la ultima palabra tambien cuenten 
    if (buscar in frase):
        solucion = estaPalabra(frase, buscar)
    return solucion


def remplazarEnFrase(frase, buscar, sustituir):
    k = encontrarPalabras(frase, buscar)
    while k != -1:  # como he puesto que cuando no encuentra la palabra devuelva un -1, 
        frase = frase[:k] + sustituir + frase[k + len(buscar):]  # asi inserto la palabra en el hueco de la otra
        k = encontrarPalabras(frase, buscar) 
    return frase


print(remplazarEnFrase('Hola a todos todos todos todos', 'todos', 'gil'))
