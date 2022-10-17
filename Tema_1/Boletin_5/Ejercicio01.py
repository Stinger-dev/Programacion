nota = int(input(" Inserte la nota(0-100): "))

if 90 <= nota <= 100:
    print(" Sobresaliente")
elif 70 <= nota <= 90:
    print(" Notable")
elif 60 <= nota <= 69:
    print(" Bien")
elif 50 <= nota <= 59:
    print(" Suficiente")
elif 0 <= nota  <= 49:
    print(" Suspenso")
else:
    print(" Nota no valida")
    
    
input("\n Pulsa enter para salir")
