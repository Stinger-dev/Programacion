'''

    100 alumnos o mas = 65/alu

    entre 50 y 99 = 70/alu

    entre 30 y 49 = 95/alu

    menos de 30 = 4000
    
'''

numeroAlumnos = int(input(" Indique el numero de alumnos:"))
precioFinal = 0

if numeroAlumnos >= 100:
    precioFinal = numeroAlumnos * 65
elif 50 <= numeroAlumnos <= 99:
    precioFinal = numeroAlumnos * 70
elif 30 <= numeroAlumnos <= 49:
    precioFinal = numeroAlumnos * 95
elif 0 < numeroAlumnos < 30:
    precioFinal = 4000
else:
    precioFinal = -1
    
if precioFinal > 0:
    print(" El precio total es de", precioFinal)
else:
    print(" Valor de alumnos no valido") 
    
input ("\n Pulsa para salir")
