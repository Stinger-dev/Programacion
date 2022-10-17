edad1 = int(input(" Introduzca la edad de la primera persona: "))

edad2 = int(input(" Introduzca la edad de la segunda persona: "))

if edad1 < edad2:
    print(" La primera persona es mas joven que la segunda")
elif edad2 > edad1:
    print(" La segunda persona es mas joven que la primera")
elif edad2 == edad1:
    print(" Ambas personas tienen la misma edad")
    
input ("\n Pulsa para salir")