lista = [12,40,50,70,100,110]

def estaOrdenada(aL = []):
    encontrada = True
    k = 0
    while (not (encontrada) and (k < (len(aL)-1))):
        if aL[k]> aL[k+1]:
            encontrada = False
        else:
            k+=1
    return encontrada


print(estaOrdenada(lista))