minutosTotales = int (input(" Minutos totales: "))
diaSemana = int (input(" Numero del dia de la semana: "))
horaDia = float (input(" Hora del dia: "))

precioPrimeros5 = 1
precioSiguientes3 = 0.8
precioSiguientes2 = 0.7
precioDesde10 = 0.5

tmpMinutos=minutosTotales
precioFinal = 0

if (tmpMinutos>5):
    precioFinal = precioFinal + (5*precioPrimeros5)
    tmpMinutos = tmpMinutos-5
    
    if (tmpMinutos>3):    
        precioFinal = precioFinal+(3*precioSiguientes3)
        tmpMinutos = tmpMinutos-3
        
        if (tmpMinutos>2):
            precioFinal = precioFinal + (2*precioSiguientes2)
            tmpMinutos = tmpMinutos-2
            precioFinal = precioFinal + (tmpMinutos*precioDesde10)
            
        else:
            precioFinal = precioFinal + (tmpMinutos*precioSiguientes2)                            
    else:
        precioFinal = precioFinal + (tmpMinutos*precioSiguientes3)     
else:
    precioFinal = precioFinal + (tmpMinutos*precioPrimeros5)
    
     
print(" El precio antes de impuestos es:",precioFinal)

if diaSemana == 7:
    precioFinal = precioFinal*1.03
    
elif (0 <= horaDia <= 12):
    precioFinal = precioFinal*1.15
    
elif (12 < horaDia < 24):
    precioFinal = precioFinal*1.10
    
    
print(" El valor final es: ", precioFinal)



input ("\n Pulsa para salir")