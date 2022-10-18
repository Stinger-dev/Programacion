mes = int(input(" Mes: "))
dia = -1
if 1 <= mes <= 12:
    if mes == 2:
        dia = 28
    elif mes == 4 or mes == 6 or mes == 9 or mes == 11:
        dia = 30
    else:
        dia = 31

if dia > 0:
    print(" El mes %s tiene %s dias" % (mes, dia))
else:
    print(" El mes no existe")

input("\n Presiona enter para salir")
