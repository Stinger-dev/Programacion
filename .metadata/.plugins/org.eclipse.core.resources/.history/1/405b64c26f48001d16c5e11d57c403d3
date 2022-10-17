'''
VERSION ORIGINAL
En el ejercicio 10 piensa cómo puedes evitar indicar valido=True en varias ocasiones.


numero1 = int(input(" Numero 1: "))
operador = str(input(" Operador: "))
numero2 = int(input(" Numero 2: "))
resultado = 0
valido = False

if operador == "*":
    resultado = numero1*numero2
    valido = True
elif operador == "+":
    resultado = numero1+numero2
    valido = True
elif operador == "-":
    resultado = numero1-numero2
    valido = True
elif operador == "/" and numero2 > 0:
    resultado = numero1/numero2
    valido = True
elif operador == "^":
    resultado = numero1**numero2
    valido = True
    

if valido:
    print(" %s%s%s=%s" %(numero1, operador, numero2, resultado))

else:
    print(" Operador no valido o intento de division entre 0")
    
    
input("\n Pulse enter para salir")

'''


numero1 = int(input(" Numero 1: "))
operador = str(input(" Operador: "))
numero2 = int(input(" Numero 2: "))
resultado = 0
valido = False


if operador != "/": #Creo que esta es la correccion que pedia el maestro, pero no estoy seguro si lo quiere mas simple
    if operador == "*":
        resultado = numero1*numero2
        
    elif operador == "+":
        resultado = numero1+numero2
        
    elif operador == "-":
        resultado = numero1-numero2
        
    elif operador == "^":
        resultado = numero1**numero2
        
    valido = True
    
elif numero2 != 0:  
    resultado = numero1/numero2
    valido = True

    

if valido:
    print(" %s%s%s=%s" %(numero1, operador, numero2, resultado))

else:
    print(" Operador no valido o intento de division entre 0")
    
    
input("\n Pulse enter para salir")
