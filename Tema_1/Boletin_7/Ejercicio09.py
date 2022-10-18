numero = 9
tipo = input(" Que figura hueca quires? (Cuadrado, triangulo, rombo): ").upper()
simbolo = "*"


match tipo:
    case "CUADRADO":
        for i in range(numero):
            if i == 0 or i == numero-1:
                print(simbolo*numero)
            else:
                print(simbolo + " "*(numero-2) + simbolo)
               
    case "TRIANGULO":
        k=0
        
        for i in range (numero):
            
            if i == numero-1:
                print("*"*(k+2))
            elif i==0:
                print( (" " * ((numero-i)-1)) + ("*")  + (" " * ((numero-i)-1)) )
            else: 
                print( (" " * ((numero-i)-1)) + ("*") + (" " * (-1+i*2 )) + ("*") + (" " * ((numero-i)-1)) )
                k= (1+i*2 )
            
        
            
    case "ROMBO":
        print("placeHolder")
        
    
     
input ("\n Pulsa para salir") 