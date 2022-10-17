hora1 = int(input(" Horas1: "))
minutos1 = int(input(" Minutos1: "))
segundos1 = int(input(" Segundos1: "))

hora2 = int(input(" Horas2: "))
minutos2 = int(input(" Minutos2: "))
segundos2 = int(input(" Segundos2: "))


if 0<(hora1<=24 and hora2<=24 and minutos1<=60 and minutos2<=60 and segundos1 <= 60 and segundos2 <=60):

    if hora1 == hora2:
        if minutos1 == minutos2:
            if segundos1 == segundos2:
                print(" La hora 1 es igual a la hora 2")
            elif segundos1 > segundos2:
                print(" La hora 1 es mayor a la hora 2")
            else:
                print(" La hora 2 es mayor a la hora 1")
        elif minutos1 > minutos2:
            print(" La hora 1 es mayor a la hora 2")
        else:
            print(" La hora 2 es mayor a la hora 1")
    elif hora1 > hora2:
        print(" La hora 1 es mayor a la hora 2")
    else:
        print(" La hora 2 es mayor a la hora 1")
        
        
input("\n Pulse enter para salir")