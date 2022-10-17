nota = float(input(" Introduzca la nota: "))
edad = float(input(" Introduzca la edad: "))



if nota >= 5 and edad >= 18:
    sexo = input(" Introduzca f o m segun el sexo: ")
    if sexo == "m":
        print (" Posible")
    elif sexo == "f":
        print (" Aceptada")
else:
    print (" No aceptada")
    
input ("\n Pulsa para salir")