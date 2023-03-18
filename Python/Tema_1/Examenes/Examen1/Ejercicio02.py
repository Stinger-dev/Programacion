alumnos = 0
eleccion = -1

#esto se podria meter directamente dentro pero asi me queda mas claro
def visualMenu():    
    print('##############################################')
    print('# Binvenido al IES Jacarandá!!:              #')
    print('   1. Alumnos que han entrado: ')
    print('   2. Alumnos que han abandonado el centro:  ')
    print('   3. Alumnos en el IES: ')
    print('   4. Salir: ')
    print('##############################################')


while eleccion != 4:
    visualMenu()
    eleccion = int(input(' Indique el numero de la opccion que desea realizar: '))
    if eleccion != 4:
        match eleccion:
            case 1:
                n = int(input(' Cuantos alumnos han entrado?: '))
                while n < 0 :
                    n = int(input(' Numero no valido, no puede entrar un numero negativo de alumnos: '))
                alumnos += n 

            case 2:
                n = int(input(' Cuantos alumnos han salido?: '))
                while n < 0 or n > alumnos :
                    n = int(input(' Numero no valido, no puede salir  un numero negativo de alumnos: '))
                alumnos += -n

            case 3:
                print(f' En el centro hay {alumnos} alumnos actualmente ')

            case _:
                input(' Eleccion no valida, pulse enter para continuar')

print(' Saliendo')                 