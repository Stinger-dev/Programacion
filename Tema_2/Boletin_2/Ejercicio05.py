def powerlt(a, b=0):
    solucion = 1
    for n in range(b):
        solucion = solucion * a
        
    return solucion


print(powerlt(2))
