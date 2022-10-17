tipo = input(" Indique el tipo del producto: ").upper()
precio= float(input(" Indique el precio del producto: "))
descuento = 0

if (precio > 0 and (tipo == "A" or tipo == "B" or tipo =="C")):
    if tipo == "A":
        descuento = 7
    elif tipo == "C" or precio < 500:
        descuento = 12  
    else:
        descuento = 9
        
        
print(" El precio tras la renaja es", precio*(1-(descuento/100)))        


input("\n Pulse enter para salir")