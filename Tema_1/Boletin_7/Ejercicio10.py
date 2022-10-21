'''
Este es exactamente igual que el anterior solo que cuando pondriamos el "*" ahora ponemos una variable que pedimos por pantalla

'''
tipo = input(" Que figura hueca quires hueca? (Cuadrado, triangulo, rombo): ").upper()
numero = int(input(" De que dimension quiere la figura?:"))
simbolo = input(" Caracter con el que hacer la figura: ")

match tipo:
    case "CUADRADO":
        for i in range(numero):
            if i == 0 or i == numero - 1:
                print(simbolo * numero)
            else:
                print(simbolo + " "*(numero - 2) + simbolo)
               
    case "TRIANGULO":
        
        k = 0
        for i in range (numero):
            
            if i == numero - 1:
                print(simbolo * (k + 2))
            elif i == 0:
                print((" " * ((numero - i) - 1)) + (simbolo) + (" " * ((numero - i) - 1)))
            else: 
                
                print((" " * ((numero - i) - 1)) + (simbolo) + (" " * (-1 + i * 2)) + (simbolo) + (" " * ((numero - i) - 1)))
                k = (1 + i * 2)
            
    case "ROMBO": 
        
        k = 0 
        for i in range (numero):
            
            if i == 0:
                print((" " * ((numero - i) - 1)) + (simbolo) + (" " * ((numero - i) - 1)))
            else: 
                print((" " * ((numero - i) - 1)) + (simbolo) + (" " * (-1 + i * 2)) + (simbolo) + (" " * ((numero - i) - 1)))
                k = (i * 2 - 1)
            
        for i in range(numero - 1):
            
            if i == numero - 2:
                print((" " * (1 + i)) + (simbolo) + (" " * (1 + i)))
            else:
                print((" " * (1 + i)) + (simbolo) + (" " * (k - i * 2 - 2)) + (simbolo) + (" " * (1 + i)))
                
    case _:
        print(" Figura no valida")
     
input ("\n Pulsa para salir") 
