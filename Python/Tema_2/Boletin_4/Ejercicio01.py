registrados = {}

def login(usuario):
    encontrado = False
    k=1
    while not encontrado and k <= 3:
        contrasegna = input(' Contraseña: ')
        if contrasegna == registrados[usuario]:
            encontrado = True
        k += 1
        
    if encontrado:
        return True
    else:
        registrados [usuario] = None
        return False

def agnadir(usuario):
    correcto = False
    while not correcto : 
        contrasegna = input(' Contraseña: ')
        contrasegna2 = input(' Repita la contraseña: ')
        if contrasegna == contrasegna2:
            correcto = True
    registrados[usuario] = contrasegna

def menu():
    print('1. Login')
    print('2. Crear usuario')
    print('3. Mostrar usuarios y contraseñas')
    print('4. Salir')
    
    opcion = int(input(' Opcion: '))
    match opcion:
        case 1:
            usuario = input('Usuario: ')
            if usuario in registrados:
                login(usuario)
            else:
                print(' El usuario no existe')
                
            input('Pulse cualquier tecla para continuar')
            menu()
            
        case 2:
            usuario = input('Usuario: ')
            if usuario not in registrados:
                agnadir(usuario)
            else:
                print(' El usuario ya existe')
                
            input('Pulse cualquier tecla para continuar')
            menu()
        case 3:
            print(registrados)
            
            input('Pulse cualquier tecla para continuar')
            menu()
        
        case 4:
            input('Pulse cualquier tecla para salir')
            
        case _:
            input('Opcion no valida, pulse cualquier tecla para continuar')
            menu()


menu()