a = []
b = []

def calcular_mcd (a,b):
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

def mcm (a,b):
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

def simplificar_fraccion(a,b):  
    c  = calcular_mcd(a,b)
    a /= c
    b /= c
    return (a, b)
    
def escribir_fraccion(a,b):
    
    