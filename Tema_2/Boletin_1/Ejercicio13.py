nombres = ['Lucia', 'Ana', 'Sandra']

inicial = 'L'

def nombresInicial(aList, inicial):
    tmp = []
    for n in aList:
        if n[0].upper() == inicial.upper():
            tmp.append(n)
    return tmp
 
def nombreValido(cad):
    for n in cad:
        if not (n.isalpha()):
            return False
    return True

def listaValida(aList):
    for n in aList:
        if not(nombreValido(n)):
            return False
    return True



if listaValida(nombres):
    if nombreValido(inicial):
        print(nombresInicial(nombres, inicial))
    else:
        print(' Inicial no valida')
else:
    print(' Los datos de la lista son erroneos')
