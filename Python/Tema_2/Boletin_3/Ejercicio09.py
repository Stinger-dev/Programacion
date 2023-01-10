def ordenarCadena(cad):
    cad = cad.lower()
    solucion = ''
    for n in cad:
        if n in 'qwrtypsdfghjklñzxcvbnm':
            solucion += n
            
    for n in cad:
        if n in 'aeiou':
            solucion += n
    return solucion

            
assert(ordenarCadena('curso de programacion') == "crsdprgrmcnuoeoaaio")
print(ordenarCadena('curso de programacion'))
