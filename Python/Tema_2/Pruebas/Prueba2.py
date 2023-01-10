def validarLetra(dni): #el dni debe estar bien antes de entrar en la funcion
    letras = 'TRWAGMYFPDXBNJZSQVHLCKE'
    numeros = int(dni[:-1])
    numeros = numeros % 23
    resultado = False
    if dni[-1].upper() == letras[numeros]:
        resultado = True      
    return resultado

def formaValida(dni):
    resultado = True
    if len(dni) == 9 or len(dni) == 8:
        for n in range(len(dni)):
            if dni[n] not in '1234567890':
                if dni[n].upper() in 'QWERTYUIOPASDFGHJKLZXCVBNM':
                    if n == (len(dni)-1):
                        pass
                    else:
                        resultado = False   
    else:
        resultado = False
        
    return resultado  

def esDniValido(dni):
    valido = False
    if formaValida(dni) and validarLetra(dni):
        valido = True
    return valido

print(esDniValido('1234567L'))
print(esDniValido('12345678Z'))
print(esDniValido('15748523D'))
print(esDniValido('952952D'))
print(esDniValido('dasdadsf2eq'))

