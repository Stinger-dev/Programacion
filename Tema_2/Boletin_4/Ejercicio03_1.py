from numpy import pi
def area_circulo(radio):
    return(pi*radio**2)

def perimetro_circulo(radio):
    return(2*pi*radio)

def distancia_euclidea(a,b):
    return ((b[0]-a[0])**2+(b[1]-a[1])**2)**(1/2)

def perimetro_triangulo(a,b,c): #abc son los tres puntos que forman al triangulo
    return distancia_euclidea(a,b)+distancia_euclidea(c,b)+distancia_euclidea(c,a)

def area_triangulo(a,b,c):
    s = perimetro_triangulo(a, b, c)/2
    return ()**(1/2)
