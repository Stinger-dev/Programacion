'''
match dia:
    case 1:
        print(" Lunes")
    case 2:
        print(" Martes")
    case 3:
        print(" Miercoles")
    case 4:
        print(" Jueves")
    case 5:
        print(" Viernes")
    case 6:
        print(" Sabado")
    case 7:
        print(" Domingo")
    case _:
        print(" Dia no valido")
        
'''     

dia = int(input(" Indique el dia de la semana: "))

if dia == 1:
    print(" Lunes")
elif dia == 2:
    print(" Martes")
elif dia == 3:
    print(" Miercoles")
elif dia == 4:
    print(" Jueves")
elif dia == 5:
    print(" Viernes")
elif dia == 6:
    print(" Sabado")
elif dia == 7:
    print(" Domingo")
else:
    print(" Dia no valido")
    
    
input("\n Pulse para salir")