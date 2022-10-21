peso = 1

while peso >= 0:   
    peso = float (input(" Indique su peso: "))
    
    if peso >= 0:
        
        #Meto todo esto dentro del if para que el programa termine sin tener que realizar operaciones inutiles
        edad = int(input(" Indique su edad: "))
        tipoVida = input(" Indique su tipo de vida (Sedentaria / Activa / Muy activa): ").upper().strip() #Upper sirve para normalizar todas las letras a mayusculas y el stripsirve para borrar los espacios y evitar errores
        tiposVida = ["ACTIVA", "MUY ACTIVA", "SEDENTARIA"]
        
        
        while edad <3 or edad > 130: #He puesto edad minima 3 y edad maxima como 130, realmente no se bien que valores poner
            edad = int(input(" Edad no valida, inserte otro valor: "))
        while  not(tipoVida in tiposVida): #Compruebo que el tipo de vida que ha introducido existe en el vector de tipos de vida
            tipoVida = input(" Tipo de vida no valido (Sedentaria / Activa / Muy activa), inserte un valor valido: ").upper().strip()
        while peso < 10 or peso > 300: #He puesto peso minimo a 10 y maximo a 300, realmente tampoco se que valores poner, supongo que si hay un niño en el gym, pesara poco
            peso = float (input(" Peso no valido, inserte uno valido: ")) 
        if ((peso > 100) or (peso > 74.4 and edad > 50) or (edad > 70 and tipoVida == "SEDENTARIA")):
            print(" Usted deberia ir al medico \n")
        else:
            print(" No es urgente que alguna al medico si no tiene problemas de salud \n")
                  
input("\n Pulse enter para salir")