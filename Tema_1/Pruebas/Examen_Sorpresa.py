'''

Lunes, miercoles y viernes (spinning 12-14) (yoga 16 20) (bCombat 20 22)
Martes y jueves (yoga 12-14) (spinning 16 20) (bCombat 20 22)

'''
print(" Bienvenido al gimnasio Jacafitness \n" + "*"*55)
dia = input(" ¿Qué día de la semana quiere comprobar?: ").upper().strip()
hora = float(input(" ¿A qué hora quiere comprobar?: "))

if ((dia == "LUNES" or dia == "MARTES" or dia == "MIERCOLES" or dia == "JUEVES" or dia == "VIERNES" or dia == "DOMINGO" or dia == "SABADO") and (0 < hora < 24)):
    if (dia == "LUNES" or dia == "MIERCOLES" or dia == "VIERNES"):
        if 12 <= hora < 14:
            print(" Puede realizar spinning")
        elif 16 <= hora < 20:
            print(" Puede realizar yoga")
        elif 20 <= hora < 22:
            print(" Puede realizar Body Combat")
        else:
            print(" No hay ninguna clase listada ese dia a esa hora")
    elif (dia == "MARTES" or dia == "JUEVES"):
        if 12 <= hora < 14:
            print(" Puede realizar yoga")
        elif 16 <= hora < 20:
            print(" Puede realizar spinning")
        elif 20 <= hora < 22:
            print(" Puede realizar Body Combat")
        else:
            print(" No hay ninguna clase listada ese dia a esa hora")
    else:
        print(" No hay clases los fin de semanas")

else:
    print(" Los datos introducidos no son validos")
     
input("\n Pulse enter para salir")

