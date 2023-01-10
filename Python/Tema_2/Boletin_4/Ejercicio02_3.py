def lcm (a,b):
    if a < b:
        a , b = b , a
    
    encontrado = False
    c = a
    while not encontrado:
        if c%a == 0 and c%b == 0:
            encontrado = True
        else:
            c += 1
            
    return c

print(lcm(7, 10) == 70)