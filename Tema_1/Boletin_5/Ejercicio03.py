'''

Creo una lista de listas con el numero del mes y el numero de dias maximo de media y calculo si es bisiesto y cambio el valor en la lista
para poder seguir usando la comparacion


Para contar los dias sin tener que preocuparme por los meses de 30 o 31 dia, los he precalculado, aunque tmb se podria hacer con un bucle sumatorio
con un for hasta  mes-1 donde sume mesesValidos[n][1] asi solo sumaria el segundo indice de cada una de los meses 


        dias_hasta_el_mes = [0]
        tmp=0
        
        for n in range(11):
            tmp = tmp + mesesValidos[n][1]
            dias_hasta_el_mes.append(tmp)
        

Con este algoritmo obtendria una lista con la suma de los dias trasncurridos al pasar cada mes sin contar el 365

aunque casi que me era mas facil calcularlos a mano que programar esto y asegurarme que funcione bn

'''

agno = int(input(" Año: "))
mes = int(input(" Mes: "))
dia = int(input(" Dia: "))
diasTotal = 0
mesesValidos = [[1, 31], [2, 28], [3, 31], [4, 30], [5, 31], [6, 30], [7, 31], [8, 31], [9, 30], [10, 31], [11, 30], [12, 31]]

if (((agno % 4 == 0 and agno % 100 != 0) or (agno % 400 == 0))and mes >= 2):  # Con esto calculo si le cambio el numero maximo de dias a febrerp
        diasTotal = 1
        mesesValidos[1][1] = 29

if (1 <= dia <= mesesValidos[mes - 1][1]) and (1 <= mes <= 12): 
    dias_hasta_el_mes = [0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334] 
    diasTotal = (dia - 1) + dias_hasta_el_mes[mes - 1] + diasTotal
    
    print(f" Han pasado {diasTotal} dias, desde el uno de enero de ese mismo año")
    
else:
    print(" Mes o dia no validos")
    
input ("\n Pulsa para salir")

'''
----------------------------------------------------------------------------------------------------------

        VERSION UN POCO MAS SIMPLIFICADA QUE QUITA LA MATRIZ Y DEJA UN SOLO VECTOR
En verdad la primera fila de la matriz nunca la usaba, asi que es mejor quitarla para mejorar un poco el codigo



agno = int(input(" Año: "))
mes = int(input(" Mes: "))
dia = int(input(" Dia: "))
diasTotal = 0
mesesValidos = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

if (((agno % 4 == 0 and agno % 100 != 0) or (agno % 400 == 0))and mes >= 2):  # Con esto calculo si le cambio el numero maximo de dias a febrerp
        diasTotal = 1
        mesesValidos[1] = 29

if (1 <= dia <= mesesValidos[mes - 1]) and (1 <= mes <= 12): 
    dias_hasta_el_mes = [0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334] 
    diasTotal = (dia - 1) + dias_hasta_el_mes[mes - 1] + diasTotal
    
    print(f" Han pasado {diasTotal} dias, desde el uno de enero de ese mismo año")
    
else:
    print(" Mes o dia no validos")
    
input ("\n Pulsa para salir")
----------------------------------------------------------------------------------------------------------

            VERSION ANTERIOR PERO CON EL CALCULO AUTOMATICO DEL VECTOR DE LOS DIAS DE LOS MESES
            
agno = int(input(" Año: "))
mes = int(input(" Mes: "))
dia = int(input(" Dia: "))
diasTotal = 0
mesesValidos = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

if (((agno % 4 == 0 and agno % 100 != 0) or (agno % 400 == 0))and mes >= 2):  # Con esto calculo si le cambio el numero maximo de dias a febrerp
        diasTotal = 1
        mesesValidos[1] = 29

if (1 <= dia <= mesesValidos[mes - 1]) and (1 <= mes <= 12): 

    dias_hasta_el_mes = [0]
    tmp=0    
    for n in range(mes): 
        tmp = tmp + mesesValidos[n]
        dias_hasta_el_mes.append(tmp)    
        
    diasTotal = (dia - 1) + dias_hasta_el_mes[mes - 1] + diasTotal
    
    print(f" Han pasado {diasTotal} dias, desde el uno de enero de ese mismo año")
    
else:
    print(" Mes o dia no validos")
    
input ("\n Pulsa para salir")

----------------------------------------------------------------------------------------------------------


'''






