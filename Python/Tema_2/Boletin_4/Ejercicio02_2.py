def gcd (a,b):
    if a > b:
        a , b = b , a
    
    encontrado = False
    c = a
    while not encontrado:
        if b % c == 0 and a % c == 0:
            encontrado = True
        else:
            c -= 1
    return c


print(gcd(27,6) == 3)