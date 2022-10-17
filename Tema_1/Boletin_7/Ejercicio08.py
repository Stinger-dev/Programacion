numero = 9
tipo = input(" Que figura quires? (Cuadrado, triangulo, rombo): ").upper()

match tipo:
    case "CUADRADO":
        tmp = []
        for i in range (numero):
            for j in range(numero):
                print("*", end="")   
            print("")
        
    case "TRIANGULO":
        tmp=1
        for i in range (numero):
            for j in range(numero-i):
                print(" ", end = "")
                
            for k in range (tmp):
                print("*", end = "")
            tmp= tmp + 2 
            for j in range(numero-i):
                print(" ", end = "")
            print(" ")
            
    case "ROMBO":
        tmp=1
        for i in range (numero):
            for j in range(numero-i):
                print(" ", end = "")
            for k in range (tmp):
                print("*", end = "")
            tmp= tmp + 2 
            for j in range(numero-i):
                print(" ", end = "")
            print(" ")
        
        for i in range (numero):
            
            for j in range(i+2):
                print(" ", end = "")
            tmp= tmp - 2 
            for k in range (tmp-2):
                print("*", end = "")
            for j in range(i+2):
                print(" ", end = "")
            print(" ")
            

    
input ("\n Pulsa para salir")   