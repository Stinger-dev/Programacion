numero = 9
tipo = input(" Que figura quires? (Cuadrado, triangulo, rombo): ").upper()

match tipo:
    case "CUADRADO":
        for i in range(numero):
            print("*"*numero)
        
    case "TRIANGULO":
        for i in range (numero):
            print( (" " * ((numero-i)-1)) + ("*" * (1+i*2 )) + (" " * ((numero-i)-1)) )
            
    case "ROMBO":
        k=0
        for i in range (numero):
            print( (" " * ((numero-i)-1)) + ("*" * (1+i*2 )) + (" " * ((numero-i)-1)) )
            
            k= (1+i*2)-2
            
        for i in range(numero):
            print ((" " * (1+i)) + ("*" * (k-i*2)) + (" " * (1+i)))
            
            
     
input ("\n Pulsa para salir")   