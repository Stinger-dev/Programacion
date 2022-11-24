def estaEscondida(cad,buscar):
    encontrada = True
    k = 0
    while encontrada and k<len(buscar):
        if buscar[k] not in cad:
            encontrada = False
        else:
            k+=1
    return encontrada



print(estaEscondida('hcjhgnhg', 'hola'))