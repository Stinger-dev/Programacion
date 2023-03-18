clasificacion = input(" Indique la clasificacion: ").upper()
tamano = int (input(" Indique el tamaño: "))
cantidad = float (input(" Indique el peso en kg: "))
precioBaseKg = float(input(" Precio base: "))

if (clasificacion == "A" and tamano == 1):
    precioBaseKg = precioBaseKg + 0.2
elif(clasificacion == "A" and tamano == 2):
    precioBaseKg = precioBaseKg + 0.3
elif(clasificacion == "B" and tamano == 1):
    precioBaseKg = precioBaseKg - 0.3
elif(clasificacion == "B" and tamano == 2):
    precioBaseKg = precioBaseKg - 0.5
    
print(" Precio total =", precioBaseKg * cantidad)

input ("\n Pulsa para salir")
