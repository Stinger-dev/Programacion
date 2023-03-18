'''
La aproximacion que es usado es, mas o menos, crear una figura de espacios dentro de una figura de espacios con un contorno de asteriscos

Realmente lo unico variable en las mayoria de las posiciones son los espacios, los asteriscos suelen ser 2

En las unicas posiciones en las que no son dos son al principio y al final asi que pongo un if para esas dos posiciones y ahi si que opero
sobre la cantidad de asteriscos

'''
tipo = input(" Que figura hueca quires hueca? (Cuadrado, triangulo, rombo): ").upper().strip()
numero = int(input(" De que dimension quiere la figura?: "))

match tipo:
    case "CUADRADO":
        for i in range(numero):
            if i == 0 or i == numero - 1:
                print("*"*numero)
            else:
                print("*" + " "*(numero - 2) + "*")
               
    case "TRIANGULO":
        
        k = 0
        for i in range (numero):
            
            if i == numero - 1:
                print("*"*(k + 2))
            elif i == 0:
                print((" " * ((numero - i) - 1)) + ("*"))
            else: 
                print((" " * ((numero - i) - 1)) + ("*") + (" " * (-1 + i * 2)) + ("*"))
                k = (1 + i * 2)
            
    case "ROMBO":
        
        k = 0 
        for i in range (numero):
            
            if i == 0:
                print((" " * ((numero - i) - 1)) + ("*"))
            else: 
                print((" " * ((numero - i) - 1)) + ("*") + (" " * (-1 + i * 2)) + ("*"))
                k = (i * 2 - 1)
            
        for i in range(numero - 1):
            
            if i == numero - 2:
                print((" " * (1 + i)) + ("*"))
            else:
                print((" " * (1 + i)) + ("*") + (" " * (k - i * 2 - 2)) + ("*"))
                
    case _:
        print(" Figura no valida")
         
input ("\n Pulsa para salir") 
