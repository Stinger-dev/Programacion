tamagnoEmpresa = int(input(' Indique el tamaño de la empresa: '))
#mujer, total, sumatorio de la edad 
python = [0, 0, 0] #teniendo el total de mujeres, el total de empleados y el sumatorio de la edad podemos hacer todos los calculos
java = [0, 0, 0]


for n in range(tamagnoEmpresa):   
     
    sexo = input(' Sexo (H-F): ').upper().strip()
    while sexo != 'H' and sexo != 'F':
        sexo = input(' Sexo no valido (H-F): ').upper().strip()
        
    edad = int(input(' Edad: '))
    while not (18<=edad<=65):
        edad = int(input(' Edad no valida (18-65): '))
        
    lenguaje = input(' Que lenguaje usa?: ').upper().strip()
    while not (lenguaje == 'JAVA' or lenguaje == 'PYTHON'):
        lenguaje = input(' Que lenguaje usa? (Python o Java): ').upper().strip()
    print('------------------------------------')
        
    if lenguaje == 'PYTHON':
        if sexo == 'F':
            python[0]+=1 #Actualizamos el numero de mujeres
            python[1]+=1 #Actualizamos el numero total
        else:
            python[1]+=1 #Actualizamos el numero total
        python[2] += edad #Añadimos a la suma de las edades que luego sumamos y dividimos para la media
    else:
        if sexo == 'F':
            java[0]+=1
            java[1]+=1
        else:
            java[1]+=1
        java[2] += edad
        
porcentajePy = python[1]/(python[1] + java[1])*100
if python[1]>0:
    print(f' El {porcentajePy}% de los empleados usan Python, de los cuales {python[1]-python[0]} son hombres y {python[0]} son mujeres y su edad media es {python[2]/python[1]} años')
else:
    print(' Nadie programa con python')
if java[1]>0:
    print(f' El {100 - porcentajePy}% de los empleados usan Java, de los cuales {java[1]-java[0]} son hombres y {java[0]} son mujeres y su edad media es {java[2]/java[1]} años')
else:
    print(' Nadie programa con java')