'''
Este tambien hay que modificarlo porque el maestro quiere que creeemos nuestra propia funcion que busqeu la palabra en la cadena
en vez de usar el .find() o .index(), aunque sean cosas que hemos dado en teoria
'''


def encontrarPalabras(frase, buscar):  # devuelve una lista con la posicion inical de una cedena todas las veces que aparezca, -1 si no existe
    solucion = -1
    buscar = ' ' + buscar + ' '  # asi me aseguro que sea una palabra, ya que esta buscando por esa secuencia de caracteres y esten separados por estacios
    frase = ' ' + frase + ' '  # asi me aseguro que la primera y la ultima palabra tambien cuenten 
    if (buscar in frase):
        solucion = (frase.find(buscar))
    return solucion


def remplazarEnFrase(frase, buscar, sustituir):
    k = encontrarPalabras(frase, buscar)
    while k != -1:  # como he puesto que cuando no encuentra la palabra devuelva un -1, 
        frase = frase[:k] + sustituir + frase[k + len(buscar):]  # asi inserto la palabra en el hueco de la otra
        k = encontrarPalabras(frase, buscar) 
    return frase


print(remplazarEnFrase('hola a todos todos todos todos', 'todos', 'gil'))
