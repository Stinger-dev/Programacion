entradaMinutos = int (input(" Numeros de minutos para pasar a horas: "))

if entradaMinutos >= 0:
    horas = entradaMinutos // 60
    minutos = entradaMinutos % 60
    
    print("", entradaMinutos, "minutos equivale a", horas ,"horas y ",minutos, "minutos")
    
input ("\n Pulsa para salir")