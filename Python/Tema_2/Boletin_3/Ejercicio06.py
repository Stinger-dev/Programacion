#ya esta hecho como queria el maestro

def estaEscondida(cad, buscar):
    k = 0
    solucion = False
    for n in cad:
        if k<len(buscar) and n == buscar[k]:
            k+=1
        
    if k == len(buscar):
        solucion = True
    
    return solucion

assert(estaEscondida('tdvoasvdoadvvadss', 'todos'))
assert(not (estaEscondida('asdfaotasfdfdasdfos', 'todos')))
assert(estaEscondida('hola', 'hola'))
assert(not(estaEscondida('ohla', 'hola')))