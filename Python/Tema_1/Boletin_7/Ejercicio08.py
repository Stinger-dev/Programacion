'''
Opero sobre la cantidad de espacios y sobre la cantidad de asteriscos, la cantidad de asteriscos es inversamente proporcional a la de espacios


'''

numero = int(input(" Tamaño: "))
tipo = input(" Que figura quires? (Cuadrado, triangulo, rombo): ").upper().strip()

match tipo:
    case "CUADRADO":
        for i in range(numero):
            print("*"*numero)
        
    case "TRIANGULO":
        for i in range (numero):
            print((" " * ((numero - i) - 1)) + ("*" * (1 + i * 2)))
            
    case "ROMBO":
        k = 0
        for i in range (numero):
            print((" " * ((numero - i) - 1)) + ("*" * (1 + i * 2)))
            
            k = (i * 2) - 1
            
        for i in range(numero):
            print ((" " * (1 + i)) + ("*" * (k - i * 2)))
            
    case _:
        print(" Figura no valida")
    
input ("\n Pulsa para salir")   
