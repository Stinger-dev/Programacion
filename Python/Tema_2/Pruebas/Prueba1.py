usuarios = ['hola']
ultima_mod = 0

def generar_usuario(nombre, apellido1, apellido2,DNI):    
    return (nombre[0:3] + apellido1 [0:3] + apellido2[0:3] + DNI[-4:]).lower()

def eliminar_usuario(aLista,borrar): #devuelve -1 si el usuario no ha sido encontrado
    resultado = -1
    if borrar in aLista:
        aLista.pop(aLista.index(borrar))
        resultado = aLista
    return resultado

def borrarUsuarios(aLista):
    return []



def menu(aLista):
    opcion = int(input(' Indique la opcion:'))
    match opcion:
        case 1:
            print(' placeholder')
            menu(aLista)

        case 2:
            borrar = input(' Usuario a borrar: ')
            tmp = eliminar_usuario(aLista,borrar)
            if tmp == -1:
                input(' No se ha encontrado el usuario, pulse cualauier tecla para continuar')
            else:
                aLista = tmp
            menu(aLista)
        case 3:
            nombre            
            menu(aLista)
        case 4:
            print(aLista)
            menu(aLista)
        case 5:
            aLista = borrarUsuarios(aLista)
            menu(aLista)
            
        case 6:
            print('\n Saliendo')
        case _:
            print(' No valido, pulse otra tecla')
            menu(aLista)
            
menu(usuarios)            