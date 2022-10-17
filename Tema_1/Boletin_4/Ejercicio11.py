    agno = int(input(" Indique de que año quiere averiguar si es bisiesto: "))


if (agno%400 != 0 and agno%4 == 0 and agno%100 != 0): 
    print(" Es bisiesto")
else:
    print(" No es bisiesto")
    
input ("\n Pulsa para salir")