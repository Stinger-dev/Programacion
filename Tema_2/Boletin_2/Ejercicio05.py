def powerlt(a, b=0):
    solucion = 1
    for n in range(b):
        solucion = solucion * a
        n=n #esto no vale para nada pero me da toc que me aparezca un error 
    return solucion


print(powerlt(2))
