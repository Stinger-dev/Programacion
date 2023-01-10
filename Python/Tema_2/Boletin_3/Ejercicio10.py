def contarPalabras(cad):
    k = 0
    solucion = 0
    cad = cad.strip()
    while k < len(cad):
        while k < len(cad) and cad[k] == ' ':
            k += 1
        solucion += 1
        while  k < len(cad) and cad[k] != ' ':
            k += 1
    return solucion


print (contarPalabras('Hola a todos'))
