numeros = [12, 13, 14, 15, 16, 17, 18, 19, 20]


def imprimirComas (aL=[]):
    return(', '.join(map(str, aL))) 


def desplazar (aL=[], cantidad=1, orden='d'):
    cantidad = cantidad % len(aL)  # asi puedo no preocuparte de que ponga un argumento demasiado largo
    orden = orden.upper().strip()
    tmp = []
    if orden == 'D':
        for n in range(len(aL)): 
            tmp.append(aL[n - cantidad])
        return tmp
    elif orden == 'I': 
        for n in range(len(aL)):
            tmp.append(aL[-len(aL) + n + cantidad])  # Es un poco lioso, pero es la mejor forma para evitar salirme del rango
    return tmp

