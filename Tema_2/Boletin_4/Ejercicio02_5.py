a = [2,10]
b = [1,60]


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

def simplificar_fraccion(frac):  
    c  = calcular_mcd(frac[0],frac[1])
    frac[0] /= c
    frac[1] /= c
    return [frac[0], frac[1]]
    
def escribir_fraccion(frac):
    if frac[1] == 1:
        print(frac[0])
    else:
        print('/'.join(frac))
        
def sumar_fracciones(fracA, fracB): 
    solucion = [fracA[0]*fracB[1]+fracA[1]*fracB[0],fracA[1]*fracB[1]]
    return simplificar_fraccion(solucion)

def restar_fracciones(fracA,fracB):
    solucion = [fracA[0]*fracB[1]-fracA[1]*fracB[0],fracA[1]*fracB[1]]
    return simplificar_fraccion(solucion)
    
def multiplicar_fracciones(fracA, fracB):
    solucion =  [fracA[0]*fracB[0],fracA[1]*fracB[1]]
    return simplificar_fraccion(solucion)

def dividir_fracciones(fracA, fracB):   
    solucion = [fracA[0]*fracB[1],fracA[1]*fracB[0]]   #todo esto se podria poner en una linea en el return, pero me parece que eso queda menos claro
    return simplificar_fraccion(solucion)

def leer_fraccion():
    n = int(input('Numerador: '))
    d = int(input('Denominador: '))
    frac = [n,d]
    return simplificar_fraccion(frac)
    
