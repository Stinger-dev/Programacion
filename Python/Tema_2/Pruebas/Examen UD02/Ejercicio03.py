def get_posicion_eq_valor(lista):
    solucion = []
    for n in range(len(lista)):
        if n == lista [n]:
            solucion.append(n)
    return solucion


def obtener_frecuencia(lista):
    solucion = {}
    for n in lista:
        if n in solucion:
            solucion[n] += 1
        else:
            solucion [n] = 1
    return solucion


def dame_numero():
    from random import randint
    return randint(0, 30)


def generar_lista(cant):
    solucion = []
    for n in range(cant): 
        n = n  # no hace nada, es simplemente para quitar el aviso
        solucion.append(dame_numero())
    return solucion


lista = generar_lista(10)
print(lista)
print(get_posicion_eq_valor(lista))

lista = generar_lista(30)
print(lista)
print(obtener_frecuencia(lista))

'''
[6, 17, 21, 22, 16, 12, 29, 17, 30, 26]
[]
[13, 10, 5, 8, 27, 12, 13, 13, 4, 15, 8, 15, 7, 30, 23, 1, 17, 24, 17, 1, 29, 18, 4, 17, 25, 10, 20, 9, 21, 16]
{13: 3, 10: 2, 5: 1, 8: 2, 27: 1, 12: 1, 4: 2, 15: 2, 7: 1, 30: 1, 23: 1, 1: 2, 17: 3, 24: 1, 29: 1, 18: 1, 25: 1, 20: 1, 9: 1, 21: 1, 16: 1}


[13, 16, 6, 24, 4, 0, 25, 2, 27, 22]
[4]
[2, 5, 20, 17, 18, 7, 20, 7, 23, 0, 29, 27, 5, 1, 19, 9, 19, 25, 28, 11, 26, 4, 14, 6, 11, 20, 25, 1, 14, 4]
{2: 1, 5: 2, 20: 3, 17: 1, 18: 1, 7: 2, 23: 1, 0: 1, 29: 1, 27: 1, 1: 2, 19: 2, 9: 1, 25: 2, 28: 1, 11: 2, 26: 1, 4: 2, 14: 2, 6: 1}

'''

'''
Opcional: exactamente como el ejemplo

lista = [1,1,3,4,5,4,6,6,6,4,3,3]

def obtener_frecuencia(lista):
    solucion = {}
    for n in lista:
        if n in solucion:
            solucion[n] += 1
        else:
            solucion [n] = 1
    return solucion

solucion = obtener_frecuencia(lista)


for n in solucion:
    print(f'{n} -> frecuencia: {solucion[n]}')

'''
