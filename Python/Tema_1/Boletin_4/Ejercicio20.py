mes = int(input(" Meses en los que lo ha dividido: "))
precio = float(input(" Precio del primer mes: "))
suma = precio

for n in range(mes - 1):
    precio = precio * 2
    print(f" La cuota {n+1} es {precio}")
    suma = suma + precio
    
print(" El precio final es %s euros" % (suma))
