'''
VERSION NO CORREGIDA
[En el ejercicio 6 puedes ahorrarte el primer if si transformas el primer else por elif.]


letra = input(" Indique la letra: ").upper()

if (letra == "A" or letra == "E" or letra == "I" or letra == "O"or letra == "U"):    
    if letra == "A":
        print(" Es la primera vocal ")
    elif letra == "E":
        print(" Es la segunda vocal")
    elif letra == "I":
        print(" Es la tercera vocal")
    elif letra == "0":
        print(" Es la cuarta vocal ")
    else:
        print(" Es la quinta vocal")        
        
else:
    print(" %s no es una vocal" %(letra))
    
    
    
input("\n Pulse enter para salir")
'''

letra = input(" Indique la letra: ").upper()


letra = input(" Indique la letra: ").upper()

if letra == "A":
    print(" Es la primera vocal ")
elif letra == "E":
    print(" Es la segunda vocal")
elif letra == "I":
    print(" Es la tercera vocal")
elif letra == "0":
    print(" Es la cuarta vocal ")
elif letra == "U":                  #Este es el cambio que me comento en la coreccion     
    print(" Es la quinta vocal")         
else:
    print(" %s no es una vocal" %(letra))
    
    
    
input("\n Pulse enter para salir")