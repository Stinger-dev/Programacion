A = float(input(" A:"))
B = float(input(" B:"))
C = float(input(" C:"))

posible = False

if (((A+B)>C) and ((A+C)>B) and ((B+C)>A)):
    if (A == B == C):
        print(" Es equilatero")
    elif (A == B or A == C or B == C):
        print(" Es isosceles")
    elif (((A**2+B**2)==C**2) or ((A**2+C**2)==B**2) or ((C**2+B**2)==A**2)):
        print(" Es rectangulo")
    else:
        print(" Es escaleno")
else:
    print(" El triangulo no es posible")
    
input ("\n Pulsa para salir")