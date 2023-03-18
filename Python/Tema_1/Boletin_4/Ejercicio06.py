print(" Calcular distancia entre dos puntos de un plano")

punto1X = float(input(" Valor de la X del punto 1: "))
punto1Y = float(input(" Valor de la y del punto 1: "))
punto2X = float(input(" Valor de la X del punto 2: "))
punto2Y = float(input(" Valor de la y del punto 2: "))

print(" La distancia es de", (((punto2X - punto1X) ** 2) + ((punto2Y - punto1Y) ** 2)) ** (1 / 2), "unidades")

input ("\n Pulsa para salir")
