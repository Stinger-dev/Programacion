saldo = int(input(' Antes de empezar, debe añadir saldo: '))
while saldo <= 0:
    saldo = int(input(' Saldo no valido, debe añadir mas de 0€: '))
    
historial = []
    
    
def dame_numero():
    from random import randint
    return randint(2, 12)


def apuesta(num, cant):
    premio = 0
    resul = dame_numero()
    
    if num == resul:
        premio = 2 * cant
    elif num < resul:
        premio = -(cant / 2)
    else:
        premio = -cant
    return premio , resul


def menu(saldo):
    print('*******************************************************************')
    print('Bienvenido a JacaBet donde, si entras con dinero, sales sin el')
    print(' 1. Apostar')
    print(' 2. Añadir mas saldo')
    print(' 3. Mostrar saldo')
    print(' 4. Retirarse')
    print(' 5. Mostrar historial')
    opcion = input('¿Que desea hacer?: ')
    
    match opcion:
        case '1':
            num = int(input(' ¿Cuanto cree que sumaran los dados?: '))
            while num < 2 or num > 12:
                num = int(input(' ¿Cuanto cree que sumaran los dados?(2-12): ')) 
            cant =  (input(' ¿Cuanto dinero desea apostar?: '))
            while cant > saldo or 0 > cant:
                cant = int(input(' Cantidad no valida, ponga 0 para cancelar y añadir mas salgo u apueste menos cantidad: '))
            premio, resultado = apuesta(num, cant)
            historial.append([num, resultado, premio])
            
            saldo += premio
            print(f' Usted aposto al {num}, ha salido el {resultado} por lo que ha ganado {premio}, su saldo actual es de {saldo} ')
                
            input(' Pulse enter para continuar')
            menu(saldo)
            
        case '2':
            cant = int(input(' ¿Cuanto saldo desea añadir?: '))
            while cant < 0:
                cant = int(input(' Saldo no valido, ¿Cuanto saldo desea añadir?: '))
            saldo += cant
            print(f' Usted ha añadido {cant}€ a su cuenta, actualmente tiene {saldo}€')
            
            input(' Pulse enter para continuar')
            menu(saldo)
        
        case '3':
            print(f' Su saldo actualmente es de {saldo}€')
            input(' Pulse enter para continuar')
            menu(saldo)
        case '4':
            input(' Pulse enter para continuar')
            
        case '5':
            print(f' Usted ha realizado {len(historial)} apuestas')
            total = 0
            for n in historial:
                print(f' Aposto al {n[0]} y salio el {n[1]} por lo que gano {n[2]}€')
                total += n[2]
            print(f' Usted ha ganado un total de {total}€')
            input(' Pulse enter para continuar')
            menu(saldo)
                
        case _:
            input(' Opcion no valida, pulse enter para continuar')
            menu(saldo)

    
menu(saldo)

