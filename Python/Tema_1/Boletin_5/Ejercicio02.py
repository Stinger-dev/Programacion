'''
mesesValidos = ["ENERO","FEBRERO", "MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"]
por si lo necesito alguna vez

meses31 = [1,3,5, 7,8,10,12]
mes28 = [2]
meses30 = [4,6,9,11]

'''

dia = int(input(" Dia: "))
mes = input(" Mes: ").upper().strip()
hemisferio = input(" Hemisferio: ").upper().strip()
estacion = " "
meses31 = ["ENERO", "MARZO", "MAYO", "JULIO", "AGOSTO", "OCTUBRE", "DICIEMBRE"]
mes28 = ["FEBRERO"]  # Supongo que me paso por alto el hecho que sea bisiesto, no pregunta 
meses30 = ["ABRIL", "JUNIO", "SEPTIEMBRE", "NOVIEMBRE"]

if  (dia > 0) and ((mes in meses31 and dia <= 31) or (mes in mes28 and dia <= 28) or (mes in meses30 and dia <= 30)):
    
    if hemisferio == "NORTE":
        if (mes == "OCTUBRE"  or mes == "NOVIEMBRE" or (mes == "SEPTIEMBRE" and dia >= 23) or (mes == "DICIEMBRE" and dia < 21)):
            estacion = "otoño"
        elif (mes == "ENERO"  or mes == "FEBRERO" or (mes == "DICIEMBRE" and dia >= 21) or (mes == "MARZO" and dia < 21)):
            estacion = "invierno"
        elif (mes == "ABRIL"  or mes == "MAYO" or (mes == "MARZO" and dia >= 23) or (mes == "JUNIO" and dia < 21)):
            estacion = "primavera"
        else:
            estacion = "verano"
              
    elif hemisferio == "SUR":
        if (mes == "OCTUBRE"  or mes == "NOVIEMBRE" or (mes == "SEPTIEMBRE" and dia >= 23) or (mes == "DICIEMBRE" and dia < 21)):
            estacion = "primavera"
        elif (mes == "ENERO"  or mes == "FEBRERO" or (mes == "DICIEMBRE" and dia >= 21) or (mes == "MARZO" and dia < 21)):
            estacion = "verano"
        elif (mes == "ABRIL"  or mes == "MAYO" or (mes == "MARZO" and dia >= 23) or (mes == "JUNIO" and dia < 21)):
            estacion = "otoño"
        else:
            estacion = "invierno"       
            
    else:
        print(" Hemisferio no valido")    
        
    print(f" El dia {dia} del {mes.lower()} en el hemisferio {hemisferio.lower()} es {estacion}")
else:
    print(" Mes o dia no valido")
    
input ("\n Pulsa para salir")

